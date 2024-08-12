import java.util.Scanner;
public class Test
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        //Nếu người dùng nhập 0, chương trình sẽ ném ra ngoại lệ ArithmeticException vì phép chia cho 0 không hợp lệ.
        //Nếu người dùng nhập một chuỗi không thể chuyển đổi thành số nguyên (ví dụ: "abc"), sẽ ném ra ngoại lệ NumberFormatException.
        try
        {
            int n = Integer.parseInt(scn.nextLine());

            if (99%n == 0)
                System.out.println( n + " is a factor of 99");
        }
//        catch (ArithmeticException ex)
//                //Khi bạn nhập 0, phép toán 99 % 0 sẽ gây ra ngoại lệ ArithmeticException vì không thể thực hiện phép chia cho 0.
//        {
//            System.out.println("Arithmetic " + ex);
//        }
//        catch (NumberFormatException ex)
//        //Khi bạn nhập "GeeksforGeeks", chuỗi này không thể chuyển đổi thành một số nguyên bằng phương thức Integer.parseInt(), do đó sẽ ném ra ngoại lệ NumberFormatException.
//
//        {
//            System.out.println("Number Format Exception " + ex);
//        }
        catch (NumberFormatException | ArithmeticException ex)
        {
            System.out.println("Exception encountered " + ex);
        }

    }
}
