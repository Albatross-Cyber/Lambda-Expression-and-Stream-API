package com.learnJava.lambda.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	// Optional<T> ofNullable(T value)
    public static Optional<String> ofNullable(){

       return  Optional.ofNullable("Hello");
       // return  Optional.ofNullable("null");
    }

    public static Optional<String> of(){

    	// Optional<T> of(T value), of() always expects the valid value.
        return  Optional.of("Hello");
       // return  Optional.of(null);

    }

    public static Optional<String> empty(){

        return  Optional.empty();
        // return  Optional.of(null);

    }
    public static void main(String[] args) {

    	System.out.println(ofNullable());
        System.out.println(ofNullable().get());
        System.out.println(of());
        System.out.println(empty().get());
    }
}
