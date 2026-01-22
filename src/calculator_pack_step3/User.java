package calculator_pack_step3;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    Calculator3 cal3 = new Calculator3();
    ArrayList<Double> totals;

    public int inputNum() {
        int num;
        do {
            System.out.print("정수를 입력하세요: ");
            num = Integer.parseInt(sc.nextLine());
        } while (num<0);
        return num;

    }

    public char inputOper() {
        System.out.print("연산자를 입력하세요 (+, -, *, /, %): ");
        return sc.next().charAt(0);

    }

    public void using() {
        double total;
        int num1 = inputNum();
        char oper = inputOper();
        sc.nextLine();
        int num2 = inputNum();
        total=cal3.calculate(num1, oper, num2);
        System.out.println(num1 + " " + oper + " " + num2 + " = " + total);
        cal3.setSaveHistory(total);
        totals = cal3.getShowHistory();
        System.out.println(totals);

        System.out.print("저장된 연산 결과 중 첫번째 결과를 삭제 하시겠습니까?(yes 입력 시 삭제): ");
        String del = sc.nextLine();
        if (del.equals("yes")) { // del에 yes가 입력되면 연산 결과 List에서 첫번째 연산 결과 삭제.
            cal3.setDel();
        }
    }


}
