public class ReverseString2 {
  public String reverseStr(String s, int k) {
        if(s.length()==1) return s;
        int len=s.length();
        if(k>=len) return reverse(s);
        StringBuilder sb=new StringBuilder();
        int start=0,end;
        for(end=2*k;end<len;end+=2*k) {
            sb.append(reverse(s.substring(start,start+k))).append(s.substring(start+k,end));
            start=end;
        } 
        end=Math.min(start+k,len);
        return sb.append(reverse(s.substring(start,end))).append(s.substring(end,len)).toString();
    }
    private String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
