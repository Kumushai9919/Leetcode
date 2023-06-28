# 242. Valid Anagram


Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

#### Example 1:
````
Input: s = "anagram", t = "nagaram"
Output: true
````
#### Example 2:
````
Input: s = "rat", t = "car"
Output: false
````

#### Constraints:
````
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
````
#### Solution with explanation in Java:
We can use several ways to solve this problem, we could use sorting but the time complexity will be unefficient but simple solution. One of the ways in order to efficient the solution is using HashMap, it will take exptra space like O(n) proportional to the number of unique characters in the string, but time complexity would be O(n) or O(s+t) that is the iteration we do once through both strings s and t and it is better than sorting.

1. at the beginning we can simply check the length of two strings, if it's not equal return false, because it is not the anagram
2. create HasMap with string s and t
3. iterate the string s, write following code ````smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);````

- ````s.charAt(i)```` retrieves the character at index i from the string s.
- ````smap.getOrDefault(s.charAt(i), 0)```` retrieves the current count/frequency of the character in the HashMap smap. If the character is not present as a - key in the map, it returns the default value 0.
- ````smap.put(...)```` assigns the updated count by incrementing it by 1 and associates it with the character in the HashMap smap.
- Similar to the previous line, this line performs the same steps for the string t and the HashMap tmap.
  
4. You should check if smap is equal to tmap using the equals() method, which compares the key-value pairs of the HashMaps. If they are equal, it means s and t have the same characters with the same frequencies, indicating that they are anagrams.

````
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }
 
         
        return smap.equals(tmap);
 
        
        
    }
}

````
