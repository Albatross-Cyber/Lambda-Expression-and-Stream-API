/** BiConsumer<T,U>
 * 	
 * 	@FunctionalInterface
 *	public interface BiConsumer<T,U>
 *	Represents an operation that accepts two input arguments and returns no result. This is the two-arity specialization of 
 *	Consumer. Unlike most other functional interfaces, BiConsumer is expected to operate via side-effects.
 *	This is a functional interface whose functional method is accept(Object, Object).
 * 
 * 	void accept(T t,U u)
 * 	Performs this operation on the given arguments.
 *	Parameters:
 *	t - the first input argument
 *	u - the second input argument
 */
package com.learnJava.lambda;

import java.util.List;
import java.util.function.BiConsumer;

import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

public class BiConsumerExample {

    public static void nameAndActivities(){

    	// Using Consumer we had to create 2 separate consumers c2 and c3
        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((s) -> studentBiConsumer.accept(s.getName(),s.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> multiply = (a,b) -> {
            System.out.println("Multiplication : " + (a * b));
        };


        BiConsumer<Integer, Integer> addition = (a,b) -> {
            System.out.println("Addition : " + (a + b));
        };

        BiConsumer<Integer, Integer> division = (a,b) -> {
            System.out.println("Division : "  + (a / b));
        };

        multiply.andThen(addition).andThen(division).accept(10,5);

        nameAndActivities();

    }
}

