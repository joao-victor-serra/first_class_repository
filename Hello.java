/**
 * Hello
 */
public class Hello {
    public static void main(String[] args) {
        int A, B, C;


        A = 5;
        B = 15;
        C = 10;

        System.out.println(B); // 15
        System.out.println(C); // 10
        System.out.println(A); // 5

        A = B;
        B = A;
        C = C;

        System.out.println(B); // 15
        System.out.println(A); // 15
        System.out.println(C); // 10
    }
}