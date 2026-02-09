package day24;

import java.util.ArrayList;
import java.util.Collections;

public class Employees {

	public static void main(String[] args) {
		Employee e1 = new Employee(102,"David",50000);
		Employee e2 = new Employee(101, "Arsh", 35000);
		Employee e3 = new Employee(103, "Akanksha", 90000);
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
       System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		

	}

}

class Employee{
	int E_id;
	String Employee_name;
	int salary;
	
	public Employee(int E_id, String Employee_name, int salary) {
		this.E_id = E_id;
		this.Employee_name = Employee_name;
		this.salary = salary;
	}
	public void setName (String Employee_name) {
		this.Employee_name = Employee_name;
	}
	public void setEid(int E_id) {
		this.E_id = E_id;
	}
	public void setSalary(int salary) {
		this.salary =  salary;
	}
	public int getSalary() {
		return salary;
	}
	public int getEid() {
		return E_id;
	}
	public String getName() {
		return Employee_name;
	}
	public String toString() {
		return E_id + " " + Employee_name + " " + salary;
	}
}
