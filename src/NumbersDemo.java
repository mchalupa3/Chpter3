import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args){

        int a = 5;
        int b =10;
        System.out.println( "Please enter a whole number" );

        Scanner input = new Scanner( System.in );
        a = input.nextInt();
        System.out.println( "Please enter another whole number" );
        b = input.nextInt();



    }

    public static void displayTwiceTheNumber(int a, int b){
        a = a *2;
        b = b * 2;
        displayResults( "Double the number is: ",a );
        displayResults( "DOuble the number is: ",b );
    }

    public static void displayNumberPlusFive(int y, int z){
        y = y + 5;
        z = z + 5;
        displayResults("The number plus 5 is: ",  y );

        displayResults("The number plus 5 is: ",  z );

    }
    public static void displayNumSqaured(int c, int d){


    }

    public static void displayResults(String display, int answer){
        System.out.println( display + answer );
    }
}
