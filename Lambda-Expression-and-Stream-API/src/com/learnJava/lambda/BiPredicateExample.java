/** BiPredicate<T,U>
 * 
 * 	@FunctionalInterface
 *	public interface BiPredicate<T,U>
 *	Represents a predicate (boolean-valued function) of two arguments. This is the two-arity specialization of Predicate.
 *	This is a functional interface whose functional method is test(Object, Object).
 *
 *	boolean test(T t,U u)
 *	Evaluates this predicate on the given arguments.
 *	Parameters:
 *	t - the first input argument
 *	u - the second input argument
 *	Returns:
 *	true if the input arguments match the predicate, otherwise false 
 */
package com.learnJava.lambda;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

public class BiPredicateExample {

    static BiPredicate<Integer,Double> biPredicate = (gradeLevel, gpa) ->  gradeLevel>=3 && gpa >=3.9 ;

    static Consumer<Student> consumer = (student) -> {
            if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
                System.out.println(student);
            }
    };

    public static  void filterStudents(){

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(consumer);
    }

    public static void main(String[] args) {
        filterStudents();
    }
}
