import ra.dev.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao canh dau tien cua tam giac: ");
            Double a = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap vao canh thu hai cua tam giac: ");
            Double b = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap vao canh thu 3 cua tam giac: ");
            Double c = Double.parseDouble(sc.nextLine());

            if (a + b < c || a + c < b || b + c < a || a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException("Day khong phai la 3 canh 1 tam giac");
            } else {
                System.out.println("day la mot tam giac");
            }
        } catch (NumberFormatException e) {
            throw new IllegalTriangleException("nhap vao 1 so.");

        }
    }
}







