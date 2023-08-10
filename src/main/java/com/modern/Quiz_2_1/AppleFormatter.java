package com.modern.Quiz_2_1;

public class AppleFormatter implements ApplePredicate{
    // 구현체

    @Override
    public String accept(Apple apple) {
        String resultWeight = apple.getWeight() > 200 ? "무겁다 " : "가볍다";
        AppleColor appleColor = apple.getAppleColor();
        String resultColor = appleColor.toString();

        return "사과는 " + resultWeight + " 무게를 가졌고 색깔은 "+ resultColor + " 이다.";
    }
}
