# Java Notes

## Explain JVM
JVM is short for Java Virtual Machine. JVM is an abstract computing machine, or virtual machine. It is a platform-independent execution environment that converts Java bytecode into machine language and executes it. Most programming languages compile source code directly into machine code that is designed to run on a specific microprocessor architecture or operating system, such as Windows or UNIX.

## What is inheritance in Java
Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of parent object.
The idea behind inheritance in java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of parent class, and you can add new methods and fields also.

Example of simple inheritance:

``` java
class Employee{  
 float salary=40000;  
}  
class Programmer extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  
```

Types of inheritance:
    - Single 
    - MultiLevel
    - Multiple (Through Interface)
    - Hierarchical

## What is tread in java
Multithreading refers to two or more tasks executing concurrently within a single program. A thread is an independent path of execution within a program. Many threads can run concurrently within a program. Every thread in Java is created and controlled by the java.lang.Thread class.

## What is Grabage Collection in java
In java, garbage means unreferenced objects.
Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects.
To do so, we were using free() function in C language and delete() in C++. But, in java it is performed automatically. So, java provides better memory management.

### Advantage of Garbage Collection
    - It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
    - It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

### How can an object be unreferenced?
    - By nulling the reference
    - By assigning a reference to another
    - By annonymous object etc

## Stream class in java
A stream is a sequence of data. In java is composed of bytes
There are three types of streams in java
    - System.out
    - System.in
    - System.err

## Oops Concepts in java
    - Object
    - Class
    - Inheritance
    - Polymorphism
    - Abstraction
    - Encapsulation

### Object
Any entity that has state and behavior is known as an object. For example: chair, pen, table, keyboard, bike etc. It can be physical and logical.

## Class
Collection of objects is called class. It is a logical entity.

### Inheritance
When one object acquires all the properties and behaviours of parent object i.e. known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.


### Polymorphism
When one task is performed by different ways i.e. known as polymorphism. For example: to convince the customer differently, to draw something e.g. shape or rectangle etc.
In java, we use method overloading and method overriding to achieve polymorphism.
Another example can be to speak something e.g. cat speaks meaw, dog barks woof etc.

### Abstraction
Hiding internal details and showing functionality is known as abstraction. For example: phone call, we don't know the internal processing.
In java, we use abstract class and interface to achieve abstraction.


### Encapsulation
Binding (or wrapping) code and data together into a single unit is known as encapsulation. For example: capsule, it is wrapped with different medicines.
A java class is the example of encapsulation. Java bean is the fully encapsulated class because all the data members are private here.
