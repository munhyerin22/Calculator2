package calculator_pack_step3;
import java.util.function.BinaryOperator;

public enum OperatorType {
    // 람다식을 생성자에 전달
    PLUS('+', (num1, num2) -> num1 + num2),
    MINUS('-', (num1, num2) -> num1 - num2),
    MULTIPLY('*', (num1, num2) -> num1 * num2),
    DIVIDE('/', (num1, num2) -> {
        if (num2 == 0)
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
            //System.out.println("0으로 나눌 수 없습니다.");
        return num1 / num2;
    }),
    NANUGE('%', (num1, num2) -> {
        if (num2 == 0)
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        //System.out.println("0으로 나눌 수 없습니다.");
        return num1 % num2;
    });

    private final char oper;
    private final BinaryOperator<Integer> expression;

    OperatorType(char oper, BinaryOperator<Integer> expression){
        this.oper = oper;
        this.expression = expression;
    }

    public int calculate(int num1, int num2){
        return expression.apply(num1, num2);
    }
}
