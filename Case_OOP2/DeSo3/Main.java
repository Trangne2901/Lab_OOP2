package Case_OOP2.DeSo3;

public class Main {
    public static void main(String[] args) {
// 1.3.1 Tạo đối tượng sinh viên từ phương thức khởi tạo của lớp Student
        Student student1 = new Student("D101","HuyenTrang","29/01/2005",8.2);

// 1.3.2 Tạo đối tượng sinh viên từ lớp cha Person
        Person student2 = new Student("D102","VanDan","19/10/2005",8.5);

// 1.3.3 Hiển thị thông tin sinh viên từ 2 đối tượng đã tạo trên qua phương thức toString()
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
