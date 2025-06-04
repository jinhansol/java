import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름을 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = scanner.nextDouble();

        System.out.print("점을 입력하시오>>");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // (a-x)^2 + (b-y)^2 <= c^2 이면 원 안에 있음
        double dx = a - x;
        double dy = b - y;
        double distanceSquare = dx * dx + dy * dy;
        double radiusSquare = c * c;

        if (distanceSquare <= radiusSquare) {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있습니다.");
        } else {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 없습니다.");
        }

        scanner.close();
    }
}
