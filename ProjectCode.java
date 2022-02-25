/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package projectcode;
import java.util.*;
/**
 *
 * @author user
 */
public class ProjectCode {
    String cusID = "";
    String cusName = "";
    int cusBal = 0;


    public ProjectCode(String ID,String Name,int Balance) {
       cusID = ID;
       cusName = Name;
       cusBal = Balance;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bal = 0;
        String ID = "";
        String Name = "";
        Scanner blyat = new Scanner(System.in);
        System.out.println("Enter your ID.");
        ID = blyat.nextLine();
        System.out.println("Enter your name.");
        Name = blyat.nextLine();
        System.out.println("Enter your balance.");
        bal = blyat.nextInt();
        ProjectCode newCus = new ProjectCode(ID,Name,bal);
        System.out.println("New customer has been registered! Your name is: " + newCus.cusName);
        System.out.println("Your ID is: " + newCus.cusID); 
        System.out.println("Your Balance is: $" + newCus.cusBal); 
    }
    
}



     


