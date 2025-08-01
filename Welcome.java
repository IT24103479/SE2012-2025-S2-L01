import java.util.Scanner;

public class Welcome{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
 
System.out.print("Enter your First name:");
String input1=sc.nextLine();

System.out.print("Enter your Last name:");
String input2=sc.nextLine();

 System.out.print("Welcome to the second year "+input1+" "+input2);
}
}