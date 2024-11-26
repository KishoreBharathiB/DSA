public class _17_MoveHyphenToBeginning {
    public static void main(String[] args) {
        String originalString = "face-prep-dfdsfg";
        String transformedString = moveHyphenToBeginning(originalString);
        System.out.println(transformedString);
    }

    public static String moveHyphenToBeginning(String string) {
        if (string.contains("-")) {
            int hyphenIndex = string.indexOf("-");
            return "-" + string.substring(0, hyphenIndex) + string.substring(hyphenIndex + 1);
        } else {
            return string;
        }
    }
}
