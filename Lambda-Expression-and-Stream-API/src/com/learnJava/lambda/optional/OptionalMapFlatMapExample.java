package com.learnJava.lambda.optional;

import java.util.Optional;

import com.learnJava.lambda.data.Bike;
import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

public class OptionalMapFlatMapExample {

	public static void optionalFlatMap() {
		// Optional<Student Optional<Bike>>
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); 
		System.out.println(studentOptional);
		if (studentOptional.isPresent()) {
			Optional<Bike> bikeOptional = studentOptional.flatMap(Student::getBike); // Optional<Bike>
			System.out.println(bikeOptional);
			System.out.println(bikeOptional.get());
		}
	}

	public static void optionalMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		if (studentOptional.isPresent()) {
			Optional<String> nameOptional = studentOptional.map(Student::getName); //
			System.out.println("nameOptional : " + nameOptional);
			System.out.println(nameOptional.get());
		}
	}

	public static void optionalFilter() {

		// Optional<Student> object
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get())
				.filter(student -> student.getGpa() >= 4.3);

		studentOptional.ifPresent(student -> System.out.println(student));

	}

	public static void main(String[] args) {
		optionalFlatMap();
		optionalMap();
		optionalFilter();
	}
}