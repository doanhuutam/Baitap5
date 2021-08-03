package model;

public class NhanVien {
    private int id;
    private String name;
    private String date;
    private String address;
    private String phone;
    private String email;
    private int idphongBan;

    public NhanVien() {
    }

    public NhanVien(int id, String name, String date, String address, String phone, String email, int idphongBan) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.idphongBan = idphongBan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdphongBan() {
        return idphongBan;
    }

    public void setIdphongBan(int idphongBan) {
        this.idphongBan = idphongBan;
    }
}
