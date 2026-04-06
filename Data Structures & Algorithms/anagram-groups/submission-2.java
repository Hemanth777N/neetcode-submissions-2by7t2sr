class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         if (strs== null || strs.length == 0){
            return new ArrayList<>();
         }
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            String frequencyStr = getFrequency(str);

            if(map.containsKey(frequencyStr)){
                map.get(frequencyStr).add(str);
            }
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(frequencyStr, strList); 
            }

        }
        return new ArrayList<>(map.values());
    
}
    private String getFrequency(String str){
            int[] freq = new int[26];
            for(char c: str.toCharArray()){
                freq[c - 'a']++;
            }

            StringBuilder Freqstr = new StringBuilder();
            char c= 'a';
            for(int i: freq){
                Freqstr.append(c);
                Freqstr.append(i);
                c++;

                    }
                    return Freqstr.toString();

        
    }
}
