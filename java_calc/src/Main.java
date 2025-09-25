public class Main {
    public static void main(String[] args) {
        calculator calc = new calculator();

        calc.setNumbers(10,2);

        calc.add();
        calc.displayresult("+");

        calc.subtract();
        calc.displayresult("-");

        calc.multiply();
        calc.displayresult("*");

        calc.divide();
        calc.displayresult("/");
    }
}