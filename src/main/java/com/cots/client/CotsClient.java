package com.cots.client;

import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.cots.server.SignalEvents;

public class CotsClient implements SignalActions{

	@Override
	public void updatePowerActions(int id, String poweractions) throws RemoteException {
		
		
		
		System.setProperty("java.security.policy","/tmp/test.policy");
		System.setSecurityManager(new RMISecurityManager());

		//System.setProperty("java.rmi.server.hostname","10.53.197.236");  set it on the COTS MACHINE IMPORTANT

		try {
			
			//System.out.println("........................................."+host);

			//Registry registry = LocateRegistry.getRegistry(host, 1099);
			Registry registry = LocateRegistry.getRegistry("192.168.1.253", 1099);
			SignalActions stub = (SignalActions) registry.lookup("action");
			stub.updatePowerActions(id, poweractions);
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
		
	}
	
}
