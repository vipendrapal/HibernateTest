package com.vipin.testq;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

public class Monkey implements Referenceable {

	String name;
	String favroutiveFruit;
	boolean likeBanaas;
	public Monkey(String name,
	String favroutiveFruit,
	boolean likeBanaas) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.favroutiveFruit=favroutiveFruit;
		this.likeBanaas=likeBanaas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFavroutiveFruit() {
		return favroutiveFruit;
	}
	public void setFavroutiveFruit(String favroutiveFruit) {
		this.favroutiveFruit = favroutiveFruit;
	}
	public boolean isLikeBanaas() {
		return likeBanaas;
	}
	public void setLikeBanaas(boolean likeBanaas) {
		this.likeBanaas = likeBanaas;
	}
	@Override
	public Reference getReference() throws NamingException {
		Reference ref=new Reference(Monkey.class.getName());
		ref.add(new StringRefAddr("name", this.name));
		ref.add(new StringRefAddr("favroutiveFruit", this.favroutiveFruit));
		ref.add(new StringRefAddr("likeBanaas", Boolean.toString(this.likeBanaas)));
		return ref;
	}


}
