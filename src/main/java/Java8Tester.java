import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Test av Java8-features
 */
public class Java8Tester {
    public static void main() {
        Java8Tester tester = new Java8Tester();

        // Interface MathOperator med metoden doSomeStuff com tar tre integers in och returnerar en int. Metoden implementeras direkt här med lambda
        MathOperator sum = (a, b, c) -> (a+b+c);
        MathOperator sub = (a, b, c) -> (a-b-c);

        print(sum, sub);


    // Javas nya metod forEach med lambda istället för metodkropp
        List<String> items = new ArrayList();
        addItem(items, "A");
        addItem(items, "B");
        addItem(items, "C");
        addItem(items, "D");
        addItem(items, "E");
        addItem(items, "F");

        items.forEach(item -> System.out.println("Hej " + item));

    }

    private static void print(MathOperator sum, MathOperator sub) {
        System.out.println("Värdet blev "+ sum.doSomeStuff(1,2,3));
        System.out.println("Värdet blev "+ sub.doSomeStuff(1,2,3));
    }

    private static void addItem(List<String> items, String a) {
        items.add(a);
    }
}

