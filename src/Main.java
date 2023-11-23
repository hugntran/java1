public class Main {
    public static void main(String[] args) {
        //Tao va chay thu yeu cau nhap thong tin va In thong tin class Person
        Person Test01 = new Person();
        Test01.nhapThongTin();
        Test01.InThongTin();
        Test01.setTen("byuni");
        Test01.getTen();
        //Chay thu yeu cau cua Student
        Student Test02 = new Student();
        Test02.nhapThongTin();
        Test02.InThongTin();
        Test02.hocbong();
        //Chay yeu cau GiaoVien
        GiaoVien Test03 = new GiaoVien();
        Test03.nhapThongTin();
        Test03.InThongTin();
    }
}