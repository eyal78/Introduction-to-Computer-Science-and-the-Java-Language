# Introduction-to-Computer-Science-and-the-Java-Language
String:
String str1="Hello world";
String str2="Hello";
int x=str1.length();                // x==11
char a=str1.charAt(1);              // a==e
int y=str.indexOf("el);             // y==1  Because the first character of substring("el") is 1
boolean ans=str1.equals(str2);     //  ans==false
int dic=str1.compareTo(str2);      //  Checks in the dictionary whether the string str2 is before str1. If so, return a negative number, if it is after it,                                    //  return a positive number, and if it is equal to it, return 0.
String ch1=str1.substring(6);      //  ch1=="world".  Returns a substring at the given index location
String ch2=str1.substring(2,8);    //  ch2=="llo wo"
String up=str2.toUpperCase();      //  up=="HELLO" 
String down=str2.toLowerCase();    //  down=="hello"
