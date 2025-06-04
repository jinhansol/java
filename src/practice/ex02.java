import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오. ");
        int money = scanner.nextInt();

        int 오만원 = money / 50000;
        money = money % 50000;

        int 만원 = money / 10000;
        money = money % 10000;

        int 천원 = money / 1000;
        money = money % 1000;

        int 백원 = money / 100;
        money = money % 100;

        int 오십원 = money / 50;
        money = money % 50;

        int 십원 = money / 10;
        money = money % 10;

        int 일원 = money;

        System.out.println("오만원권 " + 오만원 + "개");
        System.out.println("만원권 " + 만원 + "개");
        System.out.println("천원권 " + 천원 + "개");
        System.out.println("백원 " + 백원 + "개");
        System.out.println("오십원 " + 오십원 + "개");
        System.out.println("십원 " + 십원 + "개");
        System.out.println("일원 " + 일원 + "개");

        scanner.close();
    }
}
