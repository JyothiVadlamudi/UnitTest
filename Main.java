

public class Main {
    public static void main(String[] args) {
        String str="GoodMorning";
        toUpperCase(str);
        System.out.println(tc1ForNull());
        System.out.println(tc7ForJumbledCharacters());
        System.out.println(tc3ForMixedRegex_WithPrefixSpace());
        System.out.println(tc4Positive());
        System.out.println(tc5lower());
        System.out.println(tc6ForMixedRegex());
        System.out.println(tc2Forpositive());
        System.out.println(tc8ForNumbersAndCharacters() );
    }
    public static String toUpperCase(String str) {
        String s = "";
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            if (Character.isLowerCase(arr[i]) && Character.isAlphabetic(arr[i])) {
                arr[i] = (char) (arr[i] - 32);
            }
            s += arr[i];
        }
        return s;
    }
    public static boolean tc1ForNull() {
        String input = null;
        String expected = null;
        String result = toUpperCase(input);
        return result.equals(expected);
    }
    public static boolean tc2Forpositive() {
        String input = "a";
        String expected = "A";
        String result = toUpperCase(input);
        return result.equals(expected);
    }

    public static boolean tc3ForMixedRegex_WithPrefixSpace() {
        String input = "       Ge@&m^Uid";
        String expected = "       GE@&M^UID";
        String result = toUpperCase(input);
        return result.equals(expected);
    }
    public static boolean tc4Positive() {
        String input = "JYOTHI";
        String expected = "JYOTHI";
        String result = toUpperCase(input);
        return result.equals(expected);
    }
    public static boolean tc5lower() {
        String input = "lower";
        String expected = "LOWER";
        String result = toUpperCase(input);
        return result.equals(expected);
    }
    public static boolean tc6ForMixedRegex() {
        String input = "Jy@#o&*i";
        String expected = "JY@#O&*I";
        String result = toUpperCase(input);
        return result.equals(expected);
    }
    public static boolean tc7ForJumbledCharacters() {
        String input = "JyoThI";
        String expected = "JYOTHI";
        String result = toUpperCase(input);
        return result.equals(expected);
    }
    public static boolean tc8ForNumbersAndCharacters() {
        String input = "1122abCD";
        String expected = "1122ABCD";
        String result = toUpperCase(input);
        return result.equals(expected);
    }

}

