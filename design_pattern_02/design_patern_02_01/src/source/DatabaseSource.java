package source;

public class DatabaseSource implements AbstractSource
{
    @Override
    public void ConnectSource() {
        System.out.println("\u6b63\u5728\u4f7f\u7528DatabaseSource!!!");
    }
}