package Desafio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroum = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroum, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroum, int parametroDois) throws ParametrosInvalidosException {
        if (parametroum >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroum;

        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + (parametroum + i));
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}