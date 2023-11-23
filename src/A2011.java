import java.util.Scanner;

public class A2011 {
    public static void main(String[] args) {
        System.out.println("HALO");

        final int x;
        x = 10;
        System.out.println("Hang so: " + x);

        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Code:");
        int td = sc.nextInt();
        System.out.println("Point:");
        float pt = sc.nextFloat();

        System.out.println("Ten ban: " + name);
        System.out.println("Ma SV: " + td);
        System.out.println("Diem: " + pt);

    }
}
