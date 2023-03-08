package KiemTra;

public class Bai2_ky_thuat extends Bai2_nhanVien{
    private String chuyenNganh;

    public Bai2_ky_thuat() {
    }

    public Bai2_ky_thuat(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public Bai2_ky_thuat(String maNV, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNV, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String moTaCongViec() {
        return "lam cai gi minh thich";
    }
}
