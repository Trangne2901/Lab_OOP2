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
    public boolean addRectangleToFile(Rectangle objRectangle, String fileName) throws FileNotFoundException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(objRectangle);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }


    public Rectangle getRectangle(String fileName) throws IOException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Rectangle) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addRectangleListToFile(String fileName, Rectangle[] listRectangle) throws FileNotFoundException {
        try (ObjectOutputStream objectOutputStreamList = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStreamList.writeObject(listRectangle);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Rectangle[] getRectangleList(String fileName) throws FileNotFoundException {
        try(ObjectInputStream objectInputStreamList = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Rectangle[]) objectInputStreamList.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
