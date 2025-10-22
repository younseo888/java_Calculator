public class ScientificCalculator extends Advenced_Calculator{
    ///github issue #8 게산기 v3.0 개발
    ///https://github.com/younseo888/java_Calculator/issues/8#issue-3535700257

    @Override
    public int square(){
        result = 1;
        for(int i = 0; i < num2; i++)
            result = result * num1;
        return result;
    }
    /// github issue #9 제곱 연산자 개발
    /// https://github.com/younseo888/java_Calculator/issues/9

}
