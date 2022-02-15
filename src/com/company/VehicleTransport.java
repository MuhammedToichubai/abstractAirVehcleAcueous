package com.company;

import java.time.LocalDate;

public abstract class VehicleTransport {
    private String brand;
    private String name;
    private String color;
    private int volume;
    private LocalDate yearOfIssue;

    public abstract void moveJuruu();

    public VehicleTransport() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "VehicleTransport{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
