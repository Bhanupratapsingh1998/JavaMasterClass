package com.dsa2024.opps;

class Fruit {
    Fruit get() {
        System.out.println("Returning Fruit");
        return this;
    }
}

class Apple extends Fruit {
    @Override
    Apple get() {
        System.out.println("Returning Apple");
        return this;
    }
}

public class CovariantType {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        fruit.get();
    }
}
