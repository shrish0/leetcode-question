import java.util.Scanner;


// 1
// 12
// 123
// 1234
// 12345

public class Pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter pattern row ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        /*a
        StringBuilder str1 = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            str1.append(i); 
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(str1.substring(0, i));
        }
         */
        
    }
}
