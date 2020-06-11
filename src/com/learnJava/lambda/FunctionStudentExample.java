/** Usecase : Create a map of student_name and their respective GPA.
 * 
 * 	Function<T,R>
 * 
 * 	@FunctionalInterface
 *	public interface Function<T,R>
 *	Represents a function that accepts one argument and produces a result.
 *	This is a functional interface whose functional method is apply(Object).
 *
 *	R apply(T t)
 *	Applies this function to the given argument.
 *	Parameters:
 *	t - the function argument
 *	Returns:
 *	the function result
 * 
 */
package com.learnJava.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>>  function = (students -> {

        Map<String,Double> studentGradeMap = new HashMap<>();
        
        students.forEach((student -> {
                studentGradeMap.put(student.getName(),student.getGpa());
        }));

        return studentGradeMap;

    });

    public static void main(String[] args) {

        System.out.println(function.apply(StudentDataBase.getAllStudents()));

    }
}