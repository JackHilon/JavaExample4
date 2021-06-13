
package MyMath;

import MyUtilities.InputHelper;


public class MathHelper {
    
    private int total=0;
    
    public int GetTotal()
    {
        return this.total;
    }
    
    public int AddIntNumber(String prompt) throws NumberFormatException
    {
        String strNumber=InputHelper.GetInput(prompt);
        int myInt=Integer.parseInt(strNumber);
        this.total=this.total+myInt;
        return myInt;
    }
    
}
