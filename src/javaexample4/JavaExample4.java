package javaexample4;

import MyMath.MathHelper;
import java.lang.invoke.MethodHandles;

public class JavaExample4 {

    public static void main(String[] args) {
        MathHelper helper = new MathHelper();

        try {
            while (true) {
                int number = helper.AddIntNumber("Enter your number: ");
                int total = helper.GetTotal();

                String message = String.format("Entered: %d, total: %d", number, total); // %d is a place-holder

                System.out.println(message);
            }
        } catch (NumberFormatException myException) {
            System.out.println("All done!");
        }

    }

}