class Solution {
    public int countValidWords(String sentence) {
        int cnt=0;

        // Splitting the sentences
        String[] str=sentence.split(" ");
        for(int y=0;y<str.length;y++){
            String e=str[y];
            int flag=0;

            // 1. Checking if numbers are in token 
            for(int i=0;i<e.length();i++)
                if(Character.isDigit(e.charAt(i))) { flag=1; break;}
            if(flag==1) continue;

            // 2. Checking all char are in LowerCase
            if(!e.equals(e.toLowerCase()))  continue;

            // For finding atmost 1 hypen and atmost 1 punctuation,count the character 
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<e.length();i++)
                map.put(e.charAt(i),map.getOrDefault(e.charAt(i),0)+1);

             // 3. Checking hypen count
            int hyp=0;
            if(map.containsKey('-')){  hyp=map.get('-');}
            if(hyp>1) continue;

            // 4. Checking punctuation count
            int punch=0;
            if(map.containsKey('!')) punch+=map.get('!');
            if(map.containsKey('.')) punch+=map.get('.');
            if(map.containsKey(',')) punch+=map.get(',');
            if(punch>1) continue;

            // 5. Checking before and after of hypen are LowerCase letter
            if(map.containsKey('-')){
                if(e.startsWith("-") || e.endsWith("-"))  continue;
                int pos=e.indexOf("-");
                char before=e.charAt(pos-1);
                char after=e.charAt(pos+1);
                if(!Character.isLowerCase(before) || !Character.isLowerCase(after)) continue;
            }

            // 6. Check punctuation is present atlast only
            if(map.containsKey('!'))
                if(!e.endsWith("!"))  continue;
            if(map.containsKey('.'))
                if(!e.endsWith("."))  continue;
            if(map.containsKey(','))
                if(!e.endsWith(","))  continue;

            // 7. Check if a token is a space
            if(map.size()==0) continue;

            // If all conditions satisfies,then...
            cnt++;
        }
        return cnt;
    }
}
