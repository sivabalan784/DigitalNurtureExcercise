
public class Main
{
    public static void main(String[] args) {
        Logger obj=Logger.getInstance();
        Logger obj2=Logger.getInstance();
        System.out.println();
        System.out.println(obj==obj2);
    }
}
class Logger{
    private static Logger obj=new Logger();
    private Logger(){
        System.out.print("object created");
    }
    public static Logger getInstance(){
        return obj;
    }
}