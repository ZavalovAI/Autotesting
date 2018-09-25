package Lesson02;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        count++;
    }

    void doSomething() {        println(count + " I did something");

    }
    static void doSomethingElse() {
        println(count + " I did something else");
    }

    static{
    println(" Class was initialise");
        }

    private static void println(String out){
        System.out.println(out);
        }



}