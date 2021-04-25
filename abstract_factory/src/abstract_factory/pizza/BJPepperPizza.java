package abstract_factory.pizza;

public class BJPepperPizza extends Pizza{
    public void setName(String name){
        if (name.equals("BJPepperPizza"))
            this.name = "北京的胡椒披萨";
    }
}
