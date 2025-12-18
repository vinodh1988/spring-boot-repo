package com.fullapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="computers")
public class Computer {
@Id
   private Integer cno;
@Column 
   private String brand;
@Column 
   private String ram;
@Column
   private String cpu;
@Column
   private String storage;
@Column
   private Integer price;

   public Computer() {
	super();
	// TODO Auto-generated constructor stub
   }

   public Computer(Integer cno, String brand, String ram, String cpu, String storage,Integer price) {
	super();
	this.cno = cno;
	this.brand = brand;
	this.ram = ram;
	this.cpu = cpu;
	this.storage = storage;
	this.price=price;
   }

   public Integer getCno() {
	return cno;
   }

   public void setCno(Integer cno) {
	this.cno = cno;
   }

   public String getBrand() {
	return brand;
   }

   public void setBrand(String brand) {
	this.brand = brand;
   }

   public String getRam() {
	return ram;
   }

   public void setRam(String ram) {
	this.ram = ram;
   }

   public String getCpu() {
	return cpu;
   }

   public void setCpu(String cpu) {
	this.cpu = cpu;
   }

   public String getStorage() {
	return storage;
   }

   public void setStorage(String storage) {
	this.storage = storage;
   }

   public Integer getPrice() {
	return price;
   }

   public void setPrice(Integer price) {
	this.price = price;
   }
   
   
   
   
}
