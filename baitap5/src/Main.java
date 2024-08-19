public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng SinhVien
        SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", 8.0, 7.5, 9.0);
        SinhVien sv2 = new SinhVien("SV002", "Tran Thi B", 6.5, 8.0, 7.0);

        // Lưu thông tin vào file
        boolean result1 = FileSinhVien.saveSinhVienToFile(sv1, "sinhvien.txt");
        boolean result2 = FileSinhVien.saveSinhVienToFile(sv2, "sinhvien.txt");

        System.out.println("Lưu sinh viên thành công: " + result1 + " và " + result2);

        // Đọc thông tin từ file
        SinhVien[] sinhViens = FileSinhVien.readSinhVienFromFile("sinhvien.txt");

        if (sinhViens != null) {
            for (SinhVien sv : sinhViens) {
                System.out.println(sv);
            }
        } else {
            System.out.println("Không có thông tin sinh viên trong file.");
        }
    }
}
