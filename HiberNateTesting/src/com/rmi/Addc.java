package com.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Addc  extends UnicastRemoteObject implements Add1 {

	protected Addc() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		return a+b;
	}

}
