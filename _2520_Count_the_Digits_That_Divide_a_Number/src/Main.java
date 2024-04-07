public class Main {
    public int countDigits(int num) {
        String nombreString = String.valueOf(num);
        int c=0;
        for (int i = 0; i < nombreString.length(); i++) {
            char chiffreChar = nombreString.charAt(i);
            int chiffre = Character.getNumericValue(chiffreChar);
            if(num % chiffre ==0)
                c=c+1;
        }
        return c;
    }
}