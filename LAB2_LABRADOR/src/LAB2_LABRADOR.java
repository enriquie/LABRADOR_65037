
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Enriquie
 */
public class LAB2_LABRADOR {

    // Recursive
    static long fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative
    static long fibonacciIterative(int n) {
        if (n <= 1)
            return n;
        long first = 0, second = 1, next = 0;
        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input size (e.g. 10, 20, 30, 35, 40): ");
        int n = sc.nextInt();

        //Recursive time
        long startRec = System.nanoTime();
        long fibRec = fibonacciRecursive(n);
        long endRec = System.nanoTime();
        long timeRec = (endRec - startRec) / 1000000;

        //Iterative time
        long startIt = System.nanoTime();
        long fibIt = fibonacciIterative(n);
        long endIt = System.nanoTime();
        long timeIt = (endIt - startIt) / 1000000;

        // Output
        System.out.println("\nExecution Time Analysis");
        System.out.println("------------------------");
        System.out.println("Input\tRecursive Time (ms)\tIterative Time (ms)");
        System.out.println(n + "\t" + timeRec + "\t\t\t" + timeIt);
        System.out.println("\nFibonacci(" + n + ") = " + fibIt);

        if (timeRec > timeIt)
            System.out.println("Recursive approach took longer than iterative.");
        else
            System.out.println("Iterative approach took longer or same time as recursive.");
    }
}
