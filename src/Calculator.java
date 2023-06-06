import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String input = scanner.nextLine();
        input = input.replaceAll("\\s", "");
        String[] elements = input.split("");

        if(elements.length == 3) {
            TwoNumbers twoNumbers = new TwoNumbers();
            twoNumbers.calculate(elements[0], elements[2], elements[1].charAt(0));
        }
        else if(elements.length == 5) {
            ThreeNumbers threeNumbers = new ThreeNumbers();
            threeNumbers.calculate1(elements[0], elements[2], elements[4], elements[1].charAt(0), elements[3].charAt(0));
        }
        else{
            System.out.println("The app can perform calculations with 2 or 3 numbers only.");
            System.exit(0);
        }

    }
}


