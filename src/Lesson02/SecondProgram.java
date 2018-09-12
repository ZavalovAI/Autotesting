
package Lesson02;

public class SecondProgram {

    public static void main(String[] args) {
        Person.doSomethingElse();
        Person p1 = new Person ("Dima", "Bobov", 18);
        p1.doSomething();

        Person p2 = new Person("Viktor", "Tsoy");
        p2.doSomething();

        final Person p3 = p2;

        p2.secondName = "Kotsiuba";

        System.out.println(p3.secondName);

        String str1 = new String("str");
        String str2 = new String("str");
                if (str1.equals(str2))
        {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
