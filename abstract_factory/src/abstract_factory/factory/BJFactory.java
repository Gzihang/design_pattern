package abstract_factory.factory;

import abstract_factory.pizza.BJCheesePizza;
import abstract_factory.pizza.BJPepperPizza;
import abstract_factory.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
            pizza.setName("BJCheesePizza");
        }else  if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
            pizza.setName("BJPepperPizza");
        }
        return pizza;
    }
}
