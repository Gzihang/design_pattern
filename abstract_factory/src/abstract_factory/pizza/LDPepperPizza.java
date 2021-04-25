package abstract_factory.pizza;

public class LDPepperPizza extends Pizza{
    public void setName(String name){
        if (name.equals("LDPepperPizza"))
            this.name = "伦敦的胡椒披萨";
    }
}
