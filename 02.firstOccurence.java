// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack

class Solution{
  public int firstOccurence(String haystack,String needle){
    for(int i=0;i<haystack.length()-needle.length()+1;i++){
      if(haystack.charAt(i)==needle.charAt(0){               // checking if the first character of needle is present in haystack or not
        if(haystack.substring(i,i+needle.length()).equals(needle))  // if the first character of needle is found in haystack, we use substring method to find if needle is part of haystack. Start index of substring is i, and end index is i+needle.length().
          return i;
      }
    }

    return -1;
  }
}
