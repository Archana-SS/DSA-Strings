// Given an input string s, reverse the order of the words.A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.Return a string of the words in reverse order concatenated by a single space.Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
//Case 1: Sentence has one or more leading and trailing spaces but final ans should have only one space between words.

class Solution{
  public String reverseWords(String s){
    String words[]=s.split(" +"); //(" +") is the regular expression to split the sentence on one or more spaces so plus.
    StringBuilder sb=new StringBuilder();

    for(int i=words.length-1;i>=0;i--){
      if(words[i].isEmpty())
        continue;
      sb.append(words[i]);
      sb.append(" ");
    }

    String ans=sb.toString().trim();

    return ans;
  }
}

//Case 2: Sentence has one or more leading or trailing dots. And final ans should contain exactly one dot between the words

class Solution{
  public String reverseWords(String ans){
    String words[]=s.split("\\.+");
    StringBuilder sb=new StringBuilder();

    for(int i=words.length-1;i>=0;i--){
      if(words[i].isEmpty())
        continue;

      sb.append(words[i]);
      sb.append(".");
    }

    String ans=sb.toString().replaceAll("^\\.+|\\.+$",""); //here ^ means leading or starting . \\. means dot symbol . + means more than one . | means OR . $ means trailing .
    return ans;
  }
}
