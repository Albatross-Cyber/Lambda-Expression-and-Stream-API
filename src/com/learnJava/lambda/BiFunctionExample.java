/** Usecase : Create a map of student_name and their respective GPA.
 *  
 *  BiFunction<T,U,R>
 *  
 *  @FunctionalInterface
 *	public interface BiFunction<T,U,R>
 * 	Represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.
 *	This is a functional interface whose functional method is apply(Object, Object).
 *  
 *  R apply(T t,U u)
 *	Applies this function to the given arguments.
 * 	Parameters:
 *	t - the first function argument
 *	u - the second function argument
 *  Returns: the function result
 * 
 */
package com.learnJava.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

public class BiFunctionExample {

    static BiFunction<List<Student>,Predicate<Student>,Map<String, Double>> biFunction = (students,studentPredicate)->{

        Map<String,Double> studentGradeMap = new HashMap<>();
        students.forEach((student -> {

            if(studentPredicate.test(student)){
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        }));

        return studentGradeMap;

    };

    public static void main(String[] args) {

      System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateAndConsumerExample.p1));

    }
}
