package com.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws Exception {
		Add1 obj=(Add1) Naming.lookup("add");
	int i=	obj.add(5, 8);
	
	
	System.out.println("Addition of no is: "+i);
	}
}
