package Chapter1;

public class OneAway {

    boolean isOneAway(String s1, String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();

        if(Math.abs(s1Length - s2Length) > 1) return  false;

        String first = s1Length > s2Length ? s2:s1;
        String second  = s1Length > s2Length ? s1:s2;

        int index1 = 0;
        int index2 = 0;

        boolean foundDifference = false;
        while(index1 <= first.length() && index2 <= second.length()){
            if(first.charAt(index1)!= second.charAt(index2)){
                if(foundDifference) return false;
                foundDifference = true;

                if(s1Length == s2Length ) index1++;
            }else {
                index1++;
            }
            index2++;
        }
        return foundDifference;
    }

}
