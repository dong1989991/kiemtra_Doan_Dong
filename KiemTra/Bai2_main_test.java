package KiemTra;

import java.util.Scanner;

public class Bai2_main_test {
    public static void main(String[] args) {
        Bai2_nhanVien kt1 = new Bai2_ky_thuat("DT01","Doan Van dong", "19/08/1999","HN", "CNTT");
        System.out.println(kt1);
        System.out.println(kt1.moTaCongViec());

        // Input
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập mã: ");
        String maNhanVien = in.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = in.nextLine();
        System.out.print("Nhập năm sinh: ");
        String namSinh = in.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = in.nextLine();
        System.out.print("Nhập chuyên nghành: ");
        String chuyenNghanh = in.nextLine();
        System.out.println("hom nayh la ngya dep troi");

        Bai2_nhanVien kt2 = new Bai2_ky_thuat(maNhanVien,hoTen, namSinh, diaChi, chuyenNghanh);
        System.out.println(kt2);
        System.out.println(kt2.moTaCongViec());


}

}
