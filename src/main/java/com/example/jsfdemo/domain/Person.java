package com.example.jsfdemo.domain;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {
	
	private int id;
	private String firstName = "";
	private String lastName = "";
	private String zipCode = "";
	private String pin = "";
	private String dokogo = "";
	private Date dateOfBirth = new Date();
	private Date kiedy = new Date();
	private String odkiedy;
	private int dokiedy;
	private double weight;
	private boolean married;
	private int numOfChildren;
	
	
	@Size(min = 2, max = 20)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Pattern(regexp = "[0-9]{2}-[0-9]{3}")
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Size(min = 2)
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	@Min(0)
	public int getNumOfChildren() {
		return numOfChildren;
	}
	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}
	
	@Past
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Future
	public Date getKiedy() {
		return kiedy;
	}
	public void setKiedy(Date kiedy) {
		this.kiedy = kiedy;
	}
	public String getDokogo() {
		return dokogo;
	}
	public void setDokogo(String dokogo) {
		this.dokogo = dokogo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOdkiedy() {
		return odkiedy;
	}
	public void setOdkiedy(String odkiedy) {
		this.odkiedy = odkiedy;
	}
	public int getDokiedy() {
		return dokiedy;
	}
	public void setDokiedy(int dokiedy) {
		this.dokiedy = dokiedy;
	}

	
}
