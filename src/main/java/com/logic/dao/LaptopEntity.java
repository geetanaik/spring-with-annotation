package com.logic.dao;

import java.sql.Timestamp;
import java.util.Arrays;

public class LaptopEntity {
	private int lid;
	private String name;
	private String ram;
	private String color;
	private String screen;
	private byte[] photo;
	private Timestamp doe;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Timestamp getDoe() {
		return doe;
	}

	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}

	@Override
	public String toString() {
		return "LaptopEntity [lid=" + lid + ", name=" + name + ", ram=" + ram + ", color=" + color + ", screen="
				+ screen + ", photo=" + Arrays.toString(photo) + ", doe=" + doe + "]";
	}

}
