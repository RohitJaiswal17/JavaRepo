package com.Aggregation;

public class Employee {

	int id;
	String name;
	Address address; // class entity reference

	Employee(int id, String name, Address address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);

		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {

		Address ad = new Address("Pune", "MH", "India");
		Address ad1 = new Address("Indore", "MP", "India");
		Address ad2 = new Address("jabalpur", "MP", "India");
		Address ad3 = new Address("Prayagraj", "UP", "India");

		Employee emp = new Employee(101, "Prathmesh", ad);
		Employee emp1 = new Employee(102, "Govind", ad1);
		Employee emp2 = new Employee(103, "Nidhi", ad2);
		Employee emp4 = new Employee(104, "Ayushi", ad3);

		emp.display();
		emp1.display();
		emp2.display();
		emp4.display();

	}
}
