package calculator_pack_step2;
import java.util.ArrayList;
//import java.util.Scanner;

public class Calculator {
    ArrayList<Double> totals = new ArrayList<>();
    //Scanner sc = new Scanner(System.in);
    public Double Cal(int num1, char a, int num2) { // 계산기의 계산하는 기능
        double total=0;

        if(num1>=0||num2>=0) {
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
                    }
                    break;
                default:
                    System.out.println("지원하지 않는 연산자입니다.");

            }
            System.out.println(num1 + " " + a + " " + num2 + " = " + total);


        } else {
            System.out.println("양의 정수를 입력해주세요.");
        }
        return total;
    }

    // 계산기의 계산이력 저장
    public void Save_h (double total){
        totals.add(total);
    }

    // 계산기의 계산이력 보여주기
    public void Show_h(){
        System.out.println(totals);
    }
}




