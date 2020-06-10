package com.example.oops.compositions;

public class Person {

	 //composition has-a relationship
    private Job job;
   
    public Person(long salary){
        this.job=new Job();
        job.setSalary(salary);
    }
    public long getSalary() {
        return job.getSalary();
    }
}
