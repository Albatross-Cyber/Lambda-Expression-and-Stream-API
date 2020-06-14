![image](https://img.shields.io/apm/l/vim-mode?color=Green&logo=MIT&logoColor=License)
![image](https://img.shields.io/appveyor/build/gruntjs/grunt?style=flat-square)
![image](https://img.shields.io/azure-devops/coverage/swellaby/opensource/25)

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
``` Java 
interface Age 
{ 
	int x = 21; 
	void getAge(); 
} 
class AnonymousDemo 
{ 
	public static void main(String[] args) 
	{ 
		// Myclass is implementation class of Age interface 
		MyClass obj=new MyClass(); 

		// calling getage() method implemented at Myclass 
		obj.getAge();	 
	} 
} 

// Myclass implement the methods of Age Interface 
class MyClass implements Age 
{ 
	@Override
	public void getAge() 
	{ 
		// printing the age 
		System.out.print("Age is "+x); 
	} 
} 
```

In the program, interface Age is created with getAge () method and x=21.  Myclass is written as implementation class of Age interface. As done in Program, there is no need to write a separate class Myclass. Instead, directly copy the code of Myclass into this parameter, as shown here:

``` Java 
Age oj1 = new Age () {
            @Override
            public void getAge () {
                System.out.print("Age is "+x);
            }
        };
```
Here, an object to Age is not created but an object of Myclass is created and copied in the entire class code as shown above. This is possible only with anonymous inner class. Such a class is called ‘anonymous inner class’, so here we call ‘Myclass’ as anonymous inner class. 

**Anonymous inner class version of the above Program**
``` Java
interface Age 
{ 
	int x = 21; 
	void getAge(); 
} 
class AnonymousDemo 
{ 
	public static void main(String[] args) { 

		// Myclass is hidden inner class of Age interface 
		// whose name is not written but an object to it 
		// is created. 
		Age oj1 = new Age() { 
			@Override
			public void getAge() { 
				// printing age 
				System.out.print("Age is "+x); 
			} 
		}; 
		oj1.getAge(); 
	} 
}
```

Now, One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as an interface that contains only one method, then the syntax of anonymous classes may seem unwieldy and unclear. In these cases, you're usually trying to pass functionality as an argument to another method. Lambda expressions enable you to do this, to treat functionality as method argument, or code as data.  Anonymous Classes, shows you how to implement a base class without giving it a name. Although this is often more concise than a named class, for classes with only one method, even an anonymous class seems a bit excessive and cumbersome. [Lambda expressions](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html) let you express instances of single-method classes more compactly. 

They are anonymous methods (methods without names) used to implement a method defined by a [functional interface](https://medium.com/better-programming/learn-these-4-things-and-working-with-lambda-expressions-b0ab36e0fffc).



### Lambda Expressions
* [Java 8 Lambda Basics](https://youtu.be/gpIUfj3KaOc?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3)
* [Lambda Expressions in Java 8 (Part 1)](https://medium.com/@kasunprageethdissanayake/lambda-expressions-in-java-8-part-1-9de06c295723)
* [Lambda Expressions in Java 8 (Part 2)](https://medium.com/@kasunprageethdissanayake/lambda-expressions-in-java-8-part-2-83985d18115c)
* [Lambda Expressions in Java 8 (Part 3)](https://medium.com/@kasunprageethdissanayake/lambda-expressions-in-java-8-part-3-32070eb99ad7)
* [Lambda Expressions in Java 8 (Part 4)](https://medium.com/@kasunprageethdissanayake/lambda-expressions-in-java-8-part-4-ad3fe41f4be0)


Lambda is mainly used to implement [Functional Interfaces (SAM)](http://tutorials.jenkov.com/java-functional-programming/functional-interfaces.html) i.e. an interface that has exactly one abstract method.

[Comparable vs Comparator in Java](https://www.youtube.com/watch?v=oAp4GYprVHM&t=1s)
* [GeeksForGeeks](https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/)


![image](https://user-images.githubusercontent.com/65066310/84444506-959a2800-ac5f-11ea-8445-eaaecfe97cfa.png)

![image](https://user-images.githubusercontent.com/65066310/84444809-3688e300-ac60-11ea-8cf1-f528a9305ecf.png)

There are mainly 4 new functional interfaces are there which got introduced as part of Java 8: -
Consumer
Predicate
Function 
Supplier
and each and every functional interface have their own extensions such as Consumer – BiConsumer, BiPredicate – BiPredicate and Function – BiFunction, UnaryOperator, BinaryOperator.


![image](https://user-images.githubusercontent.com/65066310/84444861-528c8480-ac60-11ea-9374-749c5c429b6b.png)



All the Functional interfaces which provide target types for lambda expressions and method references are present in [**java.util.function**](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) package.


##### [Java 8 forEach](https://www.baeldung.com/foreach-java)

Simply put, the Javadoc of forEach stats that it “performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.”
And so, with forEach, we can iterate over a collection and perform a given action on each element, like any other Iterator.

![image](https://user-images.githubusercontent.com/65066310/84445051-c3cc3780-ac60-11ea-8cbc-a3a7ebd18dff.png)



I have coverend the various aspects of lambda present in com.learnJava.lambda package via taking Student and StudentDataBase class(present in com.learnJava.lambda.data) as a reference.

![image](https://user-images.githubusercontent.com/65066310/84445437-a8adf780-ac61-11ea-88de-22715adf5f8f.png)











![image](https://user-images.githubusercontent.com/65066310/84445685-c2e7d580-ac61-11ea-94e0-0d499426096a.png)













**Where to use Method Reference ?**

* Lambda expressions referring to a method directly.

Using Lambda:
``` Java Function<String,String> upperCase =  (name) -> name.toUpperCase();```

Using Method Reference:
``` Java Function<String,String> upperCase =  (name) -> String::toUpperCase();```




**Where Method Reference is not applicable?**  
``` Java Predicate<Student> predicateUsingLambda = (s) -> s.getGradelevel()>=3;```



**Constructor Reference**  


Syntax :  Classname::new  


***We can only use Constructor Reference in the context of Functional Interfaces.***  


Example:  
``` Java Supplier<Student> studentSupplier = Student::new;```  


Invalid:  
``` Java Student student = Student::new; //Compilation Issue```


### Effectively Final  
Lambda's are allowed to use local variables but not allowed to modify it even though they are not declared final. This concept is called Effectively Final.  

``` Java
int value = 4;
Consumer<Integer> c1 = (a) -> {
    // value = 6; // reassigning not allowed
    // System.out.println(i+value);
};    
```  

Prior to Java 8, any variables that's used inside the anonymous class should be declared ***final***.  


***[Lambda Expressions and Functional Interfaces: Tips and Best Practices]***(https://www.baeldung.com/java-8-lambda-expressions-tips)  


### Introduction to Streams API  
Main purpose is to perform some opertaions on collections. Parallel opertions are easy to perform with Streams API without having to spawn a multiple threads. Streams is a sequence of elements which can be created out of List/Arrays or any kind of I/O. Also one thing to notice in the examples is that Stream APIs are ***lazy*** in nature **Package java.util.stream** [Oracle-doc](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)


``` Java
List<String> names = Arrays.asList("Adam","Dan","Jenny");
names.stream(); //creates a stream
``` 


Streams operation can be performed either ***sequentially*** or ***parallel***.  
``` Java
names.parallelStream();
```   

![image](https://user-images.githubusercontent.com/65066310/84498218-d3ce3080-accd-11ea-984f-e19776e20ecc.png)  


``` Java
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
```  





![image](https://user-images.githubusercontent.com/65066310/84498647-acc42e80-acce-11ea-97f1-4314edd4d4b0.png)  
![image](https://user-images.githubusercontent.com/65066310/84498703-ca919380-acce-11ea-9eef-eacb39a50a25.png)  




### Stream API : map()
It is used to convert(trasform) one type to another. Don't get confused this with map collection.  


### Stream API : flatMap()
Converts(Transforms) one type to another as like map() method and is used in the context of Stream where each element in the stream represents multiple elements.
Example: Stream<List>, Steam<Arrays>  


### Stream API : distinct(), count() and sorted()  
distinct – Returns a stream with unique elements
count – Returns a long with the total no of elements in the Stream.
sorted - Sort the elements in the stream


### Stream API : filter()  
filters the elements in the stream. Input to the filter is a ***Predicate*** Functional Interface.  


### Stream API : reduce()  
This is also a terminal operation like reduce and is used to reduce the contents of a stream to a single value. It takes two parameters as an input.  
First parameters – default or initial value
Second Parameter – BinaryOperator<T>


### Stream API : Max/Min using reduce(), limit(), skip(), anyMatch(), allMatch(), noneMatch(), findFirst() and findAny().  
All these functions except Max/Min and skip() does not have to iterate the whole stream to evaluate the result and are short circuit functions.  


***Short Circuiting***  
Examples of Short Circuiting:  
``` Java
Example 1:
if(boolean1 && boolean2){ //AND
//body
}

If the first expression evaluates to false then the second expression wont even execute.

Example 2:
if(boolean1 || boolean2){ //OR
//body
}

If the first expression evaluates to true then the second expression wont even execute.
```  


***Stream APIs have an internal state but not all stream functions maintain and internal state***  


![image](https://user-images.githubusercontent.com/65066310/84538686-b4f08e00-ad0f-11ea-8a2f-8c891d304aca.png)  



Intermediate Operations  
``` 
Stateful functions   
distinct()  
sorted()  
skip()  
limit()  

Stateless functions  
map()  
filter(), etc.  
```  


***Stateful Functions***  
``` Java
public static List<String> printUniqueStudentActivities() { 
  List<String> studentActivities = StudentDataBase.getAllStudents()
		  			.stream()
		  			.map(Student::getActivities)
		  			.flatMap(List::stream)
		  	                .distinct() // needs the state of the previously processed elements
		  		        .sorted() // needs the state of the previously processed elements
		  		        .collect(toList());
  	return studentActivities;
}
```  


***Stateless Functions***  
``` Java
public static List<String> namesUpperCase(List<Student> names){ 
  List<String> namesUpperCase = names.stream() //Stream<Student>
			             .map(Student::getName) //Stream<String> - stateless
				     .map(String::toUpperCase) // Stream<String> -> UpperCase - stateless
				     .collect(toList()); // returns List - stateless
	return namesUpperCase;
}
```  


### Stream API : Factory methods  
of(), iterate() and generate()  
```  
Of() -> Creates a stream of certain values passed to this method.  
Example:  
Stream<String> stringStream = Stream.of(“adam”,”dan”,”Julie”);  


iterate(), generate() -> Used to create infinite Streams.  
Example:  
Stream.iterate(1, x->x*2)  

Example:
Stream.generate(<Supplier>)
```  


### Numeric Streams  
Represents the primitive values in a Stream.  
IntStream  
LongStream  
DoubleStream    


Int Stream:  
IntStream.range(1,50) -> Returns an IntStream of 49 elements from 1 to 49.  
IntStream.rangeClosed(1,50) -> Returns an IntStream of 50 elements from 1 to 50.  
Long Stream:  
LongStream.range(1,50) -> Returns a LongStream of 49 elements from 1 to 49.  
LongStream.rangeClosed(1,50) -> Returns a LongStream of 50 elements from 1 to 50.  
DoubleStream:  
It does not support the range ()and rangeClosed().  
sum()  
max()  
min()  
average()  


Numeric	Streams : Boxing() and UnBoxing()  
Boxing():  
Converting a primitive type to Wrapper Class type  
Example: Converting an int (primitive) to Integer(wrapper).    

UnBoxing():  
Converting a Wrapper Class type to primitive type.  
Example: Converting an Integer(wrapper) to int(primitive).  

Numeric Streams – mapToObj(), mapToLong(), mapToDouble()  
mapToObj –> Convert a each element numeric stream to some Object.  
mapToLong –> Convert a numeric stream to a Long Stream.  
mapToDouble –> Convert a numeric stream to a Double Stream.  


### Stream Terminal Opertaions  
Terminal Operations collects the data for you and starts the whole stream pipeline.  
```  
Terminal Operations:     
forEach()  
min()  
max()  
reduce()  
collect() and etc.  
```  

***Collect()***  
The collect() method takes in an input of type Collector and produces the result as per the input passed to the collect() method. Basically, it behaves like an accumulator and takes the input untill the streams are exhausted.  
joining() Collector performs the String concatenation on the elements in the stream. It has three different overloaded versions.

counting() Collector returns the total number of elements as a result.  

***mapping()*** collector applies a transformation function first and then collects the data in a collection (could be any type of collection).  

***maxBy() and minBy()***  
Comparator as an input parameter and Optional as an output.  
maxBy()  
This collector is used in conjunction with comparator. Returns the max element based on the property passed to the comparator.  

minBy()  
This collector is used in conjunction with comparator. Returns the smallest element based on the property passed to the comparator.  

summingInt() – this collector returns the sum as a result.  
averagingInt() – this collector returns the average as a result.  


***groupingBy()*** collector is equivalent to the groupBy() operation in SQL.  
Used to group the elements based on a property.The output of the groupingBy() is going to be a Map<K,V>. There are three different versions of groupingBy()  
groupingBy(classifier)  
groupingBy(classifier,downstream)  
groupingBy(classifier,supplier,downstream)  

***partitioningBy()*** collector is also a kind of groupingBy(). It accepts a predicate as an input and return type of the collector is going to be Map<K,V>. The key of the return type is going to be a Boolean. There are two different versions of partitioningBy().  
partitioningBy(predicate)  
partitioningBy(predicate,downstream) // downstream -> could be of any collector  



### Parallel Stream  
Splits the source of data in to multiple parts, process them parallelly and then combine the result.  
``` Java
How to Create a Parallel Stream ?  

Sequential Stream:    
IntStream.rangeClosed(1,1000)  
.sum();  

Parallel Stream:  
IntStream.rangeClosed(1,1000)  
.parallel()  
.sum();  
```  


How Parallel Stream works ?  
Parallel Stream uses the Fork/Join framework that got introduced in Java 7.  

How many Threads are created ?  
Number of threads created == number of processors available in the machine.  


### Introduction to Optional  
Introduced as part of Java 8 to represent a Non-Null value and avoids Null Pointer Exception and Unnecessary Null Checks. Inspired from the new languages such as scala , groovy etc.  

[Baeldung - Java 8 Stream API](https://www.baeldung.com/java-8-streams)  





















