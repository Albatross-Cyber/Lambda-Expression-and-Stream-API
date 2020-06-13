package com.learnJava.lambda.parallelstreams;


public class Sum {

	// If you have a variable mutable then do not use the parallel stream.
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input){
        total+=input;
        //System.out.println("total: " + total);

    }

}