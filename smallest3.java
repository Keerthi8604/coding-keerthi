import java.util.Scanner;
class smallest3 
{
   public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("to find smallest of three numbers");
        System.out.println("enter 1st number");
        int num1=scanner.nextInt();
        System.out.println("enter 2nd number");
        int num2=scanner.nextInt();
        System.out.println("enter 3rd number");
        int num3=scanner.nextInt();
        if(num1<num2 && num1<num3)
        {
            System.out.println("smallest is:"+num1);
        }
        else if(num2<num1 && num2<num3){
                System.out.println("smallest is:"+num2);
        }
        else
        {
                System.out.println("smallest is:"+num3);
        }
        

    }

} 

