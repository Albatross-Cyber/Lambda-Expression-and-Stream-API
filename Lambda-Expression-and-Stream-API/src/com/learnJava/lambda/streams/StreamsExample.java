package com.learnJava.lambda.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		
	    Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
	    Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
	    
	    Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
	    		// We can use peek method to debug the stream APIs after each step
	    		/*.peek((student -> {
                    System.out.println(student);
                 }))*/ 
	    		.filter(p1)//Stream<Students>
	    		.filter(p2)//Stream<Students>
	    		.collect(Collectors.toMap(Student::getName ,Student::getActivities )); //Map
	    
	    System.out.println(studentMap);
	}
}
