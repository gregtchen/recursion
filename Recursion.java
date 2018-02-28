public class Recursion{
   public static void main(String[] args){
      String s = "trashcan";
      backwards(s);
   }
   static void backwards(String s){
      if (s.length() == 0){
         return;
      }
      else {
         System.out.println(s.substring(s.length()-1, s.length()));
         backwards(s.substring(0, s.length()-1));
      }
   }
}

