package com.jeffrey.demo;

public class Panda {

	public void visit_parameter(Customer c) {
		System.out.println("Panda says hi to customer " + c.getId_parameter());
	}

	public void visit_threadLocal() {
		System.out.println("Panda says hi to customer " + Customer.getId_threadLocal() );
	}


	public void visit_static() {
		System.out.println("Panda says hi to customer " + Customer.id_static);
	}
}
