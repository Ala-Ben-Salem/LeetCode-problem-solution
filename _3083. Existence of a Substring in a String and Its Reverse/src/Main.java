public class Main {
    public boolean isSubstringPresent(String s) {

        StringBuilder motInverse = new StringBuilder(s).reverse();
        for(int i=0;i<motInverse.length()-1;i++){
            if(s.contains(motInverse.substring(i,i+2)))
                return true;
        }
        return false;
    }
}