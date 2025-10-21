//Given a string input of length n, find the length of the longest substring without repeating characters i.e return a substring that does not have any repeating characters.

//Method 1: Brute force  (i.e generate all the substrings without repeating char)
class Solution{
  public int longestSubstring(String s){
    int maxLen=0;

    for(int i=0;i<s.length();i++){
      int hash[]=new int[256];
      Arrays.fill(hash,0);

      for(int j=i;j<s.length();j++){
        if(hash[s.charAt(j)])==1
          break;

        hash[s.charAt(j)]=1;
        int len=j-i+1;
        maxLen=Math.max(maxLen,len);
      }
    }

    return maxLen;
  }
}

//Method 2: Optimal (Sliding window)
class Solution{
  public int longestSubstring(String s){
    int start=0,end=0;
    int maxLen=0;
    List<Character> ls=new ArrayList<>();

    while(end<s.length()){
      if(!ls.contains(s.charAt(end)){
        ls.add(s.charAt(end));
        end++;
        maxLen=Math.max(maxLen,ls.size());
      }
      else{
        ls.remove(Character.valueOf(s.charAt(start)));
        start++;
      }
    }

    return maxLen;
  }
}
