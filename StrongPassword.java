public class StrongPassword {
   public static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        boolean digitPresent=false;
        boolean lower_casePresent=false;
        boolean upper_casePresent=false;
        boolean special_charactersPresent=false;
        for(int i=0;i<n;i++){
            char ch=password.charAt(i);
            lower_casePresent= lower_casePresent || 
            (lower_case.indexOf(ch)!=-1);
            upper_casePresent= upper_casePresent || 
            (upper_case.indexOf(ch)!=-1);
            digitPresent= digitPresent || 
            (numbers.indexOf(ch)!=-1);
            special_charactersPresent= special_charactersPresent || 
            (special_characters.indexOf(ch)!=-1);
        }
        int extra=0;
        if(!lower_casePresent) extra++;
        if(!special_charactersPresent) extra++;
        if(!digitPresent) extra++;
        if(!upper_casePresent) extra++;
        return Math.max(n+extra,6)-n;
    }
}

