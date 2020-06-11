/** BinaryOperator<T>
 * 
 *  @FunctionalInterface 
 *  public interface BinaryOperator<T> extends BiFunction<T,T,T>
 *  
 *  Represents an operation upon two operands of the same type, producing a result of the same type as the operands. 
 *  This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
 *  This is a functional interface whose functional method is BiFunction.apply(Object, Object).
 */
package com.learnJava.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	   static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

	    public static void main(String[] args) {

	        BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;

	        System.out.println(binaryOperator.apply(3,4));

	        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
	        System.out.println("Result is: " + maxBy.apply(5, 6));

	        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
	        System.out.println("Result is: " + minBy.apply(5, 6));

	    }
	}
