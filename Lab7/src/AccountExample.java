import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
//    ACCOUNT_REGEX:
//^: Bắt đầu chuỗi.
//[_a-z0-9]: Cho phép các ký tự:
//Dấu gạch dưới (_).
//Các ký tự chữ thường từ a đến z.
//Các ký tự số từ 0 đến 9.
//{6,}: Ít nhất 6 ký tự.
//$: Kết thúc chuỗi.

    public AccountExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public class AccountExampleTest {
        private static AccountExample accountExample;

        public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
        public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

        public static void main(String args[]) {
            accountExample = new AccountExample();
            for (String account : validAccount) {
                boolean isValid = accountExample.validate(account);
                System.out.println("Account is " + account + " is valid: " + isValid);
            }
            for (String account : invalidAccount) {
                boolean isValid = accountExample.validate(account);
                System.out.println("Account is " + account + " is valid: " + isValid);
            }
        }
    }

}
