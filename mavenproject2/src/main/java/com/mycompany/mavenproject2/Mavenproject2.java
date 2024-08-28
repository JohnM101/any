/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Windows10
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Mavenproject2 {
    public static void main(String[] args) {
        // Create an ArrayList to store book data
        ArrayList<String[]> books = new ArrayList<>();
        
        // Loop to add books
        while (true) {
            // Get book details from the user
            String title = JOptionPane.showInputDialog("Enter the book title:");
            String author = JOptionPane.showInputDialog("Enter the book author:");
            String genre = JOptionPane.showInputDialog("Enter the book genre:");
            String year = JOptionPane.showInputDialog("Enter the year of publication:");
            
            // Add the book details to the ArrayList
            String[] book = {title, author, genre, year};
            books.add(book);
            
            // Ask the user if they want to add another book
            int response = JOptionPane.showConfirmDialog(null, "Do you want to add another book?", "Add Book", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.NO_OPTION) {
                break;
            }
        }
        
        // Create a StringBuilder to format the output
        StringBuilder output = new StringBuilder("Library Database:\n");
        for (String[] book : books) {
            output.append("Title: ").append(book[0]).append(", ")
                  .append("Author: ").append(book[1]).append(", ")
                  .append("Genre: ").append(book[2]).append(", ")
                  .append("Year: ").append(book[3]).append("\n");
        }
        
        // Display the contents of the library
        JOptionPane.showMessageDialog(null, output.toString());
    }
}