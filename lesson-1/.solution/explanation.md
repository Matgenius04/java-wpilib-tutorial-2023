### Lesson 1 Solution
To write something to the terminal, use `System.out.println(insert stuff here)`. It writes whatever you put between the parentheses to the terminal. In this example, we used the string `"Hello World"`. You can put whatever text you want inside of the quotation marks and it will print out that text to the console.

In terms of syntax, the important things to notice are within the following segment:
```java
    public static void main(String argString[]) {
        System.out.println("Hello World");
    }
```
Key takeaways
- you write code within the curly brackets
- you put semicolons after expressions
- methods are "invoked" or ran through the `.``name of thing here``(parameters inside of parentheses)``;`

The rest of the program you can think of as template code. We'll explain what everything means in due time. 

To run your code, type, `java ./lesson-1/sandbox/HelloWorld.java`.
You can run the solution code by typing `java ./lesson-1/.solution/HelloWorld.java`. You should see the program print `Hello World` to the console.