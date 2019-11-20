package com.ustglobal.objectclass;

public class Remote {
	void add() {
		System.out.println("add() method");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Remote r = new Remote();
		Class c = r.getClass();//Return type is Class
		Object o = c.newInstance();//Return type is Object
		Remote q = (Remote)o;//Down Casting
		q.add();
	}
}
