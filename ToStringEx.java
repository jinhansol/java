//class Point {
//    private int x, y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public String toString() {
//        return "point(" + x + "," + y + ")";
//    }
//}

public class ToStringEx {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p + "입니다.");
    }
}
