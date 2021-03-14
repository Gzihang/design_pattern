import org.w3c.dom.Document;
import org.w3c.dom.Node;
import button.AbstractButton;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class LoginForm {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        AbstractButton source = null;
        try {
            // 创建一个DocumentBuilder对象
            DocumentBuilder db = dbf.newDocumentBuilder();
            // 使用parse方法解析xml文件
            Document document = db.parse("Config.xml");
            Node n1 = document.getElementsByTagName("button").item(0);


            Class source_t = Class.forName(n1.getNodeValue());
            source = (AbstractButton) source_t.newInstance();
            source.display();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
