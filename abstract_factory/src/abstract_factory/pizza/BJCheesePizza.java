package abstract_factory.pizza;

public class BJCheesePizza extends Pizza{
    public void setName(String name){
        if (name.equals("BJCheesePizza"))
            this.name = "北京的奶酪披萨";
    }
}
