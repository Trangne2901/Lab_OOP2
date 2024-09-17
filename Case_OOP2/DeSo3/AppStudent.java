package Case_OOP2.DeSo3;
import Case_OOP2.DeSo3.Student;

import java.io.FileNotFoundException;

public class AppStudent {
    public static void main(String[] args) throws FileNotFoundException {
        CRUDStudent crud = new CRUDStudent();
// Tạo 3 đối tượng sinh viên
        Student student1 = new Student("D101", "HuyenTrang", "29/01/2005", 8.1);
        Student student2 = new Student("D102", "VanDan", "19/10/2005", 8.5);
        Student student3 = new Student("D103", "QuocHuy", "11/05/2005", 8.3);
// Lưu từng đối tượng vào mảng danh sách sinh viên
        crud.addStudent(student1);
        crud.addStudent(student2);
        crud.addStudent(student3);
// Lưu từng đối tượng vào file

        crud.addStudentToFile(student1,"Student1.txt");
        crud.addStudentToFile(student2,"Student2.txt");
        crud.addStudentToFile(student3,"Student3.txt");
// Hiển thị tất cả thông tin của file
        System.out.println("Hien thi tat thong tin tu file: ");
        System.out.println(crud.getStudentFromFile("Student1.txt"));
        System.out.println(crud.getStudentFromFile("Student2.txt"));
        System.out.println(crud.getStudentFromFile("Student3.txt") + "\n");


        Student[] students = { student1,student2,student3};
        crud.addStudentListToFile(students,"test.txt");

        System.out.println("Danh sach sinh vien: ");
        Student [] allStudents = crud.getAllStudentFromFile("test.txt");
        for ( Student student : allStudents){
            if (student != null){
                System.out.println(student.toString());
            }
        }
    }
}
