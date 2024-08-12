public class TernaryOperator {
    public static void main(String[] args) {

        try {
            String str = "HuyenTrang";
            String message = (str == null) ? "" : str.substring(0, 5);
            System.out.println(message);

        } catch (IndexOutOfBoundsException e) {
            // Xử lý trường hợp chuỗi ngắn hoac dai hon so ký tự
            System.out.println("Loi: " + e.getMessage());
        } catch (Exception e) {
            // Xử lý các ngoại lệ khác (nếu cần)
            System.out.println("Loi: "+ e.getMessage());
        }


    }

}
