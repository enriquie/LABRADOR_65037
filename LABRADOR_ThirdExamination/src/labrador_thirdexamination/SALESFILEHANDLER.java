/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labrador_thirdexamination;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Enriquie
 */
public class SALESFILEHANDLER {
    
    public static void saveToFile(ArrayList<SALESinv> data, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(data);
            System.out.println("Saved successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving records: " + e.getMessage());
        }
    }

    public static ArrayList<SALESinv> loadFromFile(String filename) {
        ArrayList<SALESinv> records = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            records = (ArrayList<SALESinv>) in.readObject();
            System.out.println("Loaded successfully from " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("No existing file found, starting new list.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading records: " + e.getMessage());
        }
        return records;
    }
}