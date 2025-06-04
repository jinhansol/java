import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원화를 입력하세요(단위 원): ");
        int won = sc.nextInt();

        double dollor = (double) won / 1200;
        System.out.printf("%d원은 $%.2f입니다.\n", won, dollor);

        sc.close();
    }
}
