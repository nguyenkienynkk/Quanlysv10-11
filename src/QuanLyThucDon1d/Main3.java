package QuanLyThucDon1d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
        public static void main(String[] args) {
            menu();
        }

        public static Scanner scanner = new Scanner(System.in);

        public static void menu() {
            boolean check = true;
            List<DonHang> danhSachDonHang =new ArrayList<>();
            while (check) {
                System.out.println("________Quản Lý Dơn Hàng Trong 1 Ngày_________");
                System.out.println("1.Thêm đơn hàng");
                System.out.println("2.Hiển thị đơn hàng trong 1 ngày");
                System.out.println("3.Tìm kiếm đơn hàng theo tên hàng và ngày mua hàng");
                System.out.println("4.Tìm kiếm tất cả đơn hàng thuộc cửa hàng");
                System.out.println("5.Sắp xếo đơn hàng trong 1 tháng theo thứ tự giảm dần");
                System.out.println("6.Exit");
                int so = Integer.parseInt(scanner.nextLine());
                switch (so){
                    case 1:
                        themDonHang(danhSachDonHang);
                        break;
                    case 2:
                        hienThiDonHang(danhSachDonHang) ;
                        break;
                    case 3:
                        timKiemTheoTenVaNgayMua(danhSachDonHang);
                        break;
                    case 4:
                        timKiemDonHangThuocCuaHang(danhSachDonHang);
                        break;
                    case 5:
                     sXDonHangTrong1ThangTuThapDenCao(danhSachDonHang);
                        break;
                    case 6:
                        check = false;
                        System.out.println("Exit");
                        break;



                }

            }
        }

    private static void themDonHang(List<DonHang> danhSachDonHang) {

        System.out.println("Mời bạn nhập vào số lượng hàng:");
        int sx = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sx; i++) {
            System.out.println("Mời bạn nhập tên hàng  thứ:" +(i+1));
            String tennn = scanner.nextLine();
            System.out.println("Mời bạn nhập số tiền mua của đơn hàng thứ "+(i+1));
            double sotien = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập ngày mua của đơn hàng thứ:"+(i+1));
            int ngaymua = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập tên của hàng đã mua của đơn hàng thứ :"+(i+1));
            String tencuahang = scanner.nextLine();
            danhSachDonHang.add(new DonHang(tennn,sotien,ngaymua,tencuahang));
        }

    }
    private static void hienThiDonHang(List<DonHang> danhSachDonHang) {
        for (int i = 0; i < danhSachDonHang.size(); i++) {
            System.out.println(danhSachDonHang.get(i).toString());
        }
    }

    private static void timKiemTheoTenVaNgayMua(List<DonHang> danhSachDonHang) {
        System.out.println("Nhập tên món hàng đó:");
        String search1 = scanner.nextLine();
        System.out.println("Nhập ngày bạn đã mua hàng:");
        int search =Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < danhSachDonHang.size(); i++) {
                if (danhSachDonHang.get(i).getTenHang().equals(search1) ){
                    System.out.println(danhSachDonHang.get(i).toString());
                }
            }
        for (int i = 0; i < danhSachDonHang.size(); i++) {
            if (danhSachDonHang.get(i).getNgayMua()==(search) ){
                System.out.println(danhSachDonHang.get(i).toString());
            }
        }

    }
    private static void timKiemDonHangThuocCuaHang(List<DonHang> danhSachDonHang) {
        System.out.println("Nhập tên đơn hàng:");
        String seach3 = scanner.nextLine();
        System.out.println("Đơn hàng này thuộc cửa hàng:");
        for (int i = 0; i < danhSachDonHang.size(); i++) {
            if (danhSachDonHang.get(i).getTenHang().equals(seach3) ){
                System.out.println(danhSachDonHang.get(i).getTenCuaHang());
            }
        }

    }
    private static void sXDonHangTrong1ThangTuThapDenCao (List<DonHang> danhSachDonHang) {
    }
}
