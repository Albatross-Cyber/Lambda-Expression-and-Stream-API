package com.learnJava.lambda.parallelstreams;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

public class ParallelStreamExample1 {

   public static List<String> sequentialStream(){

       long start = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream() // Stream<Students>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //<Stream<String>
                .collect(toList());

       long duration = System.currentTimeMillis()-start;
       System.out.println("Duration in sequential stream : "+ duration);

        return studentActivities;
    }

    public static List<String> parallelStream(){

        long start = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .parallelStream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //<Stream<String>
                .collect(toList());

        long duration = System.currentTimeMillis()-start;
        System.out.println("Duration in parallel stream : "+ duration);

        return studentActivities;

    }



    public static void main(String[] args) {


        System.out.println("sequentialStream : " + sequentialStream());

        System.out.println("parallelStream : " + parallelStream());


    }
}