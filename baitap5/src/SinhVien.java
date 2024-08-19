public class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    // Constructor
    public SinhVien(String maSinhVien, String tenSinhVien, double diemToan, double diemLy, double diemHoa) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    // Getters and Setters
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    public String toString() {
        return maSinhVien + "," + tenSinhVien + "," + diemToan + "," + diemLy + "," + diemHoa;
    }
}
