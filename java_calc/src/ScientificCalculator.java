public class ScientificCalculator extends Advenced_Calculator{

    @Override
    public int square(){
        result = 1;
        for(int i = 0; i < num2; i++)
            result = result * num1;
        return result;
    }
}
