public class FormTheLargestNumber {
   public String findLargest(int[] arr) {
        if(arr.length==1) return String.valueOf(arr[0]);
        String[] strArr=new String[arr.length];
        for(int i=0;i<arr.length;i++) strArr[i]=String.valueOf(arr[i]);
        Arrays.sort(strArr,(a,b)->(b+a).compareTo(a+b));
        StringBuilder ans =new StringBuilder();
        for(String el:strArr) ans.append(el);
        return ans.charAt(0)=='0'? "0":ans.toString();
    }
}
