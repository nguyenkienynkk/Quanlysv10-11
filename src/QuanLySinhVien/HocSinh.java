package QuanLySinhVien;



public class HocSinh {
        private String tenSV;
        private int tuoi;
        private int sex;
        private double diemTB;

    public HocSinh(String tenSV, int tuoi, int sex, double diemTB) {
        this.tenSV = tenSV;
        this.tuoi = tuoi;
        this.sex = sex;
        this.diemTB = diemTB;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "tenSV='" + tenSV + '\'' +
                ", tuoi=" + tuoi +
                ", sex=" + sex +
                ", diemTB=" + diemTB +
                '}';
    }

    public void inThongTinSinhVien() {
        String name1 = sex == 1 ? "nam" : sex == 0 ? "nu" : "gioi tinh thu 3";
        System.out.println("Thông tin sinh viên: ");
        System.out.println("Tên: " + tenSV + "- Tuổi: " + tuoi + "Giới tính : " + sex + "- Điểm trung bình: " + diemTB );
    }
}
