package calculator_pack_step2;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args){

        double total;
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 계산기 프로그램 ===");

        String exit; // 변수를 루프 외부에서 선언해야한다.

        do {
            System.out.print("첫번째 숫자를 입혁하세요: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("두번째 숫자를 입혁하세요: ");
            int num2 = Integer.parseInt(sc.nextLine());

            System.out.print("연산자를 입혁하세요(+,-,*,/): ");
            char a = sc.next().charAt(0);

            total = new Calculator().Cal(num1, a, num2);
            cal.getSave_h(total);

            sc.nextLine();

            System.out.print("저장된 연산 결과 중 첫번째 결과를 삭제 하시겠습니까?(yes 입력 시 삭제): ");
            String del = sc.nextLine();
            if (del.equals("yes")){
                cal.getDel();
            }

            System.out.print("계속 계산하시겠습니까?(exit 입력 시 종료): ");
            exit = sc.nextLine();


        } while (!exit.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }
}
