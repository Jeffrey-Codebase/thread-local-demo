package com.jeffrey.demo;

public class Building {

	private Panda panda = new Panda();

	public void visit_parameter(Customer c) {
		System.out.println("Customer " + c.getId_parameter() + " go into the building");
		panda.visit_parameter(c);
	}

	public void visit_threadLocal() {
		System.out.println("Customer " + Customer.getId_threadLocal() + " go into the building");
		panda.visit_threadLocal();
	}


	public void visit_static() {
		System.out.println("Customer " + Customer.id_static + " go into the building");
		panda.visit_static();
	}

}
