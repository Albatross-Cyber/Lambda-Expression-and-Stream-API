package com.learnJava.lambda.streams;

import java.util.stream.Collectors;

import com.learnJava.lambda.data.Student;
import com.learnJava.lambda.data.StudentDataBase;

public class StreamsSumAvgExample {

    public static int sum(){

        int totalNoOfNotebooks = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));

        return totalNoOfNotebooks;
    }

    public static double average(){

        double totalNoOfNotebooks = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));

        return totalNoOfNotebooks;
    }


    public static void main(String[] args) {


        System.out.println("Total no of Notebooks : " + sum());

        System.out.println("Average no of Notebooks : " + average());
    }
}