package My;
import java.util.*;
public class MyPraktic {
    public static void main(String[] args) {
        System.out.println("Привіт, сьогодні:");
        System.out.println(new Date());
    }

}

//створення статичних змінних без їх ініціалізації, щоб переконатися що система сама їх ініціалізує
class Praktic {
    static int i;
    static char c;
    public static void main(String[] args) {
        System.out.println("int = " + i);
        System.out.println("char = " + c);
    }
}

// TIJ4 Chapter Object, Exericise 2, page 89
// object/HelloWorld.java
// Following the HelloDate.java example in this chapter, create a "hello, world"
// program that simply displays that statement.

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// TIJ4 Chapter Object, Exericise 3, page 90
// object/ATNTest.java
// Find the code fragments involving ATypeName and turn them into a program
// that compiles and runs.

class ATNTest {
    public static void main(String[] args) {
        class ATypeName {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 2.71828;
        a.b = false;
        a.show();
    }
}

// object/DataOnlyTest.java
// TIJ4 Chapter Object Exercise 4 page 90
// Turn the DataOnly code fragments into a program that compiles and runs

class DataOnlyTest {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DataOnly data = new DataOnly();
        data.i = 3;
        data.d = 2.71828;
        data.b = false;
        data.show();
    }
}

// object/DOTest2.java
// TIJ4 Chapter Object, Exercise 5, page 90
// Modify the previous exercise so that the values of the data in DataOnly are
// assigned to and printed in main().

class DOTest2 {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DataOnly data = new DataOnly();
        data.i = 234;
        data.d = 2.1234545;
        data.b = true;
        data.show();
    }
}

// object/StorageTest.java
// TIJ4 Chapter Object, Exercise 6, page 90
// Write a program that includes and calls the storage() method defined as a
// code fragment in this chapter.

class StorageTest {
    public static void main(String[] args) {
        class StoreStuff {
            int storage(String s) {
                return s.length() * 2;
            }
        }
        StoreStuff x = new StoreStuff();
        System.out.println(x.storage("hello"));
    }
}

// object/ITest.java
// TIJ4 Chapter Object, Exercise 7, page 90
// Turn the Incrementable code fragments into a working program.

