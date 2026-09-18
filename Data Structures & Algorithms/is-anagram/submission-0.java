class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        HashMap<Character,Integer> map=new HashMap<>();
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            map.put(ch1,map.getOrDefault(ch1,0)-1);
        }
        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))!=0){
                return false;
            }
        }
        return true;
    }
}
