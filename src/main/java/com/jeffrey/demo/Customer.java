package com.jeffrey.demo;

public class Customer {

	public static String id_static;

	private String id_parameter;

	private static ThreadLocal<String> id_threadLocal = new ThreadLocal<String>();

	public Customer (String id) {
		id_parameter = id;
		id_static = id;
		id_threadLocal.set(id);
	}

	public String getId_parameter() {
		return id_parameter;
	}

	public static String getId_threadLocal() {
		return id_threadLocal.get();
	}

}
