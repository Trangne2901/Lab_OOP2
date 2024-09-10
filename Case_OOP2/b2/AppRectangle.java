package Case_OOP2.b2;

import Case_OOP2.b1.Rectangle;

public class AppRectangle {
    public static void main(String[] args) {
        // Tạo một đối tượng CRUDRectangle
        CRUDRectangle crud = new CRUDRectangle();

        // Tạo 3 đối tượng hình chữ nhật
        Rectangle rect1 = new Rectangle("Rectangle", "Red", 4.0, 5.0);
        Rectangle rect2 = new Rectangle("Rectangle", "Blue", 6.0, 7.0);
        Rectangle rect3 = new Rectangle("Rectangle", "Green", 8.0, 9.0);

        // Lưu từng đối tượng vào mảng danh sách hình chữ nhật sử dụng phương thức addRectangle()
        crud.addRectangle(rect1);
        crud.addRectangle(rect2);
        crud.addRectangle(rect3);

        // Lưu từng đối tượng hình chữ nhật vào file sử dụng phương thức addRectangleToFile()
        String filename = "rectangles.txt";
        crud.addRectangleToFile(rect1, filename);
        crud.addRectangleToFile(rect2, filename);
        crud.addRectangleToFile(rect3, filename);

        // Hiển thị thông tin của hình chữ nhật từ file sử dụng phương thức getRectangleFromFile()
        Rectangle rectFromFile = crud.getRectangleFromFile(filename);
        if (rectFromFile != null) {
            System.out.println("Hình chữ nhật đầu tiên từ file: " + rectFromFile);
        }

        // Lưu mảng đối tượng hình chữ nhật vào file sử dụng phương thức addRectangleListToFile()
        Rectangle[] rectangleList = {rect1, rect2, rect3};
        crud.addRectangleListToFile(rectangleList, filename);

        // Hiển thị tất cả thông tin hình chữ nhật trong mảng đối tượng hình chữ nhật trong file
        Rectangle[] allRectangles = crud.getAllRectangleFromFile(filename);
        System.out.println("Tất cả hình chữ nhật từ file:");
        for (Rectangle rect : allRectangles) {
            System.out.println(rect);
        }
    }
}

