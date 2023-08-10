package com.modern.Quiz_2_1;


public class Apple {
    private int weight;
    private AppleColor appleColor;


    public Apple(int weight, AppleColor appleColor) {
        this.weight = weight;
        this.appleColor = appleColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public AppleColor getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(AppleColor appleColor) {
        this.appleColor = appleColor;
    }
}
