import java.util.Scanner;
class GiaoVien extends Person {
    private String[] lopgiangday;
    private double luong;
    private int somon;
    private String[] mongiangday;

    // Constructors
    public GiaoVien() {
    }

    public GiaoVien(String T, String G, String N, String D, String[] L,
                    double L2, int S, String[] M) {
        super(T,G,N,D);
        this.lopgiangday = L;
        this.luong = L2;
        this.somon = S;
        this.mongiangday = M;
    }
    // Ghi đè phương thức Nhập thông tin từ lớp Person
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập mức lương: ");
        this.luong = nhap.nextDouble();
        nhap.nextLine(); // Xử lý lỗi nhập sau nextDouble()
        System.out.println("Nhập số môn giảng dạy: ");
        this.somon = nhap.nextInt();
        nhap.nextLine(); // Xử lý lỗi nhập sau nextInt()
        this.mongiangday = new String[somon];
        for (int i = 0; i < somon; i++) {
            System.out.println("Nhập môn giảng dạy " + (i + 1) + ": ");
            mongiangday[i] = nhap.nextLine();
        }
    }

    // Ghi đè phương thức In thông tin từ lớp Person
    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("Mức lương: " + luong);
        System.out.println("Số môn giảng dạy: " + somon);
        System.out.println("Các môn giảng dạy:");
        for (int i = 0; i < somon; i++) {
            System.out.println("- " + mongiangday[i]);
        }
    }
}