package br.com.wcc;

import java.util.Scanner;

public class SomaNumeros {


    public void  SomarNumeros(double numeros) {
        double soma = 0, num;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <numeros; i++) {
            System.out.println("Digite o numero que você quer somar: " );
            num = s.nextDouble();
            soma = (soma + num);

        }
        System.out.println(" A soma dos números é: " + soma);

    }

}

