package oop;

public class Employee {
  int eid;
  String ename;
  double esal;
  Employee(int id){
	  eid=id;
  }
  Employee(int id, String name){
	  eid=id;
	  ename=name;
  }
  Employee(int id, String name, double sal){
	  eid=id;
	  ename=name;
	  esal=sal;
  }
} 
hi