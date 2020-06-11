/**
 *  We can only use Constructor Reference in the context of Functional Interfaces.
 *  
 */
package com.learnJava.lambda;

import java.util.function.Function;
import java.util.function.Supplier;

import com.learnJava.lambda.data.Student;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String, Student> studentFunction = Student::new;

    /* 
     * Compilation Issue
     * Student student = Student::new;  
     */

    public static void main(String[] args) {

        System.out.println(studentSupplier.get());

        System.out.println(studentFunction.apply("Client123"));
    }
}