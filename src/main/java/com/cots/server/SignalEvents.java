package com.cots.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SignalEvents extends Remote {
    void updatePowerStatus(int id,String powerstatus) throws RemoteException;
}