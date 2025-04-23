import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

// Define a Car class
class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

public class Main {
    //throws keyword
    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access denied you must be 18 or higher");
        }
        else {
            System.out.println("Access granted you are old enough");
        }
    }
    public static void main(String[] args) {


        //Java Exceptions
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }


        //Regex
        // [abc] : find one character from the options in the brackets
        // [^abc] : find a character not between the brackets
        // [0-9] : find a character from the range 0 to 9

        //Lambda Expressions
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.forEach( (n) -> { System.out.println(n); } );
        //Lambda expressions can be stored in variables using the Consumer interface
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        //Lambda expression for comparators
        Collections.sort(myCars, (obj1, obj2) -> {
            Car a = (Car) obj1;
            Car b = (Car) obj2;
            if (a.year < b.year) return -1;
            if (a.year > b.year) return 1;
            return 0;
        });


    }
}