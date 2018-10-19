package com.cots.server;

import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.cots.model.BladeView;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RmiUtility implements SignalEvents{
	
	
	public void instantiateRMI()  {
	
	try {

		System.setProperty("java.security.policy","/tmp/test.policy");
		System.setSecurityManager(new RMISecurityManager());

		LocateRegistry.createRegistry(1099);
		RmiUtility obj = new RmiUtility();
		SignalEvents stub = (SignalEvents) UnicastRemoteObject.exportObject(obj, 0);

		// Bind the remote object's stub in the registry
		Registry registry = LocateRegistry.getRegistry();
		registry.bind("signal", stub);

		System.err.println("Server ready");
	} catch (Exception e) {
		System.err.println("Server exception: " + e.toString());
		e.printStackTrace();
	} 	
	}

	@Override
	public void updatePowerStatus(int id, String powerstatus) throws RemoteException {
	
		RestTemplate restTemplate = new RestTemplate();
		
		BladeView bladeView=new BladeView();
		bladeView.setBladeId(id);
		bladeView.setPowerStatus(powerstatus);
		bladeView.setAppStatus(false);
		
		
		try {
		ObjectMapper om = new ObjectMapper();
        String jsonRequest = om.writeValueAsString(bladeView);
		
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> entity = new HttpEntity<String>(jsonRequest, httpHeaders);
		
		System.out.println("...................."+jsonRequest);
		
        restTemplate.put("http://localhost:8080/add", entity);
        
        
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
