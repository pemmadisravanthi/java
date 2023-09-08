import java.util.Scanner;
public class DoWhileDemo{
    public static void main(String[]args){
        int choice;
        Scanner keyboard=new Scanner(System.in);
        do{
            System.out.println("~~~~~Menu~~~~~");
            System.out.println("1.Option 1");
            System.out.println("2.Option 2");
            System.out.println("3.Quit");
            System.out.println("Enter choice =");
            choice=keyboard.nextInt();
            if(choice==1){
                System.out.println("User entered 1");
            }
            if(choice==2){
                System.out.println("User entered 2");
            }
        }while(choice!=3);
    }
}
