package myProjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerString {

    /*метод для валидации строки*/
    public static String testString(String stringForTest) {

        Pattern p1 = Pattern.compile("^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$");
        Pattern p2 = Pattern.compile("^[+][3][7][5](29|25|33|44)[\\d]{7}$");
        Pattern p3 = Pattern.compile("^([A-Я][а-я]+)$");

        Matcher m = p1.matcher(stringForTest);
        if (m.matches()) return "e-mail";

        m = p2.matcher(stringForTest);
        if (m.matches()) return "phone";

        m = p3.matcher(stringForTest);
        if (m.matches()) return "name";

        return "не знаю";
    }
}

