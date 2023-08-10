package com.modern.Quiz_2_1;

import java.util.ArrayList;
import java.util.List;

public class Quiz_2_1 {
    // 문제 사과 리스트를 인수로 받아 다양한 방법으로 문자열을 생성할수 잇도록( toString) 파라미터화된 prettyPrintApple 메서드 구현하시오!
    // 예를들어 사과무게, 무거운지, 가벼운지 등등등등

    public static void main(String[] args) {

        Apple apple1 = new Apple(199,AppleColor.RED);
        Apple apple2 = new Apple(100,AppleColor.YELLOW);
        Apple apple3 = new Apple(333,AppleColor.GREEN);

        List<Apple> appleList = new ArrayList<>();
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);

        prettyPrintApple(appleList,new AppleFormatter()); // 구현체만 주입

    }





    public static void prettyPrintApple(List<Apple> inventory, ApplePredicate p){
        for (Apple apple : inventory){
            String output = p.accept(apple);
            System.out.println(output);
        }

    }

}

