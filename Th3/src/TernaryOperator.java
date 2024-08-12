public class TernaryOperator {
    public static void main(String[] args) {
        String str ="HuyenTrang";
        String result = (str == null) ? "" : str.substring(0, 5);
//        String result;

        try {
            // Nếu str không phải là null, lấy chuỗi con; nếu null, gán giá trị mặc định
            if (str == null) {
                result = "Null";
            } else {
                result = str.substring(0,5);
            }
        } catch (IndexOutOfBoundsException e) {
            // Xử lý trường hợp chuỗi ngắn hơn 5 ký tự
            result = "Default";
        } catch (Exception e) {
            // Xử lý các ngoại lệ khác (nếu cần)
            result = "Default";
        }

        System.out.println("Result " + result);
    }
}
