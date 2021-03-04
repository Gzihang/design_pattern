package Dao;

import Utils.DBUtils;

public class UserDao {
    DBUtils dbUtils=new DBUtils();
    public boolean findUser(String username, String password){
        System.out.println("找到用户了!");
        return true;
    }
}
