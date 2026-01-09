package calculator_pack_step2;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args){
        double total;

        Scanner sc = new Scanner(System.in);
        System.out.println("=== 계산기 프로그램 ===");

        String exit; // 변수를 루프 외부에서 선언해야한다.

        do {
            System.out.print("첫번째 숫자를 입혁하세요: ");
            int num1 = sc.nextInt();

            System.out.print("연산자를 입혁하세요(+,-,*,/): ");
            char a = sc.next().charAt(0);

            System.out.print("두번째 숫자를 입혁하세요: ");
            int num2 = sc.nextInt();

            total = new Calculator().Cal(num1, a, num2);
            new Calculator().Save_h(total);
            new Calculator().Show_h();
            sc.nextLine();

            System.out.print("계속 계산하시겠습니까?(그만 계산할 시 exit를 입력해주세요.): ");
            exit = sc.nextLine();


        } while (!exit.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }
}
