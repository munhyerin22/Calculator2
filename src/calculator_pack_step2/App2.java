package calculator_pack_step2;

import java.util.ArrayList;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        ArrayList<Double> totals;
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 계산기 프로그램 ===");

        String exit; // 변수를 루프 외부에서 선언해야한다.
        double total; // 연산 결과 저장하는 변수로 나누기 연산 결과가 실수일 수 있기 때문에 실수형으로 지정.

        do {
            try {
                int num1 = cal.sc1();
                // System.out.print("첫번째 숫자를 입혁하세요: ");
                //int num1 = Integer.parseInt(sc.nextLine());
                System.out.print("연산자를 입혁하세요(+,-,*,/): ");
                char a = sc.next().charAt(0);
                int num2 = cal.sc1();
                // System.out.print("두번째 숫자를 입혁하세요: ");
                //int num2 = Integer.parseInt(sc.nextLine());

                total = new Calculator().Cal(num1, a, num2);
                cal.setSave_h(total);
                totals = cal.getShow_h();
                System.out.println(totals);

                sc.nextLine(); // 다음 scanner실행 전에 enter 빼주기.

                System.out.print("저장된 연산 결과 중 첫번째 결과를 삭제 하시겠습니까?(yes 입력 시 삭제): ");
                String del = sc.nextLine();
                if (del.equals("yes")) { // del에 yes가 입력되면 연산 결과 List에서 첫번째 연산 결과 삭제.
                    cal.setDel();
                }
            } catch (Exception e) {
                System.out.println("잘못된 값을 입력했습니다.");
            }

            System.out.print("계속 계산하시겠습니까?(exit 입력 시 종료): ");
            exit = sc.nextLine();

        } while (!exit.equals("exit")); // exit에 입력되는 값이 "exit"가 아니면 계속 반복

        System.out.println("프로그램을 종료합니다.");
    }
}