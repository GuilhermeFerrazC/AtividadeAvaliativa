package com.mycompany.sequenciadefibonacci;

import java.time.Duration;
import java.time.Instant;

public class FibonacciRecursivo {

    static long fibo(double n) {
        if (n < 2) {
            return (long) n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Instant startTime = Instant.now();

        // teste do programa. Imprime os 10 primeiros termos
        for (int i = 0; i < 1000; i++) {
            System.out.println("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }

        Instant endTime = Instant.now();
        Duration totalTime = Duration.between(startTime, endTime);

        System.out.println("");
        System.out.println("Impressão dos 1000 primeiros termos");
        System.out.println("RECURSIVO");
        System.out.println("========");
        System.out.println(totalTime);
        System.out.println("========");
    }

}
