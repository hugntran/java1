import java.util.Scanner;
class Student extends Person {
    //THUOC TINH
    private String maSV, email;
    private float diemThi;

    // Constructors
    public Student() {
    }

    public Student(String T, String G, String N, String D, String M, float D2, String E) {
        super(T, G, N, D);
        this.maSV = M;
        this.diemThi = D2;
        this.email = E;
    }

    // Ghi đè phương thức nhap, in thong tin cua lop Person
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        this.maSV = nhap.nextLine();
        System.out.println("Nhập điểm thi: ");
        this.diemThi = nhap.nextFloat();
        nhap.nextLine(); // Xử lý ký tự xuống dòng sau khi nhập du lieu double hoac float
        System.out.println("Nhập email: ");
        this.email = nhap.nextLine();
    }

    // Ghi đè phương thức In thông tin từ lớp Person
    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Điểm thi: " + diemThi);
        System.out.println("Email: " + email);
    }

    public void hocbong() {
        if (diemThi > 8 && diemThi <= 10) {
            System.out.println("Duoc Hoc Bong");
        } else {
            System.out.println("Chuc ban may man lan sau");
        }
    }
}
