package com.vincentlv.fizzbuzz.test;

import com.vincentlv.fizzbuzz.entity.Game;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_object_when_given_object(){
        Game game = new Game();
        assertThat(game instanceof Game,is(true));
    }

    @Test
    public void should_return_1_when_given_1(){
        Game game = new Game();
        assertThat(game.tell(1),is("1"));
    }

    @Test
    public void should_return_fizz_when_given_3(){
        Game game = new Game();
        assertThat(game.tell(3),is("fizz"));
    }

    @Test
    public void should_return_buzz_when_given_5(){
        Game game = new Game();
        assertThat(game.tell(5),is("buzz"));
    }
    @Test
    public void should_return_fizzbuzz_when_given_15(){
        Game game = new Game();
        assertThat(game.tell(15),is("fizzbuzz"));
    }



}
