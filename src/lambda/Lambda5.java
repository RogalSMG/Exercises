package lambda;

public class Lambda5 {
    interface ArgumentI {
        String function(String str);
    }

    // static function with
    static String someFunc(ArgumentI arg, String str) {
        return arg.function(str);
    }

    public static void main(String[] args) {
        

        // providing lambda as an argument to someFunc function
        String after = someFunc((str) -> {
            char[] chars = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    chars[i]++;
                }
            }
            return String.valueOf(chars);
        }, "Ala has a cat!");

        System.out.println(after);

    }
}