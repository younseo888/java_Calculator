public class Main {
    public static void main(String[] args) {
        calculator calc = new calculator();

        calc.setNumbers(3,5);

        calc.add();
        calc.displayresult("+");

        Advenced_Calculator calc_mul = new Advenced_Calculator();
        calc_mul.setNumbers(10,2);
        calc_mul.multiply();
        calc_mul.displayresult("*");

    }
}