# Lambda-Expression-and-Stream-API

Lambda Expressions & Stream API in Java 8.

Demonstrating Lambdas, Streams, Optionals and Parallel programming in Java 8 using handful of examples.

Before diving into the Lambdas let's first understand about [Anonymous Inner Class](https://www.geeksforgeeks.org/anonymous-inner-class-java/) in Java. [Oracle-doc](https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html)

Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the same time. They are like local classes except that they do not have a name. Use them if you need to use a local class only once.

Syntax: The syntax of an anonymous class expression is like the invocation of a constructor, except that there is a class definition contained in a block of code.

``` Java
// Test can be interface, abstract/concrete class
Test t = new Test ()
{
// data members and methods
public void test_method ()
{
........
........
}
};
```

To understand anonymous inner class, let us take a simple program
