import java.util.Scanner;
class greatest3
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("to find greatest of three numbers");
        System.out.println("enter 1st number");
        int num1=scan.nextInt();
        System.out.println("enter 2nd number");
        int num2=scan.nextInt();
        System.out.println("enter 3rd number");
        int num3=scan.nextInt();
        if(num1>num2)
        {
            if(num1>num3)
                System.out.println("greatest is:"+num1);
            else
                System.out.println("greatest is:"+num2);
        }
        else
        {
            if(num2>num3)
                System.out.println("greatest is:"+num2);
            else
                System.out.println("greatest is:"+num3);
        }
        

    }

}