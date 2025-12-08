import java.util.*;

public class StringToInteger {

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0;
        long num = 0;

        if (s.charAt(i) == '-') { sign = -1; i++; }
        else if (s.charAt(i) == '+') i++;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // Early clamp to avoid long overflow
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(num * sign);
    }

    public static void main(String[] args) {

        // Test cases (you can add more)
        System.out.println(myAtoi("42"));                 // 42
        System.out.println(myAtoi("   -42"));             // -42
        System.out.println(myAtoi("4193 with words"));    // 4193
        System.out.println(myAtoi("words and 987"));      // 0
        System.out.println(myAtoi("-91283472332"));       // -2147483648
        System.out.println(myAtoi("9223372036854775808")); // 2147483647
    }
}
