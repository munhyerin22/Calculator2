package calculator_pack_step2;

import java.util.ArrayList;
//import java.util.Scanner;


public class Calculator {
    ArrayList<Double> totals = new ArrayList<>();

    public Double Cal(int num1, char a, int num2) { // 계산기의 계산하는 기능
        double total = 0;

        if (num1 >= 0 && num2 >= 0) { // num1과 num2가 둘다 0보다 크거나 같을 때만 참으로 연산 시작
            switch (a) { // 입력받은 연산자를 a에 입력받아 해당 case를 실행.
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
                    if (num2 != 0) { // num2가 분모로 0으로 나눌 수 없다는 예외처리
                        total = (double) num1 / num2; // 나누기의 결과 값은 실수로 나올 수 있기 때문에 형변환.
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
        totals.add(total); // totals라는 ArrayList에 total값을 추가
    }

    public void setSave_h(double total) {
        save_h(total); // private 접근 지정자에 간접적으로 접근.
    }

    private void show_h(){
        System.out.println(totals);
    }

    public void getShow_h(){
        show_h();
    }

    // 연산 결과 중 첫번째 값 삭제하기
    private void del() {
        if(!totals.isEmpty()){
            totals.removeFirst(); // totals라는 List에 첫번째 인덱스 삭제.
            System.out.println(totals); // 삭제완료된 List 출력
        } else {
            System.out.println("저장된 값이 없습니다.");
        }
    }

    public void setTotals() {
        del(); // private 접근 지정자에 간접적으로 접근.
    }
}







