import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args){
        double gpa;
        String name;
        Scanner input = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        name = input.nextLine();
        System.out.println( "Enter your gpa:   " );
        gpa = input.nextDouble();
        System.out.println( name + " has a gpa of " + gpa + " resulting in a credit of " + (gpa * 10) + " dollars." );

    }
}
