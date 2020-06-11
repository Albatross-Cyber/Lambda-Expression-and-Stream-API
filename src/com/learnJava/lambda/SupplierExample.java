/**  Supplier<T>
 * 	 
 *	@FunctionalInterface
 *	public interface Supplier<T>
 *
 *	T get()
 *	Gets a result.
 *	Returns: a result 
 */
package com.learnJava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

public class SupplierExample {

    public static  Supplier<Student> studentSupplier = () -> {
      return  new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
    };

    public static  Supplier<List<Student>> studentsSupplier = () -> StudentDataBase.getAllStudents();

    public static void main(String[] args) {

        Student student = studentSupplier.get();

        System.out.println("Student is : " + student);

        System.out.println("Students are : " + studentsSupplier.get());
    }
}
