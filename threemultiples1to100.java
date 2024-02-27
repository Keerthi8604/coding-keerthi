import java.util.Scanner;
class threemultiples1to100 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for(int i = 1; i<=n;i++)
        {
            if(i%3 == 0)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total numbers divisible by 3 from 1 to 100 : " + count);
        
    }
}    

