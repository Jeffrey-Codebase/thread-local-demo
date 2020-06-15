package com.jeffrey.demo;

/**
 * Hello world!
 *
 */
public class App {
	private Zoo zoo = new Zoo();

	class VisitThread extends Thread {

		int id, testCase;

		public VisitThread(int id, int testCase) {
			this.id = id;
			this.testCase = testCase;
		}

		@Override
		public void run() {
			Customer c = new Customer(String.valueOf(id));
			// sleep a while to check whether the static variable has been changed
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			switch (testCase) {
			case 1:
				zoo.visit_parameter(c);
				break;
			case 2:
				zoo.visit_threadLocal();
				break;
			case 3:
				zoo.visit_static();
				break;
			}
		}
	}

	public void visit_parameter() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			new VisitThread(i, 1).start();
		}
		Thread.sleep(500);
	}

	public void visit_threadLocal() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			new VisitThread(i, 2).start();
		}
		Thread.sleep(500);
	}

	public void visit_static() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			new VisitThread(i, 3).start();
		}
		Thread.sleep(500);
	}
}
