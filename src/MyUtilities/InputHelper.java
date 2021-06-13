
package MyUtilities;

import static java.lang.System.in;
import java.util.Scanner;


public class InputHelper {
    
     public static String GetInput(String promt) 
    {
        System.out.print(promt);
        Scanner myScan=new Scanner(in);
        String myInput=myScan.nextLine();
        return myInput;
    }
    
}
