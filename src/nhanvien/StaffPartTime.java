package nhanvien;

public class StaffPartTime extends Staff {
    private int time;

    public StaffPartTime(){

    }

    public StaffPartTime(int time) {
        this.time = time;
    }

    public StaffPartTime(String code, String name, int age, int phone, String email, int time) {
        super(code, name, age, phone, email);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public double tinhLuong() {
        return time * 1000;
    }

    @Override
    public String toString() {
        return "NvPartTime{" +
                "time=" + time +
                '}';
    }
}
