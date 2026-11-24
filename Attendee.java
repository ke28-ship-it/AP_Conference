// Attendee.java     
// @Author ELON KATZ
  
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class Attendee {
  public static void main(String[] args) {
    File myObj = new File("names.csv");

    try (Scanner myReader = new Scanner(myObj)) {
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] arrAttend = data.split(",");
        System.out.println("Number: " + arrAttend[0] + ", Last Name: " + arrAttend[1] + ", First Name: " + arrAttend[2] + ", Company: " + arrAttend[3]);
      }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}