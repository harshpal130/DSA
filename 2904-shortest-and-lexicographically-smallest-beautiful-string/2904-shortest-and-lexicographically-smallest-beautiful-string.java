class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<Integer> st = new ArrayList<>();
        int n = s.length();

        for(int i = 0; i<n;i++){
            if(s.charAt(i)=='1'){
                st.add(i);
            }
        }
        if(st.size()<k){
            return "";
        }
        String ans = "";

        for(int i=0; i+k-1<st.size();i++){
            int start = st.get(i);
            int end = st.get(i+k-1);

            String curr = s.substring(start,end+1);

            if (ans.equals("") || curr.length() < ans.length() || (curr.length() == ans.length() && curr.compareTo(ans) < 0)) {
                ans=curr;
            }
        }
        return ans;
    }
}