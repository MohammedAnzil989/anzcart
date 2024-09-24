package com.anzcode.anzcart.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Product {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
 
   private String name;
   public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getRatings() {
	return ratings;
}
public void setRatings(double ratings) {
	this.ratings = ratings;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getSeller() {
	return seller;
}
public void setSeller(String seller) {
	this.seller = seller;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public int getNumOfRevievw() {
	return numOfRevievw;
}
public void setNumOfRevievw(int numOfRevievw) {
	this.numOfRevievw = numOfRevievw;
}
private double price;
   public Product(String name, double price, String description, double ratings, String category, String seller, int stock,
		int numOfRevievw ,List<String>images) {
	super();
	this.name = name;
	this.price = price;
	this.description = description;
	this.ratings = ratings;
	this.category = category;
	this.seller = seller;
	this.stock = stock;
	this.numOfRevievw = numOfRevievw;
	this.images = images;
}
public List<String> getImages() {
	return images;
}
public void setImages(List<String> images) {
	this.images = images;
}
public Product() {
	super();
}
private String description;
   private double ratings;
   private String category;
   private String seller;
   private int stock;
   private int numOfRevievw;
   @ElementCollection
   @Column(name="image_url")
   private List<String> images;
}
