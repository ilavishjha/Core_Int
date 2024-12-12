package com.rays.collection.comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		
		

		if (this.id==o.id) {
			return o.name.compareTo(this.name);
			

		} else {

			return this.id - o.id;

		}
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

}