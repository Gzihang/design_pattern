package abstract_factory.pizza;

public class LDCheesePizza  extends Pizza{
    public void setName(String name){
        if (name.equals("LDCheesePizza"))
            this.name = "伦敦的奶酪披萨";
    }
}
