import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zad3MoreStreams {
    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    private static ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("wyswietla parzyste elementy podwojone streamem\n");
//wyswietla parzyste elementy podwojone streamem
        numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2) //do podwajania
                .forEach(System.out::println);
        System.out.println("drukowanie referencji do streama\n");
/// drukowanie referencji do streama
        System.out.println(numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)); //do podwajania);
        System.out.println("sume podowjonych wartosci parzystych\n");
/// sume podowjonych wartosci parzystych
        Integer sum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2) //do podwajania
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

        sum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x * 2)
                .sum(); //do podwajania
        // .map(x -> x*2) //do podwajania
        //    .mapToInt(Integer::intValue).sum();

        System.out.println(".mapToInt(Integer::intValue).sum(); = " + sum+ "\n");

/// nieparzyste elementy do innej listy

        List<Integer> oddNumbers = new ArrayList<>();

        numbers.stream()
                .filter(x -> x % 2 != 0)
                .forEach(x -> oddNumbers.add(x));


        List<Integer> oddNumbersCorrect = numbers.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("oddNumbersCorrect: " + oddNumbersCorrect+"\n");
/// lista na mape


        cars.add(new Car("BMW", 1999, 120000));
        cars.add(new Car("Mazda", 1997, 10000));
        cars.add(new Car("Mazda", 1999, 80000));
        cars.add(new Car("BMW", 1997, 125600));
        cars.add(new Car("Audi", 2099, 20000));
        cars.add(new Car("Audi", 1999, 120200));

        Map<String, Car> carsMap = cars.stream()
                .collect(Collectors.toMap(
                        c -> c.getName() + ":" + c.getYear(),
                        c ->c )
                );
//////////
        System.out.println("===================================\n");
        System.out.println(
                cars.stream()
                .collect(Collectors.groupingBy(Car::getName))
        );
    }



}

