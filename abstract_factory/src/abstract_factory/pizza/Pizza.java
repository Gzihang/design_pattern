package abstract_factory.pizza;

public class Pizza {
    protected String name;
    public void prepare(){
        System.out.println("正在准备"+name+"Pizza");
    }
    public void bake(){
        System.out.println("正在烘培"+name+"Pizza");
    }
    public void cut(){
        System.out.println("正在切分"+name+"Pizza");
    }
    public void box(){
        System.out.println("正在打包"+name+"Pizza");
    }
    public void setName(String name){
        this.name = name;
    }
}
