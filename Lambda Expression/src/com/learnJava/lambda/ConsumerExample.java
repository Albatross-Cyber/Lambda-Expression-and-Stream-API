/**  Consumer<T>
 * 	
 *  @FunctionalInterface
 *  public interface Consumer<T>
 * 
 * 	Represents an operation that accepts a single input argument and returns no result. Unlike most other 
 *  functional interfaces, Consumer is expected to operate via side-effects.
 *  This is a functional interface whose functional method is accept(Object).
 * 	
 * void accept(T t)
 * Performs this operation on the given argument.
 * Parameters: t - the input argument
 *  
 */
package com.learnJava.lambda;

import java.util.List;
import java.util.function.Consumer;

import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

// Java 8 :- https://www.javabrahman.com/java-8/java-8-java-util-function-consumer-tutorial-with-examples/
public class ConsumerExample {

    static Consumer<Student>  c1= p -> System.out.println(p);

    static Consumer<Student>  c2= p -> System.out.print(p.getName().toUpperCase());

    static Consumer<Student>  c3= p -> System.out.println(p.getActivities());


    public static void printName(){

        List<Student> personList = StudentDataBase.getAllStudents();

        personList.forEach(c1);

    }

    public static void printNameAndActivities(){
        System.out.println("printNameAndActivities : ");
        List<Student> personList = StudentDataBase.getAllStudents();
        personList.forEach(c2.andThen(c3));  // Consumer Chaining (using this we can chain n number of functional interfaces)
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("printNameAndActivitiesUsingCondition : ");
        List<Student> personList = StudentDataBase.getAllStudents();
        personList.forEach((s) -> {
            if( s.getGradeLevel()>=3 && s.getGpa()>3.9){
                c2.andThen(c3).accept(s);
            }
        });
    }

    public static void main(String[] args) {

        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();

    }
}