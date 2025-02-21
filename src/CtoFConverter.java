import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double Temp;
        double tempChange;
        boolean finished = false;
        do {
            System.out.print("Please enter the celsius temperature that you want to convert to fahrenheit:");

            if (in.hasNextDouble()) {
                Temp = in.nextDouble();
                tempChange = (Temp * 1.8) + 32;
                System.out.println("\nYour temp in Fahrenheit is:\n" + tempChange);
                finished = true;
            }
            else{
                System.out.print("you did not enter the correct input\n");
                in.next();
            }
        }

        while(!finished);
        }


    }

