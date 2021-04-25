package abstract_factory.factory;

import abstract_factory.pizza.Pizza;

public interface AbsFactory {
    Pizza createPizza(String orderType);
}
