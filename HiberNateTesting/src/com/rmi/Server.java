package com.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {

	
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		Addc obj=new Addc();
		Naming.rebind("add", obj);
		System.out.println("server started");
		
	}
}
