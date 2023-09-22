import java.util.Scanner;
class calculator{
    public static void main(String arg[]){
        int marks[] = new int[6];
        int i;
        float total = 0, avg;
        Scanner sc = new Scanner(System.in);
        for(i=0; i<6; i++)
        {
            System.out.println("Enter marks of subject"+(i+1)+" : ");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        sc.close();
        avg = total/6;
        System.out.println("The Student Grade is: ");
        if(avg>=60)
        {
            System.out.println("A");
        }
        else if(avg>=50 && avg<80)
        {
            System.out.println("B");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("D");
        }
        }
    }
