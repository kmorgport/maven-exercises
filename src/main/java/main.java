import org.apache.commons.lang3.StringUtils;

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

    }
}
