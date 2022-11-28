package com.mycompany.sequenciadefibonacci;

import java.time.Duration;
import java.time.Instant;

public class Fibonacci {

// faz o trabalho a ser medido
    // Iterativo //
    static long fibo(double n) {
        double F = 0;     // atual
        double ant = 0;   // anterior

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }

        }

        return (long) F;
    }

    public static void main(String[] args) {
        Instant startTime = Instant.now();

// Teste do programa. Imprime os 10 primeiros termos
        for (int i = 0; i < 1000; i++) {
            System.out.println("(" + i + "):" + Fibonacci.fibo(i) + "\t");

        }
        Instant endTime = Instant.now();
        Duration totalTime = Duration.between(startTime, endTime);
        
        System.out.println("");
        System.out.println("Impressão dos 1000 primeiros termos");
        System.out.println("ITERATIVO");
        System.out.println("========");
        System.out.println(totalTime);
        System.out.println("========");
    }

}
