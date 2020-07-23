package junit5.tdd;

public class FizzBuzzWhizz {
    String play(int number) {
        if(number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }
}
