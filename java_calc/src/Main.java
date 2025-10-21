public class Main {
    public static void main(String[] args) {
        calculator calc = new calculator();

        calc.setNumbers(3,3);

        calc.add();
        calc.displayresult("+");

        calc.multiply();
        calc.displayresult("*");

        calc.square();
        calc.displayresult("^");

    }
}