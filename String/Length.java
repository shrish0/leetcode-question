class Length {
    public static int StringLength(String strs) {
        int i = 0;
        if (strs.equals("")) {
            return 0;
        }
        // while (true) {
        //     try {
        //         strs.charAt(i);
        //         i++;                                                         
        //     } catch (StringIndexOutOfBoundsException e) {
        //         break;
        //     }
        // }
       
        for(char a : strs.toCharArray()){
            i++;
        }
        return i;
    }


    public static void main(String[] args) {
        System.out.println(StringLength("avava"));
    }
}
