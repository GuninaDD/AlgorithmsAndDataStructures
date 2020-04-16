package com.geekbrains.lesson5.sample.bagpack;

public class Item {
    private final int weight;
    private final int price;
    private final String name;

    public Item(String name, int weight, int price) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    int getWeight() {
        return weight;
    }

    int getPrice() {
        return price;
    }

    String getName() {
        return name;
    }
}
