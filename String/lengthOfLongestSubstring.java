class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;
        HashSet<Character> set = new HashSet<>();
        int j=0,result=0;
        for(int i=0;i<s.length();i++ ){
            if(set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(j++));
                }
            }
            set.add(s.charAt(i));
            result=Math.max(i-j+1,result);
        }
        return result;
    }
}
