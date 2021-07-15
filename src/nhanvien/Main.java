package nhanvien;

public class Main {
    public static void main(String[] args) {
        Staff c06[] = new Staff[2];
        c06[0] = new StaffFullTime("nv1", "Nam", 22, 123456, "nhanvien1@", 100, 100, 1000);
        c06[1] = new StaffFullTime("nv2", "Lam", 23, 987654, "nhanvien2@", 100, 200, 1000);
        Staff c05[] = new Staff[2];
        c05[0] = new StaffPartTime("nv3", "Long", 25, 134567, "nhanvien3@", 160);
        c05[1] = new StaffPartTime("nv4", "Nam", 26, 167890, "nhanvien4@", 150);

        Manage kA = new Manage("kA",c05);
        kA.showAll();
        System.out.println(kA.tinhTong());
        Manage quan = new Manage("quan", c06);
        quan.showAll();
        System.out.println(quan.tinhTong());
    }
}