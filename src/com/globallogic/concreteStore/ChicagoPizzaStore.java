package com.globallogic.concreteStore;

import com.globallogic.abstractProduct.Pizza;
import com.globallogic.concreteProducts.ChicagoStyleCheesePizza;
import com.globallogic.concreteProducts.ChicagoStyleClamPizza;
import com.globallogic.concreteProducts.ChicagoStylePepperoniPizza;
import com.globallogic.concreteProducts.ChicagoStyleVeggiePizza;
import com.globallogic.abstractStore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
