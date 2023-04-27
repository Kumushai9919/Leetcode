class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> digitLogs = new ArrayList();
        List<String> letterLogs = new ArrayList();
        
        for(String s:logs){
            
            String[] str = s.split(" ");
            if(Character.isDigit(str[1].charAt(0))){
                digitLogs.add(s);
            }else{
                letterLogs.add(s);
            }
        }
        
        Collections.sort(letterLogs,new Comparator<String>(){
           
            @Override
            public int compare(String first, String second){
             
                String firstVals = first.substring(first.indexOf(" ")+1);
                String secondVals = second.substring(second.indexOf(" ")+1);
                
                if(firstVals.equals(secondVals)){
                    return first.split(" ")[0].compareTo(second.split(" ")[0]); 
                }
                
                return firstVals.compareTo(secondVals);
                
            }
            
        });
        
        letterLogs.addAll(digitLogs);
        return letterLogs.toArray(new String[letterLogs.size()]);
    }
}
