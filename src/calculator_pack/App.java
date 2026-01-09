package calculator_pack;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 계산기 프로그램 ===");

        String exit = ""; // 변수를 루프 외부에서 선언해야한다.
        int total;
        do {
            System.out.print("첫번째 숫자를 입혁하세요: ");
            int num1 = sc.nextInt();

            System.out.print("연산자를 입혁하세요(+,-,*,/): ");
            char a = sc.next().charAt(0);

            System.out.print("두번째 숫자를 입혁하세요: ");
            int num2 = sc.nextInt();

            switch (a) {
                case '+': total = num1 + num2; break;
                case '-': total = num1 - num2; break;
                case '*': total = num1 * num2; break;
                case '/':
                    if (num2 != 0) {
                        total = num1 / num2;
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
            sc.nextLine();

            System.out.print("계속계산하시겠습니까?(그만 계산할 시 exit를 입력해주세요.): ");
            exit = sc.nextLine();

        } while (!exit.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }
}
