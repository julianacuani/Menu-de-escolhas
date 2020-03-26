package br.com.wcc;

public class FibonacciSequence {

    public void fibonacci(int n) {
        int a = 1, b = 0, aux;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            aux = a;
            a = a+b;
            b = aux;
        }

    }
}
