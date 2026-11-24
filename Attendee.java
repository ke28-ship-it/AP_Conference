/* This class file will represent a person attending the Event
  * Consider the company or organizxation they belong to
  * Consider Name, Table, Seat Number and other data that may be populated
  * during the data load itself, or during the method that places people at their seats.
  */

// Attendee.java     
// @Author ELON KATZ
  
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class Attendee {
  public static void main(String[] args) {
    File myObj = new File("names.csv");

    // try-with-resources: Scanner will be closed automatically
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

    Scanner newObj = new Scanner(System.in);
    System.out.print("First Name: ");
    String newFName = newObj.nextLine();
    System.out.print("Last Name: ");
    String newLName = newObj.nextLine();
    int newComp = -1;
    while(newComp < 1 && newComp > 16){
      System.out.print("Company: ");
      newComp = Integer.parseInt(newObj.nextLine());
    }
  }
}