package Case_OOP2.DeSo3;
import Case_OOP2.DeSo3.Student;
public class AppStudent {
    public static void main(String[] args) {
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
        String filename = "Student.txt";
        crud.addStudentToFile(student1,filename);
        crud.addStudentToFile(student2,filename);
        crud.addStudentToFile(student3,filename);
// Hiển thị tất cả thông tin của file
        System.out.println("Thong tin sinh vien tu file: "+crud.getStudentFromFile(filename).toString());

        crud.addStudentListToFile(crud.getAllStudentFromFile(filename),filename);
        System.out.println("Danh sach sinh vien: ");
        Student [] allStudents = crud.getAllStudentFromFile(filename);
        for ( Student student : allStudents){
            if (student != null){
                System.out.println(student.toString());
            }
        }
    }
}
