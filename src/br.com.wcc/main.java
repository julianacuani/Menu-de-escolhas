package br.com.wcc;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double soma;
        int opcao;
        Scanner s = new Scanner(System.in);

        System.out.println(" Digite o numero da opção desejada: \n 1 - Somar números (int, float ou double)\n" +
                           " 2 - Ver a tabuada do numero desejado \n 3 - Sequencia de Fibonacci");

                opcao = s.nextInt();

        switch (opcao) {
            case 1:
                SomaNumeros sn = new SomaNumeros();
                double numeros;
                System.out.println("Quantos numeros você quer somar: ");
                numeros = s.nextDouble();
                sn.SomarNumeros(numeros);
                break;

            case 2:
                Tabuada t = new Tabuada();
                int numero;
                System.out.println("Digitem um número para ver tabuada: ");
                numero = s.nextInt();
                t.escreverTabuada(numero);
                break;

            case 3:
                FibonacciSequence f = new FibonacciSequence();
                int n;
                System.out.println("Quantos numeros da sequencia de Fibonacci você quer ver?");
                n = s.nextInt();
                f.fibonacci(n);
                break;

            default:
                System.out.println("Opção invalida");
                break;

        }
    }
}