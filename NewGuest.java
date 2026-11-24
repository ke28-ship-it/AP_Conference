// NewGuest.java     
// @Author ELON KATZ
import java.util.Scanner;

public class NewGuest{
    private String newFName;
    private String newLName;
    private int newComp;

    public NewGuest(){
        Scanner newObj = new Scanner(System.in);
        System.out.println("First Name: ");
        newFName = newObj.nextLine();

        System.out.println("Last Name: ");
        newLName = newObj.nextLine();

        System.out.println("Company: ");
        newComp = newObj.nextInt();
    }

    public String GetFName(){
        return newFName;
    }

    public String GetLName(){
        return newLName;
    }

    public int GetComp(){
        return newComp;
    }

    public void Tostring(String a, String b, int c){
        System.out.println(a + " " + b + " " + c);
    }
}