
public class App extends sysout{
    public static void main(String[] args){
        calc calcu = new calc ();
        
        float number ;
        number = calcu.div(23,25);
        print(""+number);
        print(""+calcu.sub(50,25));
        print(""+calcu.add(50,25));
    }
}
