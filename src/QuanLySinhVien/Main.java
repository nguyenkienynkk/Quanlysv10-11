package QuanLySinhVien;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        boolean check = true;
        List<HocSinh> danhSachSinhVien =new ArrayList<>();
        while (check) {
            System.out.println("________Quản Lý Sinh Viên_________");
            System.out.println("1.Thêm sinh viên");
            System.out.println("2.Tìm kiếm sinh viên");
            System.out.println("3.Liệt kê tất cả sinh viên có điểm trung bình lớn hơn 8");
            System.out.println("4.Sắp xếp sinh viên theo điểm trung bình từ cao đến thấp");
            System.out.println("5.Liêt kê tất cả sinh viên là nữ và dưới 20 tuổi");
            System.out.println("6.Exit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so){
                case 1:
                    themSinhVien(danhSachSinhVien);
                    break;
                case 2:
                    timKiemTheoTen(danhSachSinhVien);
                    break;
                case 3:
                    lietKeSVtblonhon8(danhSachSinhVien);
                    break;
                case 4:
                    sxSvtheodiemTB(danhSachSinhVien);
                    break;
                case 5:
                    lietKeSvTuoiduoi20(danhSachSinhVien);
                    break;
                case 6:
                    check = false;
                    System.out.println("Exit");
                    break;



            }

        }
    }

    private static void themSinhVien(List<HocSinh> danhSachSinhVienN) {


            System.out.println("Mời bạn nhập vào số lượng sinh viên:");
            int sllc = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < sllc; i++) {
                System.out.println("Mời bạn nhập tên sinh viên thứ:" +(i+1));
                String tenn = scanner.nextLine();
                System.out.println("Mời bạn nhập tuổi sinh viên thứ "+(i+1));
                int tuoi = Integer.parseInt(scanner.nextLine());
                System.out.println("Mời bạn nhập giới tính của sinh viên thứ:"+(i+1));
                int gioitinh = Integer.parseInt(scanner.nextLine());
                System.out.println("Mời bạn nhập điểm của sinh viên thứ :"+(i+1));
                double diemtbb = Double.parseDouble(scanner.nextLine());
                danhSachSinhVienN.add(new HocSinh(tenn,tuoi,gioitinh,diemtbb));
            }

    }

    private static void sxSvtheodiemTB(List<HocSinh> danhSachSinhVien) {
        int n, tempSort;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j >= 1; j--) {

                if (array[j] < array[j - 1]) {
                    tempSort = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tempSort;
                }
            }
        }

        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static void lietKeSvTuoiduoi20(List<HocSinh> danhSachSinhVien) {
        System.out.println("Danh sách sinh viên là nữ tuổi dưới 20 là:");
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if(danhSachSinhVien.get(i).getTuoi()<20 && danhSachSinhVien.get(i).getSex()== 0) {
                System.out.println(danhSachSinhVien.get(i).toString());
            }
        }

    }

    private static void lietKeSVtblonhon8(List<HocSinh> danhSachSinhVien) {
        System.out.println("Sinh viên có điểm trung bình lớn hơn 8 là");
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
           if (danhSachSinhVien.get(i).getDiemTB()>8) {
               System.out.println(danhSachSinhVien.get(i).toString());
           }
            }

        }




    private static void timKiemTheoTen(List<HocSinh> danhSachSv) {


        System.out.println("Nhập tên sinh viên cần tìm:");
        String name1 = scanner.nextLine();
        System.out.println("Sinh viên bạn muốn tìm là:");
        for (int i = 0; i < danhSachSv.size(); i++) {
            if (danhSachSv.get(i).getTenSV().equals(name1)){
                System.out.println(danhSachSv.get(i).toString());
            }
        }

    }




}