import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many lines do you want to enter");
        int n = s.nextInt();

        System.out.println("I want to enter " + n + " lines ");
        n = n + 1;
        String[] str;
        str = new String[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            str[i] = s.nextLine();
            System.out.println(str[i]);
            count++;
        }
        if (count == n) {
            System.out.println("Reversed output");

            for (int i = n - 1; i >= 0; i--) {
                System.out.println(str[i]);
            }
        }
    }
    import java.util.Scanner;
    public class Task2 {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input the first number: ");
            double x = in.nextDouble();
            System.out.print("Input the second number: ");
            double y = in.nextDouble();
            System.out.print("Input the third number: ");
            double z = in.nextDouble();
            System.out.print("The average value is " + average(x, y, z)+"\n" );
        }

        public static double average(double x, double y, double z)
        {
            return (x + y + z) / 3;
        }
    }
    Task4
    #include <stdio.h>
    /* height and width of a rectangle in inches */
    int width;
    int height;

    int area;
    int perimeter;

    int main() {
        height = 4;
        width = 9;

        perimeter = 2*(height + width);
        printf("Perimeter of the rectangle = %d inches\n", perimeter);

        area = height * width;
        printf("Area of the rectangle = %d square inches\n", area);

        return(0);
    }