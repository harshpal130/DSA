class Solution {
    public int romanToInt(String s) {
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbols[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        int sum = 0;
        int j = 0; // Pointer to track our current position in string s
        
        for (int i = 0; i < symbols.length; i++) {
            // While the remaining string starts with the current symbol
            while (j < s.length() && s.startsWith(symbols[i], j)) {
                sum += values[i];
                j += symbols[i].length(); // Move pointer past the matched symbol
            }
        }
        
        return sum;
    }
}
