import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello World!");

        int age = 18;
        double gpa = 3.89;
        boolean snowing = true;

        System.out.println(age + "|" + gpa + "|" + snowing);
        String city = "Columbus";
        System.out.println(city);

        float pi = 3.141592f;
        System.out.println(pi);

        int[] dailyHighs = {50,60,70,80,90};
        System.out.println(dailyHighs[0]);
        // sout
        System.out.println(dailyHighs[1]);
        System.out.println(dailyHighs[2]);
        System.out.println(dailyHighs[3]);
        System.out.println(dailyHighs[4]);
        for(int i=0; i<=4; i++){
            System.out.println(dailyHighs[i]);
        }

        int[][] twoDArray = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(twoDArray[0][1]);
        System.out.println(twoDArray[2][3]);

        int sum = 3 + 2;
        System.out.println(sum);

        int i = 1;
        int result = ++i * 2;
        System.out.println(result);

        System.out.println("What is your age?");
        int inputAge = input.nextInt();
        input.nextLine();
        System.out.println("Your age is " + inputAge);

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}