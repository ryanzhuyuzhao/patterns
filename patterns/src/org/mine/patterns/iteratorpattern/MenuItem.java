package org.mine.patterns.iteratorpattern;

/**
 * @ClassName MenuItem
 * @Description
 * @Author Administrator
 * @Date 2021/3/29 0029 22:43
 * @Version 1.0
 */
public class MenuItem {
    private String name;
    private String desciption;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String desciption, boolean vegetarian, double price) {
        this.name = name;
        this.desciption = desciption;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
