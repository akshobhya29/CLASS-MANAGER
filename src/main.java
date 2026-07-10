import java.util.Scanner;
import java.util.ArrayList;
public class main
{
    public static void main (String args[])
{ Scanner sc=new Scanner(System.in);
    ArrayList<String> students= new ArrayList<String>();
    System.out.println("       CLASS MANAGER       ");
    System.out.println("1. Add Students\n2. Display Students\n3. Search Students\n4. Delete Student\n5. EXIT");
    while(true)
    {int choice=sc.nextInt();
    switch(choice)
    {case 1:
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the student's name");

        String a=sc.nextLine();
        students.add(a);}
        System.out.println("       CLASS MANAGER       ");
        System.out.println("1. Add Students\n2. Display Students\n3. Search Students\n4. Delete Student\n5. EXIT");
        break;

        case 2:
    System.out.println(students);
            System.out.println("       CLASS MANAGER       ");
            System.out.println("1. Add Students\n2. Display Students\n3. Search Students\n4. Delete Student\n5. EXIT");
    break;
        case 3:
            System.out.println("Enter the roll no. of the student you want to find");
    int rn=sc.nextInt();
    System.out.println("Roll number-"+rn+"       Name-"+students.get(rn-1));
            System.out.println("       CLASS MANAGER       ");
            System.out.println("1. Add Students\n2. Display Students\n3. Search Students\n4. Delete Student\n5. EXIT");
    break;
        case 4:
        System.out.println("Enter the roll no. of student you want to delete");
        int del = sc.nextInt();
        students.remove(del - 1);
            System.out.println("       CLASS MANAGER       ");
            System.out.println("1. Add Students\n2. Display Students\n3. Search Students\n4. Delete Student\n5. EXIT");
        break;
        case 5:
            System.out.println("THE END");
            return;
        default:
            System.out.println("Please enter a valid choice");
            System.out.println("       CLASS MANAGER       ");
            System.out.println("1. Add Students\n2. Display Students\n3. Search Students\n4. Delete Student\n5. EXIT");
    }
    }
    }
}


