/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labrador_thirdexamination;

/**
 *
 * @author Enriquie
 */
import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    
    public static void saveToFile(ArrayList<RECORDS> data, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(data);
            System.out.println("Saved successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving records: " + e.getMessage());
        }
    }

    public static ArrayList<RECORDS> loadFromFile(String filename) {
        ArrayList<RECORDS> records = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            records = (ArrayList<RECORDS>) in.readObject();
            System.out.println("Loaded successfully from " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("No existing file found, starting new list.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading records: " + e.getMessage());
        }
        return records;
    }
}
