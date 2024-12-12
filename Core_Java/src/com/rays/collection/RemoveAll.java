package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveAll {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		Collection c1 = new ArrayList();

		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
		System.out.println(c.removeAll(c1));
		System.out.println(c);
	}
}
