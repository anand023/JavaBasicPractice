package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        String str = "AhikbSSkksS";
        System.out.printf(removeUpperCase(str));
    }
    private static String removeUpperCase(String str){
        String upperCaseRegX = "[A-Z]";
        Pattern pattern = Pattern.compile(upperCaseRegX);
        Matcher matcher = pattern.matcher(str);

        return matcher.replaceAll("");
    }
}
