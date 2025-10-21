public class calculator {
    int num1;
    int num2;
    int result;

    public void setNumbers(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add(){
        result = num1 + num2;
        return result;
    }
    public int subtract(){
        result = num1 - num2;
        return result;
    }
    public int multiply(){
        result = 0;
        for(int i = 0; i < num2; i++)
            result = result + num1;
        return result;
    }
    public int divide(){
        result = 0;
        while(num1 >= num2){
            num1 -= num2;
            ++result;
        }
        return result;
    }

    public int square(){
        result = 1;
        for(int i = 0; i < num2; i++)
            result = result * num1;
        return result;
    }

    public void displayresult(String operator){
        System.out.println( num1 + " " + operator + " " + num2 + " = " + result);
    }
}
