import java.io.*;
public class CmdlineArgsDemoV3 extends Object
{
    public static void main(String[]args) {
        CmdlineArgsDemoV3 obj=new CmdlineArgsDemoV3();
        if(args.length!=2){
            System.out.println("Invalid number of arguments \n you need to pass two integers");
        }
        else
        {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println(" The class name is : "+obj.getClass());
        System.out.println(" Sum of "+x+" and "+y+" is "+z);
    }
  }
}
