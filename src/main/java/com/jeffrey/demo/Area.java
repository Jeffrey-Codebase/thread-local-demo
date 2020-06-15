package com.jeffrey.demo;

public class Area {
	private Building building = new Building();

	public void visit_parameter(Customer c) {
		System.out.println("Customer " + c.getId_parameter() + " go into the area");
		building.visit_parameter(c);
	}

	public void visit_threadLocal() {
		System.out.println("Customer " + Customer.getId_threadLocal() + " go into the area");
		building.visit_threadLocal();
	}


	public void visit_static() {
		System.out.println("Customer " + Customer.id_static + " go into the area");
		building.visit_static();
	}
}
