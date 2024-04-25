package com.hw1.model.vo;

public class Employee {
	 private int empNo;
	   private String empName;
	   private String dept;
	   private String job;
	   private int age;
	   private char gender;
	   private int salary;
	   private double bonusPoint;
	   private String phone;
	   private String address;
	   
	   // 기본생성자
	   public Employee() {};
	   
	   // 6개
	   public Employee(int empNo, String empName, int age, char gender, String phone, String address) {
	      this.empNo = empNo;
	      this.empName = empName;
	      this.age = age;
	      this.gender = gender;
	      this.phone = phone;
	      this.address = address;
	      
	      
	      
	   }
	   
	   
	   
	   // 매개변수 생성자 (전체)
	   public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
	      this.empNo = empNo;
	      this.empName = empName;
	      this.dept = dept;
	      this.job = job;
	      this.age = age;
	      this.gender = gender;
	      this.salary = salary;
	      this.bonusPoint = bonusPoint;
	      this.phone = phone;
	      this.address = address;
	   }
	   
	   // set
	   
	   public void setEmpNo(int empNo) {
	      this.empNo = empNo;
	   }
	   public void setEmpName(String empName) {
	      this.empName = empName;
	   }
	   public void setDept(String dept) {
	      this.dept = dept;
	   }
	   public void setJob(String job) {
	      this.job = job;
	   }
	   
	   public void setAge(int age) {
	      this.age = age;
	   }
	   public void setGender(char gender) {
	      this.gender = gender;
	   
	   }
	   public void setSalary(int salary) {
	      this.salary = salary;
	   }
	   public void setBonusPoint(double bonusPoint) {
	      this.bonusPoint = bonusPoint;
	   }
	   public void setPhone(String phone) {
	      this.phone = phone;
	   }
	   
	   public void setAddress(String address) {
	      this.address = address;
	   }
	   
	   // get
	   
	   public int getempNo(){
	      return empNo;
	   }
	   public String getEmpName(){
	      return empName;
	   }
	   
	   public String getDept(){
	      return dept;
	   }
	   
	   public String getJob() {
	      return job;
	   }

	   public int getAge() {
	      return age;
	   }
	   
	   public char getGender() {
	      return gender;
	   
	   }
	   public int getSalary() {
	      return salary;
	   }
	   public double getBonusPoint() {
	      return bonusPoint;
	   }
	   public String getPhone() {
	      return phone;
	   }
	   
	   public String getAddress() {
	      return address;
	   }
	   
	   public String information(){
	      return "emp[" + empNo + "]" + " : " + empNo + ", " + empName + ", " + dept + ", " + job + ", " + age + ", " + gender + ", " + salary + ", " + bonusPoint + ", " + phone + ", " + address;
	      
	      
	      
	      
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
	
	
	
	
	


	
	
	
	