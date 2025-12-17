package com.fullapp.entities;

public class Person {
     private Integer sno;
     private String name;
     private String city;
     
    public Person() {
    	
    }
    
    public Person(int sno,String name,String city) {
    	this.sno=sno;
    	this.name=name;
    	this.city=city;
    }
    public String getCity() {
		return city;
	}
    public Integer getSno() {
    	return sno;
    }
    public String getName() {
    	return name;
    	
    }
    
    public void setSno(Integer  sno) {
    	this.sno=sno;
    }
    
    public void SetName(String name) {
    	this.name=name;
    }
    
    public void setCity(String city) {
    	this.city=city;
    }
    
}
