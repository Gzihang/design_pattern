package Service;

import Dao.UserDao;
public class LoginForm {
    UserDao userDao = new UserDao();
    public void init(){
        System.out.println("初始化成功");
    }
    public void display(){
        System.out.println("展示页面");
    }
    public void validate(String username, String password){
        if (userDao.findUser(username, password)){
            System.out.println("登陆成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
