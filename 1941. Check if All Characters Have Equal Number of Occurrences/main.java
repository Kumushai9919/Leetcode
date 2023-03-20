class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            Character ch=(Character)s.charAt(i);
            if(map.containsKey(ch))
                map.replace(ch,map.get(ch),map.get(ch)+1);
            else
                map.put(ch,1);
        }
        int k=map.get((Character)s.charAt(0));
        for(int m : map.values())
        {
            if(m !=k)
                return false;
        }
            
        return true;
    }
}
