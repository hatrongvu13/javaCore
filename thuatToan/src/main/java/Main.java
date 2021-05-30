import java.util.*;

public class Main {
    public static void main(String[] args) {
        // khai bao va nhap cac phan tu cua mang
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap do dai cua mang");
        int n = scan.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu cua mang : ");
            a[i] = scan.nextInt();
        }
// sap xep
        sapXep(a);
// hien thi mang ra
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void sapXep(int a[]) {
        System.out.println("sap xep mang");
        for (int i = 0; i < a.length - 1; i++) {
//            System.out.println(a[i]);
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
    }
}
