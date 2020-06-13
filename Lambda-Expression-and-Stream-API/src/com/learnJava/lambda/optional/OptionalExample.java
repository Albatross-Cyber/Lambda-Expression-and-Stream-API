package com.learnJava.lambda.optional;

import java.util.Optional;

import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

public class OptionalExample {

    @SuppressWarnings("unused")
	public static String getStudentName(){

       // Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student!=null){
            return  student.getName();
        }else{
            return  null;
        }
    }

    public static Optional<String> getStudentNameOptional(){

    	// Taking the student object and wraps it in Optional object
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> student = Optional.ofNullable(null);

        if(student.isPresent()){                     
            return  student.map(Student::getName); // don't get confused this with streams map method. Both are different. Optional<String>
        }
        return Optional.empty(); // Represents an optional value with no value
    }

    public static void main(String[] args) {


        if(getStudentNameOptional().isPresent()){
            System.out.println(getStudentNameOptional().get());
        }else{
            System.out.println("Name is returned as empty.");
        }


    }
}