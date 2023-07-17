import java.util.Scanner;

public class UnsetBit {
    static int unsetBit(int A, int B){
        int unset = (1<<B);
        if ((A & unset) != 0){
            A = A & ~unset;
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(unsetBit(A, B));
    }
}
