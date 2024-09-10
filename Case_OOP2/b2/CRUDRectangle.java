package Case_OOP2.b2;

import Case_OOP2.b1.Rectangle;

import java.io.*;
import java.util.ArrayList;

public class CRUDRectangle {
    //    Mang lu danh sach hinh chu nhat
    private Rectangle[] rectangles;

    //    Lưu số hình chữ nhật hiện tại có trong danh sách
    public static int numberOfRectangle;

    //Phương thức khởi tạo CRUDRectangle() không tham số
    public CRUDRectangle() {
        this.rectangles = new Rectangle[100];
        numberOfRectangle = 0;
    }

    //Phương thức thêm 1 vào danh sách
    public boolean addRectangle(Rectangle objRectangle) {
        if (numberOfRectangle < rectangles.length) {
            rectangles[numberOfRectangle++] = objRectangle;
            return true;
        }
        return false;
    }

    //Phương thức lưu một hình chữ nhật vào file
    public boolean addRectangleToFile(Rectangle objRectangle, String filename) {
        try (FileWriter fileWriter = new FileWriter(filename, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(objRectangle.toString());
            bufferedWriter.newLine();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;

        }
    }

    // Phương thức trả về đối tượng hình chữ nhật từ file
    public Rectangle getRectangleFromFile(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Giả sử mỗi dòng chứa thông tin hình chữ nhật dưới dạng: Shape: Rectangle, Color: Red, Width: 10.0, Height: 5.0
                String[] parts = line.split(", ");
                String shapeName = parts[0].split(": ")[1];
                String color = parts[1].split(": ")[1];
                double width = Double.parseDouble(parts[2].split(": ")[1]);
                double height = Double.parseDouble(parts[3].split(": ")[1]);

                return new Rectangle(shapeName, color, height, width);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // Nếu không tìm thấy hoặc xảy ra lỗi
    }


    //Phương thức lưu danh sách hình chữ nhật vào file
    public boolean addRectangleListToFile(Rectangle[] listRectangle, String filename) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename))) {
            for (Rectangle rect : listRectangle) {
                if (rect != null) {
                    bufferedWriter.write(rect.toString());
                    bufferedWriter.newLine();
                }
            }
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    //Phương thức trả về danh sách hình chữ nhật trong file
    public Rectangle[] getAllRectangleFromFile(String filename) {
        ArrayList<Rectangle> rectangleList = new ArrayList<>(); // Dùng ArrayList để lưu danh sách hình chữ nhật tạm thời

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Giả sử mỗi dòng chứa thông tin hình chữ nhật dưới dạng: Shape: Rectangle, Color: Red, Width: 10.0, Height: 5.0
                String[] parts = line.split(", ");
                String shapeName = parts[0].split(": ")[1];
                String color = parts[1].split(": ")[1];
                double width = Double.parseDouble(parts[2].split(": ")[1]);
                double height = Double.parseDouble(parts[3].split(": ")[1]);

                // Tạo đối tượng hình chữ nhật từ các thông tin đọc được và thêm vào danh sách
                Rectangle rectangle = new Rectangle(shapeName, color, height, width);
                rectangleList.add(rectangle);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Chuyển ArrayList thành mảng Rectangle[]
        return rectangleList.toArray(new Rectangle[0]);
    }

}
