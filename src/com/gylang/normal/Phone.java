package com.gylang.normal;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/12,
 */

public class Phone implements Comparable{

    private String name;
    private String brand;
    private String color;
    private double price;
    private int ram;
    private int rom;
    private int battery;

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                ", rom=" + rom +
                ", battery=" + battery +
                '}';
    }

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }

    public Phone(String name, String brand, String color, double price, int ram, int rom, int battery) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.ram = ram;
        this.rom = rom;
        this.battery = battery;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public int compareTo(Object o) {
        if (o.equals(this)) {
            return 0;
        } else {
            return 1;
        }
    }
}
