package QuanLySinhVien;
import QuanLySinhVien.HocSinh;


import java.util.*;

public class Main {
    private static List<HocSinh[]> hocSinhs  = new ArrayList<HocSinh[]>();

    public static HocSinh[] listHocSinh;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        while (true) {
            System.out.println("--------Menu---------");
            System.out.println("1.Thêm Sinh Viên Cần Thêm");
            System.out.println("2.Hiển Thị Các Sinh Viên");
            System.out.println("3.Tìm Sinh Viên Theo Tên");
            System.out.println("Please Choose");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so) {
                case 1:
                    themSinhVien();
                    menu();
                    break;
                case 2:
                    hienThiSinhVien();
                    menu();
                    break;
                case 3:
                    timSinhVIen();
                    menu();
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng các số trên");
                    menu();
                    break;


            }

        }
    }

    public static void themSinhVien() {
        System.out.println("Mời bạn nhập số lượng sinh viên cần thêm: ");
        int so = Integer.parseInt(scanner.nextLine());
        listHocSinh = new HocSinh[so];
        for (int i = 0; i < so; i++) {
            System.out.println("Mời nhập thông tin  sinh viên thứ: " + (i + 1));
            System.out.println("Mời nhập vào tên sinh viên thứ: " + (i + 1));
            String ten = scanner.nextLine();
            System.out.println("Mời bạn nhập vào tuổi sinh viên thứ: " + (i + 1));
            int tuoi = scanner.nextInt();
            System.out.println("Mời bạn nhập vào trình độ văn hoá của sinh viên thứ:" + ( i + 1 ));
            String trinh = scanner.nextLine();
            String trinhdo = scanner.nextLine();
            System.out.println("Mời bạn nhập giới tính của sinh viên thứ:"+( i + 1 ));
            String sex = scanner.nextLine();
            System.out.println("Mời bạn nhập năm sinh của sinh viên thứ: " + (i + 1));
            int namsinh = Integer.parseInt(scanner.nextLine());
            HocSinh hocSinh = new HocSinh(ten,tuoi,namsinh,trinh,sex);
            hocSinhs.add(listHocSinh);
            listHocSinh[i]= hocSinh ;
        }
    }


    public static void hienThiSinhVien() {
        for (int i = 0; i < listHocSinh.length; i++) {
            listHocSinh[i].inThongTinSinhVien();

        }

    }

    public static void timSinhVIen() {
        System.out.println("Nhập tên sinh viên cần tìm: ");
        String search = scanner.nextLine();
        System.out.println("Sinh viên bạn yêu cầu là:");
        for (int i = 0; i < listHocSinh.length; i++) {
            if (listHocSinh[i].getTenSV().equals(search)) {
                listHocSinh[i].inThongTinSinhVien();
            }else{
                System.out.println("Không có sinh viên đã tìm ở lớp này");
            }

        }

    }
}

