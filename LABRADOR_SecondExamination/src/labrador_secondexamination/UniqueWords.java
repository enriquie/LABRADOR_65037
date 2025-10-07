/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labrador_secondexamination;

/**
 *
 * @author Enriquie
 */

import java.util.Scanner;



class Node {
    String word;
    Node left, right;

    public Node(String word) {
        this.word = word;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    void insert(String word) {
        root = insertRec(root, word.toLowerCase());
    }

    Node insertRec(Node root, String word) {
        if (root == null) {
            root = new Node(word);
            return root;
        }
        if (word.compareTo(root.word) < 0)
            root.left = insertRec(root.left, word);
        else if (word.compareTo(root.word) > 0)
            root.right = insertRec(root.right, word);
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.word);
            inorderRec(root.right);
        }
    }
}


public class UniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            BinarySearchTree bst = new BinarySearchTree();

            System.out.println("\nEnter a passage:");
            String input = sc.nextLine();

            input = input.replaceAll("[.,?!]", "");
            String[] words = input.split("\\s+");

            for (String word : words) {
                bst.insert(word);
            }

            System.out.println("\nUnique words in the passage:");
            bst.inorder();

            // Ask if user wants to try again
            System.out.print("\nType yes to try again or no to exit. (yes/no): ");
            choice = sc.nextLine().trim().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("\nProgram terminated. Goodbye!");
        sc.close();
    }
}


