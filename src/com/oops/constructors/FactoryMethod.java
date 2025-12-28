package com.oops.constructors;

public class FactoryMethod {
	private int id;
	private String name;
	
	public FactoryMethod(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "FactoryMethod [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public static FactoryMethod accept(int id, String name) {
		return new FactoryMethod(id,name);
		
	}
	
	

}
