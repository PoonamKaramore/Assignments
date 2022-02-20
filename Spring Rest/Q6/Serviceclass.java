package que6;

import org.springframework.stereotype.Component;

@Component
public class Serviceclass {

    public int Addition(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    public int subtraction(int a, int b) {
        System.out.println(a - b);
        return a - b;
    }

    public int multiplication(int a, int b) {
        System.out.println(a * b);
        return a * b;
    }

    public double division(int a, int b) {
            System.out.println(a / b);
            return a / b;
    }

    public double square(int a) {
        System.out.println(Math.sqrt(a));
        return Math.sqrt(a);
    }
}


