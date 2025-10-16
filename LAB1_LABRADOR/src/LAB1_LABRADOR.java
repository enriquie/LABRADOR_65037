/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Enriquie
 */
import java.util.Scanner;

public class LAB1_LABRADOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        
        long startInsert = System.nanoTime();
        int pos = n / 2;
        int value = 99;
        int newArr[] = new int[n + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = value;
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        long endInsert = System.nanoTime();
        long insertTime = (endInsert - startInsert) / 1000000;
        long startDelete = System.nanoTime();
        int delPos = n / 2;
        int tempArr[] = new int[n - 1];
        for (int i = 0; i < delPos; i++) {
            tempArr[i] = arr[i];
        }
        for (int i = delPos + 1; i < n; i++) {
            tempArr[i - 1] = arr[i];
        }
        long endDelete = System.nanoTime();
        long deleteTime = (endDelete - startDelete) / 1000000;
        long startSearch = System.nanoTime();
        int key = arr[n / 2];
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        long endSearch = System.nanoTime();
        long searchTime = (endSearch - startSearch) / 1000000;

        
        
        System.out.println("\nExecution Time Analysis");
        System.out.println("------------------------");
        System.out.println("Operation\tInput Size\tTime (ms)\tBig-O");
        System.out.println("Insert\t\t" + n + "\t\t" + insertTime + "\t\tO(n)");
        System.out.println("Delete\t\t" + n + "\t\t" + deleteTime + "\t\tO(n)");
        System.out.println("Search\t\t" + n + "\t\t" + searchTime + "\t\tO(n)");
    }
}
