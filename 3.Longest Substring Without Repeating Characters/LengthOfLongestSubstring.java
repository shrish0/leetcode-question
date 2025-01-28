import java.util.*;
class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        System.out.println("length of longest substring without repeating character : "+lengthOfLongestSubstring(str));
    }
}
