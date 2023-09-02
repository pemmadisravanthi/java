import java.io.*;
import java.util.*;
public class SumofNaturalNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        System.out.println("Enter n value in between 1 to 20");
        int n = sc.nextInt();{
            int sum=0;
            for(int i=1;i<=n;i++)
            {
                sum=sum+i;
            }
            System.out.println(" Sum of first "+n+" natural number is "+sum);
        }
    }
}
