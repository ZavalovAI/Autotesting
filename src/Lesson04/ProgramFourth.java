package Lesson04;

import java.io.File;
import java.io.FileReader;

public class ProgramFourth {
    public static void main(String[] args) {


        try {
            simpleWaiter(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            int i = 10 / 0;
        } catch (ArithmeticException iae) {
            System.out.println("Exception toString() " + iae);
            System.out.println("");
            System.out.println("Exception getString(): " + iae.getMessage());
            System.out.println("");
            System.out.println("Exception toString() ");
            iae.printStackTrace();
        } finally {
            System.out.println("Final Block. ");
        }

    }
private static void simpleWaiter(long timeout) throws InterruptedException {
        Thread.sleep(timeout);
}
}