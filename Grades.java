import java.util.Scanner;

public class Grades{
 public static void main(String[] args){
 
int marks;
Scanner sc=new Scanner(System.in);

System.out.println("Enter your marks:");
marks=sc.nextInt();

if(marks>=90){
 System.out.println("Grade A");
}else if(marks>=80 && marks<=89){
 System.out.println("Grade B");
}else if(marks>=70 && marks<=79){
 System.out.println("Grade C");
}else if(marks>=60 && marks<=69){
 System.out.println("Grade D");
}else{
 System.out.println("Fail");
}

}

}