import java.io.*;
import java.lang.*;
import java.util.*;
 
public class Main{
   public static void main(String[] args) {
            Scanner sc2 = new Scanner(System.in);
            int n = Integer.parseInt(sc2.nextLine());
            while(sc2.hasNextLine()){
                String w = sc2.nextLine();
                if (w.length()==11){
                    char[] temp = w.toCharArray();
                    char[] res = new char[3];
                    res[0] = temp[0];
                    res[1] = '9'; 
                    res[3] = temp[10];
                    w = res.toString();
                    System.out.println(w);
                }
                if (w.length()>10){
                    char[] temp = w.toCharArray();
                    char[] res = new char[4];
                    res[0] = temp[0];
                    res[1] = (char)((w.length()-3)/10); 
                    res[2] = (char)((w.length()-3)%10); 
                    res[3] = temp[w.length()-1];
                    w = res.toString();
                    System.out.println(w);
                } else {
                    System.out.println(w);
                }
        }
        sc2.close();
   }
}
