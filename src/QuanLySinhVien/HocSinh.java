package QuanLySinhVien;

public class HocSinh {


        private String tenSV ;
        private int tuoi ;
        private int namSinh;
        private String trinhDoVanHoa ;
        private String gioiTinh ;

        public HocSinh(String tenSV, int tuoi, int namSinh, String trinhDoVanHoa, String gioiTinh) {
            this.tenSV = tenSV;
            this.tuoi = tuoi;
            this.namSinh = namSinh;
            this.trinhDoVanHoa = trinhDoVanHoa;
            this.gioiTinh = gioiTinh;
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

        public int getNamSinh() {
            return namSinh;
        }

        public void setNamSinh(int namSinh) {
            this.namSinh = namSinh;
        }

        public String getTrinhDoVanHoa() {
            return trinhDoVanHoa;
        }

        public void setTrinhDoVanHoa(String trinhDoVanHoa) {
            this.trinhDoVanHoa = trinhDoVanHoa;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        @Override
        public String toString() {
            return "HocSinh{" +
                    "tenSV='" + tenSV + '\'' +
                    ", tuoi=" + tuoi +
                    ", namSinh=" + namSinh +
                    ", trinhDoVanHoa='" + trinhDoVanHoa + '\'' +
                    ", gioiTinh='" + gioiTinh + '\'' +
                    '}';
        }

        public void inThongTinSinhVien(){
            System.out.println("Thông Tin Sinh Viên");
            System.out.println("Tên:"+tenSV + "Tuổi:"+ tuoi + "Năm Sinh : "+ namSinh + "Trình Độ Văn Hoá" + trinhDoVanHoa + "Giới Tính :" +gioiTinh);
        }

}
