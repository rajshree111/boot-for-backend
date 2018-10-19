package com.cots.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SignalActions extends Remote{
	 void updatePowerActions(int id,String poweractions) throws RemoteException;

}
