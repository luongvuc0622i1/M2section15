import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        IllegalTriangleException ex = new IllegalTriangleException();
        try {
            ex.Calculate();
        } catch (InputMismatchException e) {
            System.out.println("Xảy ra ngoại lệ: Bạn đã nhập sai dữ liệu");
        }
    }

    private void Calculate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất: ");
        int a = input.nextInt();
        System.out.println("Nhập vào cạnh thứ hai: ");
        int b = input.nextInt();
        System.out.println("Nhập vào cạnh thứ ba: ");
        int c = input.nextInt();
        if (a < 0 || b < 0 || c < 0) {
            throw new InputMismatchException();
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            throw new InputMismatchException();
        }
    }
}
