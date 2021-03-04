package Utils;

import domain.Connection;

public class DBUtils {

    public Connection getConnection(){
        System.out.println("获得连接了!");
        return new Connection();
    }
}
