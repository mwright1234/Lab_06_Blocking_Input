import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double gasGallon = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double hundredCost;
        double distance;
        boolean finish = false;

        do {
            System.out.println("how many gallons of gas can your tank hold:");

            if (in.hasNextDouble()) {
                gasGallon = in.nextDouble();
                finish = true;
            }
            else{
                System.out.println("this is not a correct response");
                in.next();
            }
        }
        while(!finish);
        finish = false;
        do {
            System.out.println("what is your cars MPG:");

            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                finish = true;
            }
            else{
                System.out.println("this is not a correct response");
                in.next();
            }
        }
        while(!finish);
        finish = false;
        do {
            System.out.println("what is the current price of gas:");

            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                finish = true;
            }
            else{
                System.out.println("this is not a correct response");
                in.next();
            }
        }
        while(!finish);
        hundredCost = (100.0 / fuelEfficiency) * gasPrice;
        distance = fuelEfficiency * gasGallon;
        System.out.print("it would cost: $" + hundredCost + " to drive 100 miles.");
        System.out.println("\nyou would drive: "+ distance + " miles with a full tank of gas");
        }


    }

