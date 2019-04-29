import java.util.Scanner;

public class Celcius {
    public static void main(String[] args){
        Scanner userInput = new Scanner( System.in );
        int temp8;
        int temp12;
        int temp5;
        display( "Welcome to the farienhieght calculator! Enter in the temp for 8:00 am in farenheit: " );
        temp8 = userInput.nextInt();
        display( "Enter the temp for 12 o'clock in farenheit " );
        temp12 = userInput.nextInt();
        display( "enther the temp for % o'clock in farenheit" );
        temp5 = userInput.nextInt();

        double celcius;
        int average = (temp5 + temp8 + temp12)/3;
        celcius = (average - 32) * .555555555;
        if(celcius > 0 && average < 100){
            System.out.println( "The average temp in farenheit is: " + average + " and the temp in celcius is: " + celcius );

            display( "it is pretty mild outside" );
        }
        else if(celcius < 32){
            System.out.println( "The average temp in farenheit is: " + average + " and the temp in celcius is: " + celcius );

            display( "it is freezing outside!!" );

        }
        else{
            System.out.println( "The average temp in farenheit is: " + average + " and the temp in celcius is: " + celcius );
            display( "it is hot outside!" );
        }


    }
    public static void display(String c){
        System.out.println( c );

    }
}
