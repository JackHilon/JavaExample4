
package MyMath;

import MyUtilities.InputHelper;


public class MathHelper {
    
    private int total=0;
    
    public MathHelper(){
        this.total=50;
    }
    
    public MathHelper(int number)
    {
        this(); // call the MathHelper() constructor
        this.total=this.total+number;
    }
    
    
    
    //--------------------------------------------------------------------
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
