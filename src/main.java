import java.util.Scanner;
import java.util.ArrayList;
public class main
{
    public void menu()
{
    System.out.println("       CLASS MANAGER       ");
    System.out.println("1. Add Students\n2. Display Students\n3. Search Students\n4. Delete Student\n5. EXIT");
}
public void end()
{
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
    public static void main (String args[])
{ main obj= new main();
    Scanner sc=new Scanner(System.in);
    ArrayList<String> students= new ArrayList<String>();
   obj.menu();
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
        obj.end();
        obj.menu();
        break;

        case 2:
            if(students.isEmpty())
                System.out.println("Please enter the students first");
            else
            {
            System.out.println("Roll NO.       Name");
    for(int j=0;j<students.size();j++)
    {int y=j+1;
        System.out.println(y+"."+"             "+students.get(j));

    }
            }obj.end();
            obj.menu();
    break;
        case 3:
            if(students.isEmpty())
                System.out.println("Please enter the students first");
            else
            {
                System.out.println("Enter the roll no. of the student you want to find");
    int rn=sc.nextInt();
    if(rn< 1|| rn>students.size())
        System.out.println("Please enter a valid roll number");
    else
    System.out.println("Roll number-"+rn+"       Name-"+students.get(rn-1));
            }
            obj.end();
            obj.menu();
    break;
        case 4:
            if(students.isEmpty())
                System.out.println("Please enter the students first");
            else
            {
        System.out.println("Enter the roll no. of student you want to delete");
        int del = sc.nextInt();
                if(del<1 || del>students.size()) {
                    System.out.println("Please enter a valid roll number");
                }
                else
        students.remove(del - 1);}
            obj.end();
            obj.menu();
        break;
        case 5:
            System.out.println("THE END");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            return;
        default:
            System.out.println("Please enter a valid choice");
            obj.menu();
    }
    }
    }
}


