import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8Tester {
    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

        // Interface MathOperator med metoden doSomeStuff com tar tre integers in och returnerar en int. Metoden implementeras direkt här med lambda
        MathOperator sum = (a, b, c) -> (a+b+c);
        MathOperator sub = (a, b, c) -> (a-b-c);

        System.out.println("Värdet blev "+ sum.doSomeStuff(1,2,3));
        System.out.println("Värdet blev "+ sub.doSomeStuff(1,2,3));


    // Javas nya metod forEach med lambda istället för metodkropp
        List<String> items = new ArrayList();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");

        items.forEach(item -> System.out.println("Hej " + item));

    }
}

