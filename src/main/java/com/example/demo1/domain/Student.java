/*
 * Author Name: Aditya Chaurasia
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package com.example.demo1.domain;

public class Student {
	private int id;
	private String name;
	private  String Address;
	private int mark;

	public Student() {
	}

	public Student(int id, String name, String address, int mark) {
		this.id = id;
		this.name = name;
		Address = address;
		this.mark = mark;
	}
}
