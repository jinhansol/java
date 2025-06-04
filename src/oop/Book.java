////public class Book {
////    String title;
////    String author;
////    void show() {
////        System.out.println(title + " " + author);
////    }
////
////    public Book(String t) {
////        title = t; author = "작자 미상";
////    }
////
////    public Book(String t, String a) {
////        title = t; author = a;
////    }
////
////    public static void main(String[] args) {
////        Book littlePrince = new Book("어린왕자", "생택쥐페리");
////        Book lobeStory = new Book("춘향전");
////        System.out.println(littlePrince.title + " " + littlePrince.author);
////        System.out.println(lobeStory.title + " " + lobeStory.author);
////
////    }
////}
//
//public class Book {
//    String title;
//    String author;
//    void show() {
//        System.out.println(title + " " + author);
//    }
//
//    public Book() {
//        this("","");
//        System.out.println("생성자 호출됨");
//    }
//
//    public Book(String title) {
//        this(title, "작자미상");
//    }
//
//    public Book(String title, String author) {
//        this.title = title; this.author = author;
//    }
//
//    public static void main(String[] args) {
//        Book littlePrince = new Book("어린왕자", "생택쥐페리");
//        Book lobeStory = new Book("춘향전");
//        Book emptyBook = new Book();
//        lobeStory.show();
//
//    }
//}