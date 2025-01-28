import java.util.*;
class FindRepeatedDnaSequences {
    //using hashset and list contains
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        String sequence;
        if (s.length() < 10) {
            return list;
        }
        for (int i = 0; i <= s.length() - 10; i++) {
           sequence = s.substring(i,i+10);
           if(set.contains(sequence)){
             if(!list.contains(sequence))
                 list.add(sequence);
             }
             else{
                 set.add(sequence);
             }
        }
        return list;
    }

    //HashMap
    /* 
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        String sequence;
        if (s.length() < 10) {
            return list;
        }
        for (int i = 0; i <= s.length() - 10; i++) {
           sequence = s.substring(i,i+10);
           map.getOrDefault(sequence, 0);
        }
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                list.add(key);
            }
        }
        return list;
    }
    */

    //two hashset gpt recommendation
    /*
      public static List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashSet<String> repeatSet = new HashSet<>();
        String sequence;
        if (s.length() < 10) {
            return list;
        }
        for (int i = 0; i <= s.length() - 10; i++) {
           sequence = s.substring(i,i+10);
           if(set.contains(sequence))
           {
             if(!repeatSet.contains(sequence)){
                 repeatSet.add(sequence);
                 list.add(sequence);
             }
            }
             else{
                 set.add(sequence);
             }
        }
        return list;
    }
    */


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String :  ");
        String strs = sc.nextLine();

        System.out.println(findRepeatedDnaSequences(strs));

    }
 }
 