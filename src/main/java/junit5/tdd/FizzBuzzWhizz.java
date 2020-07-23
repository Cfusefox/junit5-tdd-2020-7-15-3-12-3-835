package junit5.tdd;

public class FizzBuzzWhizz {
    String play(int number) {
        String result = "";
        if(number % 3 == 0) {
            result += "fizz";
        }
        if(number % 5 == 0) {
            result += "buzz";
        }
        if(number % 7 == 0) {
            result += "whizz ";
        }
        if(result.equals("")) {
            return String.valueOf(number);
        } else {
            return result;
        }
    }
}
