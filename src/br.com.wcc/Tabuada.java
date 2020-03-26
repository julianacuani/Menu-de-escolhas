package br.com.wcc;

import java.util.Scanner;

public class Tabuada {

    public void escreverTabuada(int numero) {
      System.out.println("Tabuada do: " + numero);
      for(int i = 1; i <= 10; i++){
         System.out.println( i + " x " + numero + " = " + i * numero);
       }
    }
}
