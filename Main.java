class CalculatorTest2 {

    public static void main(String[] args) {

        Calculator2 calc = new Calculator2();

        calc.originalPrice = 10;
        calc.findTotal();

        calc.originalPrice = 12;
        calc.findTotal();

        calc.originalPrice = 9;
        calc.findTotal();

        calc.originalPrice = 8;
        calc.findTotal();

        calc.originalPrice = 7;
        calc.findTotal();

        calc.originalPrice = 15;
        calc.findTotal();

        calc.originalPrice = 11;
        calc.findTotal();

        calc.originalPrice = 30;
        calc.findTotal();
    }
}
class Calculator2 {

    double tax = 0.05;
    double tip = 0.15;
    double originalPrice;

    public void findTotal() {
        double total = originalPrice * (1 + tax + tip);
        System.out.println("Total: $" + total);
    }
}

