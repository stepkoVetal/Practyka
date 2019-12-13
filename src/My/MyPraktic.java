package My;
import java.util.*;
/* public class MyPraktic {
    public static void main(String[] args) {
        System.out.println("Привіт, сьогодні:");
        System.out.println(new Date());
    }

}

*/
//створення статичних змінних без їх ініціалізації, щоб переконатися що система сама їх ініціалізує
public class MyPraktic {
    static int i;
    static char c;
    public static void main(String[] args) {
        System.out.println("int = " + i);
        System.out.println("char = " + c);
    }
}