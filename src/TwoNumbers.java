class TwoNumbers {
    int a;
    int b;
    char operator;
    int result;

    public void calculate(String element1, String element2, char op) {
        try {
            a = Integer.parseInt(element1);
        } catch (NumberFormatException nfe) {
            System.out.println("Enter a number.");
            System.exit(0);
        }
        try {
            b = Integer.parseInt(element2);
        } catch (NumberFormatException nfe) {
            System.out.println("Enter a number.");
            System.exit(0);
        }
        operator = op;
        if (a < 0 || a > 10 || b < 0 || b > 10) {
            System.out.println("Numbers must be in range from 1 to 10.");
            System.exit(0);
        } else {
            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
                default:
                    System.out.println("Invalid operator. Please enter +, -, / or *");
                    System.exit(0);
            }
        }
        System.out.println("Output: " + result);
    }
}
