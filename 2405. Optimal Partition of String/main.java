class Solution {
    public int partitionString(String s) {
        int idx = 0;
        int count = 0;
        Map<Character, Boolean> mp = new HashMap<>(); // use a HashMap instead of an unordered_map
        while (idx < s.length()) {
            if (mp.containsKey(s.charAt(idx))) { // if current character has already appeared in current substring
                count++; // increment count
                mp.clear(); // clear HashMap to start a new substring
            }
            mp.put(s.charAt(idx), true); // mark current character as seen
            idx++; // move to next character
        }
        return count + 1; // return number of substrings (add 1 because we need to count the last substring as well)
    }
}

// Time complexity:
//The time complexity of this algorithm is O(n)O(n)O(n), where n is the length
//of the input string. We iterate through the string once to create the substrings.
