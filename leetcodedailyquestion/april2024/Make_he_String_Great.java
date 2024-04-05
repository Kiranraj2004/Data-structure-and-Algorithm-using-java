package leetcodedailyquestion.april2024;

//5/4/2024
public class Make_he_String_Great {
    public static void main(String[] args) {
        String s="abBAcC";
//        System.out.println((int)('A'));
        System.out.println(makeGood(s));
    }
    public static String makeGood(String s) {
//        Stack<Character>res=new Stack<>();
//        for (int i = 0; i <s.length() ; i++) {
//            if (res.isEmpty()){
//                res.push(s.charAt(i));
//                continue;
//            }
//            boolean a=Character.isLowerCase(res.peek())^Character.isLowerCase(s.charAt(i));
//            boolean f=Character.toLowerCase(res.peek())==Character.toLowerCase(s.charAt(i));
//            if (!res.isEmpty()&&a&&f){
//                res.pop();
//            }
////            optimal way
////            if ((Character.isUpperCase(s.charAt(i)) && Character.isLowerCase(res.peek())
////                    && Character.toUpperCase(res.peek()) == s.charAt(i)) ||
////                    Character.isUpperCase(res.peek()) && Character.isLowerCase(s.charAt(i))
////                            && Character.toUpperCase(s.charAt(i)) == res.peek()) {
////                res.pop();
////            }
//            else{
//                res.push(s.charAt(i));
//            }
//        }
//        StringBuffer r=new StringBuffer();
//        for (Character re : res) {
//            r.append(re);
//        }
//        return r.toString();

//        optimal solution
    if (s.length()==1||s.length()==0){
        return s;
    }
    StringBuffer res=new StringBuffer(s);
    int i=0;
    while(i<res.length()-1){
        char left=res.charAt(i);
        char right=res.charAt(i+1);
        if(Math.abs(left-right)==32){
            res.delete(i,i+2);
            if (i>0){
                i--;
            }
        }
        else{
            i++;
        }

    }
    return res.toString();
    }


}
