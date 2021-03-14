import org.w3c.dom.Node;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import transformer.AbstractTransformer;
import source.AbstractSource;
import javax.xml.parsers.DocumentBuilderFactory;



public class Main
{
    public static void main(final String[] args) {
        final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        AbstractSource source = null;
        AbstractTransformer transformer = null;
        try {
            final DocumentBuilder db = dbf.newDocumentBuilder();
            final Document document = db.parse("Config.xml");
            final Node n1 = document.getElementsByTagName("source").item(0);
            System.out.println(n1.getAttributes().item(0));
            final Node n2 = document.getElementsByTagName("book").item(0);
            final Class source_t = Class.forName("source.DatabaseSource");
            source = source_t.newInstance();
            final Class transformer_t = Class.forName("transformer.XLSTransformer");
            transformer = transformer_t.newInstance();
            source.ConnectSource();
            transformer.UseTransformer();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}