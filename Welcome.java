import java.util.Scanner;

public class Welcome{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
 
System.out.print("Enter your First name:");
String input1=sc.nextLine();

System.out.print("Enter your Last name:");
String input2=sc.nextLine();

 System.out.printf("Welcome to the second year %s %s ",input1,input2);
}
}