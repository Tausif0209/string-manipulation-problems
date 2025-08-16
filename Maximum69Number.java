public class Maximum69Number {
   public int maximum69Number (int num) {
        // StringBuilder ans=new StringBuilder();
        // String s=num+"";
        // for(int i=0;i<s.length();i++){
        //     ans.append('9');
        //     if(s.charAt(i)=='6') {
        //         ans.append(s.substring(i+1));
        //         break;
        //     }
        // } return Integer.parseInt(ans.toString());

        return Integer.parseInt(String.valueOf(num).replaceFirst("6","9"));
    }
}
