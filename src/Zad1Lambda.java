import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zad1Lambda {

    private static List<Integer> numbers = Arrays.asList(1,2,3,4);
    private static Map<Integer, String> map = new HashMap();

    public static void main(String[] args){

       // prepareMap();

/*        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread.");
            }
        });*/
        System.out.println("1.A");

        Thread t = new Thread( () -> System.out.println("New Thread."));
        t.start();

        System.out.println("Main Thread");

////////////////////////  1.B

        ///////////////////////  FOR EACH  ///////////////////////

        for (int x: numbers) System.out.println(x);

        ///////////////////////  LAMBDA  ///////////////////////

        numbers.forEach(System.out::print);

////////////////////////  1.C

        map.put(1,"first");
        map.put(2,"second");
        map.put(3,"third");

        ///////////////////////  FOR EACH  ///////////////////////

        for (Map.Entry<Integer,String> x: map.entrySet()
             ) {
            System.out.println(x.getKey() + ' ' +x.getValue());
        }

        ///////////////////////  LAMBDA  ///////////////////////

        map.forEach((k,v)-> System.out.println(k+' '+v));




    }
}
