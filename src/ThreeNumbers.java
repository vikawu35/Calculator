class ThreeNumbers {
    int a;
    int b;
    int c;
    char operator1;
    char operator2;
    int result;

    public void calculate1(String element1, String element2, String element3, char op1, char op2) {
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
        try {
            c = Integer.parseInt(element3);
        } catch (NumberFormatException nfe) {
            System.out.println("Enter a number.");
            System.exit(0);
        }
        operator1 = op1;
        operator2 = op2;
        if (a < 0 || a > 10 || b < 0 || b > 10 || c < 0 || c > 10) {
            System.out.println("Numbers must be in range from 1 to 10.");
            System.exit(0);
        } else if (operator1 == '+') {
            switch (operator2) {
                case '+':
                    result = a + b + c;
                    break;
                case '-':
                    result = a + b - c;
                    break;
                case '*':
                    result = a + (b * c);
                    break;
                case '/':
                    result = a + b / c;
                    break;
                default:
                    System.out.println("Invalid operator. Please enter +, -, / or *");
                    System.exit(0);
            }
        } else if (operator1 == '-') {
            switch (operator2) {
                case '+':
                    result = a - b + c;
                    break;
                case '-':
                    result = a - b - c;
                    break;
                case '*':
                    result = a * b * c;
                    break;
                case '/':
                    result = a / b / c;
                    break;
                default:
                    System.out.println("Invalid operator. Please enter +, -, / or *");
                    System.exit(0);
            }
        } else if (operator1 == '*') {
            switch (operator2) {
                case '+':
                    result = a * b + c;
                    break;
                case '-':
                    result = a * b - c;
                    break;
                case '*':
                    result = a * b * c;
                    break;
                case '/':
                    result = (a * b) / c;
                    break;
                default:
                    System.out.println("Invalid operator. Please enter +, -, / or *");
                    System.exit(0);
            }

        } else if (operator1 == '/') {
            switch (operator2) {
                case '+':
                    result = a / b + c;
                    break;
                case '-':
                    result = a / b - c;
                    break;
                case '*':
                    result = a / b * c;
                    break;
                case '/':
                    result = a / b / c;
                    break;
                default:
                    System.out.println("Invalid operator. Please enter +, -, / or *");
                    System.exit(0);
                }
            }
        System.out.println("Output: " + result);
    }
}
