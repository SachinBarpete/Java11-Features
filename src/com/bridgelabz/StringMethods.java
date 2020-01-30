package com.bridgelabz;

import java.util.stream.Collectors;

/***
 * @author Sachin Barpete
 * @date 30/01/2020
 * @purpose Implementation of java11 String class methods
 */
public class StringMethods {

    public static void main(String[] args) {

        String value1 = "        Sachin      ";
        System.out.println("after strip()        :" + value1.strip());
        System.out.println("after stripLeading() :" + value1.stripLeading());
        System.out.println("after stripTrailing():" + value1.stripTrailing());

        String value2 = " ";
        System.out.println(value2.isBlank());
        System.out.println(value2.isEmpty()); // present before java11

        String value3 = "Hello how are you \n Im good \n";
        System.out.println(value3);
        System.out.println(value3.lines().collect(Collectors.toList()));

        String value4 = "Sachin Barpete ";
        System.out.println(value4.repeat(3));
    }
}
