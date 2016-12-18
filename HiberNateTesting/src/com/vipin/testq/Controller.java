package com.vipin.testq;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Controller {

	public static void main(String[] args) throws NamingException {
		
		
		Hashtable<String,String> map=new  Hashtable<String,String>();
		map.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
		map.put(Context.PROVIDER_URL,"file:/D:/binding/");
		Context ctx= new InitialContext(map);
		
	/*	
		Monkey monkey1=new Monkey("steve","banana",true);
		ctx.bind("monkey1 steve", monkey1);
		System.out.println("done");
		Object o=ctx.lookup("monkey1 steve");
		System.out.println(o.getClass().getName());
		System.out.println(o);*/
		ctx.destroySubcontext("vipin");
	
	}
}
