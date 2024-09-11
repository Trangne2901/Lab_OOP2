package Case_OOP2.DeSo3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
        try (FileWriter fileWriter = new FileWriter(filename, true)) {
            fileWriter.write(objStudent.toString() + "\n");
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    //+ Phương thức trả về đối tượng sinh viên của file
    public Student getStudentFromFile(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line = bufferedReader.readLine();
            if (line != null) {
                String[] data = line.split(",");
                String markAvgString = data[3].split(": ")[1];
                return new Student(data[0].split(": ")[1], data[1].split(": ")[1], data[2].split(": ")[1], Double.parseDouble(markAvgString));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    //+ Phương thức lưu danh sách sinh viên vào file
    public boolean addStudentListToFile(Student[] listStudent, String filename) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            for (Student student : listStudent) {
                if (student != null) {
                    fileWriter.write(student.toString()+"\n");
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    //+ Phương thức trả về danh sách sinh viên trong file
    public Student[] getAllStudentFromFile(String filename) {
        Student[] students = new Student[100];
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] data = line.split(",");
                String markAvgString = data[3].split(": ")[1];
                students[count++] = new Student(data[0].split(": ")[1], data[1].split(": ")[1], data[2].split(": ")[1], Double.parseDouble(markAvgString));
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
