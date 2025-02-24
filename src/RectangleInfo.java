import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area;
        double perimeter;
        double diagonal;
        boolean finish = false;

        do{
            System.out.println("what is the width of your rectangle?");
            if(in.hasNextDouble()) {
                width = in.nextDouble();
                finish = true;
            }
            else{
                System.out.println("you did not enter the correct response");
                in.next();
            }
        }
        while(!finish);
        finish = false;
        do{
            System.out.println("what is the height of your rectangle?");
            if(in.hasNextDouble()) {
                height = in.nextDouble();
                finish = true;
            }
            else{
                System.out.println("you did not enter the correct response");
                in.next();
            }
        }
        while(!finish);

        area = width * height;
        perimeter = width + width + height + height;
        diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        System.out.print("the perimeter is: " + perimeter + " and the area is: " + area);
        System.out.print("\nthe length of the diagonal is: " + diagonal);











    }
}
