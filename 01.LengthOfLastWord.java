class Solution{
  public int lengthOfLastWord(String s){
    int count=0;

    String str=s.trim(); //to remove the leading and trailing spaces in the given string

    for(int i=str.length()-1;i>=0;i--){  //reverse traversal
      if(str.charAt(i)!=' ')
        count++;
      else
        break;
    }

    return count;
  }
}
