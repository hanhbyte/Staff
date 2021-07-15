package nhanvien;

public class StaffFullTime extends Staff {
    private double tienthuong;
    private double tienphat;
    private double luongcung;

    public StaffFullTime(){

    }

    public StaffFullTime(String code, String name, int age, int phone, String email, long tienthuong, long tienphat, long luongcung) {
        super(code, name, age, phone, email);
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }
//    public String luongLinh(){
//        return "LuongCung" + luongcung + ("TienThuong" +tienthuong+'-'+ "TienPhat" + tienphat);
//    } Không được đè nên

    @Override
    public double tinhLuong() {
        return luongcung+tienthuong-tienphat; 
    }

    @Override
    public String toString() {
        return "NvFullTime{" +
                "tienthuong=" + tienthuong +
                ", tienphat=" + tienphat +
                ", luongcung=" + luongcung +
                '}';
    }
}
