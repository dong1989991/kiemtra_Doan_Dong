package KiemTra;

public class Bai3_main_test {
    public static void main(String[] args) {
        Bai3_Van_ban vb=new Bai3_Van_ban("doan van dong");
        System.out.println("So ky tu trong chuoi la:"+vb.wordCount());
        System.out.println("Viet hoa chuoi van ban:"+vb.toUpper());
        System.out.println("Chuyen hoa thanh thuong:"+vb.hoaThanhThuong());
        System.out.println("Viet hoa dau:"+vb.vietHoaDau());

    }
}