class StaticTest {
    static int i = 47;
}
class Incrementable {
    static void increment() { StaticTest.i++; }
}
class ITest {
    public static void main(String[] args) {
        System.out.println("StaticTest.i= " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("After sf.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
    }
}

// object/OneStaticTest.java
// TIJ4 Chapter Object, Exercise 8, page 90
/* Write a program that demonstrates that, no matter how many objects you
 * create of a particular class, there is only one instance of a particular
 * static field of that class.
 */

/* class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() { StaticTest.i++; }
}
*/
class OneStaticTest {
    public static void main(String[] args) {
        System.out.println("StaticTest.i= " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        st1.i = 3;
        System.out.println("After st1.i = 3, ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("Create another StaticTest, st3.");
        StaticTest st3 = new StaticTest();
        System.out.println("st3.i = " + st3.i);
    }
}

// TIJ4 Chapter Object, Exercise 9, page 90
// Write a program that demonstrates that autoboxing works for all the primitive // types and their wrappers.

class AutoboxTest {
    public static void main(String[] args) {
        boolean b = false;
        char c = 'x';
        byte t = 8;
        short s = 16;
        int i = 32;
        long l = 64;
        float f = 0.32f;
        double d = 0.64;
        Boolean B = b;
        System.out.println("boolean b = " + b);
        System.out.println("Boolean B = " + B);
        Character C = c;
        System.out.println("char c = " + c);
        System.out.println("Character C = " + C);
        Byte T = t;
        System.out.println("byte t = " + t);
        System.out.println("Byte T = " + T);
        Short S = s;
        System.out.println("short s = " + s);
        System.out.println("Short S = " + S);
        Integer I = i;
        System.out.println("int i = " + i);
        System.out.println("Integer I = " + I);
        Long L = l;
        System.out.println("long l = " + l);
        System.out.println("Long L = " + L);
        Float F = f;
        System.out.println("float f = " + f);
        System.out.println("Float F = " + F);
        Double D = d;
        System.out.println("double d = " + d);
        System.out.println("Double D = " + D);
    }
}

// TIJ4 Chapter Object, Exercise 10, page 90
// Write a program that prints three arguments taken from the command line. To do // this you'll need to index into the command-line array of Strings.

class CommandArgTest {
    public static void main(String[] args) {
        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);
        System.out.println("args[2] = " + args[2]);
    }

}

// object/Rainbow.java
// TIJ4 Chapter Object, Exercise 11, page 90
// Turn the AllColorsOfTheRainbow into a program that compiles and runs.

class Rainbow {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
        System.out.println("atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
        atc.changeColor(7);
        atc.changeTheHueOfTheColor(77);
        System.out.println("After color change, atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
        System.out.println("atc.hue = " + atc.hue);
    }
}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors = 0;
    int hue = 0;
    void changeTheHueOfTheColor(int newHue) {
        hue = newHue;
    }
    int changeColor(int newColor) {
        return anIntegerRepresentingColors = newColor;
    }
}

// object.DocTest.java
// TIJ4 Chapter Object, Exercise 12, page 90
/* Find the code for the second version of HelloDate.java, which is the simple
 * comment documentation example. Execute Javadoc on the file and view the
 * results with your Web browser.
 */

//import java.util.*;

/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author Burce Eckel
 * @author www.MindView.net
 * @version 4.0
 */

class DocTest {
    /** Entry poing to class & application.
     * @param args array of string arguments
     * @throws //exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
} /* Output: (55% match)

 */

// object.Documentation1.java
// TIJ4 Chapter Object, Exercise 13 - 1
/* Run Documentation1.java, Documentation2.java and Documentation3.java
 * through Javadoc. Verify the resulting documentation with your Web browser.
 */

/** A class comment */
class Documentation1 {
    /** A field comment */
    public int i;
    /** A method comment */
    public void f() {}
}

// object.Documentation1.java
// TIJ4 Chapter Object, Exercise 13 - 2
/* Run Documentation1.java, Documentation2.java and Documentation3.java
 * through Javadoc. Verify the resulting documentation with your Web browser.
 */
//import java.util.*;

// object/Documentation2.java
/**
 * <pre>
 * Uses
 * System.out.println(new Date());
 * </pre>
 */

class Documentation2 {
    Date d = new Date();
    void showDate() {
        System.out.println("Date = " + d);
    }
}

// object.Documentation1.java
// TIJ4 Chapter Object, Exercise 13 - 3
/* Run Documentation1.java, Documentation2.java and Documentation3.java
 * through Javadoc. Verify the resulting documentation with your Web browser.
 */
//import java.util.*;

// object/Documentation3.java
/**
 * You can even insert a list:
 * <ol>
 * <li> Item one
 * <li> Item two
 * <li> Item three
 * </ol>
 */

class Documentation3 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("d = " + d);
    }
}

// object/Documentation4.java
// TIJ4 Chapter Object, Exercise 14, page 90
// Add an HTML list of items to the documentation in the previous exercise.
//import java.util.*;

// object/Documentation4.java
/**
 * You can even insert a list:
 * <ol>
 * <li> Item one
 * <li> Item two
 * <li> Item three
 * </ol>



 * Another test list
 * <ol>
 * <li> One
 * <li> Two
 * <li> Three
 * </ol>
 */

class Documentation4 {

    /** Let's try a public field list
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */

    public int i = 2;

    /**
     * A private field list (-private to see)
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol>
     */

    private int j = 3;

    /**
     * Another list can be inserted here to help explain the
     * following method call
     * <ol>
     * <li> One
     * <li> Two
     * <li> Three
     * </ol><br>
     * but may be formatted differently in Method Summary
     */

    public static void main(String[] args) {

        /**
         * Let's try another test list here
         * <ol>
         * <li> One
         * <li> Two
         * <li> Three
         * </ol>
         */

        Date d = new Date();
        System.out.println("d = " + d);
    }
}

// object/HelloDocTest.java
// TIJ4 Chapter Object, Exercies 15, page 91
/* Take the program in Exercise 2 and add comment documentation to it. Extract
 * this comment documentation into an HTML file using Javadoc and view it with
 * your Web browser.
 */


/**
 * Public class contained in file of the same name that includes main()
 */

class HelloDocTest {

    /** main method executed by java
     */

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// object/Overloading.java
// TIJ4 Chapter Object, Exercise 16, page 91
/* In the Initialization and Cleanup chapter, locate the Overloading.java
 * example and add Javadoc documentation. Extract this comment documentation
 * into and HTML file using Javadoc and view it with your Web browser.
 */

// initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.

/** creates type Tree wth two constructors and one info method
 */

class Tree {
    int height;

    /** no-argument constructor
     * assigns height = 0
     */

    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    /** constructor taking an int argument,
     * assigns height that int argument
     */

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new tree that is " + height + " feet tall");
    }

    /** method to print height of tree object
     */

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    /** overloaded method to print string argument
     * and height of a tree object
     */

    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

/** class to test construction of tree objects
 */

class Overloading {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloading method");
        }
        // Overloaded constructor:
        new Tree();
    }
}
//Сумма введених двох чисел
class MyFirstClass
{
    public static void main(String[] args)
    {
        int a, b, c;
        String s1, s2;
        System.out.println("Введите два числа");
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = a + b;
        System.out.println("Сумма ваших чисел равна " + c);
    }
}