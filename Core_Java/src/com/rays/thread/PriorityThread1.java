package com.rays.thread;


	public class PriorityThread1 extends Thread {
	    String name = null;

	    public PriorityThread1(String name) {
	        this.name = name;
	    }

	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(name + " " + getPriority() + " " + i);
	        }
	    }

	    public static void main(String[] args) {
	        PriorityThread1 p1 = new PriorityThread1("Arun");
	        PriorityThread1 p2 = new PriorityThread1("Amisha");
	        PriorityThread1 p3 = new PriorityThread1("Mahak");

	        p1.setPriority(1);      //set lowest priority
	        p2.setPriority(10);     //set highest priority
//	        p1.setPriority(Thread.MIN_PRIORITY);
//	        p2.setPriority(Thread.MAX_PRIORITY);

	        p1.start();
	        p2.start();
	        p3.start();
	    }
	}

