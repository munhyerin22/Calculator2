package calculator_pack_step2;
import java.util.ArrayList;

public class Calculator {
    ArrayList<Double> totals = new ArrayList<>();

    public Double Cal(int num1, char a, int num2) { // 계산기의 계산하는 기능
        double total = 0;

        if (num1 >= 0 && num2 >= 0) {
            switch (a) {
                case '+':
                    total = num1 + num2;
                    break;
                case '-':
                    total = num1 - num2;
                    break;
                case '*':
                    total = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        total = (double) num1 / num2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                        break;
                    }
                    break;
                default:
                    System.out.println("지원하지 않는 연산자입니다.");
                    break;

            }

            System.out.println(num1 + " " + a + " " + num2 + " = " + total);

        } else {
            System.out.println("양의 정수를 입력해주세요.");
        }
        return total;
    }

    // 계산기의 계산이력 저장하고 보여주기
    private void save_h(double total) {
        totals.add(total);
        System.out.println(totals);
    }
    public void getSave_h(double total){
        save_h(total);
    }

    // 연산 결과 중 첫번째 값 삭제하기
    private void del(){
        totals.removeFirst();
        System.out.println(totals);
    }

    public void getDel(){
        del();
    }
}







