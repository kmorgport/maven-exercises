import org.apache.commons.lang3.StringUtils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String test = scanner.nextLine();
        if(StringUtils.isNumeric(test)){
            System.out.println(test + " is a number.");
        }else{
            System.out.println(test + " is not a number.");
        }
        System.out.println(StringUtils.swapCase(test));
        System.out.println(StringUtils.reverse(test));

//        DriverManager.registerDriver(new Driver());
//        Connection connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
//                "test",
//                "test"
//        );

    }
}
