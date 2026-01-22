package calculator_pack_step3;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자 나오세요
        User user = new User();
        // 계산기 나오세요
        //Calculator3 cal = new Calculator3();
        int count = 0;
        String exit = "";
        do {
            try {
                user.using();
            } catch (Exception e) {
                System.out.println("0으로 나누어 졌습니다.");
                count++;
                System.out.println("count = " + count);
                continue;
                //throw new RuntimeException(e);
            }

            System.out.print("계속 계산하시겠습니까?(exit 입력 시 종료): ");
            exit = sc.nextLine();
            count++;
            System.out.println("count = " + count);

        } while (!exit.equals("exit"));
        System.out.println("프로그램을 종료합니다.");
    }
}