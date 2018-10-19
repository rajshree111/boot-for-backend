package com.cots.server;

public class CotsServer implements Runnable{

	@Override
	public void run() {

		try {
			Thread.sleep(7000);
			
			RmiUtility rmiUtility = new RmiUtility();
			rmiUtility.instantiateRMI();


		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
