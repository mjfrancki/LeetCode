class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.equals("") ) return 0;
        if (!s.contains(" ")) return s.length();


        //strlength = s.length();

        int count = 0;
        for(int i = s.length()-1; i >= 0; i--){

            if (s.charAt(i) == ' ') return count;

            count ++ ;


        }

        return 0;
    }
}
