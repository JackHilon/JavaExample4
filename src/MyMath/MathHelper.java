package MyMath;

import MyUtilities.InputHelper;

public class MathHelper {

    // final means that is setted once only. Always in capital letters.
    public static final String ADD = "Adding";
    public static final String SUB = "Subtract";

    private int total = 0;

    public MathHelper() {
        this.total = 50;
    }

    public MathHelper(int number) {
        this(); // call the MathHelper() constructor
        this.total = this.total + number;
    }

    //--------------------------------------------------------------------
    public int GetTotal() {
        return this.total;
    }

    public int GetMath(String prompt, String operation)
            throws NumberFormatException {
        String strNumber = InputHelper.GetInput(prompt);
        int myInt = Integer.parseInt(strNumber);
        switch (operation) {
            case ADD:
                this.total = this.total + myInt;
                break;
            case SUB:
                this.total = this.total - myInt;
                break;
        }

        return myInt;
    }
    
    public int GetMath(String prompt, Operation operation)
            throws NumberFormatException {
        String strNumber = InputHelper.GetInput(prompt);
        int myInt = Integer.parseInt(strNumber);
        switch (operation) {
            case ADD:
                this.total = this.total + myInt;
                break;
            case SUB:
                this.total = this.total - myInt;
                break;
        }

        return myInt;
    }

}
