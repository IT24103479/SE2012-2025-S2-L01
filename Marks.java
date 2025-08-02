import java.util.Scanner;

public class Marks{
public static void main(String[] args){
     int[] studentID=new int[3];
     int[][] update=new int[3][3];
     int[] average_s=new int[3];
     int[] average=new int[3];
     int[] total=new int[3];

 Scanner sc=new Scanner(System.in);
  //subject IDs
System.out.println("subject IDs->Mathematics=1, Chemistry=2, Physics=3");


for(int i=0;i<3;i++){
 System.out.println("Enter the student ID number:");
 studentID[i]=sc.nextInt();
 
for(int j=0;j<3;j++){
 System.out.println("Enter Subject "+(j+1)+" Marks:");
 update[i][j]=sc.nextInt();
   }
}

//subject average

for(int i=0;i<3;i++){
average_s[i]=(update[0][i]+update[1][i]+update[2][i])/2;
}

//total
for(int i=0;i<3;i++){
total[i]=(update[i][0]+update[i][1]+update[i][2]);
}

//Average of a student
for(int i=0;i<3;i++){
average[i]=(total[i]/2);
}

//printing average of the subjects
System.out.printf("Average of each subject: Mathematics->%d,Chemistry->%d,Physics->%d\n",average_s[0],average_s[1],average_s[2]);

//printing average and total of a students
for(int i=0;i<3;i++){
System.out.printf("Student ID %d: Total = %d, Average = %d\n",studentID[i], total[i], average[i]);
}

}
}