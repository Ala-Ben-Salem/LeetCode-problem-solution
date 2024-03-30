public class Main {
    public boolean isPalindrome(int x) {
        String xstr = String.valueOf(x);
        String reversed = "";

        for (int i = xstr.length() - 1; i >= 0; i--) {
            reversed += xstr.charAt(i);
        }
        return xstr.equals(reversed);
    }
}