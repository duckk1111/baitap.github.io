import java.util.Scanner;

public class Calculator {
    public int CalculatorSum() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
             System.out.print("Enter a number or enter 'n' to stop: ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            } 
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Pls enter a acception number or enter 'n' to stop, thank you");
            }

        }  
        return sum;
    }

    public int CalculatorOfSumProduct(int n) {
        int sum = 0; 
        StringBuilder eBuilder = new StringBuilder();

        for (int i = 1; i <= n ; i++){
            int product = 1; 


            for (int j = 1; j <= i; j++) {
                product *= j;
                eBuilder.append(j);
                if (j < i ) {
                    eBuilder.append("*");
                }
            }
            sum += product;
            if (i < n) {
                eBuilder.append(" + ");
            }
        }
            System.out.println("Expression is: " + eBuilder.toString());
            return sum;
    }

    public void printPrimeFactor(int n) {
        System.out.print("Prime factor " + n + " is: " );
        while (n % 2 == 0) {
            System.out.print(2 + "  ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            while (n % i == 0 ) {
                System.out.print(i + "  ");
                n /= i;
            }
        }
        if (n > 2) { 
            System.out.print(n);
        }

    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int Sum = calculator.CalculatorSum();
        System.out.println("Sum is: " + Sum);

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        n = sc.nextInt();
        int sumOfProduct = calculator.CalculatorOfSumProduct(n);
        System.out.println("Enter Experession n = " + n + " is: " + sumOfProduct);
        System.out.print("Enter Prime Factors: ");
        n = sc.nextInt();
        calculator.printPrimeFactor(n);
    }
}
