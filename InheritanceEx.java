//class Person {
//    private int weight;
//    int age;
//    protected int height;
//    public String name;
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//    public int getWeight() {
//        return weight;
//    }
//}
//
//class Student extends Person {
//    public void set() {
//        age = 30;
//        name = "홍길동";
//        height = 175;
//        // weight = 99; //오류. 슈퍼 클래스의 private 접근 불가
//        setWeight(99); // private 멤버 weight은 setWeight()으로 간접 접근
//    }
//}
//
//public class InheritanceEx {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.set();
//    }
//}
