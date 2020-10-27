package com.vincentlv.fizzbuzz.entity;

public class Game {
    public String tell(int given) {
        if (given%3 ==0&&given%5 ==0) return "fizzbuzz";
        if (given%3 ==0) return "fizz";
        if (given%5 ==0) return "buzz";
        return "1";
    }

}
