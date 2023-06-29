package org.example;

public class even {
   private int number;

    public even(int enter) {
    }

    public boolean isEven() {
        return number/2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public int getValue() {
        return number;
    }

}
