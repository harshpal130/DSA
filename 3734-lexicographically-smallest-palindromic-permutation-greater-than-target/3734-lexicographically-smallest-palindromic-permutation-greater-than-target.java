class Solution {

    public String lexPalindromicPermutation(String s, String target) {

        int n = s.length();
        int halfLen = n / 2;

        // ---------------------------------------
        // 1. Count characters
        // ---------------------------------------
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // ---------------------------------------
        // 2. Check if palindrome is possible
        // ---------------------------------------
        int odd = 0;
        char middle = '\0';

        for (int i = 0; i < 26; i++) {

            if (freq[i] % 2 == 1) {
                odd++;
                middle = (char) ('a' + i);
            }
        }

        if (odd > 1) {
            return "";
        }

        // ---------------------------------------
        // 3. Frequency for first half
        // ---------------------------------------
        int[] halfFreq = new int[26];

        for (int i = 0; i < 26; i++) {
            halfFreq[i] = freq[i] / 2;
        }

        // ---------------------------------------
        // 4. Target's first half
        // ---------------------------------------
        String targetHalf = target.substring(0, halfLen);

        char[] half = new char[halfLen];

        // ---------------------------------------
        // 5. Try to match target half
        // ---------------------------------------
        for (int i = 0; i < halfLen; i++) {

            int idx = targetHalf.charAt(i) - 'a';

            // We cannot match target[i].
            if (halfFreq[idx] == 0) {

                // IMPORTANT:
                // Try to make THIS position bigger first.
                return findGreater(
                        half,
                        i,
                        halfFreq,
                        middle,
                        target
                );
            }

            // Use target character
            half[i] = targetHalf.charAt(i);
            halfFreq[idx]--;
        }

        // ---------------------------------------
        // 6. We matched target half exactly
        // ---------------------------------------
        String candidate = buildPalindrome(half, middle);

        // It is already greater than target.
        if (candidate.compareTo(target) > 0) {
            return candidate;
        }

        // Candidate == target.
        // Find next greater palindrome.
        return findGreater(
                half,
                halfLen - 1,
                halfFreq,
                middle,
                target
        );
    }


    private String findGreater(
            char[] half,
            int pos,
            int[] halfFreq,
            char middle,
            String target) {

        String targetHalf = target.substring(0, half.length);

        // ---------------------------------------
        // Go from RIGHT to LEFT
        // ---------------------------------------
        while (pos >= 0) {

            /*
             * IMPORTANT:
             *
             * If pos == half.length or half[pos] already
             * contains a character, put that character back.
             *
             * But when we reached this method because matching
             * failed at position i, half[i] has NOT been filled.
             */
            if (pos < half.length && half[pos] != '\0') {

                int old = half[pos] - 'a';
                halfFreq[old]++;
            }

            int targetChar =
                    targetHalf.charAt(pos) - 'a';

            // ---------------------------------------
            // Try smallest character > target[pos]
            // ---------------------------------------
            for (int c = targetChar + 1; c < 26; c++) {

                if (halfFreq[c] == 0) {
                    continue;
                }

                // Choose character
                half[pos] = (char) ('a' + c);
                halfFreq[c]--;

                // ---------------------------------------
                // Fill remaining positions with the
                // smallest available characters
                // ---------------------------------------
                int index = pos + 1;

                for (int x = 0; x < 26; x++) {

                    while (halfFreq[x] > 0) {

                        half[index] =
                                (char) ('a' + x);

                        index++;
                        halfFreq[x]--;
                    }
                }

                // Build palindrome
                return buildPalindrome(
                        half,
                        middle
                );
            }

            // Couldn't make this position bigger.
            // Go left.
            pos--;
        }

        return "";
    }


    private String buildPalindrome(
            char[] half,
            char middle) {

        StringBuilder sb = new StringBuilder();

        // First half
        for (char ch : half) {
            sb.append(ch);
        }

        // Middle character
        if (middle != '\0') {
            sb.append(middle);
        }

        // Reverse first half
        for (int i = half.length - 1; i >= 0; i--) {
            sb.append(half[i]);
        }

        return sb.toString();
    }
}