//Method 1:
class Solution{
  public boolean isPalindrome(String s){
    String rev="";

    for(int i=s.length()-1;i>=0;i--){
      rev+=s.charAt(i);
    }

    if(s.toLowerCase().equals(rev.toLowerCase()))
      return true;
    else
      return false;
  }
}

//Method 2: 2 pointer
class Solution{
  public boolean isPalindrome(String s){
    int i=0,j=s.length()-1;

    while(i<j){
      if(s.charAt(i)!=s.charAt(j))
        return false;
      i++;
      j--;
    }

    return true;
  }
}

//Type 2 question: You are given a string 'S'. Your task is to check whether the string is palindrome or not. For checking palindrome, consider alphabets and numbers only and ignore the symbols and whitespaces.
/*Let S = “c1 O$d@eeD o1c”.
If we ignore the special characters, whitespaces and convert all uppercase letters to lowercase, we get S = “c1odeedo1c”, which is a palindrome. Hence, the given string is also a palindrome.*/

class Solution{
  public boolean isPalindrome(String s){
    String str=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();  //it retains only the alphanumeric characters and converts the string into lower case.

    int i=0,j=str.length()-1;

    while(i<j){
      if(str.charAt(i)!=str.charAt(j))
        return false;
      i++;
      j--;
    }

    return true;
  }
}
