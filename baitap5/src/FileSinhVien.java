import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileSinhVien {

    // Phương thức lưu thông tin sinh viên vào file
    public static boolean saveSinhVienToFile(SinhVien sinhVien, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(sinhVien.toString());
            bufferedWriter.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức đọc thông tin sinh viên từ file
    public static SinhVien[] readSinhVienFromFile(String fileName) {
        List<SinhVien> sinhVienList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    SinhVien sinhVien = new SinhVien(data[0], data[1],
                            Double.parseDouble(data[2]), Double.parseDouble(data[3]),
                            Double.parseDouble(data[4]));
                    sinhVienList.add(sinhVien);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return sinhVienList.isEmpty() ? null : sinhVienList.toArray(new SinhVien[0]);
    }
}
