package abstract_factory.factory;


import abstract_factory.pizza.LDCheesePizza;
import abstract_factory.pizza.LDPepperPizza;
import abstract_factory.pizza.Pizza;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
            pizza.setName("LDCheesePizza");
        }else  if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
            pizza.setName("LDCheesePizza");
        }
        return pizza;
    }
}
