import java.util.HashSet;

public class Recursion {
    public static class SubsequenceString{

        public void UniqsubSequence(String str,int idx,String newString,HashSet<String> set){

            if(idx==str.length()) {
                if (set.contains(newString)) {
                    return;
                } else {
                    System.out.println(newString);
                    set.add(newString);
                    return;
                }
            }

            char currChar = str.charAt(idx);

            //to be
            UniqsubSequence(str,idx+1,newString+currChar,set);

            //not to be
            UniqsubSequence(str,idx+1,newString,set);
        }
    }

    public static void main(String[] args) {
        String str = "aabbcc";
        HashSet<String> set = new HashSet<>();
        SubsequenceString s1 = new SubsequenceString();
        s1.UniqsubSequence(str,0,"",set);
    }
}
