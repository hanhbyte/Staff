package nhanvien;

public class Staff {
    private String code;
    private String name;
    private int age;
    private int phone;
    private String email;


    public Staff(){

    }

    public Staff(String code, String name, int age, int phone, String email) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double tinhLuong(){
        return 0;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}