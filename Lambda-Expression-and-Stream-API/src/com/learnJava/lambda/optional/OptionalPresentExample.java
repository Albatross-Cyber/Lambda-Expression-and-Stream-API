package com.learnJava.lambda.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("Hello Optional");

        System.out.println(stringOptional);
        System.out.println(stringOptional.isPresent());
        if(stringOptional.isPresent())
        	System.out.println(stringOptional.get());

        stringOptional.ifPresent((s -> System.out.println("value is : " + s)));
    }
}
