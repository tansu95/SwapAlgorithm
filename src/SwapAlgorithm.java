public class SwapAlgorithm {
    public static void main(String[] args) {
        swapElements(1, 3);
        swapElemString("misha","marat");
    }

    public static void swapElements(int a, int b) {
        a += b;
        b = a - b;
        a = a - b;
//        a = a + b - (b = a);
        System.out.println(a + ":" + b);
    }

    public static void swapElemString(String a, String b) {
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println(a + ":" + b);
    }
}