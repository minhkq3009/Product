import java.sql.SQLOutput;

public class Product {
    private String maSP;
    private String tenSP;
    private double giaTien;
    private int soLuong;
    private String donVi;

    public Product(String maSP, String tenSP, double giaTien, int soLuong, String donVi) {
        this.maSP=maSP;
        this.tenSP=tenSP;
        this.giaTien=giaTien;
        this.soLuong=soLuong;
        this.donVi=donVi;
    }

    public void tangSoLuong(int soLuongThem) {
        soLuong += soLuongThem;
    }

    public void giamSoLuong(int soLuongGiam) {
        if (soLuongGiam <= this.soLuong) {
            soLuong -= soLuongGiam;
        } else {
            System.out.println("Không đủ số lượng để giảm.");
        }
    }

    public void thayDoiGiaTien(double giaMoi) {
        giaTien = giaMoi;
    }

    public void kiemTraHang() {
        if (soLuong > 0) {
            System.out.println("Sản phẩm còn hàng.");
        } else {
            System.out.println("Sản phẩm hết hàng.");
        }
    }

    public void inThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá tiền: " + giaTien);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn vị: " + donVi);
    }

    public static void main(String[] args) {

        Product product1 = new Product("SP001", "Điện thoại", 500.0, 10, "cái");
        Product product2 = new Product("SP002", "Laptop", 1200.0, 5, "chiếc");
        Product product3 = new Product("SP003", "Tai nghe", 50.0, 20, "cặp");

        System.out.println("Thông tin sản phẩm 1:");
        product1.inThongTin();
        System.out.println();

        System.out.println("Thông tin sản phẩm 2:");
        product2.inThongTin();
        System.out.println();

        System.out.println("Thông tin sản phẩm 3:");
        product3.inThongTin();
        System.out.println();
    }
}
