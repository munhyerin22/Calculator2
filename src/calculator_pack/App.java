package calculator_pack;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("=== 계산기 프로그램 ===");

        String exit = ""; // 변수를 루프 외부에서 선언해야한다.
        double total; // 연산 결과 저장하는 변수로 나누기 연산 결과가 실수일 수 있기 때문에 실수형으로 지정.

        do {
            System.out.print("첫번째 숫자를 입혁하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두번째 숫자를 입혁하세요: ");
            int num2 = sc.nextInt();

            System.out.print("연산자를 입혁하세요(+,-,*,/): ");
            char a = sc.next().charAt(0);

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
                            continue;
                        }
                        break;
                    default:
                        System.out.println("지원하지 않는 연산자입니다.");
                        continue;
                }

            System.out.println(num1 + " " + a + " " + num2 + " = " + total);
            sc.nextLine(); // 다음 scanner실행 전에 enter 빼주기.

            System.out.print("계속 계산하시겠습니까?(exit 입력 시 종료): ");
            exit = sc.nextLine();
            } else {
                System.out.println("양의 정수를 입력해주세요.");
            }

        } while (!exit.equals("exit")); // exit에 입력되는 값이 "exit"가 아니면 계속 반복

        System.out.println("프로그램을 종료합니다.");
    }
}
