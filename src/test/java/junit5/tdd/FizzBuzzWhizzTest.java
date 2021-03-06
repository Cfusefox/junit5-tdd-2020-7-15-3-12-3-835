package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FizzBuzzWhizzTest {

    @Test
    void should_return_2_when_play_fizz_buzz_whizz_given_2() {
        //given
        int number = 2;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual= fizzBuzzWhizz.countOff(number);

        //then
        assertEquals("2", actual);

    }

    @Test
    void should_return_fizz_when_play_fizz_buzz_whizz_given_9() {
        //given
        int number = 9;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.countOff(number);

        //then
        assertEquals("fizz", actual);

    }

    @Test
    void should_return_buzz_when_play_fizz_buzz_whizz_given_10() {
        //given
        int number = 10;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.countOff(number);

        //then
        assertEquals("buzz", actual);
    }

    @Test
    void should_return_whizz_when_play_fizz_buzz_whizz_given_14() {
        //given
        int number = 14;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.countOff(number);

        //then
        assertEquals("whizz", actual);
    }

    @Test
    void should_return_fizz_buzz_when_play_fizz_buzz_whizz_given_15() {
        //given
        int number = 15;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.countOff(number);

        //then
        assertEquals("fizzbuzz", actual);
    }

    @Test
    void should_return_fizz_buzz_whizz_when_play_fizz_buzz_whizz_given_105() {
        //given
        int number = 105;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.countOff(number);

        //then
        assertEquals("fizzbuzzwhizz", actual);
    }

}
