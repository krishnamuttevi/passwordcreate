package u2java;

import java.util.Scanner;
public class passwordcheck {
public static void main(String[] args) {
	boolean b=true;
// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
while(b) {
	System.out.println("Hello user enter a new password");
char str[]=sc.next().toCharArray();
int dig=0,ch=0,Ch=0,sp=0;
if(str.length>=6&&str.length<=16) {
for(int i=0;i<str.length;i++) {
if(str[i]>=48&&str[i]<=57) {
++dig;
}
if(str[i]>=97&&str[i]<=122) {
++ch;
}
if(str[i]>=65&&str[i]<=90) {
++Ch;
}
if(str[i]=='$'||str[i]=='@'||str[i]=='#'){
++sp;
}
}
if(dig>=1&&ch>=1&&Ch>=1&&sp>=1) {
System.out.println("valid password");
b=false;
}
else {
System.out.println("Not a valid password!\nplease try again");
}
}else {
System.out.println("Not a valid password!\nplease try again");
}
}
}}