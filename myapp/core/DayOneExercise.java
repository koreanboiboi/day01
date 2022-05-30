package myapp.core;
import java.io.Console;

public class DayOneExercise {

    public static void main(String[] args) {
        Console cons = System.console();


        String input1 = cons.readLine("Please input first number: ");
        String input2 = cons.readLine("Please input second number: ");
        Integer i = Integer.parseInt(input1);
        Integer j = Integer.parseInt(input2);
        String operator = cons.readLine("Select operator(add,div,sub,mul): ");
        
        if (operator.equals("add")) {
            System.out.println(i+j);
        } else if (operator.equals("div")) {
            float val = Float.parseFloat(input1);
            float val1 = Float.parseFloat(input2);
            float f = val/val1;
            System.out.printf("%.3f",f);
        } else if (operator.equals("sub")) {
            System.out.println(i-j);
        } else if (operator.equals("mul")) {
            System.out.println(i*j);
        }

    }
    
}
