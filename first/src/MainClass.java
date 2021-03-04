import Service.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;

public class MainClass {
    public static void main(String[] args) {
        LoginForm loginForm=new LoginForm();
        loginForm.init();
        loginForm.display();
        loginForm.validate("root", "123");
    }
}
