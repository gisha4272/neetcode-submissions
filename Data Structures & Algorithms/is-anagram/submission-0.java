class Solution {
    public boolean isAnagram(String s, String t) {
        char [] str = s.toCharArray();
        char [] str1 = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(str1);
        int j=str.length;
        int k=str1.length;
        if(j!=k)
        {
            return false;
        }
        int l = 0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i]==str1[i])
            {
                l++;
                continue;
            }
            
        }
        if(l==str.length)
        {
            return true;
        }
       return false;
    }
}
