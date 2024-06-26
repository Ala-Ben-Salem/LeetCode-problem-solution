public class Main {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0]; // Prendre le premier mot comme préfixe initial
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Réduire le préfixe jusqu'à ce qu'il corresponde
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}