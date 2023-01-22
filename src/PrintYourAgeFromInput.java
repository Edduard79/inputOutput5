import java.util.Scanner;

public class PrintYourAgeFromInput {
    public PrintYourAgeFromInput(){
    }

    public static void main(String[] args){

        System.out.printf("Please insert your age and press enter! \n");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        input.close();

        System.out.printf("You are %d y.o!", age);
    }




}
