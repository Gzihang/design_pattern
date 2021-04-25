package abstract_factory;

import abstract_factory.factory.AbsFactory;
import abstract_factory.factory.BJFactory;
import abstract_factory.oder.OrderPizza;

public class Use {
    public static void main(String[] args) {
        AbsFactory factory = new BJFactory();
        OrderPizza orderPizza = new OrderPizza(factory);

    }
}
