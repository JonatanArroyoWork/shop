package com.shop.domain;


import java.util.ArrayList;
import java.util.List;

public class Shop {

	private Integer id;
	private String name;
	private int capacity;

	private List<Picture> allPicture = new ArrayList<Picture>();

	private static int counter = 1;

	public Shop() {

		this.id = counter;
		counter++;
	}

	public Shop(String name, int capacity) {

		this.name = name;
		this.capacity = capacity;

		this.id = counter;
		counter++;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	public List<Picture> getAllPicture() {
		return allPicture;
	}

	public boolean containsPicture(Picture picture) {
		return allPicture.contains(picture);
	}

	public void addPicture(Picture picture) throws Exception {
		if (picture == null)
			throw new Exception();
		allPicture.add(picture);

	}

	public void burnPictures() {
		this.allPicture.removeAll(allPicture);
	}
}
