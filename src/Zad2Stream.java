import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Zad2Stream {
    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[]args){
        /*2.A Napisz pętle do wyświetlania wsyztkich elelemtów listy numbers
        *
        * 2.B Napisz pętlę for-each do wyswieltania wszsytkich elemetow listy numbers
        *
        * 2.C zrob poprzenie zadanie z wykrozsytaniem lambdy
        *
        * 2.D zastąp lambde method reference
        * */
//2.A
        Iterator<Integer> inte = numbers.iterator();

       while(inte.hasNext()){
           System.out.println(inte.next());
       }
//2.B
        for (int x: numbers
             ) {
            System.out.println(x);
        }
//2.D
        numbers.forEach(System.out::println);
//parzyste foreach
        System.out.println("parzyste");

        for (int x: numbers
        ) {
            if(x%2==0){
                System.out.println(x);
            }
        }
//parzyste stream
        System.out.println("parzyste stream");

        numbers.stream()
                .filter(x -> x%2 == 0)
                .forEach(System.out::println);

//
    }
}
