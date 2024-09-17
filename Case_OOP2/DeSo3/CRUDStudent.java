package Case_OOP2.DeSo3;

import java.io.*;

public class CRUDStudent {
    //+ Mảng đối tượng Student: Lưu danh sách sinh viên
    private Student[] students;
    //+ Thuộc tính static numberOfStudent: Lưu số sinh viên hiện tại có trong danh sách
    public static int numberOfStudent;

    //+ Phương thức khởi tạo CRUDStudent() không tham số
    public CRUDStudent() {
        this.students = new Student[100]; // Mảng chứa tối đa 100 sinh viên
        numberOfStudent = 0;
    }

    // + Phương thức thêm 1 sinh viên vào danh sách
    public boolean addStudent(Student objStudent) {
        if (numberOfStudent < students.length) {
            students[numberOfStudent++] = objStudent;
            return true;
        }
        return false;
    }

    //+ Phương thức lưu một sinh viên vào file
    public boolean addStudentToFile(Student objStudent, String filename) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            objectOutputStream.writeObject(objStudent);
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    //+ Phương thức trả về đối tượng sinh viên của file
    public Student getStudentFromFile(String filename) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
          Student objStudent = (Student) objectInputStream.readObject();
          return  objStudent;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    //+ Phương thức lưu danh sách sinh viên vào file
    public boolean addStudentListToFile(Student[] listStudent, String filename) throws FileNotFoundException {
        try ( ObjectOutputStream objectOutputStreamList = new ObjectOutputStream(new FileOutputStream(filename))) {
        objectOutputStreamList.writeObject(listStudent);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    //+ Phương thức trả về danh sách sinh viên trong file
    public Student[] getAllStudentFromFile(String filename) {
        try(ObjectInputStream objectInputStreamList = new ObjectInputStream(new FileInputStream(filename))) {
            Student [] objStudents = (Student[]) objectInputStreamList.readObject();
            return objStudents;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
