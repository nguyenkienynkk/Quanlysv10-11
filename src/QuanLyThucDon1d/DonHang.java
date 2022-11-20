package QuanLyThucDon1d;

public class DonHang {
    private String tenHang;
    private double soTienMua;
    private int ngayMua;
    private String tenCuaHang;

    public DonHang(String tenHang, double soTienMua, int ngayMua, String tenCuaHang) {
        this.tenHang = tenHang;
        this.soTienMua = soTienMua;
        this.ngayMua = ngayMua;
        this.tenCuaHang = tenCuaHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getSoTienMua() {
        return soTienMua;
    }

    public void setSoTienMua(double soTienMua) {
        this.soTienMua = soTienMua;
    }

    public int getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(int ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getTenCuaHang() {
        return tenCuaHang;
    }

    public void setTenCuaHang(String tenCuaHang) {
        this.tenCuaHang = tenCuaHang;
    }

    @Override
    public String toString() {
        return "DonHang{" +
                "tenHang='" + tenHang + '\'' +
                ", soTienMua=" + soTienMua +
                ", ngayMua=" + ngayMua +
                ", tenCuaHang='" + tenCuaHang + '\'' +
                '}';
    }
}
