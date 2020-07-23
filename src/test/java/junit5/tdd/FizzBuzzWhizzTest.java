package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FizzBuzzWhizzTest {

    @Test
    void should_return_fizz_when_play_fizz_buzz_whizz_given_9() {
        //given
        int number = 9;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual= fizzBuzzWhizz.play(number);

        //then
        assertEquals("fizz", actual);

    }
}
