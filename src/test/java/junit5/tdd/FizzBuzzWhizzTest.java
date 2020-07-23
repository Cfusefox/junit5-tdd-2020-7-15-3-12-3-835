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
        String actual= fizzBuzzWhizz.play(number);

        //then
        assertEquals("2", actual);

    }
}
