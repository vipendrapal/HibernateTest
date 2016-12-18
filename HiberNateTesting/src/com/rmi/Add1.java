package com.rmi;

import java.rmi.Remote;
import java.util.ArrayList;

//import org.hibernate.cfg.Configuration;

public interface Add1 extends Remote {

	public int add(int a,int b) throws Exception;
	// for get hib just added comment
}
