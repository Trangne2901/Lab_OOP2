package Case_OOP2.b1;

public class main {
    public static void main(String[] args) {
//1.3.1 Tạo đối tượng hình chữ nhật từ phương thức khởi tạo của lớp Rectangle

        Rectangle rectangle1 = new Rectangle( "Rectangle"," blue", 2.0,5.0);

//1.3.2 Tạo đối tượng hình chữ nhật từ lớp cha Shape

        Shape rectangle2 = new Rectangle( "Rectangle","red", 4.0,7.0);

//1.3.3 Hiển thị thông tin hình chữ nhật từ 2 đối tượng đã tạo trên qua phương thức toString()
        System.out.println( rectangle1.toString() + ", Dien tich = " + rectangle1.calArea());
        System.out.println(rectangle2.toString() + ", Dien tich = " + rectangle2.calArea());

//        Tinh dien tich
//        System.out.println( "Dien tich hinh 1 : " + rectangle1.calArea()  );
//        System.out.println("Dien tich hinh 2: " + rectangle2.calArea());
    }
}
