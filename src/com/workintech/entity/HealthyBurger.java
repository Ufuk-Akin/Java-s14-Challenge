package com.workintech.entity;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    private String healthyExtra3Name;
    private double healthyExtra3Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Vegan Rolled");
    }

    public void addHealthyAddition1 (String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2 (String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalprice = super.itemizeHamburger();

        if(healthyExtra1Name != null) {
            totalprice +=this.healthyExtra1Price;
            System.out.println(this.healthyExtra1Name + ": " + this.healthyExtra1Price);
        }
        if(healthyExtra2Name != null) {
            totalprice += healthyExtra2Price;
            System.out.println(this.healthyExtra2Name + ": " +this.healthyExtra2Price);
        }
        return totalprice;
    }
}
