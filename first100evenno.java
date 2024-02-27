import java.util.Scanner;

 class first100evenno 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int count = 0;
        System.out.println("The first " + num + " Numbers : ");
        for(int i = 1; i<=num;i++)
        {
            if(i%2== 0)
                System.out.println(i);   
        }   
    }
}
    

