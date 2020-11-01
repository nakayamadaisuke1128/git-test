public class Main {
    public static void main(String[] args) {
        String s1 = "Java and JavaScript";
        //一部に文字列Javaを含めるかを調べる
        if(s1.contains("Java")) {
            System.out.println("文字列s1は、Javaを含んでいます");
        }
        //文字列Javaで終わるかを調べる
        if(s1.endsWith("Java")) {
            System.out.println("文字列s1は、Javaが末尾にあります");
        }
        //文字列Javaが最初に登場する位置を調べる
        System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
        //文字列Javaを後ろから検索して最初に登場する位置を調べる
        System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
    }
}