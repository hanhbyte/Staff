package nhanvien;

public class Manage {
    private Staff[] listStaff;
    private String name;

    public Manage(){

    }

    public Manage(String name, Staff[] listStaff){
        this.name = name;
        this.listStaff = listStaff;
    }

    public Staff[] getListStaff() {
        return listStaff;
    }

    public void setListStaff(Staff[] listStaff) {
        this.listStaff = listStaff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showAll(){
        for (Staff staff : listStaff) {
            System.out.println(staff.toString());
        }
    }

    public double tinhTong(){
        double tong = 0;
        for (Staff staff : listStaff){
            tong = tong + staff.tinhLuong();
        }
        return tong;
        }


    }
