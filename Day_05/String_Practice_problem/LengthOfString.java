import java.util.Scanner;

public class LengthOfString {
      public static int LengthByMethod(String s){
       int count =0;
while(true){
 try {
  s.charAt(i);
i++;
count++;
} catch(expection e){
  break;
}
return count;
}
      public static void main(String[] args){
      Scanner input  = new Scanner(System.in);
      String s = input.nextLine();
      int length = LengthByMethod(s);

      int lengthInBuilt = s.length();
System.out.println(length);
}

}