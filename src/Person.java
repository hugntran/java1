import java.util.Scanner;

public class Person {
    //Thuoc tinh cua class
    private String ten, gioitinh, ngaysinh, diachi;

    //Constructor khong tham so
    public Person() {
    }

    //Constructor co tham so
    public Person(String T, String G, String N, String D) {
        this.ten = T;
        this.gioitinh = G;
        this.ngaysinh = N;
        this.diachi = D;
    }

    // Ham get/set
    public String getTen() {
        return ten;
    }

    public void setTen(String Te) {
        this.ten = Te;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String Gi) {
        this.gioitinh = Gi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String Ng) {
        this.ngaysinh = Ng;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String Di) {
        this.diachi = Di;
    }

    ;

    //Phuong thuc nhap THONG TIN
    public void nhapThongTin() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap thong tin theo thu tu:");
        System.out.println("ten: ");
        this.ten = nhap.nextLine();
        System.out.println("Gioi Tinh: ");
        this.gioitinh = nhap.nextLine();
        System.out.println("Ngay Sinh: ");
        this.ngaysinh = nhap.nextLine();
        System.out.println("Dia Chi: ");
        this.diachi = nhap.nextLine();
    }

    //Phuong thuc IN THONG TIN
    public void InThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Gioi Tinh: " + gioitinh);
        System.out.println("Ngay Sinh: " + ngaysinh);
        System.out.println("Dia Chi: " + diachi);
    }
}