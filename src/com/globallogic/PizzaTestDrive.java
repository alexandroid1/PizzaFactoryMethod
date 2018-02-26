package com.globallogic;

import com.globallogic.abstractProduct.Pizza;
import com.globallogic.abstractStore.PizzaStore;
import com.globallogic.concreteStore.ChicagoPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
