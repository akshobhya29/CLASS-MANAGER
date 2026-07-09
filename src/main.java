import java.util.Scanner;
import java.util.ArrayList;
public class gmain
{
    public static void main (String args[])
{ Scanner sc=new Scanner(System.in);
    ArrayList<String> students= new ArrayList<String>();
    System.out.println("Enter the number of students");
    int n=sc.nextInt();
    sc.nextLine();
    for(int i=1;i<=n;i++)
    {
        System.out.println("Enter the student's name");
        String a=sc.nextLine();
        students.add(a);

    }
    System.out.println(students);
    System.out.println("If you want to find a Student enter 1 else 0 ");
    int resp1=sc.nextInt();
    if(resp1==1)
    {
        System.out.println("Enter the roll no. of the student you want to find");
    int rn=sc.nextInt();
    System.out.println("Roll number-"+rn+"       Name-"+students.get(rn-1));
    }
    System.out.println("If you want to delete a Student enter 1 else 0");
    int resp2=sc.nextInt();
    if(resp2==1){
        System.out.println("Enter the roll no. of student you want to delete");
        int del=sc.nextInt();
        students.remove(del-1);
        System.out.println(students);

    }
}

}
