package calculator_pack_step3;
import java.util.ArrayList;

public class Calculator3 {
    //User user = new User();
    ArrayList<Double> totals = new ArrayList<>();

    public Double calculate(int num1, char oper, int num2) {
        double total=0;

        switch(oper){
            case '+':
                total = OperatorType.PLUS.calculate(num1, num2);
                break;
            case '-':
                total = OperatorType.MINUS.calculate(num1, num2);
                break;
            case '*':
                total = OperatorType.MULTIPLY.calculate(num1, num2);
                break;
            case '/':
                total = OperatorType.DIVIDE.calculate(num1, num2);
                break;
            case '%':
                total = OperatorType.NANUGE.calculate(num1, num2);
                break;
            default:
                System.out.println("지원하지 않는 연산자 입니다.");
        }

    return total;
    }

    // 계산기의 계산이력 저장하고 보여주기
    private void saveHistory(double total) {
        totals.add(total); // totals라는 ArrayList에 total값을 추가
    }

    public void setSaveHistory(double total) {
        saveHistory(total); // private 접근 지정자에 간접적으로 접근.
    }

    public ArrayList<Double> getShowHistory() {
        return totals;
    }

    // 연산 결과 중 첫번째 값 삭제하기
    private void del() {
        if (!totals.isEmpty()) {
            totals.removeFirst(); // totals라는 List에 첫번째 인덱스 삭제.
            System.out.println(totals); // 삭제완료된 List 출력
        } else {
            System.out.println("저장된 값이 없습니다.");
        }
    }

    public void setDel() {
        del(); // private 접근 지정자에 간접적으로 접근.
    }
}

