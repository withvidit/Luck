
public class Choice {

}











































































































































































































































































































































































































































































































































































































































































































/*
1.Add and Reverse    
********************************************************  571
public class Main {
public static void main(String[] args) {
		
              int[] a={10,15,20,25,30,100};
       Scanner sc = new Scanner(System.in);
       int size=sc.nextInt();
       String []s1=new String[size];
       for(int i=0;i<size;i++)
       {
    	   s1[i]=sc.next();
       }
System.out.println(kape1.display(s1));
}}
              int b=15;
              int i,sum=0,r=0;
              for(i=0;i<a.length;i++)
              {
            	  if(a[i]>b)
            	  {
            		  sum=sum+a[i];
            	  }
              }
              //System.out.println(sum);
             while(sum!=0)
             {
            	 r=(r*10)+(sum%10);
            	 sum=sum/10;
             }
             System.out.println(r);;
	}
}
2.Add Time
********************************************************
public class Main {
	
	public static void main(String[] args) throws IOException, ParseException  {
		
	String s1="23:59:59";
	String s2="23:59:59";
	SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
	sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
	sdf.setTimeZone(TimeZone.getTimeZone("s1"));
	sdf.setTimeZone(TimeZone.getTimeZone("s2"));
	Date d1=sdf.parse(s1);
	Date d2=sdf.parse(s2);
	long add=d1.getTime()+d2.getTime();
	String s=sdf.format(add);
	Calendar cal=Calendar.getInstance();
	cal.setTime(sdf.parse(s));
	int FindDay=cal.get(Calendar.DAY_OF_MONTH);
	if(FindDay>1)
	FindDay=FindDay-1;
	String op=FindDay+":"+s;
	System.out.println(op);
	}
}
3.Adjacent Swaps
*********************************************************
public class Main
{
public static void main(String[] args) {
String s1="forget";
getvalues(s1);
}
public static void getvalues(String s1)
{
StringBuffer sb=new StringBuffer();
int l=s1.length();
if(l%2==0)
{
for(int i=0;i<s1.length()-1;i=i+2)
{
char a=s1.charAt(i);
char b=s1.charAt(i+1);
sb.append(b).append(a);
}
System.out.println(sb);
}
else
{
for(int i = 0;i<s1.length()-1;i=i+2)
{
char a=s1.charAt(i);
char b=s1.charAt(i+1);
sb.append(b).append(a);
}
sb.append(s1.charAt(l-1));
System.out.println(sb);
}
}
}
4.Age for Voting(getAge)
*************************************************************
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s =sc.nextLine();
System.out.println(UserMainCode.display(s));}}
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserMainCode {
public static String display(String n)
{
	
int year=0;
 String now="01/01/2015";
SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
try
{
	
Date d=sdf1.parse(n);
Date d1=sdf1.parse(now);
sdf1.setLenient(false);
int y=d.getYear();
int y1=d1.getYear();
int m=d.getMonth();
int m1=d1.getMonth();
int day=d.getDay();
int day1=d1.getDay();
year=y1-y;
if(m>m1)
year--;
else if(m==m1)
{if(day<day1)
year--;
}
}
catch(Exception e)
{
e.printStackTrace();
}
if(year>18)
return "eligible";
else
return "not-eligible";
}}
5.All Numbers(validateNumber)
**************************************************
import java.util.Scanner;
public class kape {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int size=sc.nextInt();
       String []s1=new String[size];
       for(int i=0;i<size;i++)
       {
    	   s1[i]=sc.next();
       }
       System.out.println(kape1.display(s1));
    }}
public class kape1 {
public static int display(String a[])
{int c=0;
for(int i=0;i<a.length;i++)
{
String s=a[i];
int k=0;
for(int j=0;j<s.length();j++)
{
char a1=s.charAt(j);
//System.out
if(a1>='0' && a1<='9' || a1=='.' )
k++;
 
}
if(k==s.length())
c++;
}
if(c==a.length)
return 1;
else
return -1;
}}
6.All Vowels
**********************************************************
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Main {
/**
* @param args
public static void main(String[] args) {
String s1="alphabet";
getvalues(s1);
}
public static void getvalues(String s1) {
String s2="aeiou";
StringBuffer sb=new StringBuffer();
for(int i=0;i<s1.length();i++)
{
for(int j=0;j<s2.length();j++)
{
if(s1.charAt(i)==s2.charAt(j))
{
sb.append(s1.charAt(i));
}
}
}
if(sb.toString().equals(s2))
{
System.out.println("true");
}
else
System.out.println("false");
}
}
7.8.Anagrams
********************************************************
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
	
	public static void main(String[] args) {
		String s1="Desperation";
		String s2="A Rope Ends It";
		List<Character> l1=new ArrayList<Character>();
		List<Character> l2=new ArrayList<Character>();
		List<Character> l3=new ArrayList<Character>();
		String s3=s1.toUpperCase();
		String s4=s2.toUpperCase();
		for (int i = 0; i < s3.length(); i++) 
		{
			l1.add(s3.charAt(i));
		}
		for (int i = 0; i < s4.length(); i++) 
		{
			l2.add(s4.charAt(i));
		}
		l3.add(' ');
		l1.removeAll(l3);
		l2.removeAll(l3);
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1);
		System.out.println(l2);
		if(l1.equals(l2))
			System.out.println("true");
		else
			System.out.println("false");
		}
}
9.Array List Sorting and Merging (sortMergedArrayList)
******************************************************* 3/1/17/11/19
public class kape {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); 
ArrayList<Integer> al1=new ArrayList<Integer>();
ArrayList<Integer> al2=new ArrayList<Integer>();
ArrayList<Integer> ans=new ArrayList<Integer>();
for(int i=0;i<5;i++)
al1.add(sc.nextInt());
for(int j=0;j<5;j++)
al2.add(sc.nextInt());
ans=kape1.answer(al1,al2);
//System.out.println(ans);
for(int k=0;k<3;k++)
System.out.println(ans.get(k));
}
}
import java.util.ArrayList;
import java.util.Collections;
public class kape1 {
public static ArrayList<Integer> answer (ArrayList<Integer> al1, ArrayList<Integer> al2)
{
al1.addAll(al2);
Collections.sort(al1);
ArrayList<Integer> ans=new ArrayList<Integer>();
ans.add(al1.get(2));
ans.add(al1.get(6));
ans.add(al1.get(8));
return ans;
}
10.ArrayFront   (scanArray)
***************************************************************************      6/1/2/3/4/5/6
import java.util.Scanner;
 
public class kapes3 {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int []a=new int[s];
for(int i=0;i<s;i++)
{
a[i]=sc.nextInt();
}
System.out.println(kapes4.display(a));
}
}
 public class kapes4
{public static boolean display(int[] a)
{
int u=0,l=0;
boolean b=false;
if(a.length>=4)
l=4;
else
l=a.length;
for(int i=0;i<l;i++)
if(a[i]==9)
u=10;
if(u==10)
b=true;
 
return b; 
}
}
11.ArrayList and Set Operations  (performSetOperations)
***************************************************
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n=Integer.parseInt(sc.nextLine());
       ArrayList<Integer>a1=new ArrayList<Integer>();
       ArrayList<Integer>a2=new ArrayList<Integer>();
      for(int i=0;i<n;i++)
    	 a1.add(Integer.parseInt(sc.nextLine()));
      for(int i=0;i<n;i++)
     	a2.add(Integer.parseInt(sc.nextLine()));  
      char c=sc.nextLine().charAt(0);
       System.out.println(UserMainCode.getvalues(a1,a2,c));
    }
}
import java.util.ArrayList;
public class UserMainCode {
	public static ArrayList<Integer> getvalues(ArrayList<Integer>a1,ArrayList<Integer>a2,char c)
	{
		ArrayList<Integer>op1=new ArrayList<Integer>();int k=0;
		switch(c)
		{
		case '+':
			a1.removeAll(a2);
			a1.addAll(a2);
          op1=a1;
         break;
		case '*':
			a1.retainAll(a2);
			op1=a1;
			break;
		case '-':
			for(int i=0;i<a1.size();i++)
			{
				k=0;
				for(int j=0;j<a2.size();j++)
				{
					if(a1.get(i)==a2.get(j))
						k=1;
				}
				if(k==0)
					op1.add(a1.get(i));
			}
		 break;
		}
		return op1;
		}}
12.ArrayList Manipulation  (generateOddEvenList)
*******************************************
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
ArrayList<Integer>al1=new ArrayList<Integer>();
ArrayList<Integer>al2=new ArrayList<Integer>();
for(int i=0;i<s;i++)
al1.add(sc.nextInt());
for(int i=0;i<s;i++)
al2.add(sc.nextInt());
ArrayList<Integer>al3=new ArrayList<Integer>();
al3=Usermaincode.display(al1,al2);
Iterator<Integer> it=al3.iterator();
while(it.hasNext())
{
int n=it.next();
System.out.println(n);
}
}
}
import java.util.ArrayList;
import java.util.Iterator;
 
public class Usermaincode
{
public static ArrayList<Integer> display (ArrayList<Integer>al1,ArrayList<Integer>al2)
{
ArrayList<Integer>al3=new ArrayList<Integer>();
for(int i=0;i<al1.size();i++)
{
if(i%2==0)
al3.add(al2.get(i));
else
al3.add(al1.get(i));
}
return al3;
}}
13.ArrayList to String Array
************************************************************************
import java.util.*;
public class Main {
public static void main(String[] args) {
	List<String> l1=new ArrayList<String>();
	l1.add("Apple");
	l1.add("Chery");
	l1.add("Grapes");
	List<String> l2=new ArrayList<String>();
	l2.add("Orange");
	l2.add("Mango");
	l2.add("Melon");
	l2.add("Apple");
	String[] s2=fruitsList(l1,l2);
	for(String s3:s2)
		System.out.println(s3);
}
public static String[] fruitsList(List<String> l1, List<String> l2){
	List<String> l3=new ArrayList<String>();
	for(int i=0;i<l1.size();i++){
		String s1=l1.get(i);
		
		if(s1.charAt(s1.length()-1)!='a' && s1.charAt(s1.length()-1)!='A' && s1.charAt(s1.length()-1)!='e' && s1.charAt(s1.length()-1)!='E')
			l3.add(s1); }
	for(int i=0;i<l2.size();i++){
		String s1=l2.get(i);
		if(s1.charAt(0)!='m' && s1.charAt(0)!='M' && s1.charAt(0)!='a' && s1.charAt(0)!='A')
			l3.add(s1); }
	Collections.sort(l3);
	String[] s2=new String[l3.size()];
	for(int i=0;i<s2.length;i++)
		s2[i]=l3.get(i);
	return s2;
}
14.ArrayList to String Array(convertToStringArray)
************************************************************************
import java.util.Collections;
import java.util.List;
public class UserMainCode{
public static String[]convertToString(List <String>l)
{
Collections.sort(l);
String answer[]=new String[l.size()];
for(int i=0;i<l.size();i++)
{
answer[i]=l.get(i);
}
return answer;
}
}
15.Asterisk & Characters
**************************************************************************
import java.util.*;
public class Main {
public static void main(String[] args) {
String input="Welcome*elizabeth";
System.out.println(characterCheck(input));
}
public static boolean characterCheck(String input) {
boolean b=false;
StringTokenizer t=new StringTokenizer(input,"*");
String s1=t.nextToken();
String s2=t.nextToken();
String s3=s1.substring(s1.length()-1);
String s4=s2.substring(0,1);
if(s3.equalsIgnoreCase(s4))
b=true;
return b;
}
}
16.Average of Elements in Hashmap  (avgOfEven)
********************************************************************  3/1/2.3/2/4.1/6/6.2
import java.util.HashMap;
import java.util.Scanner;
 
public class kapes3 {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<Integer,Float>hm=new HashMap<Integer,Float>();
for(int i=0;i<s;i++)
{
hm.put(Integer.parseInt(sc.nextLine()),Float.parseFloat(sc.nextLine()));
}
System.out.println(kapes4.display(hm));
}
}
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
public class kapes4
{public static String display(HashMap<Integer,Float>hm)
{
float sum=0;
int count=0;
DecimalFormat df=new DecimalFormat("#.00");
Iterator<Integer> it=hm.keySet().iterator();
while(it.hasNext())
{
int y=it.next();
if(y%2==0)
{
sum=(float) (sum+hm.get(y));
count++;
}}
float d=sum/count;
return df.format(d);
}
}
17.Average of Prime Locations (averageElements)
****************************            8/4/1/7/6/5/8/6/9
import java.util.Scanner;
public class kape{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
int []a=new int[20];
int n=Integer.parseInt(sc.nextLine());
for(int i=0;i<n;i++)
{
	a[i]=Integer.parseInt(sc.nextLine());
}
System.out.print(kape1.display(n,a));
}}
public class kape1{
public static double display(int n,int[]a)
{
int count=0,sum=0,n1=0;
double avg=0;
for(int i=2;i<n;i++)
{
count=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{
sum=sum+a[i];
n1=n1+1;
}
}
 avg=(double)(sum)/n1;
return avg;
}}
18.Average of Primes   (addPrimeIndex)
********************************
import java.util.Scanner;
 
public class kapes3{
public static void main (String[] args)
                {
                                // your code goes here
                                Scanner sc = new Scanner(System.in);
                                int n = sc.nextInt();
                                int[] arr = new int[n]; 
                                for(int i=0;i<n;i++){
                                                arr[i] = sc.nextInt();
                                }
                                
                                System.out.println(kapes4.getvalues(arr, n));
                }}
 public class kapes4{
      public static int getvalues(int[] a,int n) {
      
            int sum=0;
            int count=0;
            int sum_count=0;
            for(int i=0;i<a.length;i++)
            {
                            count=0;
                            for(int j=1;j<=i;j++)
                            {
                            if(i%j==0)
                            {
                            count++;
                            if(i<0)
                            break;
                            }
            
            }
            if(count==2)
            {
                            sum=sum+a[i];
                            sum_count++;
            }
            }
            
            int avg=sum/sum_count;
            return avg;
 
            }}
19.BOUNDARY AVERAGE   (getBoundaryAverage)
********************************************  6/3/6/9/4/2/5
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int n[]=new int[size];
for(int i=0;i<size;i++)
{
	n[i]=sc.nextInt();
}
System.out.println(Usermaincode.display(n));
}
}
public class Usermaincode {
    public static float display(int num[])
    {
    	   int max = num[0];
    	   int min=num[num.length-1];
    	   for (int i = 0; i < num.length; i++)
    	   {
    	       if (num[i] > max)
    	          max = num[i];
    	       if (num[i]<min)
    	    	   min=num[i];
    	   }
    	   return (float)(max+min)/2;
    }
}
20.Calculate Average ? Hash Map
**********************************
import java.util.HashMap;
import java.util.Scanner;
public class main12 {
	public static void main(String[] arg)
	{
		HashMap<Integer,Double> hm=new HashMap<Integer,Double>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			double s=sc.nextDouble();
			hm.put(a,s);
		}
		System.out.println(main13.dis(hm));}}
 
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
class main13
{
public static double dis(HashMap<Integer,Double> h1) 
	{
	double avg=0.0,sum=0.0;
	int k=0;
	for(Map.Entry m:h1.entrySet())
	{
		int a=(Integer)m.getKey();
		if(a%2!=0)
		{
			Double d=(Double) m.getValue();
			sum=sum+d;
			k++;
		}
	}
	avg = (double)sum/k;
	DecimalFormat df = new DecimalFormat(".##");
	String b1 = df.format(avg);
	double b = Double.parseDouble(b1);
	return b;}}
21.22.Calculate Electricity Bill (calculateElectricityBill)
******************************************************************   ABC2012345
	public static int meterReading(String input1, String input2, int input3) 
	{
		int n1=Integer.parseInt(input1.substring(5, input1.length()));
		int n2=Integer.parseInt(input2.substring(5, input2.length()));
		int n=Math.abs((n2-n1)*input3);
		return n;
	}
}
23.Character cleaning   (removeCharacter)
******************************************************************************************    elephant/e
public class PO {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char ch=sc.nextLine().charAt(0);
		StringBuffer sb=new StringBuffer(name);
		for(int i=0;i<sb.length();i++)
	{if(ch==sb.charAt(i))
{
sb.deleteCharAt(i);
i--;
}
}
System.out.print(sb.toString());}}
24.Check Characters in a String  (checkCharacters)
*******************************************************************     the picture was great
import java.util.StringTokenizer;
public class Main 
{
	public static void main(String[] args) 
	{
		String input="this";
		System.out.println(checkForFirstAndLastChar(input));
	}
	public static int checkForFirstAndLastChar(String input) 
	{
		StringTokenizer t = new StringTokenizer(input," ");
		String s = t.nextToken();
		String s1 = " " ;
		while(t.hasMoreTokens())
		{
			s1 = t.nextToken();
		}
		if(s.charAt(0) == s1.charAt(s1.length()-1))
			return 1;
		else 
			return 0; 
	}
}
25.Check first and last word   (check)
*********************************
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String age=sc.nextLine();
System.out.println(Usermaincode.display(age));
}
}
import java.util.StringTokenizer;
public class Usermaincode
{public static int display(String s)
{
int count=0; 
String fin="";
StringTokenizer st=new StringTokenizer(s);
String ini=st.nextToken();
while(st.hasMoreTokens())
{ fin=st.nextToken();
}
if(ini.equals(fin))
count=ini.length();
else
count=ini.length()+fin.length();
return count;
}
}
26.Check Sum of Odd Digits  (checkSum)
******************************************************************      56895/sum of odd digits is odd
public class UserMainCode {
	public static int SumOfOddsAndEvens(int n){
		int n1,n2=0,n3;
		while(n!=0)
		{
			n1=n%10;
			if((n1%2)!=0)
				n2+=n1;
			n/=10;
		}
		if(n2%2==0)
			n3=-1;
		else
			n3=1;
		
		return n3;	
	}
	public static void main(String[] args) {
		int n=84882;
		System.out.println(SumOfOddsAndEvens(n));
	}
}
27.28.Color Code  ()
*******************************************
import java.util.*;
public class B {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.next();
boolean b=colorCodeValidation(s1);
if(b==true)
System.out.println("valid color code");
else
System.out.println("invalid color code");
}
public static boolean colorCodeValidation(String s1) {
boolean b=false,b1=false;
String s2=s1.substring(1,s1.length());
if(s1.length()==7)
if(s1.charAt(0)=='#')
b1=true;
 
if(b1==true)
for(int i=0;i<s2.length();i++){
char c=s2.charAt(i);
if(c!='#'){
if((Character.isAlphabetic(c)&& Character.isUpperCase(c)) || Character.isDigit(c))
b=true;
else{
b=false;
break;}}}
return b;
}
29.Common Elements  (sumCommonElements)
******************************************
import java.util.Scanner;
public class Main {
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(sc.nextLine());
	int[] a=new int[n];
	int[] b=new int[n];
	for(int i=0;i<n;i++)
	a[i]=Integer.parseInt(sc.nextLine());
	for(int i=0;i<n;i++)
	b[i]=Integer.parseInt(sc.nextLine());
	System.out.println(UserMainCode.display(a,b));
}}
public class UserMainCode {
public static int display(int a[],int b[])
{
	
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
		sum=sum+a[i];
		}}
		if(sum==0)
		return -1;
		else
		return sum;
	}}
30.Commons   (countCommonStrings)
***************************
public class kape {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int count=0;
int n1 = sc.nextInt(); 
String[] s1 = new String[n1];
for (int i = 0; i < n1; i++) {
s1[i] = sc.next();
}
int n2 = sc.nextInt();
String[] s2 = new String[n2];
for (int i = 0; i < n2; i++) {
s2[i] = sc.next();
}
ArrayList<String> al = new ArrayList<String>();
for (int i = 0; i < n1; i++) {
for (int j = 0; j < n2; j++) {
if(s1[i].equals(s2[j])){
if(!al.contains(s1[i])){
count++;
al.add(s1[i]);
}
}
}
}
System.out.println(count);
}
} 
31.Concatenate Characters  (concatCharacter)
***************************************
import java.util.Scanner;
 
public class kapes3 {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
String []a=new String[s];
for(int i=0;i<s;i++)
{
a[i]=sc.nextLine();
}
System.out.println(kapes4.display(a));
}
}
public class kapes4
{public static String display(String[] a)
{
StringBuffer sb=new StringBuffer();
for(int i=0;i<a.length;i++)
sb.append(a[i].charAt(a[i].length()-1));
return sb.toString();
}
}
32.Convert Format
****************************************************
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
	String s="555-666-1234";
	System.out.println(display(s));
	}
public static String display(String s) {
	StringTokenizer t=new StringTokenizer(s,"-");
	String s1=t.nextToken();
	String s2=t.nextToken();
	String s3=t.nextToken();
		
	StringBuffer sb=new StringBuffer();
	sb.append(s1.substring(0, s1.length()-1)).append('-');
	sb.append(s1.charAt(s1.length()-1)).append(s2.charAt(0)).append('-');
	sb.append(s2.substring(1, s2.length())).append(s3.charAt(0)).append('-');
	sb.append(s3.substring(1, s3.length()));
	
	return sb.toString();
}
}
33.Count Sequential Characters  (countSequentialChars)
******************************************************************************************  abcxxxabc/1
public class Main {
public static void main(String[] args) {
String input1="aaxxyzAAx";
System.out.println(consecutiveRepeatitionOfChar(input1));
}
public static int consecutiveRepeatitionOfChar(String input1) {
int c=0;
int n=0;
for(int i=0;i<input1.length()-1;i++){
if(input1.charAt(i)==input1.charAt(i+1))
n++;
else
n=0;
if(n==2)
c++; }
return c;
}
}
34.Count Vowels   (?countVowels?)
*************************************************************************************   avinash/3
public class Main {
public static void main(String[] args) {
String s1="avinash";
getvalues(s1);
}
public static void getvalues(String s1) {
String s2=s1.toLowerCase();
String s3="aeiou";
int count=0;
for(int i=0;i<s2.length();i++)
{
for(int j=0;j<s3.length();j++)
{
if(s2.charAt(i)==s3.charAt(j))
{
count++;
}
}
}
System.out.println(count);
}
}
35.Dash Check
**********************************************
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
String s1="hi-there-you.";
String s2="12-(134)-7539";
getvalues(s1,s2);
}
public static void getvalues(String s1, String s2) {
ArrayList<Integer>l1=new ArrayList<Integer>
();
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)=='-')
{
l1.add(i);
}
}
ArrayList<Integer>l2=new ArrayList<Integer>
();
for(int i=0;i<s2.length();i++)
{
if(s2.charAt(i)=='-')
{
l2.add(i);
}
}
//System.out.println(l1);
//System.out.println(l2);
if(l1.equals(l2))
{
System.out.println(1);
}
else
System.out.println(-1);
}
}
36.Date Format Conversion
*****************************************************************
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
public static void main(String[] args) {
String s1="12/12/1998";
getvalues(s1);
}
public static void getvalues(String s1) {
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try {
Date d1=sdf.parse(s1);
SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yy");
String s2=sdf1.format(d1);
System.out.println(s2);
} catch (ParseException e) {
e.printStackTrace();
}
}
}
37.Date Format
*********************************************************
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
	/**
	 * @param args
	 * @throws ParseException 
	 
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String s1="12/07/1994";
		String s2="12/07/1995";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("MM-dd-yyyy");
		Date d1=sdf.parse(s1);
		Date d2=sdf.parse(s2);
		Calendar cal=Calendar.getInstance();
		cal.setTime(d1);
		long y=cal.getTimeInMillis();
		cal.setTime(d2);
		long y1=cal.getTimeInMillis();
		String s3=sdf1.format(d1);
		String s4=sdf1.format(d2);
		if(y<y1)
			System.out.println(s3);
		else
			System.out.println(s4);
		
	}
}
38.Date Validation   (getValidDate)
****************************************************************************************   03.12.2013/VALID
import java.util.ArrayList;
import java.util.Collections;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
public static void main(String[] args) {
String s="14#09/1991";
getvalues(s);
}
public static void getvalues(String s) {
if(s.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
System.out.println(1);
} catch (ParseException e) {
System.out.println(-1);
}
}
else if(s.matches("[0-9]{2}[/]{1}[0-9]{2}[/][0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
System.out.println(1);
} catch (ParseException e) {
System.out.println(-1);
}
}
else if(s.matches("[0-9]{2}[-]{1}[0-9]{2}[-][0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
System.out.println(1);
} catch (ParseException e) {
System.out.println(-1);
}
}
else
System.out.println(-1);
}
}
39.Day of the Week
*******************************************************
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws ParseException {
		 
		Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    System.out.println(User.calculateBornDay(s1));
		}
		}
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class User {
	public static String calculateBornDay(String s1) throws ParseException 
	{
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
		Date d=sdf.parse(s1);
		String s=sdf1.format(d);
		return s;
	}
}
40.Day of Week
************************************************************
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws ParseException {
		 
		Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    System.out.println(User.calculateBornDay(s1));
		}
		}
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class User {
	public static String calculateBornDay(String s1) throws ParseException 
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
		Date d=sdf.parse(s1);
		String s=sdf1.format(d);
		return s.toLowerCase();
	}
}
41.Decimal to Binary Conversion    (convertDecimalToBinary)
*****************************************************************************************    5/101
import java.util.*;
import java.text.*;
public class Main {
public static void main(String[] args) throws ParseException {
	 
	Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    
    String s1=UserMainCode.IntegertoBinaryString(a);
    System.out.println(s1);
}
}
import java.text.ParseException;
public class UserMainCode
{
	public static String IntegertoBinaryString(int a) throws ParseException 
	{
		String s = Integer.toBinaryString(a);
		
		return s;
}
}
42.Difference between largest and smallest elements in an array  (getBigDiff)
*************************************************************  4/3/6/2/1
import java.util.Arrays;
public class kape1 {
public static int display(int []array)
{
	Arrays.sort(array);
	int n=array[array.length-1]-array[0];
	int b=array.length;
	if(b==1)
	{
		n=array[0];
	}
	return n;
	}
}
public static void main(String[] args) throws ParseException {
	 
	 Scanner sc = new Scanner(System.in);
     int size=sc.nextInt();
     int arr[]=new int[size];
     for(int i=0;i<size;i++)
     {
  	   arr[i]=sc.nextInt();
     }
System.out.println(UserMainCode.display(arr));
}
}
43.Difference between two dates in days   (getDateDifference)
***********************************************************************************   2012-03-12/2012-03-14/2
import java.text.*;
import java.util.*;
public class Main {
public static int dateDifference(String s1,String s2) throws ParseException{
	SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
	Date d=sd.parse(s1);
	Calendar c=Calendar.getInstance();
	c.setTime(d);
	long d1=c.getTimeInMillis();
	d=sd.parse(s2);
	c.setTime(d);
	long d2=c.getTimeInMillis();
	int n=Math.abs((int) ((d1-d2)/(1000*3600*24)));
	return n;
	}
public static void main(String[] args) throws ParseException {
	String s1="2012-03-12";
	String s2="2012-03-14";
	System.out.println(dateDifference(s1,s2));
	}
}
44.Digit Comparison  (compareLastDigit)
**********************************************************************************************   59/29/TRUE
import java.util.*;
public class User {
public static void main(String[] args) {
	int a=89;
	int b=59;
System.out.println(characterCheck(a,b));
}
public static boolean characterCheck(int q,int w) {
boolean b=false;
int c=q%10;
int d=w%10;
if(c==d)
b=true;
else
	b=false;
return b;
}
}
45.Digits - II
**********************************************************
public class Main 
{
	public static void main(String[] args) 
	{
		int n=698;
		System.out.println(conversiontoaSingleDigit(n));
	}
	public static int conversiontoaSingleDigit(int n)
	{
		int sum = 0 ;
		int n1=n;
		while(n>10)
		{
			int a = 0 ; sum = 0;
			while(n!=0)
			{
				a = n%10;
				sum+=a;
				n=n/10;
			}
			n=sum;
		}
		return sum;
	}
}
46.Digits   (countSeven)
***********************************************************************************   717/2
public class UserMainCode
{
	public static int display(int n)
	{
		int num=0,count=0;
		while(n!=0)
		{
			num=n%10;
			if(num==7)
			{
				count++;
			}
			n=n/10;
		}
		return count;
	}
}
47.Discount Rate Calculation 
**************************
import java.util.HashMap;
import java.util.Iterator;
 
import java.util.TreeMap;
 
import java.util.Scanner;
 
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<String,String>hm=new HashMap<String,String>();
HashMap<String,Integer>hm1=new HashMap<String,Integer>();
for(int i=0;i<s;i++)
{
String id=sc.nextLine();
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));
 
}
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
tm=Usermaincode.display(hm,hm1);
Iterator<String> it=tm.keySet().iterator();
while(it.hasNext())
{
String n=it.next();
int fac=tm.get(n);
System.out.println(n+":"+fac);
}
}
}
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeMap;
public class Usermaincode
{
public static TreeMap<String,Integer> display (HashMap<String,String>hm,HashMap<String,Integer>hm1)
{
int year=0,amount=0;
double dis=0;
String now="01/01/2015";
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
Iterator<String> it=hm.keySet().iterator();
while(it.hasNext())
{
String id=it.next();
String dor=hm.get(id);
amount=hm1.get(id);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
try
{
Date d=sdf.parse(dor);
Date d1=sdf1.parse(now);
sdf.setLenient(false);
int y=d.getYear();
int y1=d1.getYear();
int m=d.getMonth();
int m1=d1.getMonth();
int day=d.getDay();
int day1=d1.getDay();
year=y1-y;
if(m>m1)
year--;
else if(m==m1)
{if(day<day1)
year--;
}
if(year>=5 && amount>=20000)
dis=0.2*amount;
else if(year<5 && amount>=20000)
dis=0.1*amount;
else if(year>=5 && amount<20000)
dis=0.15*amount;
else 
dis=0.05*amount;
tm.put(id,(int)dis);
}
catch(Exception e)
{
e.printStackTrace();
}
}
return tm;
}
}
48.DOB - Validation(ValidateDOB)
*****************************
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode {
public static void main(String[] args)
{
String str=new String();
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(str);
System.out.println("TRUE");
}
catch(Exception e)
{
System.out.println("FALSE");
}
}
}
49.Duplicate Characters
*********************************************
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
String s1="hi this is sample test";
getvalues(s1);
}
public static void getvalues(String s1) {
char a[]=s1.toCharArray();
StringBuffer sb=new StringBuffer();
LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
for(int i=0;i<a.length;i++)
{
hs.add(a[i]);
}
Iterator<Character>itr=hs.iterator();
while(itr.hasNext())
{
char o=itr.next();
if(o!=' ');
{
sb.append(o);
}
}
System.out.println(sb);
}}
50.Duplicates    (getDistinctSum)
*********************************************************************************   1/2/1/2
import java.util.*;
public class User {
public static void main(String[] args) {
	int a=1;
	int b=1;
	int c=1;
System.out.println(characterCheck(a,b,c));
}
public static int characterCheck(int q,int w,int e) {
	int s=0;
if(q!=w&&q!=e)
{
	s=q+w+e;
}
else if(q==w&&q==e)
{
	s=0;
}
else if(q==w&&q!=e)
{
	s=e;
}
else if(q!=w&&q==e)
{
	s=w;
}
return s;
}
}
51.Elements in ArrayList(arrayListSubtractor)
*********************************************
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int n,m;
		Scanner sin = new Scanner(System.in);
		n = sin.nextInt();
		ArrayList<Integer> a1 = new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			int k = sin.nextInt();
			a1.add(k);
		}
		m = sin.nextInt();
		ArrayList<Integer> a2 = new ArrayList<Integer>(m);
		for(int i=0;i<m;i++)
		{
			int k = sin.nextInt();
			a2.add(k);
		}
		int[] result = UserMainCode.arrayListSubtractor(a1,a2);
		Arrays.sort(result);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
}
}
import java.util.*;
public class UserMainCode
{
	public static int[] arrayListSubtractor(ArrayList<Integer> arrlist1,ArrayList<Integer> arrlist2)
	{
		int count=0,key;
		int max = arrlist1.size();
		if(arrlist1.size() < arrlist2.size())
			max = arrlist2.size();
		ArrayList<Integer> temp = new ArrayList<Integer>(max);
		for(int i=0;i<arrlist1.size();i++)
		{
			key = (int)arrlist1.get(i);
			if(arrlist2.indexOf(key) == -1)
			{
				++count;
				temp.add(key);
			}
		}
		for(int i=0;i<arrlist2.size();i++)
		{
			key = (int)arrlist2.get(i);
			if(arrlist1.indexOf(key) == -1)
			{
				if(!temp.contains(key))
				{
					++count;
					temp.add(key);
				}
			}
		}
		int[] result = new int[count];
		for(int i=0;i<count;i++)
			result[i] = (int)temp.get(i);
		return result;
		
	}
}
52.E-Mail Validation  (ValidateEmail)
*******************************
import java.util.*;
public class Main {
public static void main(String[] args) {
      String ip="academy@xyz.com";
      boolean b=User.emailIdValidation(ip);
      if(b==true)
            System.out.println("valid mail Id");
      else
            System.out.println("not a valid Id");
}}
 
import java.util.StringTokenizer;
 
 
public class User{
      public static boolean emailIdValidation(String ip) {
            int i=0;
            boolean b=false;
            StringTokenizer t=new StringTokenizer(ip,"@");
                  String s1=t.nextToken();
                  String s2=t.nextToken();
            StringTokenizer t1=new StringTokenizer(s2,".");
                  String s3=t1.nextToken();
                  String s4=t1.nextToken();
            if(ip.contains("@") && ip.contains("."))
                  i++;
            
            if(i==1)
                  if(s3.length()==5)
                        if(s1.length()>=3)
                              if(s4.equals("com"))
                                    b=true;
            return b;
      }
      }
53.Employee Bonus
*********************************************************************
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
public class Main
{
public static void main(String args[]) 
{
HashMap<Integer,String>hm=new HashMap<Integer,String>();
HashMap<Integer,Integer>hm1=new HashMap<Integer,Integer>();
TreeMap<Integer,Integer>hm2=new TreeMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
for(int i=0;i<s;i++)
{
int id=Integer.parseInt(sc.nextLine());
String ss=sc.nextLine();
int salary=Integer.parseInt(sc.nextLine());
hm.put(id,ss);
 
 
hm1.put(id,salary);
}
hm2=User.display(hm,hm1);
Iterator<Integer> it=hm2.keySet().iterator();
for(int i=0;i<s;i++)
{
int id=it.next();
int bonus=hm2.get(id);
System.out.println(id);
System.out.println(bonus);
}
}}
 
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
public class User
{ public static TreeMap<Integer,Integer> display(HashMap<Integer,String>hm,HashMap<Integer,Integer>hm1)
{
TreeMap<Integer,Integer>hm2=new TreeMap<Integer,Integer>();
Iterator<Integer> it=hm.keySet().iterator();
 
while(it.hasNext())
{
int y=it.next();
String dob=hm.get(y);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
sdf.setLenient(false);
String now="01-09-2014"; 
try
{ Date d=sdf.parse(now);
Date d1=sdf.parse(dob);
int y1=d.getYear();
int y2=d1.getYear();
int m1=d.getMonth();
int m2=d1.getMonth();
int day1=d.getDay();
int day2= d1.getDay();
int age=y1-y2;
if(m1<m2)
age--;
else if(m1==m2 && day1<day2)
age--;
if(age>=25 && age<=30)
{float bonus=(float)0.2*hm1.get(y)+hm1.get(y);
hm2.put(y,(int)bonus );
}
else if(age>30 && age<=60)
{ float bonus=(float) (0.3*hm1.get(y))+hm1.get(y);
hm2.put(y,(int)bonus );
}
else if(age<25 || age>60)
hm2.put(y,-200);
else 
hm2.put(y,-100); 
}
catch(Exception e)
{e.printStackTrace();
}}
return hm2; 
}
54.Employees & Designations(obtainDesignation)
********************************************
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int k1=Integer.parseInt(sc.nextLine());
LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
for(int i=0;i<k1;i++)
{
String k=sc.nextLine();
String s=sc.nextLine();
hm.put(k,s);
}
String n=sc.nextLine();
LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
hm1=UserMainCode.dis(hm,n);
Iterator<String> it=hm1.keySet().iterator();
while(it.hasNext())
{
String s2=it.next();
System.out.println(s2);
}
}
}
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class UserMainCode
{
public static LinkedHashMap<String,String> dis(LinkedHashMap<String,String> h1,String n) 
{
 
int k=0;
LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
Iterator<String>it=h1.keySet().iterator();
while(it.hasNext())
{
String s2=it.next();
String s3=h1.get(s2);
if(s3.equals(n))
hm1.put(s2,s3);
}
return hm1;
}}
55.Even and Odd Index Sum
*******************************************
import java.util.Scanner;
public class PO {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
getvalues(n);
}
public static void getvalues(int n) {
int rem = 0, i = 0;
int a[] = new int[10];
while (n > 0) {
rem = n % 10;
a[i] = rem;
n = n / 10;
i++;
}
int sume = 0, sumo = 0;
for (int j = i - 1; j >= 0; j -= 2) {
sumo = sumo + a[j];
}
for (int j = i - 2; j >= 0; j -= 2) {
sume = sume + a[j];
}
if (sume == sumo) {
System.out.println(1);
} else
System.out.println(-1);
}
56.Even Sum & Duplicate Elements(sumElements)
********************************************
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Main
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
System.out.println(UserMainCode.display(a));
}}
import java.util.Iterator;
import java.util.LinkedHashSet;
public class UserMainCode {
	public static int display(int a[])
	{
		LinkedHashSet<Integer>h1=new LinkedHashSet<Integer>();
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			h1.add(a[i]);
		}
		Iterator<Integer> it=h1.iterator();
		while(it.hasNext())
		{
			int k=it.next();
			if(k%2==0)
			{
				s=s+k;
			}
		}
		if(s>0)
			return s;
		else
			return -1;
		}}
57.Experience Calculator  (calculateExperience)
************************************************************11/01/2010/01/09/2014/4
import java.util.Date;
import java.text.SimpleDateFormat;
public class Usermaincode
{public static boolean display(String s,String s1,int n)
{
boolean b=false;
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
try{
Date d=sdf.parse(s);
Date d1=sdf.parse(s1);
int y=d.getYear();
int y1=d1.getYear();
int m=d.getMonth();
int m1=d1.getMonth();
int day=d.getDay();
int day1=d1.getDay();
int age=y1-y;
if(m>m1)
age--;
else if(m==m1)
{if(day<day1)
age--;
}
if(age==n)
b=true;
else
b=false;
}
catch(Exception e)
{e.printStackTrace();
}
return b;
}
}
58.Experience Validator(validateExp)
************************************
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
      String s=sc.nextLine();
      String s1=sc.nextLine();
      
     System.out.print(UserMainCode.getvalues(s,s1));
    }
}
import java.util.Calendar;
import java.util.Date;
public class UserMainCode {
	public static boolean getvalues(String s,String s1)
	{
		int y1=Integer.parseInt(s);
		Date d=new Date();
		Calendar c=Calendar.getInstance();
		int y2=c.get(Calendar.YEAR);
		
		int y=Math.abs(y1-y2);
		int e=Integer.parseInt(s1);
		if(y>=e)
			return true;
		else
			return false;
		
		}}
59.Fetching Middle Characters from String  (getMiddleChars)
***********************************************************        this/hi
public class UserMainCode {
    public static String getMiddleChars(String str)
    {
    	StringBuffer sb=new StringBuffer();
    	 if(str.length()%2==0)
    	 {
    	 sb.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
    	 }
    	 return sb.toString();
    	 }
    }
60.Fibonacci Sum
**********************************************
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static int sumOfFibonacci(int n){
int a=0,b=1,c=0,d=1;
for(int i=3;i<=n;i++){
c=a+b;
a=b; b=c;
d=d+c;
}
return d;
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(sumOfFibonacci(n));
}
}
61.File Extension   (fileIdentifier)
************************************************************  sun.gif
import java.util.*;
public class Main {
	public static String extensionString(String s1){
		StringTokenizer t=new StringTokenizer(s1,".");
		t.nextToken();
		String s2=t.nextToken();
		return s2;
	}
	public static void main(String[] args) {
		String s1="sun.gif";
		System.out.println(extensionString(s1));
	}
}
62.Find common characters and unique characters in string  (commonChars)
********************************************************************************   a black cow/battle ship/2
import java.util.Arrays;
import java.util.StringTokenizer;
public class PO
{
public static int display(String s,String s1)
{
int c=0,m=0;String t=null; 
char a[]=s.toCharArray();
char b[]=s1.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
s=new String(a);
s1=new String(b);
StringTokenizer st=new StringTokenizer(s);
StringTokenizer st1=new StringTokenizer(s1);
s=st.nextToken();
s1=st1.nextToken();
if(s.length()>s1.length())
{t=s1;
s1=s;
s=t;
}
for(int i=0;i<s.length();i++)
{
for(int j=0;j<s1.length();j++)
{
if(s.charAt(i)==s1.charAt(j))
{
if((s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))&&(s1.indexOf(s1.charAt(j))==s1.lastIndexOf(s1.charAt(j))))
{
c++;
}
}}}
return c;
 
}
}
63.Find Digits
****************************************************
import java.util.*;
public class Main {
public static void main(String[] args) {
double d=845.69;
System.out.println(noOfDigits(d));
}
public static String noOfDigits(double d) {
int n1=0,n2=0;
String s=String.valueOf(d);
StringTokenizer t=new StringTokenizer(s,".");
String s1=t.nextToken();
String s2=t.nextToken();
n1=s1.length();
n2=s2.length();
if(s1.charAt(0)=='0')
n1=s1.length()-1;
if(n2!=1)
if(s2.charAt(s2.length()-1)=='0')
n2=s2.length()-1;
String s3=String.valueOf(n1)+":"+String.valueOf(n2);
return s3;
}
}
64.Find Distance   (findDistance)
*****************************************************************************    3/4/5/2
public class User {
	
	public static int display(int a,int b,int c,int d)   {
		
		
		long q=(int)Math.round(Math.sqrt(((a-c)*(a-c))+((b-d)*(b-d))));
		return (int) q;
		
	}
}
65.Find the difference between Dates in months  (getMonthDifference)
*******************************************************************************      2012-03-01/2012-04-12/1
import java.text.*;
import java.util.*;
public class Main {
public static void main(String[] args) throws ParseException {
	String s1="2012-03-01";
	String s2="2012-03-16";
	System.out.println(monthsBetweenDates(s1,s2));
}
public static int monthsBetweenDates(String s1, String s2) throws ParseException {
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=sdf.parse(s1);
		Date d2=sdf.parse(s2);
	Calendar cal=Calendar.getInstance();
	
	cal.setTime(d1);
		int months1=cal.get(Calendar.MONTH);
		int year1=cal.get(Calendar.YEAR);
	cal.setTime(d2);
		int months2=cal.get(Calendar.MONTH);
		int year2=cal.get(Calendar.YEAR);
	int n=((year2-year1)*12)+(months2-months1);
	return n;
}
}
66.Find the element position in a reversed string array  (getElementPosition)
**********************************************************************************    4/red/green/blue
import java.util.ArrayList;
import java.util.Collections;
public class Main {
/**
* @param args
public static void main(String[] args) {
String []a={"grape","mango","apple"};
String b="apple";
getvalues(a,b);
}
public static void getvalues(String[] a, String b) {
ArrayList<String>al=new ArrayList<String>();
for(int i=0;i<a.length;i++)
{
al.add(a[i]);
}
System.out.println(al);
Collections.sort(al);
System.out.println(al);
Collections.reverse(al);
System.out.println(al);
for(int i=0;i<al.size();i++)
{
if(b.equals(al.get(i)))
{
System.out.println(i+1);
}
}
}
}
67.Finding the day of birth   (calculateBornDay)
***************************************************************************     29-07-2013/MONDAY
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws ParseException {
		 
		Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    System.out.println(UserMainCode.calculateBornDay(s1));
		}
		}
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class UserMainCode {
	public static String calculateBornDay(String s1) throws ParseException 
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
		Date d=sdf.parse(s1);
		String s=sdf1.format(d);
		return s.toUpperCase();
	}
}
68.Flush Characters  (getSpecialChar)
***********************************************************************************    cogniz$#45Ant
public class User {
/**
* @param args
public static void main(String[] args) {
String s1="cogniz$#45Ant";
String s2=getvalues(s1);
System.out.println(s2);
}
public static String getvalues(String s1) {
StringBuffer sb= new StringBuffer();
for(int i=0;i<s1.length();i++)
{
char a=s1.charAt(i);
if(!Character.isAlphabetic(a))
sb.append(a);
}
return sb.toString();
}
69.Forming New Word from a String  (formNewWord)
**************************************************************        california/3/calnia
public class Main 
{
	public static void main(String[] args) 
	{
		String s1="this";
		int n1=1;
		System.out.println(subStringOfgivenString(s1,n1));
	}
	public static String subStringOfgivenString(String s1, int n1) 
	{
		int n = 2*n1;
		String s = new String();
		if(s1.length()>n)
		{
			s = s1.substring(0,n1) + s1.substring(s1.length()-n1, s1.length());
			return s;
		}
		else
			return null;
70.Generate the series (addSeries)
********************************************************************        9/-3
import java.util.*;
public class Main {
	public static int consecutiveSumSubofOddNos(int n){
		List<Integer> l1=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
			if(i%2!=0)
				l1.add(i);
		int n1=l1.get(0);
		for(int i=1;i<l1.size();i++)
			if(i%2!=0)
				n1=n1+l1.get(i);
			else
				n1=n1-l1.get(i);
		return n1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(consecutiveSumSubofOddNos(n));
	}}
71.Grade Calculator I (calculateGrade)
**********************************
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main
{
public static void main(String[]arg)
{
LinkedHashMap<String,Double>hm=new LinkedHashMap<String,Double>();
LinkedHashMap<String,String>hm1=new LinkedHashMap<String,String>();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
String s=sc.next();
double d=sc.nextDouble();
hm.put(s,d);
}
LinkedHashMap<String,String>hm2=UserMainCode.dis(hm);
for(Map.Entry<String,String>entry:hm2.entrySet())
{
System.out.println(entry.getKey());
System.out.println(entry.getValue());
}}}
import java.util.LinkedHashMap;
import java.util.Map;
class UserMainCode
{
public static LinkedHashMap<String,String>dis(LinkedHashMap<String,Double>h1)
{
	LinkedHashMap<String,String>h2=new LinkedHashMap<String,String>();
for(Map.Entry m:h1.entrySet())
{
double d=(Double)m.getValue();
if(d>60)
{
String s=(String)m.getKey();
h2.put(s,"pass");
}
else
{
String s=(String)m.getKey();
h2.put(s,"fail");
}
}
return h2;
}
}
72.Grade Calculator
*****************
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeMap;
 
import java.util.Scanner;
 
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
for(int i=0;i<s;i++)
{
hm.put(sc.nextInt(),sc.nextInt());
}
TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
tm=Usermaincode.display(hm);
Iterator<Integer> it=tm.keySet().iterator();
for(int i=0;i<s;i++)
{
int n=it.next();
String fac=tm.get(n);
System.out.println(n);
System.out.println(fac);
}
}
}
import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeMap;
public class Usermaincode
{
public static TreeMap<Integer,String> display (HashMap<Integer,Integer>hm)
{
TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
Iterator<Integer> it=hm.keySet().iterator();
while(it.hasNext())
{
int id=it.next();
int mark=hm.get(id);
if(mark>=80)
tm.put(id,"GOLD");
else if(mark<80 && mark>=60)
tm.put(id,"SILVER");
else if(mark<60 && mark>=45)
tm.put(id,"BRONZE");
else
tm.put(id,"FAIL");
}
return tm;
}}
73.ID Validation  (validateIDLocations)
*******************************************************************    
import java.util.*;
public class Main {
public static void main(String[] args) {
String s1="CTS-hyd-1234";
String s2="hyderabad";
boolean b=formattingString(s1,s2);
if(b==true)
System.out.println("String format:CTS-LLL-XXXX");
else
System.out.println("not in required format");
}
public static boolean formattingString(String s1, String s2) {
String s3=s2.substring(0, 3);
boolean b=false;
StringTokenizer t=new StringTokenizer(s1,"-");
String s4=t.nextToken();
String s5=t.nextToken();
String s6=t.nextToken();
if(s4.equals("CTS") && s5.equals(s3) && s6.matches("[0-9]{4}"))
b=true;
else{
b=false;}
return b;
}
}
74.Initial Format  (nameFormatter)
****************************************************************************************   Jessica Miller
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
String s1="vishal jadiya";
getvalues(s1);
}
public static void getvalues(String s1) {
StringBuffer sb=new StringBuffer();
StringTokenizer st=new StringTokenizer(s1," ");
String s2=st.nextToken();
String s3=st.nextToken();
sb.append(s3).append(",");
sb.append(s2.substring(0,1).toUpperCase());
System.out.println(sb);
}
}
75.Integer Factorial(getFactorial)
**********************************
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
 
import java.util.Scanner;
 
public class kapes3 {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
int []a=new int[s];
for(int i=0;i<s;i++)
{
a[i]=sc.nextInt();
}
LinkedHashMap<Integer,Integer>hm2=new LinkedHashMap<Integer,Integer>();
hm2=kapes4.display(a);
Iterator<Integer> it=hm2.keySet().iterator();
for(int i=0;i<s;i++)
{
int n=it.next();
int fac=hm2.get(n);
System.out.println(n+":"+fac);
}
}
}
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
public class kapes4
{public static LinkedHashMap<Integer,Integer> display(int[] a)
{
 
LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<Integer,Integer>();
for(int i=0;i<a.length;i++)
{
int u=1;
for(int j=1;j<=a[i];j++)
{u=u*j;}
hm.put(a[i],u); 
}
return hm;
}}
76.Interest Calculation
*********************
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
 
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<String,String>hm=new HashMap<String,String>();
HashMap<String,Integer>hm1=new HashMap<String,Integer>();
for(int i=0;i<s;i++)
{
String id=sc.nextLine();
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));
}
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
tm=Usermaincode.display(hm,hm1);
Iterator<String> it=tm.keySet().iterator();
while(it.hasNext())
{
String n=it.next();
int fac=tm.get(n);
System.out.println(n+":"+fac);
}
}
}
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
import java.util.TreeMap;
public class Usermaincode
{
public static TreeMap<String,Integer> display (HashMap<String,String>hm,HashMap<String,Integer>hm1)
{
int year=0,amount=0;
double dis=0;
String now="01/01/2015";
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
Iterator<String> it=hm.keySet().iterator();
while(it.hasNext())
{
String id=it.next();
String dor=hm.get(id);
amount=hm1.get(id);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
try
{
Date d=sdf.parse(dor);
Date d1=sdf1.parse(now);
sdf.setLenient(false);
int y=d.getYear();
int y1=d1.getYear();
int m=d.getMonth();
int m1=d1.getMonth();
int day=d.getDay();
int day1=d1.getDay();
year=y1-y;
if(m>m1)
year--;
else if(m==m1)
{if(day<day1)
year--;
}
if(year>=60)
dis=0.1*amount+amount;
else if(year<60 && year>=30 )
dis=0.07*amount+amount;
else 
dis=0.04*amount+amount;
tm.put(id,(int)dis);
}
catch(Exception e)
{
e.printStackTrace();
}
}
return tm;
}
}
77.IP Validator  (ipValidator)
***********************************************************************************    132.145.184.210
import java.util.*;
public class Main {
	public static void main(String[] args) {
		String ipAddress="10.230.110.160";
	    boolean b=validateIpAddress(ipAddress);
	    if(b==true)
	    	System.out.println("valid ipAddress");
	    else
	    	System.out.println("not a valid ipAddress");
	}
	public static boolean validateIpAddress(String ipAddress) {
		boolean b1=false;
		StringTokenizer t=new StringTokenizer(ipAddress,".");
		int a=Integer.parseInt(t.nextToken());
		int b=Integer.parseInt(t.nextToken());
		int c=Integer.parseInt(t.nextToken());
		int d=Integer.parseInt(t.nextToken());
		if((a>=0 && a<=255)&&(b>=0 && b<=255)&&(c>=0 && c<=255)&&(d>=0 && d<=255))
			b1=true;
		return b1;
	}
}
78.ISBN Validation
***********************************
public class Main {
public static void main(String[] args) {
String ip="020110311";
boolean b=ISBNnumber(ip);
if(b==true)
System.out.println("valid ISBN number");
else
System.out.println("check ur data");
}
public static boolean ISBNnumber(String ip) {
boolean b=false;
int sum=0;
for(int i=0,j=ip.length();i<ip.length();i++,j--){
String s=String.valueOf(ip.charAt(i));
int n=Integer.parseInt(s);
sum+=(n*j); }
//System.out.println(sum);
if(sum%11==0)
b=true;
return b;
}
}
79.Kaprekar Number (getKaprekarNumber)
**********************************
import java.util.Scanner;
public class useer{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(useerm.display(n));
}}
public class useerm{
public static int display(int a)
{
 int count=0,j=0;
 int a1=a;
 while(a1!=0)
 {
	 count=count+1;
	 a1=a1/10;
 }
 int square=a*a;
 String s=Integer.toString(square);
 String s1=s.substring(0,count);
 String s2=s.substring(count);
 int x=Integer.parseInt(s1);
 int y=Integer.parseInt(s2);
 int result =x+y;
 if(result==a){
	 j=1;
	 
 }
 else
 {
	 j=2;
 }
 return j;
}}
80.Largest Chunk
***************************************
import java.util.*;
public class Main {
public static void main(String[] args) {
String s1="this is soooo good";
System.out.println(maxChunk(s1));
}
public static int maxChunk(String s1) {
int max=0;
StringTokenizer t=new StringTokenizer(s1," ");
while(t.hasMoreTokens()){
String s2=t.nextToken();
int n=0;
for(int i=0;i<s2.length()-1;i++)
if(s2.charAt(i)==s2.charAt(i+1))
n++;
if(n>max)
max=n;
}
return (max+1);
}
}
81.Largest Difference   (checkDifference)
********************************************************************      7/2/4/5/1/9/3/8    
public class Main {
	public static int getDiffArray(int[] n1){
		int n2,n3=0,n4=0,i;
		for(i=0;i<n1.length-1;i++){
			n2=Math.abs(n1[i]-n1[i+1]);
			if(n2>n3){
				n3=n2;
				n4=i+1; }}
		return n4;
	}
	public static void main(String[] args) {
		int[] n1={2,4,5,1,9,3,8};
		System.out.println(getDiffArray(n1));
	}
}
82.Largest Element (checkLargestAmongCorner)
************************************************************   5/2/3/8/4/5
import java.util.Arrays;
public class kape1 {
public static int display(int []a)
{
	int max=0;
	int x,y,z;
	x=a[0];
	y=a[a.length/2];
	z=a[a.length-1];
	if(x>y&&x>z)
		max=x;
	else if(y>x&&y>z)
		max=y;
	else if(z>x&&z>y)
		max=z;
	return max;
}}
83.Largest Key in HashMap
*****************************************
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
public class Main {
/**
* @param args
public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<Integer, String>hm=new HashMap<Integer, String>();
hm.put(12,"amron");
hm.put(9, "excide");
hm.put(7,"SF");
getvalues(hm);
}
public static void getvalues(HashMap<Integer, String> hm) {
int max=0;
String s2=new String();
Iterator<Integer>itr=hm.keySet().iterator();
while(itr.hasNext())
{
int a=itr.next();
if(a>max)
{
max=a;
String s3=hm.get(a);
s2=s3;
}
}
System.out.println(s2);
}
}
84.Largest Span(getLargestSpan)
****************************
import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int []a=new int[n];
 for(int i=0;i<n;i++)
 {
	 a[i]=sc.nextInt();
 }
 System.out.print(UserMainCode.display(a,n));
}}
public class UserMainCode {
		public static int display(int[] x,int n)
		{
			int gap=0,max=0;
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(x[i]==x[j])
					{
						gap=j;
					}
				}
				if(gap-i>max)
					max=gap-i;
				
			}
			return max+1;
		}
	}
85.Largest Span  (getMaxSpan)
*******************************
public class Main {
public static void main(String[] args) {
int[]a={1,2,1,1,3};
System.out.println(maxSpan(a));
}
public static int maxSpan(int[] a) {
String s2 = null;
int n=0;
StringBuffer sb=new StringBuffer();
for(int i=0;i<a.length;i++)
sb.append(String.valueOf(a[i]));
String s1=sb.toString();
for(int i=0;i<s1.length();i++)
for(int j=i+1;j<s1.length();j++)
if(s1.charAt(i)==s1.charAt(j))
s2=String.valueOf(s1.charAt(j));
int n1=s1.indexOf(s2);
int n2=s1.lastIndexOf(s2);
for(int i=n1+1;i<n2;i++)
n++;
return (n+2);
}
}
86.Last letters(getLastLetter)
******************************
import java.util.Scanner;
public class main{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	String number=sc.nextLine();
	System.out.print(Usermaincode.display(number));
}}
import java.util.StringTokenizer;
public class Usermaincode {
    public static String display(String input){        
     StringTokenizer st=new StringTokenizer(input);
     String str=st.nextToken();
     String solution=Character.toUpperCase(str.charAt(str.length()-1))+"";
     while(st.hasMoreTokens()){
    	str=st.nextToken();
    	solution+="$"+Character.toUpperCase(str.charAt(str.length()-1));
     }
     return solution;
    }
}
87.Leap Year
*********************************
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class UserMainCode {
	
	public static void main(String[] args) throws IOException, ParseException  {
		
		String s1="23/02/2012";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		GregorianCalendar g=new GregorianCalendar();
		StringTokenizer t=new StringTokenizer(s1,"/");
		String s2=t.nextToken();
		String s3=t.nextToken();
		String s4=t.nextToken();
		int n1=Integer.parseInt(s4);
		Date d1=sdf.parse(s1);
		boolean b=g.isLeapYear(n1);
		System.out.println(b);
		}
}
88.Length of same word
***************************************
import java.util.*;
public class Main {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String s1="this is cognizant academy";
		List<String> l=new ArrayList<String>();
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens())
		{
			String s2=t.nextToken();
			l.add(s2);
		}
		String s3=l.get(0);
		String s4=l.get(l.size()-1);
		if(s3.equals(s4))
		{
			int n=s3.length();
			System.out.println(n);
		}
		else
		{
			int n1=s3.length();
			int n2=s4.length();
			System.out.println(n1+n2);
		}
	}
}
89.Length of the Largest Chunk   (largestChunk)
******************************************************************************************   You are toooo good/4
import java.util.*;
public class Main {
public static void main(String[] args) {
String s1="You are toooo good";
System.out.println(maxChunk(s1));
}
public static int maxChunk(String s1) {
int max=0;
StringTokenizer t=new StringTokenizer(s1," ");
while(t.hasMoreTokens()){
String s2=t.nextToken();
int n=0;
for(int i=0;i<s2.length()-1;i++)
if(s2.charAt(i)==s2.charAt(i+1))
n++;
if(n>max)
max=n;
}
return (max+1);
}
}
90.Longest Word
*****************************
import java.util.*;
public class Main {
public static void main(String[] args) {
String s1="ABC DEF";
System.out.println(lengthiestString(s1));
}
public static String lengthiestString(String s1) {
int max=0;
String s2=new String();
StringTokenizer t=new StringTokenizer(s1," ");
loop:
while(t.hasMoreTokens()){
String s3=t.nextToken();
int n=s3.length();
if(n>max){
max=n;
s2=s3;}
if(n==max)
for(int i=0;i<s3.length();i++){
char c1=s2.charAt(i);
char c2=s3.charAt(i);
if(c1!=c2){
if(c2<c1)
s2=s3;
continue loop;} }
}
return s2;
}}
91.Managers & Hashmaps
*****************
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<Integer,String>hm=new HashMap<Integer,String>();
HashMap<Integer,Integer>hm1=new HashMap<Integer,Integer>();
for(int i=0;i<s;i++)
{
int id=Integer.parseInt(sc.nextLine());
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));
}
HashMap<Integer,Integer>hm2=new HashMap<Integer,Integer>();
hm2=Usermaincode.display(hm,hm1);
Iterator<Integer> it=hm2.keySet().iterator();
while(it.hasNext())
{
int n=it.next();
int fac=hm2.get(n);
System.out.println(n);
System.out.println(fac);
}}}
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashMap;
public class Usermaincode
{public static HashMap<Integer,Integer> display(HashMap<Integer,String>hm,HashMap<Integer,Integer>hm1)
{
HashMap<Integer,Integer>hm3=new HashMap<Integer,Integer>();
Iterator<Integer> it=hm.keySet().iterator();
while(it.hasNext())
{
int id=it.next();
String name=hm.get(id);
if(name.equals("manager"))
{int salary=hm1.get(id)+5000; 
hm3.put(id,salary);
}}
return hm3;
}
}
92.Mastering Hashmap
******************
import java.util.HashMap;
import java.util.Scanner;
public class kapes3
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
for(int i=0;i<n;i++)
{
	h1.put(sc.nextInt(),sc.nextInt());
}
System.out.println(UserMainCode.display(h1));
}}
import java.util.HashMap;
import java.util.Iterator;
public class UserMainCode {
	public static int display(HashMap<Integer,Integer>h1)
	{
		int av=0,c=0,s=0;
		Iterator<Integer> it=h1.keySet().iterator();
		while(it.hasNext())
		{
			int a=it.next();
			if(a%2!=0)
			{
				int b=h1.get(a);
				s=s+b;
				c++;
			}
		}
		av=s/c;
		return av;
		}}
93.Math Calculator   (calculator) 
************************************************************                    23/2/*              
public class Main {
public class Main
{public static void main(String[] args) throws ParseException {
	
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	char c = sc.next().charAt(0);
	System.out.println(UserMainCode.display(a,b,c));
}
}
public static int display(int a,int b,char c)
{
	int a1=0;
	if(c=='*')
	{
	a1=a*b;
	}
	
	else if(c=='+')
	{
		a1=a+b;
		}
	else if(c=='-')
	{
		a1=a-b;
	}
	else if(c=='/')
	{
		a1=a/b;
	}
	else if(c=='%')
	{
		a1=a%b;
	}
	
	return a1;
}}
94.Max Admissions
***********************************
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
	
	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> inpList = new ArrayList<Integer>();
		for(int i=0;i<n*2;i++) {
			inpList.add(Integer.parseInt(br.readLine()));
		}
		System.out.println(UserMainCode.getYear(inpList));		
	}
}
import java.util.ArrayList;
public class UserMainCode {
	
	public static Integer getYear(ArrayList<Integer> inpList) {
		int i,maxyear=0,maxcount=0;
		for(i=0;i<inpList.size();i++)
		{
			int num=inpList.get(i);
			if(maxcount<num)
				maxcount=num;
		}
		maxyear=inpList.get((inpList.indexOf(maxcount))-1);
		return maxyear;
	}		
}
95.Max Scorer
**************************************
import java.util.StringTokenizer;
public class Main {
	public static String retrieveMaxScoredStudent(String[] s1){
		int max=0;
		String s4=null;
		for(int i=0;i<s1.length;i++){
			String s2=s1[i];	
			StringTokenizer t=new StringTokenizer(s2,"#");
			String s3=t.nextToken();
			int n1=Integer.parseInt(t.nextToken());
			int n2=Integer.parseInt(t.nextToken());
			int n3=Integer.parseInt(t.nextToken());
			int n=n1+n2+n3;
		
		if(n>max)
		{
			max=n;
			s4=s3;
		}
		}
		return s4;
	}
	public static void main(String[] args) {
		String[] s1={"arun#12#12#12","deepak#13#12#12","puppy#12#11#12"};
		System.out.println(retrieveMaxScoredStudent(s1));
	}
}
96.Max Substring
**********************************
import java.util.*;
public class PO {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		int max=0;
		String s3=null;
	StringTokenizer st=new StringTokenizer(s,"-");
	while( st.hasMoreTokens())
	{
		String s2=st.nextToken();
		int n=s2.length();
		if(n>max)
		{
			max=n;
			s3=s2;
		}
	}System.out.print(s3);
	}}
97.Max Vowels
***********************************************
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
String s1 = "Appreciation is the best way to motivate aaaaeeeiii";
getvalues(s1);
}
public static void getvalues(String s1) {
int i = 0;
StringTokenizer st = new StringTokenizer(s1," ");
int len = 0;
int count = 0;
int count2 = 0;
String s6 = null;
while (st.hasMoreTokens()) {
String s5 = st.nextToken();
len = s5.length();
count=0;
for (i = 0; i < len; i++) {
if (s5.charAt(i) == 'a' || s5.charAt(i) == 'e'|| s5.charAt(i) == 'i' || s5.charAt(i) == 'o'|| s5.charAt(i) == 'u'
||s5.charAt(i) == 'A' ||s5.charAt(i) == 'E' ||s5.charAt(i) == 'I' ||s5.charAt(i) == 'O' ||s5.charAt(i) == 'U')
count++;
}
if (count > count2) {
count2 = count;
s6 = s5;
}
}
System.out.println(s6);
}
}
98.Maximum Difference
****************************************
public class Main {
	public static int getDiffArray(int[] n1){
		int n2,n3=0,n4=0,i;
		for(i=0;i<n1.length-1;i++){
			n2=Math.abs(n1[i]-n1[i+1]);
			if(n2>n3){
				n3=n2;
				n4=i+1; }}
		return n4;
	}
	public static void main(String[] args) {
		int[] n1={4,8,6,1,9,4};
		System.out.println(getDiffArray(n1));
	}
}
99.Median Calculation(calculateMedian)
***********************************
import java.util.*;
 
public class Main
{
public static void main(String[] args)
{
int n,m;
Scanner sin = new Scanner(System.in);
n = sin.nextInt();
int[] a1 = new int[n];
for(int i=0;i<n;i++)
{
a1[i] = sin.nextInt();
}
System.out.println(""+UserMainCode.calculateMedian(a1));
}
}
import java.util.*;
 
public class UserMainCode
{
public static int calculateMedian(int[] a)
{
Arrays.sort(a);
int length = a.length;
int result=0,mid=0,midNext=0;
if((length%2) != 0)
{
mid = (length/2)+1;
result = a[mid];
}
else
{
mid = length/2;
midNext = mid+1;
float add = a[mid-1]+a[midNext-1];
float div = add/2;
result = Math.round(div); 
}
return result;
 
}
}
100.Middle of Array  (getMiddleElement)
*****************************  5/1/5/23/64/9
import java.util.Scanner;
 
public class kape {
 
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int []a=new int[s];
for(int i=0;i<s;i++)
{
a[i]=sc.nextInt();
}
System.out.println(kape1.display(a));
}
}
public class kape1
{public static int display(int[] a)
{
int y=a.length/2;
return a[y];
}
101.Month : Number of Days
*****************************************************************
import java.util.*;
public class MainDate{
     public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	int month=sc.nextInt();
	System.out.println(main13.display(year, month));
     }
}
import java.util.Calendar;
public class main13{
     public static int display(int year,int month)
     {
    	 Calendar cal=Calendar.getInstance();
    	 cal.set(Calendar.YEAR,year);
    	 cal.set(Calendar.MONTH,month);
    	 int DAY_OF_MONTH=cal.getActualMaximum(cal.DAY_OF_MONTH);
    	return DAY_OF_MONTH;
     }}
102.Month Name   (?getMonthName?)
*******************************************************************************************   01-06-82/JUNE
import java.text.ParseException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws ParseException {
		 
		Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    System.out.println(User.calculateBornDay(s1));
		}
		}
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class User {
	public static String calculateBornDay(String s1) throws ParseException 
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
		SimpleDateFormat sdf1=new SimpleDateFormat("MMMM");
		Date d=sdf.parse(s1);
		String s=sdf1.format(d);
		return s.toUpperCase();
	}
}
103.Name Shrinking  (getFormatedString)
****************************************************************************************  Sachin Ramesh
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
String s1="Sachin Ramesh Tendulkar";
getvalues(s1);
}
public static void getvalues(String s1) {
StringBuffer sb=new StringBuffer();
StringTokenizer st=new StringTokenizer(s1," ");
String s2=st.nextToken();
String s3=st.nextToken();
String s4=st.nextToken();
sb.append(s4).append(" ");
sb.append(s3.substring(0,1));
sb.append(".");
sb.append(s2.substring(0,1));
System.out.println(sb);
}
}
104.nCr  (calculateNcr)
**********************************************************************   4/3/4
public class Main {
public static void main(String[] args) {
int n=4;
int r=3;
getvalues(n,r);
}
public static void getvalues(int n, int r) {
int fact=1,fact1=1,fact2=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
//System.out.println(fact);
for(int i=1;i<=r;i++)
{
fact1=fact1*i;
}
//System.out.println(fact1);
for(int i=1;i<=(n-r);i++)
{
fact2=fact2*i;
}
//System.out.println(fact2);
int res=fact/(fact1*fact2);
System.out.println(res);
}
}
105.Negative String  (?negativeString?)
***********************************************************  This is just a misconception
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args) {
String s1="this is just a misconception";
getvalues(s1);
}
public static void getvalues(String s1) {
StringBuffer sb=new StringBuffer();
StringTokenizer st=new StringTokenizer(s1," ");
while(st.hasMoreTokens())
{
String s2=st.nextToken();
if(s2.equals("is"))
{
String s3=s2.replace("is", "is not");
sb.append(s3);
//sb.append(" ");
}
else
sb.append(s2);
sb.append(" ");
}
sb.delete(sb.length()-1, sb.length());
System.out.println(sb);
}
}
106.Next Year day
************************************************
import java.text.ParseException;
import java.util.Scanner;
public class Main
{public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    System.out.println(UserMainCode.getvalues(s1));
}
}
public class UserMainCode
{
	public static String getvalues(String s1) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		String s="";
		try {
		Date d1=sdf.parse(s1);
		Calendar cal=Calendar.getInstance();
		cal.setTime(d1);
		cal.add(Calendar.YEAR, 1);
		Date d2=cal.getTime();
		SimpleDateFormat sdf1=new SimpleDateFormat("EEEEE");
		 s=sdf1.format(d2);
		
		} 
		catch (ParseException e) 
		{ 
			e.printStackTrace();
		}
		return s;
	}
}
107.Number Validation  (validateNumber)
***************************************************************    123-456-7895
import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String pan=s.next();
	int b=panNumberValidation(pan);
	if(b==1)
		System.out.println("valid Pancard Number");
	else
		System.out.println("not a valid credential");
}
public static int panNumberValidation(String input) {
	int b=0;
	if(input.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
	{b=1;}
	else
		b=0;
	return b;
}
}
108.Occurance Count
**************************************
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException, ParseException  {
		// TODO Auto-generated method stub
		String s1="hello world hello";
		String s2="world";
		int c=0;
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens())
		{
			String s3=t.nextToken();
			if(s3.equals(s2))
				c++;
		}
         System.out.println(c);
	}
}
109.Odd Digit Sum  (oddDigitSum)
**************************************************************     3/cog2nizant1/al33k/d2t4H3r5
import java.util.Scanner;
  public class kape {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int s1=sc.nextInt();
	String[] s2 = new String[s1];
	for (int i = 0; i < s1; i++) {
	s2[i] = sc.next();
	}
System.out.println(kape1.getSum(s2)); 
}}
public class kape1 {
	
public static int getSum(String[] s1) {
int sum=0;
for(int i=0;i<s1.length;i++)
for(int j=0;j<s1[i].length();j++){
char c=s1[i].charAt(j);
if(Character.isDigit(c)){
if(c%2!=0)
{
String t=String.valueOf(c);
int n=Integer.parseInt(t);
sum=sum+n; } }}
return sum;
 }
}
110.Palindrome - In Range
*****************************************************
import java.util.*;
public class Main {
	public static int sumOfPalindromeNos(int n1,int n2){
		List<Integer> l1=new ArrayList<Integer>();
		for(int i=n1;i<=n2;i++){
			int r=0,n3=i;
			while(n3!=0){
				r=(r*10)+(n3%10);
				n3=n3/10;	}
			if(r==i)
				l1.add(i);		}
		System.out.println(l1);
		int s=0;
		for(int i=0;i<l1.size();i++)
			s+=l1.get(i);
		return s;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range:");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("sum of palindrome nos.within given range is:"+sumOfPalindromeNos(n1,n2));
	}
}
111.Palindrome & Vowels  (checkPalindrome)
************************************
import java.util.Scanner;
public class useer {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String s=sc.nextLine();
       System.out.println(useerm.display(s));
       }}
import java.util.Iterator;
import java.util.LinkedHashSet;
public class useerm {   
    public static int display(String s) {
      StringBuffer sb=new StringBuffer(s);
      
      int k=0;
     LinkedHashSet<Character>l1=new LinkedHashSet<Character>();
     
       String s2=sb.reverse().toString();
       if(s2.equals(s))
       {
        String s3=s2.toLowerCase();
        
        for(int i=0;i<s3.length();i++)
        {
         l1.add(s3.charAt(i));
         
        }
        Iterator<Character> it=l1.iterator();
        while(it.hasNext())
        {
         char a=it.next();
        
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        k++;
        }
       }
       if(k>=2)
      return 1;
       else
       return -1;
}}
112.PAN Card
*********************************
public class Main {
public static void main(String[] args) {
String s1="OLE124F";
getvalues(s1);
}
public static void getvalues(String s1) {
if(s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
{
System.out.println(1);
}
else
System.out.println(-1);
}
}
113.Password  (validatePassword)
**************************
  
 
import java.util.*;
public class Main {
public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String s1=s.next();
      boolean b=User.passwordValidation(s1);
      if(b==true)
            System.out.println("valid password");
      else
            System.out.println("not a valid password");
}
 
}
 
public class User{
      public static boolean passwordValidation(String s1) {
      boolean b=false,b1=false,b2=false;
      if(s1.length()>=8)
                              b1=true;
      if(b1==true)
            for(int i=0;i<s1.length();i++)
                  if(Character.isAlphabetic(s1.charAt(i)) || Character.isDigit(s1.charAt(i)) || s1.charAt(i)=='#' || s1.charAt(i)=='@' || s1.charAt(i)=='%')
                        b2=true;
      if(b2==true)
            if(s1.contains("#") || s1.contains("@") || s1.contains("%"))
                  b=true;
      return b;
}
114.Password Validation
******************************
public class UserMainCode {
	    
		public static int display(String password){
                          if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=6 && password.length()<=20)
		    	{
		    		return 1;
		    	}
		    	else
		    	{
		    		return -1;
		    	}
		   }
		}
115.Pattern Matcher
**************************************
import java.util.*;
public class UserMainCode 
{
	public static boolean matchCharacter(String s) 
	{
		boolean b=false;
		if(s.matches("(CPT)[-]{1}[0-9]{6}"))
		{
			b=true;
		}
		else
		{
			b=false;
		}
		
		return b;
			
	}
}
116.Perfect Number
*************************************************
public class Main {
public static void main(String[] args) {
int n=28;
System.out.println(perfectNumber(n));
}
public static boolean perfectNumber(int n) {
int n1=0;
boolean b=false;
for(int i=1;i<n;i++)
if(n%i==0)
n1+=i;
System.out.println(n1);
if(n1==n)
b=true;
return b;
}
}
117.Phone Number Validator  (?validatePhoneNumber?)
***************************************************  265-265-7777
public class UserMainCode
{
	
	public static int display(String s){
		int sum=0,u=0;
		StringTokenizer st=new StringTokenizer(s,"-");
		while(st.hasMoreTokens())
		{
		String s1=st.nextToken();
		sum=sum+s1.length();
		for(int i=0;i<s1.length();i++)
		{
		if(!Character.isDigit(s1.charAt(i)))
		u=10;
		}
		}
		if(u==0 && sum==10)
		return 1;
		else
		return 2;
		}}
118.Playing with String - I
*******************************************************
import java.util.Scanner;
public class Main
{
	public static void main(String[] arg)
	{
		
Scanner s=new Scanner(System.in);
int n=Integer.parseInt(s.nextLine());
String[] sc=new String[n];
for(int i=0;i<n;i++)
{
	sc[i]=s.nextLine();
}
int a=Integer.parseInt(s.nextLine());
System.out.println(UserMainCode.get(n,sc,a));
	}
}
public class UserMainCode {
    public static String get(int n,String[] input,int a)
    {        
   StringBuffer sb=new StringBuffer();
   for(int i=0;i<n;i++)
   {
	   if(input[i].length()>=a)
	   {
		   String a1=input[i];
		   sb.append(a1.substring(a1.length()-1));
	   }
	   else
	   {
		   sb.append('$'); 
	   }
   }
return sb.toString();
    
 
    }
}
119.Playing with String - II
*************************************************************
import java.util.*;
public class Main {
	/**
	 * @param args
	 * @throws ParseException 
	 
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String s1[]={"AAA","BB","CCCC","A","ABCDE"};
		String s2[]=new String[s1.length];
		for (int i = 0; i < s1.length; i++) 
		{
			s2[i]=s1[i].toLowerCase();
			
			}
		Arrays.sort(s2);
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);	
		}
		
	}
}
*****************main****************
import java.text.ParseException;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)throws ParseException {
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String s1[]=new String[n];
		for(int i=0;i<n;i++)
		s1[i]=sc.nextLine();
		String s2[]=new String[s1.length];
String s3[]=UserMainCode.get(s1,s2);
for (int i = 0; i < s3.length; i++) {
	System.out.println(s3[i]);
}
}
}
******************usermain*********************
import java.text.ParseException;
import java.util.Arrays;
public class UserMainCode
{
	public static String[] get(String[] s1,String[] s2) throws ParseException,NumberFormatException
    {      for (int i = 0; i < s1.length; i++) 
	{
		s2[i]=s1[i].toLowerCase();
		
		}
	Arrays.sort(s2);
	return s2;
}
}
120.Prefix Finder
**********************************
import java.util.Scanner;
 
public class mainc {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
String s[]=new String[n];
for(int i=0;i<n;i++)
s[i]=sc.nextLine();
maincc.reverseString(s);
}
}
		import java.util.ArrayList;
		 import java.util.Iterator;
		import java.util.LinkedHashSet;
		 
		
		public class maincc {
		 
		public static void reverseString (String s[]) {
		LinkedHashSet<String>l1=new LinkedHashSet<String>();
		ArrayList<String>a1=new ArrayList<String>();
		int c=0;
		for(int i=0;i<s.length;i++)
		l1.add(s[i]);
		Iterator<String> it=l1.iterator();
		while(it.hasNext())
		{
		a1.add(it.next());
		}
		for(int i=0;i<a1.size();i++)
		{
		String s2=a1.get(i);
		for(int j=0;j<a1.size();j++)
		{
		String s3=a1.get(j);
		if(i!=j&&s3.length()>s2.length())
		{
		String s4=s3.substring(0,s2.length());
		if(s2.equals(s4))
		c++;
		}
		}
		}
		System.out.println(c);
		}
		 
		}
121.Price Calculator - II
*********************************************
import java.util.*;
public class UserMainCode {
public static void main(String[] args) {
HashMap<String, String> m1=new HashMap<String, String>();
m1.put("monitor", "1200.36");
m1.put("mouse","100.42");
m1.put("speaker", "500.25");
String[] s={"speaker","mouse"};
System.out.println(getTheTotalCostOfPheripherals(m1,s));
}
public static float getTheTotalCostOfPheripherals(HashMap<String,String> m1,String[] s) {
Float f=(float) 0;
Iterator<String> i=m1.keySet().iterator();
while(i.hasNext()){
String s1=(String) i.next();
Float f1=Float.parseFloat(m1.get(s1));
for(int j=0;j<s.length;j++)
if(s[j].equals(s1))
f+=f1; }
return f;
}}
122.Programming Logic
*************************************************
import java.util.ArrayList;
public class UserMainCode{
	public static void main(String[] args) {
int ip1=13,ip2=3,ip3=8;
System.out.println(thirteenLapse(ip1,ip2,ip3));
}
public static int thirteenLapse(int ip1, int ip2, int ip3) {
ArrayList<Integer> l=new ArrayList<Integer>();
l.add(ip1);
l.add(ip2);
l.add(ip3);
int s=0;
for(int i=0;i<l.size();i++){
if(l.get(i)!=13)
s+=l.get(i);
if(l.get(i)==13)
i=i+1;}
return s;
}}
123.Proper Case
*******************************************************
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args){
	String s1="This is cognizant academy";	
	System.out.println(capsStart(s1));
}
public static String capsStart(String s1){
	StringBuffer s5=new StringBuffer();
	StringTokenizer t=new StringTokenizer(s1," ");
	while(t.hasMoreTokens()){
		String s2=t.nextToken();
		String s3=s2.substring(0,1);
		String s4=s2.substring(1, s2.length());
		s5.append(s3.toUpperCase()).append(s4).append(" ");	}
	return s5.toString();
}
}
124.Regular Expression - 1(validate)
*************************************
    
import java.util.Scanner;
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
System.out.println(Usermaincode.display(n));
}
}
public class Usermaincode
{
public static String display(String s)
{
String w="FALSE";
if(s.length()==4 && (Character.isDigit(s.charAt(0))||Character.isAlphabetic(s.charAt(0)))&&s.charAt(1)=='R')
{
if(Character.isDigit(s.charAt(2)))
w="TRUE";
} 
return w;
 
}
}
125.Regular Expression ? 2 (Age Validator)-(ValidateAge)
******************************************************
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String age=sc.nextLine();
System.out.println(Usermaincode.display(age));
}
}
public class Usermaincode
{public static boolean display(String s)
{int c=0;
boolean q=false;
int n=s.length();
for(int i=0;i<n;i++)
{
char a=s.charAt(i);
if(Character.isDigit(a))
c++;
}
if(c==s.length())
{
int age=Integer.parseInt(s);
if((age>=21)&&(age<=45))
q=true;
}
return q;
}
}
126.Regular Expression ? 3 (Phone Validator)
*****************************************************
import java.util.*;
public class UserMainCode 
{
	public static boolean matchCharacter(String s) 
	{
		boolean b=false;
		if(s.matches("[0]{2}[0-9]{8}"))
		{
			b=false;
		}
		else if(s.matches("[0-9]{10}"))
		{
			b=true;
		}
		return b;
			
	}
}
127.Regular Expression - II (validateString)
****************************************************************************           AcB/TRUE   
public class UserMainCode
{public static boolean display(String s)
{
boolean b=true;
if(s.length()==3)
{
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(!Character.isAlphabetic(c[i]))
		{
			b=false;
			break;
		}
	}
}
return b; 
}
}
128.Regular Expression - III    (validateString)
**************************************************************************   ab2/TRUE
public class User
{
	public static boolean display(String s)
	{
		boolean a=false;
	if(Character.isDigit(s.charAt(0)))
	{
		a=false;
	}
	else
	{
		a=true;
	}
	return a;
	}
}
129.Regular Expressions - III
********************************************************
import java.util.*;
public class Main {
	/**
	 * @param args
	 * @throws ParseException 
	 
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String s1="catcowcat";
		String s2="catp";
		int c=0;
		for(int i=0;i<(s1.length()-(s2.length()-1));i++)
		{
			if(s2.equalsIgnoreCase(s1.substring(i,i+s2.length())))
				c++;
		}
		System.out.println(c);
		}
}
130.Regular Expression - III(passwordValidation)
******************************************** 
public class UserMainCode
{
      public static int display(String s)
      {
            
              if(s.matches(".*[0-9]{1,}.*") && s.matches(".*[@#$]{1,}.*") && s.length()>=8 && s.matches(".*[A-Z]{1,}.*") && s.matches(".*[a-z]{1,}.*"))
                    return 1;
              else
                    return -1;
      }}
131.REMOVE 10'S(removeTens)
**************************
import java.util.Scanner;
public class main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[]m=new int[size];
int[]n=new int[size];
int j=0;
for(int i=0;i<size;i++)
{
n[i]=sc.nextInt();
}
for(int i=0;i<size;i++)
{
if(n[i]!=10)
{
m[j]=n[i];
j++;
}}
for(int i=0;i<size;i++)
{
System.out.println(m[i]);
}
}
}
******************main********************
import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;
 
public class Main  {
	public static void main(String[] args) throws ParseException{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[]n=new int[size];
	
		for(int i=0;i<size;i++)
		{
		n[i]=sc.nextInt();
		}
		int a[]=UserMainCode.display(n,size);
		for(int i=0;i<size;i++)
		{
		System.out.println(a[i]);
		}
}
}
**********************usermain************************************
import java.text.ParseException;
public class UserMainCode
{
	 public static int[] display(int[] n,int size)throws ParseException
     {int i,j=0;
     int[]m=new int[size];
		 for( i=0;i<size;i++)
		 {
		 if(n[i]!=10)
		 {
		 m[j]=n[i];
		 j++;
		 }}
		 return m;
}
}
132.Remove 3 Multiples(Remove 3 Multiples)
**************************************
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 
 
public class HelloWorld{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
ArrayList<Integer> al=new ArrayList<Integer>();
ArrayList<Integer> al1=new ArrayList<Integer>();
int n=Integer.parseInt(sc.nextLine());
for(int i=0;i<n;i++)
{
al.add(sc.nextInt());
}
al1=User.findFruitName(al);
Iterator it=al1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
 
 
public class User
{
public static ArrayList<Integer> findFruitName(ArrayList<Integer> al)
{
ArrayList<Integer> al2=new ArrayList<Integer>();
 
for(int i=0;i<al.size();i++)
{
if((i+1)%3!=0)
al2.add(al.get(i));
}
 
return al2;
}
}
133.Remove Elements  (removeElements) 
*******************************************************  5/a/bb/b/ccc/ddd
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[] a=new String[n];
		for(int i=0;i<n;i++)
		 a[i]=sc.nextLine();
		int m=Integer.parseInt(sc.nextLine());
		System.out.println(UserMainCode.display(a,m));
	}}
import java.util.*;
public class UserMainCode
{
	
	public static int display(String[] a,int m){
		
			int u=a.length;
			for(int i=0;i<a.length;i++)
			{
			if(a[i].length()==m)
			u--;
			}
			return u;
			}}
134.Removing elements from HashMap   (afterDelete)
****************************************************************************************  4/339/RON/1010/JONS
import java.util.HashMap;
import java.util.Iterator;
public class useerm {
/**
* @param args
public static void main(String[] args) {
HashMap<Integer, String>hm=new HashMap<Integer, String>();
hm.put(339,"RON");
hm.put(1010, "jons");
hm.put(3366, "yoo");
hm.put(2020, "world");
getvalues(hm);
}
public static void getvalues(HashMap<Integer, String> hm) {
int count=0;
//HashMap<Integer, String>hm1=new HashMap<Integer, String>();
Iterator<Integer>itr=hm.keySet().iterator();
while(itr.hasNext())
{
int n=itr.next();
if(n%3!=0)
{
count++;
}
}
System.out.println(count);
}
}
135.Removing Keys from HashMap (sizeOfResultandHashMap)
*************************************************************    3/2/hi/4/hello/12/helloworld
import java.util.*;
public class Main {
public static void main(String[] args) {
HashMap<Integer, String>hm=new HashMap<Integer, String>();
hm.put(2,"hi");
hm.put(8, "hello");
hm.put(15, "yoo");
hm.put(12, "world");
hm.put(45, "ya");
getvalues(hm);
}
public static void getvalues(HashMap<Integer, String> hm) {
int count=0;
HashMap<Integer, String>hm1=new HashMap<Integer, String>();
Iterator<Integer>itr=hm.keySet().iterator();
while(itr.hasNext())
{
int n=itr.next();
if(n%4!=0)
{
count++;
}
}
System.out.println(count);
}
}
136.Removing vowels from String  (removeEvenVowels)
**************************************************************************          commitment/cmmitmnt
public class Main {
	public static void main(String[] args) {
		String s1="capacity";
		System.out.println(removeEvenElements(s1));
	}
	public static String removeEvenElements(String s1) {
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<s1.length();i++)
			if((i%2)==0)
				sb1.append(s1.charAt(i));
			else if((i%2)!=0)
				if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' && s1.charAt(i)!='o' && s1.charAt(i)!='u')
					if(s1.charAt(i)!='A' && s1.charAt(i)!='E' && s1.charAt(i)!='I' && s1.charAt(i)!='O' && s1.charAt(i)!='U')
					 sb1.append(s1.charAt(i));
		return sb1.toString();
	}
}
137.Repeat Front(repeatFirstThreeCharacters)
******************************************
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int n=Integer.parseInt(sc.nextLine());
System.out.println(Usermaincode.display(s,n));
}
}
import java.util.StringTokenizer;
public class Usermaincode
{public static String display(String s,int n)
{
StringBuffer sb=new StringBuffer();
StringBuffer sb1=new StringBuffer();
if(s.length()>3)
{ sb.append(s.substring(0,3));
s=sb.toString();
}
for(int i=0;i<n;i++)
sb1.append(s);
return sb1.toString();
}
}
138.Repeating set of characters in a string  (getString)
******************************************************************************************     Cognizant/3/Cognizantantantant
import java.util.*;
public class useerm {
	public static String lengthiestString(String s1,int n){
		StringBuffer sb=new StringBuffer();
		sb.append(s1);
		for(int i=0;i<n;i++)
		
		{
			
			sb.append(s1.substring(s1.length()-n,s1.length()));
			
        	}
        return sb.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String:");
		String s1=s.nextLine();
		int n=s.nextInt();
		System.out.println("the lengthiest string is:"+lengthiestString(s1,n));
		}
}
139.Retirement (retirementEmployeeList)
**********************************
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class kape
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=Integer.parseInt(sc.nextLine());
LinkedHashMap<String,String>a1=new LinkedHashMap<String,String>();
for(int i=0;i<n;i++)
{
a1.put(sc.nextLine(),sc.nextLine());
}
kape1.display(a1);
}
}
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class kape1{
public static void display(HashMap<String,String>a1)
{
LinkedHashSet<String>a=new LinkedHashSet<String>();
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
int y=0;
Iterator<String>it=a1.keySet().iterator();
while(it.hasNext())
{
String s=it.next();
String s1=a1.get(s);
try{
Date d1=sdf.parse(s1);
Calendar c=Calendar.getInstance();
c.setTime(d1);
int y1=c.get(Calendar.YEAR);
int m1=c.get(Calendar.MONTH);
int da1=c.get(Calendar.DAY_OF_MONTH);
Date d2=new Date();
c.setTime(d2);
int y2=c.get(Calendar.YEAR);
int m2=c.get(Calendar.MONTH);
int da2=c.get(Calendar.DAY_OF_MONTH);
y=Math.abs(y1-y2);
if(m1==m2)
{
if(da1>da2)
y--;
}
else if(m1>m2)
y--;
if(y>=60)
a.add(s);
}
catch(Exception e)
{
e.printStackTrace();
}
}
System.out.println(a);
}
}
140.Reverse Split(reshape)
************************
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokens {
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
	StringBuffer sb=new StringBuffer();
	sb.append(s.charAt(s.length()-1));
	
	for(int i=s.length()-2;i>=0;i--)
	
	{
		
		sb.append('-');
		sb.append(s.charAt(i));
		
	}
	System.out.print( sb.toString());}}
141.Reverse SubString  (?reverseSubstring?)
*********************************************************************************************    Rajasthan/2/3
public class UserMainCode {
	public static void main(String[] args) {
		String input1="Rajasthan";
		int input2=2, input3=5;
		System.out.println(retrieveString(input1,input2,input3));
	}
	public static String retrieveString(String input1, int input2, int input3) {
		StringBuffer sb=new StringBuffer(input1);
		sb.reverse();
		String output=sb.substring(input2, input2+input3);
		return output;
	}
}
142.Reversing a Number  (reverseNumber)
*****************************************************************************    543/345
public class UserMainCode {
    public static int reverseNumber(int number)
    {
    int d=number,rev=0,rem=0;
    	while(d!=0)
    	{
    	rem=d%10;
    	rev=rev*10+rem;
    	d=d/10;
    	}
    	return rev;
    }
}
143.Scores  (checkScores)
*************************************************************************          3/1/100/100
public static void main (String[] args)
                {
                                Scanner sc = new Scanner(System.in);
                                int n = sc.nextInt();
                                int[] arr = new int[n]; 
                                for(int i=0;i<n;i++){
                                                arr[i] = sc.nextInt();
                                }
                                
                                System.out.println(consecutiveNum(arr, n));
                }
                
 
                public static boolean consecutiveNum(int arr[], int n){
                                boolean b = false;
                                for(int i=0;i<n-1;i++){
                                                if(arr[i] == 100){
                                                                if(arr[i+1] == 100){
                                                                                b = true;
                                                                                break;
                                                                }
                                                }
                                }
                                return b;
                }
144.Sequence in Array
***************************************
public class Main 
{
	public static void main(String[] args) 
	{
		//int[] a={2,1,4,1,2,3,6,1,2,3};
		int[] a={1,2,1,3,4,5,8};
		System.out.println(sequenceInArray(a));
	}
	public static boolean sequenceInArray(int[] a) 
	{
		boolean b = false;
		
		for(int i = 0 ; i< a.length-3; i++)
		{
			if(a[i]==1 && a[i+1]==2 && a[i+2]==3)
				b = true;
		}
		
		return b;
	}
}
145.Sequence Sum
******************************************************
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static int sumOfFibonacci(int n){
int a=0,b=1,c=0,d=1;
for(int i=3;i<=n;i++){
c=a+b;
a=b; b=c;
d=d+c;
}
return d;
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(sumOfFibonacci(n));
}
}
146.Shift Left (shiftLeft)
*********************
import java.util.Scanner;
public class usercc
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[]m=new int[size];
int[]n=new int[size];
int j=0;
for(int i=0;i<size;i++)
{
n[i]=sc.nextInt();
}
for(int i=0;i<size;i++)
{
if(n[i]!=5)
{
m[j]=n[i];
j++;
}}
for(int i=0;i<size;i++)
{
System.out.println(m[i]);
}
}
}
147.Simple String Manipulation - II
*****************************************************
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		String inpList=sc.nextLine();
		
		System.out.println(UserMainCode.calculateWordSum(inpList));		
	}
}
public class UserMainCode {
	
	public static int calculateWordSum(String inp) {
		int count=0;
		String st[]=inp.split(" ");
		String s1=st[0];
		String slst=st[st.length-1];
		if(s1.equals(slst))
		{
			count=s1.length();
		}
		else
		{
			count=s1.length()+slst.length();
		}
		return count;
					
					
	}		
}
148.Simple String Manipulation   (getString)
****************************************************************************************************   Hello/llo
import java.util.Scanner;
public class useer
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(useerm.display(s));
}}
public class useerm
{
	public static String display(String s)
{
StringBuffer sb=new StringBuffer();
char a=s.charAt(0);
char b=s.charAt(1);
if(a!='j'&& b!='b')
sb.append(s.substring(2));
else if(a=='j' && b!='b')
sb.append("j").append(s.substring(2));
else if(a!='j' && b=='b')
sb.append(s.substring(1));
else
sb.append(s.substring(0));
return sb.toString();
}
} 
149.Sorted Array(orderElements)
***************************
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int n;
		Scanner sin = new Scanner(System.in);
		n = sin.nextInt();
		String[] a1 = new String[n];
		for(int i=0;i<n;i++)
		{
			a1[i] = sin.next();
		}
		a1 = UserMainCode.orderElements(a1);
		for(int i=0;i<a1.length;i++)
			System.out.println(""+a1[i]);
}
}
import java.util.*;
public class UserMainCode
{
	public static String[] orderElements(String[] arr)
	{
		HashSet<String> al=new HashSet<String>(); 
		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);		
		}
		Iterator<String> itr=al.iterator();
		arr = new String[al.size()];
		int i =0 ;  
		while(itr.hasNext()){  
			arr[i++] = itr.next();  
		}
		Arrays.sort(arr);
		return arr;
		
		
	}
}
150.Start Case
********************************************************
import java.util.StringTokenizer;
public class Main {
public static void main(String[] args){
	String s1="Now is the time to act!";	
	System.out.println(capsStart(s1));
}
public static String capsStart(String s1){
	StringBuffer s5=new StringBuffer();
	StringTokenizer t=new StringTokenizer(s1," ");
	while(t.hasMoreTokens()){
		String s2=t.nextToken();
		String s3=s2.substring(0,1);
		String s4=s2.substring(1, s2.length());
		s5.append(s3.toUpperCase()).append(s4).append(" ");	}
	return s5.toString();
}
}
151.State ID generator
*************************************************************
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
public class UserMainCode
{
	public static HashMap<String, String> getStateID(String[] s1)  
	{
		HashMap<String, String> hm = new HashMap<String, String>(); 
		ArrayList<String> lst1 = new ArrayList<String>(); 
		ArrayList<String> lst2 = new ArrayList<String>(); 
		for(String s : s1) 
			lst1.add(s.toUpperCase().substring(0,3)); 
		for(String s : s1) 
			lst2.add(s); 
		for(int i=0;i<s1.length;i++) 
		{ 
			hm.put(lst1.get(i),lst2.get(i)); 
		} 
		//System.out.println(map);
		
		return hm;
		
}
}
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main  {
	public static void main(String[] args) throws ParseException{
	
		String[] s1={"goa","kerala","gujarat"}; 
		HashMap<String,String> x= new HashMap<String,String>();
		x= UserMainCode.getStateID(s1);
		for(Map.Entry<String, String> ans: x.entrySet()) 
		{ 
			System.out.println(ans.getKey()+":"+ans.getValue()); 
		} 
}
}
152.States and Capitals(getCapital)
*********************************
import java.util.HashMap;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
	
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		HashMap<String,String> hm=new HashMap<String,String>();
		for(int i=0;i<n;i++)
		{
			String s1=sc.next();
			String s2=sc.next();
			hm.put(s1,s2);
		}
		String sa=sc.next();
			System.out.print(UserMainCode.display(hm,sa));
				
 	}
}
import java.util.HashMap;
import java.util.Map;
public class UserMainCode
{
	public static String display(HashMap<String,String> hm,String sa)
	{
	for(Map.Entry m1:hm.entrySet())
	{
	String ss=(String)m1.getKey();
	if(ss.equalsIgnoreCase(sa))
	{
		
			return (m1.getValue()+"$"+m1.getKey());
		
	}
	}
	return sa;
	}
}
153.String Concatenation (concatstring)
***************************************************************************** hello/hi/lohi
public class Main {
/**
* @param args
public static void main(String[] args) {
String s1="hello";
String s2="hikio";
getvalues(s1,s2);
}
public static void getvalues(String s1, String s2) {
StringBuffer sb=new StringBuffer();
int l1=s1.length();
int l2=s2.length();
if(l1==l2)
{
sb.append(s1).append(s2);
}
else if(l1>l2)
{
sb.append(s1.substring(s1.length()-s2.length(),s1.length())).append(s2);
}
else if(l1<l2)
{
sb.append(s1).append(s2.substring(s2.length()-s1.length(),s2.length()));
}
System.out.println(sb);
}
}
154.String Encryption  (encrypt)
*****************************************************************************  curiosity/dusipsjtz
public class Main {
public static void main(String[] args) {
String s1="zzzz";
System.out.println(stringFormatting(s1));
}
public static String stringFormatting(String s1) {
StringBuffer sb=new StringBuffer();
for(int i=0;i<s1.length();i++){
char c=s1.charAt(i);
if(i%2==0){
if(c==122)
c=(char) (c-25);
else{
c=(char) (c+1);}
sb.append(c);}
else
sb.append(c);}
return sb.toString();
}
}
155.String Finder  (?stringFinder?)
***************************************************************************************************   
public class Main {
public static void main(String[] args) {
String s1="geniousRajKumarDev";
String s2="Raj";
String s3="gen";
getvalues(s1,s2,s3);
}
public static void getvalues(String s1, String s2, String s3) {
if(s1.contains(s2)&& s1.contains(s3))
{
if(s1.indexOf(s2)<s1.indexOf(s3))
{
System.out.println(1);
}
else
System.out.println(2);
}
}}
156.String Occurances - II
*******************************************************************************
import java.util.*;
public class UserMainCode {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		char []c=s.toCharArray();
		char[] c1=s1.toCharArray();
		int count=0,result=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(c[i]==c1[j])
				{
					i++;
					count++;
					if(i>=s.length())
				break;
					}
			}
		
	if(count==s1.length())
	{
		result++;
		i=i-1;
	}
	count=0;
		}
		System.out.print(result);
	}}
157.String Occurences
********************************************************************
import java.util.StringTokenizer;
public class Main {
/**
* @param args
public static void main(String[] args) {
String s1="ABC xyz AAA";
String s2="w abc";
getvalues(s1,s2);
}
public static void getvalues(String s1, String s2) {
int count=0;
StringTokenizer st=new StringTokenizer(s2," ");
String s3=st.nextToken();
String s4=st.nextToken();
//System.out.println(s4);
StringTokenizer st1=new StringTokenizer(s1," ");
while(st1.hasMoreTokens())
{
String s5=st1.nextToken();
if(s4.equals(s5))
{
count++;
}
}
System.out.println(count);
}
}
158.String Processing - III    (moveX)
*******************************************************************                xxhixx/hixxxx
public class Main {
public static void main(String[] args) {
String input="xaXafxsd";
System.out.println(removalOfx(input));
}
public static String removalOfx(String input) {
StringBuffer sb=new StringBuffer(input);
int j=0;
for(int i=0;i<sb.length();i++)
if(sb.charAt(i)=='x')
{
sb.deleteCharAt(i);
j++;
}
for(int i=0;i<j;i++)
sb.append('x');
return sb.toString();
}
}
159.String Processing - IV   (getStringUsingNthCharacter)
****************************************************************************************    HelloWorld/2/HelWrd
public class Main 
{
	public static void main(String[] args) 
	{
		String input1="HelloWorld";
		int input2=2; 
		System.out.println(deletingtheCharOccuringTwice(input1,input2));
	}
	public static String deletingtheCharOccuringTwice(String input1, int input2) 
	{
		StringBuffer sb=new StringBuffer(input1);
		int c=1;
		for(int i=0;i<sb.length();i++)
		{
			c=1;
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
					c++;
			}
			if(c>input2)
			{	
				for(int j=i+1;j<sb.length();j++)
				{
					if(sb.charAt(i)==sb.charAt(j))
					{
						sb.deleteCharAt(j);
						j--;
					}
				}	
			}
			if(c==input2)
			{	
				for(int j=i+1;j<sb.length();j++)
				{
					if(sb.charAt(i)==sb.charAt(j))
						sb.deleteCharAt(j);   
				}	
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb.toString();
	}
}
160.String processing ? Long + Short + Long
********************************************************************
import java.util.StringTokenizer;
public class User {
public static void main(String[] args){
	String s1="Hi";	
	String s2="Hello";
	System.out.println(capsStart(s1,s2));
}
public static String capsStart(String s1,String s2){
	StringBuffer s5=new StringBuffer();
	int q=s1.length();
	int w=s2.length();
	if(q>w)
	{
		s5.append(s1).append(s2).append(s1);
	}
	else
	{
		s5.append(s2).append(s1).append(s2);
	}
	return s5.toString();
}
}
161.String Processing - MixMania   (checkPattern)
********************************************************************************************   Mix Mania
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
StringBuffer sb=new StringBuffer();
String s2=s1.substring(0,3);
int a=0,b=0,c=0;
char c21=s2.charAt(0);
if (Character.isDigit(c21)||Character.isLetter(c21))
		{
	a=1;
		}
	if(a==1)
	{
		char c1=s2.charAt(1);
		char c2=s2.charAt(2);
		if(c1=='i'){
			b=1;
		}
		if(c2=='x')
		{c=1;
		}
		
	}
	if(a==1&&b==1&&c==1)
	{
		System.out.print("true");
	}else
	{
		System.out.print("false");
	}
	
	}}
162.String Processing - TrimCat   (getAlternateChars)
**************************************************************************************      Hello/Hlo
public class Main 
{
	public static void main(String[] args) 
	{
		String s="Hello";	
		System.out.println(alternatingChar(s));
	}
	public static String alternatingChar(String s)
	{
		StringBuffer sbf = new StringBuffer();
		for(int i = 0; i < s.length() ; i++)
		{
			sbf.append(s.charAt(i));
			i=i+1;			
		}
		String str = sbf.toString();
		return str;
	}
}
163.String Processing - Username    (fetchUserName)
***************************************************************************************      admin@xyz.com
import java.util.StringTokenizer;
public class User {
public static void main(String[] args) {
String s1="admin@xyz.com";
getvalues(s1);
}
public static void getvalues(String s1) {
StringTokenizer st=new StringTokenizer(s1,"@");
String s2=st.nextToken();
System.out.println(s2);
}}
164.String Processing - V   (concatString)
**************************************************************************************    3/AAA/BBB/CCC
import java.util.*;
public class Main {
	public static void main(String[] args)  {
		
		String s1[]={"aa","bb","cc"};
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length;i++)
		{
			sb.append(s1[i]).append(",");
			
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}
165.String Processing - V   (returnLastRepeatedCharacters)
*********************************************************************************    Hello/2/lolo
public class Main 
{
	public static void main(String[] args) 
	{
		String s1="hello";
		int n1=3;
		System.out.println(formattingOfString(s1,n1));
	}
	public static String formattingOfString(String s1, int n1) 
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < n1 ; i++)
			sb.append(s1.substring(s1.length()-n1, s1.length()));
		return sb.toString();
	}	
}
166.String Processing - VII   (isEqual)
*********************************************************************************     AAAA/abab/2
import java.util.*;
public class useerm {
	public static boolean lengthiestString(String s1,String s2,int n){
		boolean a=false;
		char c=s1.charAt(n);
		char d=s2.charAt(s2.length()-n);
		
        String s3=Character.toString(c);
        //System.out.println(s3);
        String s4=Character.toString(d);
        //System.out.println(s4);
        if(s3.equalsIgnoreCase(s4))
        {
        	a=true;
        }else
        {
        	a=false;
        }
      return a;  
	}
167.String Processing - ZigZag
*************************************************************
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class User {
	
	public static void main(String[] args) throws IOException, ParseException  {
		// TODO Auto-generated method stub
	String s1="10-02-2012";
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Calendar cal=Calendar.getInstance();
	Date d1=sdf.parse(s1);
	cal.setTime(d1);
	int n=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	System.out.println(n);
	}
}
168.String Processing   (exchangeCharacters)
**********************************************************************************    HelloWorld/delloWorlH
public class Main {
	/**
	 * @param args
	 
	public static void main(String[] args) {
	String s1="HelloWorld";
	StringBuffer sb=new StringBuffer();
	char c=s1.charAt(0);
	String s2=s1.substring(1, s1.length()-1);
    char c1=s1.charAt(s1.length()-1);
    sb.append(c1).append(s2).append(c);
    System.out.println(sb);
	}
}
169.String Repetition  (repeatString)
**********************************************************************************    COGNIZANT/4/COG COG
import java.util.*;
public class useer {
	public static String lengthiestString(String s1,int n){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++)
		{if(n>=3)
			sb.append(s1.substring(0,3)).append(" ");
			else if(n==2)
				sb.append(s1.substring(0,2)).append(" ");
			else if(n==1)
				sb.append(s1.substring(0,1));
        	}
        return sb.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String:");
		String s1=s.nextLine();
		int n=s.nextInt();
		System.out.println("the lengthiest string is:"+lengthiestString(s1,n));
		}
}
170.String Splitter
****************************************************
import java.util.*;
public class UserMainCode 
{
	public static void main(String[] args) 
	{
		String ip1="AAA/bba/ccc/DDD";
		char ip2='/';
		String op[]=loweringCasenReverseofaString(ip1,ip2);
		for(String s:op)
		System.out.println(s);
	}
	public static String[] loweringCasenReverseofaString(String ip1, char ip2)
	{
		StringTokenizer t1 = new StringTokenizer(ip1,"/");
		ArrayList<String> lst = new ArrayList<String>(); 
		while(t1.hasMoreTokens())
		{
			StringBuffer sb = new StringBuffer();
			sb.append(t1.nextToken().toLowerCase());
			lst.add(sb.reverse().toString());
		}
		String[] op = new String[lst.size()];
		for(int i = 0;i<lst.size();i++)
		{
			op[i] = (String) lst.get(i);
		}
		return op;
	}
}
171.Strings ? Unique & Existing Characters (replaceplus)
**************************************************
import java.util.Scanner;
public class Main {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
String n1=sc.nextLine();
System.out.println(UserMainCode.display(n,n1));
}
}
public class UserMainCode
{
public static String display(String s,String s1)
{
String s2=s.toLowerCase();
String s3=s1.toLowerCase();
StringBuffer sb=new StringBuffer();
for(int i=0;i<s.length();i++)
{
char c=s2.charAt(i);
if(s3.indexOf(c)==-1)
sb.append("+");
else
sb.append(s.charAt(i));
} return sb.toString();
 
}
}
172.Strings Processing - Replication   (repeatString)
**********************************************************************************   Lily/2/LilyLily
import java.util.*;
public class UserMainCode {
	public static String lengthiestString(String s1,int n){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++)
		{
			sb.append(s1);
        	}
        return sb.toString();
	}
173.Strings Processing(findFruitName)
**********************************
import java.util.Scanner;
 
public class Main
{
public static void main(String args[]) 
{
 
String str=new String();
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
int n=sc.nextInt();
String k=UserMainCode.findFruitName(str, n);
System.out.println(k);
 
}
import java.util.StringTokenizer;
 
public class UserMainCode
{
public static String findFruitName(String m,int n)
{
int i=0;
String h=null;
StringTokenizer st=new StringTokenizer(m,",");
 
int max=st.countTokens();
String[] ss=new String[max];
while(st.hasMoreElements())
{
ss[i++]=st.nextToken();
}
if(n>max)
h=ss[i-1];
else
h=ss[n-1];
return h;
}
}
174.Sum Non Prime Numbers
********************************************
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
public class UserMainCode {
	public static int func(int n) {
		int sum=0;int k=0;int sum1=0;
		for(int i=2; i<=n; i++)
		{ k=0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
					k++;
				
			}
		if(k==0)
		{
			sum=sum+i;
		}
		}
		for(int r=1; r<=n; r++)
			sum1=sum1+r;
		return sum1-sum;
		}
}
175.Sum of Common Elements (getSumOfIntersection)
************************************************
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[] a=new int[n];
int[] b=new int[m];
for(int i=0;i<n;i++)
 a[i]=sc.nextInt();
for(int i=0;i<m;i++)
 b[i]=sc.nextInt();
int u=UserMainCode.display(a,b);
if(u==-1)
System.out.println("No common elements");
else
System.out.println(u);}}
public class UserMainCode {
public static int display(int a[],int b[])
{
	
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<b.length;j++)
		{if(a[i]==b[j])
		sum=sum+a[i];
		}}
		if(sum==0)
		return -1;
		else
		return sum;
		}}
176.Sum of cubes and squares of elements in an array   (addEvenOdd)
*************************************************************************    5/2/6/3/4/5/208
public class Main {
public static void main(String[] args) {
int a[]={2,4,3,5,6};
System.out.println(summationPattern(a));
}
public static int summationPattern(int[] a) {
int n1=0,n2=0;
for(int i=0;i<a.length;i++)
if(a[i]%2==0)
n1+=(a[i]*a[i]);
else
n2+=(a[i]*a[i]*a[i]);
return n1+n2;
}
}
177.Sum of Digits
************************************
public class Main {
/**
* @param args
public static void main(String[] args) {
String s1="abcde";
getvalues(s1);
}
public static void getvalues(String s1) {
int sum=0;
for(int i=0;i<s1.length();i++)
{
char a=s1.charAt(i);
if(Character.isDigit(a))
{
int b=Integer.parseInt(String.valueOf(a));
sum=sum+b;
}
}
if(sum==0)
{
System.out.println(-1);
}
else
System.out.println(sum);
}
}
178.Sum of Digits in a String  (sumOfDigits)
*****************************************************************************   good23bad4
public class Main {
/**
* @param args
public static void main(String[] args) {
String s1="goodbad";
getvalues(s1);
}
public static void getvalues(String s1) {
int sum=0;
for(int i=0;i<s1.length();i++)
{
char a=s1.charAt(i);
if(Character.isDigit(a))
{
int b=Integer.parseInt(String.valueOf(a));
sum=sum+b;
}
}
if(sum==0)
{
System.out.println(-1);
}
else
System.out.println(sum);
}
}
179.Sum of Lowest marks (getLowest)
************************************************************************   5/1/54/2/85/3/74/4/59/5/57/170
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n=Integer.parseInt(sc.nextLine());
      HashMap<Integer,Integer>h1=new HashMap<Integer,Integer>();
      for(int i=0;i<n;i++)
      {
    	  h1.put(sc.nextInt(),sc.nextInt());
    	  }
       System.out.println(UserMainCode.getvalues(h1));
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
public class UserMainCode {
	public static int getvalues(HashMap<Integer,Integer>h1)
	{
		ArrayList<Integer>a1=new ArrayList<Integer>();
		int m=0;
		Iterator<Integer> it=h1.keySet().iterator();
		while(it.hasNext())
		{
			int x=it.next();
			a1.add(h1.get(x));
		}		
		Collections.sort(a1);
		m=a1.get(0)+a1.get(1)+a1.get(2);
		return m;
		}}
180.Sum of Max & Min    (getSumMaxMin)
***********************************************************************************  12/17/19/31
public class User
{
	public static int display(int a,int b,int c)
	{
		int d=0;
	if(a<b&&b<c)
	{
		d=a+c;
	}
	else if(a<b&&b>c)
	{
		d=b+c;
	}
	else if(a>b&&b<c)
	
	{
		d=a+b;
	}
	return d;
}}
181.Sum of Powers of elements in an array  (getSumOfPower)
************************************************************* 4/3/6/2/1
public class useerm{
public static int display(int n,int[]a)
{
	
		
		
		{
			int sum=0;
			for(int i=0;i<n;i++)
				sum=(int)(sum+Math.pow(a[i], i));
			return sum;
	}}}
182.Sum of Squares of Even Digits (sumOfSquaresOfEvenDigits)
*******************************************************************          56895/100
public class UserMainCode                                                    
{
	
	    public static int display(int number){
	    	int n1=0,n2=0;
	    	while(number!=0)
	    	{
	    	n1=number%10;
	    	if((n1%2)==0)
	    	n2+=n1*n1;
	    	number/=10;
	    	}
	    	return n2;
	    }
	}
183.Sum Squares of Digits
*******************************************************************
public class Main {
public static void main(String[] args) {
int n=321;
getvalues(n);
}
public static void getvalues(int n) {
int a=n;
int rem=0;
int sum=0;
while(a!=0)
{
rem=a%10;
sum=sum+(rem*rem);
a=a/10;
}
System.out.println(sum);
}
}
184.SumOdd    (addOddNumbers)
*****************************************************************************     6/9     
public class UserMainCode {
public static int sumOf(int n){
int a=0;
for(int i=0;i<=n;i++)
{
	if(i%2!=0)
	{
		a=a+i;
	}
}
return a;
}
185.Swap Characters  (swapCharacter)
*****************************************************************************************    
public class Main
{
public static void main(String[] args) {
String s1="TRAINER";
getvalues(s1);
}
public static void getvalues(String s1)
{
StringBuffer sb=new StringBuffer();
int l=s1.length();
if(l%2==0)
{
for(int i=0;i<s1.length()-1;i=i+2)
{
char a=s1.charAt(i);
char b=s1.charAt(i+1);
sb.append(b).append(a);
}
System.out.println(sb);
}
else
{
for(int i = 0;i<s1.length()-1;i=i+2)
{
char a=s1.charAt(i);
char b=s1.charAt(i+1);
sb.append(b).append(a);
}
sb.append(s1.charAt(l-1));
System.out.println(sb);
}
}
}
186.Symmetric Difference  (getSymmetricDifference)
********************************************
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int n,m;
		Scanner sin = new Scanner(System.in);
		n = sin.nextInt();
		int[] a1 = new int[n];
		for(int i=0;i<n;i++)
		{
			a1[i] = sin.nextInt();
		}
		m = sin.nextInt();
		int[] a2 = new int[m];
		for(int i=0;i<m;i++)
		{
			a2[i] = sin.nextInt();
		}
		int[] result = UserMainCode.getSymmetricDifference (a1,a2);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
}
}
import java.util.*;
public class UserMainCode
{
	public static int[] getSymmetricDifference (int[] a1,int[] a2)
	{
		//int[] a1 = new int[]{11,5,14,26,3};
		//int[] a2 = new int[]{5,3,1};
		int[] union,inter,result;
		int count=0;
		int max = a1.length+a2.length;
		ArrayList<Integer> temp = new ArrayList<Integer>(max);
		union
		for(int i=0;i<a1.length;i++)
		{
			if(!temp.contains(a1[i]))
			{
				++count;
				temp.add(a1[i]);
			}
		}
		for(int i=0;i<a2.length;i++)
		{
			if(!temp.contains(a2[i]))
			{
				++count;
				temp.add(a2[i]);
			}
		}
		union = new int[count];
		for(int i=0;i<count;i++)
		{
			union[i] = (int)temp.get(i);
		}
		Arrays.sort(union);
		intersection
		temp = new ArrayList<Integer>(max);
		count =0;
		Arrays.sort(a2);
		for(int i=0;i<a1.length;i++)
		{
			if(Arrays.binarySearch(a2,a1[i]) >= 0)
			{
				++count;
				temp.add(a1[i]);
			}
		}
		inter = new int[count];
		for(int i=0;i<count;i++)
		{
			inter[i] = (int)temp.get(i);
		}
		Arrays.sort(inter);
		difference 
	
		temp = new ArrayList<Integer>(max);
		count =0;
		Arrays.sort(inter);
		for(int i=0;i<union.length;i++)
		{
			if(Arrays.binarySearch(inter,union[i]) < 0)
			{
				++count;
				temp.add(union[i]);
			}
		}
		result = new int[count];
		for(int i=0;i<count;i++)
		{
			result[i] = (int)temp.get(i);
		}
		Arrays.sort(result);
		//System.out.println("resultant array : \n "+Arrays.toString(result));
		return result;
		
	}
}
187.Test Vowels
*********************************************
public class Main {
public static void main(String[] args) {
String s1="cbisouzze";
System.out.println(vowelsCheck(s1));
}
public static boolean vowelsCheck(String s1) {
boolean b=false;
int n1=0,n2=0,n3=0,n4=0,n5=0;
for(int i=0;i<s1.length();i++){
char c=s1.charAt(i);
if(c=='a')
n1++;
if(c=='e')
n2++;
if(c=='i')
n3++;
if(c=='o')
n4++;
if(c=='u')
n5++;}
if(n1==1 && n2==1 && n3==1 && n4==1 && n5==1)
b=true;
return b;
}
}
188.Three Digits  (validatestrings)
*****************************************************************************   CTS-215
public class Main {
public static void main(String[] args) {
String s1="CTS-2j4";
getvalues(s1);
}
public static void getvalues(String s1) {
if(s1.matches("(CTS)[-]{1}[0-9]{3}"))
{
System.out.println(1);
}
else
System.out.println(-1);
}
}
189.Transfer from Hashmap to Arraylist(getName)
**********************************************
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
 
 
public class Main {
public static void main(String[] args)
{
LinkedHashMap<Integer,String> hm1=new LinkedHashMap<Integer,String>();
int n;
Scanner sc=new Scanner(System.in);
n=Integer.parseInt(sc.nextLine());
for(int i=0;i<n;i++)
{
hm1.put(Integer.parseInt(sc.nextLine()),sc.nextLine());
}
ArrayList<String> al1=new ArrayList<String>();
al1=UserMain.getName(hm1);
Iterator<String> it=al1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
 
}
 
}
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
 
 
public class UserMain {
public static ArrayList<String> getName(HashMap<Integer,String> hm1)
{
ArrayList<String> al2=new ArrayList<String>();
LinkedHashMap<Integer,String> hm2=new LinkedHashMap<Integer,String>(hm1);
 
Iterator<Integer> it =hm2.keySet().iterator();
int flag1=0,flag2=0;
while(it.hasNext())
{
int id=it.next();
String name=hm2.get(id);
char[] check=name.toCharArray();
if(check[0]>='a'&&check[0]<='z')
{
if(check[name.length()-1]>='A'&&check[name.length()-1]<='Z')
{
flag1=1;
}
}
for(int i=0;i<name.length();i++)
{
if(check[i]>='0'&&check[i]<='9')
{
flag2=1;
}
}
if(flag1==1&&flag2==1)
{
al2.add(name);
}
flag1=0;
flag2=0;
}
return al2;
 
}
}
190.7) Triplets(checkTripplets)
***************************
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
int n;
int[] a=new int[10];
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
boolean s=UserMain.checkTripplets(a);
if(s)
System.out.println("TRUE");
else
System.out.println("FALSE");
}
 
}
public class UserMain {
public static boolean checkTripplets(int[] a)
{
boolean b=false;
for(int i=0;i<a.length-3;i++)
{
if((a[i]==a[i+1])&&(a[i+1]==a[i+2]))
{
b=true;
}
}
return b;
}
}
191.Unique Characters  (checkUnique)
******************************
import java.util.ArrayList;
import java.util.List;
public class kape 
{
public static void main(String[] args) 
{
	
			String s1="HOWAREYOU";
			kape1.getvalues(s1);
			}}
			
public class kape1 
{
	public static void getvalues(String s1) {
		String s2=s1.toLowerCase();
		StringBuffer sb=new StringBuffer(s2);
		int l=sb.length();
		int count=0;
		for(int i=0;i<l;i++)
		{ count=0;
		for(int j=i+1;j<l;j++)
		{
		if(sb.charAt(i)==sb.charAt(j))
		{
		sb.deleteCharAt(j);
		count++;
		j--;
		l--;
		 
		}
		}
		if(count>0)
		{
		sb.deleteCharAt(i);
		i--;
		l--;
		}
		}
		if(sb.length()==0)
		{
		System.out.println(-1);
		}
		else
		System.out.println(sb.length());
		}
		}
192.Unique Characters in a string   (uniqueCounter)
*********************************************************************************      HelloWorld/5
public class Main {
/**
* @param args
public static void main(String[] args) {
String s1="HelloWorld";
getvalues(s1);
}
public static void getvalues(String s1) {
String s2=s1.toLowerCase();
StringBuffer sb=new StringBuffer(s2);
int l=sb.length();
int count=0;
for(int i=0;i<l;i++)
{ count=0;
for(int j=i+1;j<l;j++)
{
if(sb.charAt(i)==sb.charAt(j))
{
sb.deleteCharAt(j);
count++;
j--;
l--;
j=i;
}
}
if(count>0)
{
sb.deleteCharAt(i);
i--;
l--;
}
}
if(sb.length()==0)
{
System.out.println(-1);
}
else
System.out.println(sb.length());
}
}
193.Unique Even Sum (addUniqueEven)
******************************
import java.util.ArrayList;
import java.util.List;
public class kape 
{
public static void main(String[] args) 
{
int a[]={2,5,1,4};
System.out.println(kape1.sumOfEvenNos(a));
}}
public class kape1 
{
public static int sumOfEvenNos(int[] a)
{
int sum = 0,count=0;
ArrayList<Integer> lst = new ArrayList<Integer>();
lst.add(a[0]);
for(int i = 1 ; i < a.length ; i++)
{
if(!lst.contains(a[i]))
{
lst.add(a[i]);
}
}
for(int j = 0 ; j < lst.size() ; j++)
{
if(lst.get(j)%2==0)
{
sum+=lst.get(j);
}
else
count++;
}
if(count == lst.size())
return -1;
else 
return sum;
}
}
194.Unique Number  (getUnique)
*****************************************************     123/unique
public class useer{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[100];
		int i=0,count=0;
		while(n!=0)
		{
			int num=n%10;
			a[i]=num;
			i++;
			n=n/10;
		}
		for(int j=0;j<i-1;j++)
		{
			for(int k=j+1;k<=i-1;k++)
			{
				if(a[j]==a[k]){
					count++;
				}
			}}
				if(count>0)
				{
					System.out.println("Invalid");
				}
				else
				{
					System.out.println("valid");
				}
				}}
195.Unique Number    (calculateUnique)
***************************************************************            12/4/3/3
public class User
{
	public static int display(int a,int b,int c)
	{
		int d=0;
	if(a!=b&&a!=c)
	{
		d=3;
	}
	else if(a==b&&a==c)
	{
		d=1;
	}
	else if(a!=b&&a==c)
	
	{
		d=2;
	}
	else if(a==b&&a!=c)
	{
		d=2;
	}
	return d;
}}
196.Valid Date
***********************************************
import java.util.ArrayList;
import java.util.Collections;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
public static void main(String[] args) {
String s="12.03.2012";
getvalues(s);
}
public static void getvalues(String s) {
if(s.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
System.out.println(1);
} catch (ParseException e) {
System.out.println(-1);
}
}
else if(s.matches("[0-9]{2}[/]{1}[0-9]{2}[/][0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
System.out.println(1);
} catch (ParseException e) {
System.out.println(-1);
}
}
else if(s.matches("[0-9]{2}[-]{1}[0-9]{2}[-][0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(s);
System.out.println(1);
} catch (ParseException e) {
System.out.println(-1);
}
}
else
System.out.println(-1);
}
}
***************************main and user main*******************************************
import java.util.Date;
import java.util.Scanner; 
public class Main { 
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in);
	String s=sc.nextLine(); 
int res=Usercode.getvalues(s);
if(res==-1)
	System.out.println("InValid date format");
else 
	System.out.println("Valid date format");
} }
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Usercode{
	public static int getvalues(String s) { 
		int res=0;
if(s.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}")) 
{ 
SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy"); 
sdf.setLenient(false); 
try 
{ 
Date d1=(Date) sdf.parse(s); 
System.out.println(1); 
} catch (ParseException e) { 
res=-1; 
} 
} 
else if(s.matches("[0-9]{2}[/]{1}[0-9]{2}[/][0-9]{4}")) 
{ 
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 
sdf.setLenient(false); 
try 
{ 
Date d1=(Date) sdf.parse(s); 
res= 1; 
} catch (ParseException e) { 
res= -1; 
} 
} 
else if(s.matches("[0-9]{2}[-]{1}[0-9]{2}[-][0-9]{4}")) 
{ 
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy"); 
sdf.setLenient(false); 
try 
{ 
Date d1=(Date) sdf.parse(s); 
res=1; 
} catch (ParseException e) { 
res=-1; 
} 
} 
else 
res= -1;
 
	return res;
}}
197.Validate Number  (validateNumber)
****************************************  -94923
public class Usermaincode
{
public static int display(String s)
{
int count=0,n;
for(int i=1;i<s.length();i++)
{
char c=s.charAt(i);
if(Character.isDigit(c))
count++;
}if(count==s.length()-1)
{n=Integer.parseInt(s);
n=(-1)*n;
}
else
n=-1;
return n;
 
}
}
198.Validate Time  (validateTime)
****************************************
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
StringTokenizer st=new StringTokenizer(str,":");
if(st.countTokens()==3)
{
 
SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm:ss a");
sdf1.setLenient(false);
try
{
 
Date d2=sdf1.parse(str);
System.out.println("Valid time");
}
catch(Exception e)
{
System.out.println("Invalid time");
}
}
else
{
SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
sdf.setLenient(false);
try
{
Date d1=sdf.parse(str);
 
System.out.println("Valid time");
}
catch(Exception e){
System.out.println("Invalid time");
}
}
}
****************main n usermain*******************
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class Main{ 
public static void main(String []args){ 
Scanner sc=new Scanner(System.in); 
String str=sc.nextLine();
int sum=Usercode.display(str);
if(sum==1)
	{System.out.println("Valid ");}
else{
	System.out.println("Invalid");}
}}
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
public class Usercode 
{ 
public static int display(String s) 
{int res=0;
StringTokenizer st=new StringTokenizer(s,":"); 
if(st.countTokens()==3) 
{ 
	
  
SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm:ss a"); 
sdf1.setLenient(false); 
try 
{ 
  
Date d2=sdf1.parse(s); 
res=1; 
} 
catch(Exception e) 
{ 
res=-1; 
} 
} 
else 
{ 
SimpleDateFormat sdf = new SimpleDateFormat("h:mm a"); 
sdf.setLenient(false); 
try 
{ 
Date d1=sdf.parse(s); 
  
res=1; 
} 
catch(Exception e){ 
res=-1; 
} 
}
return res; 
}}
199.Validating Date Format  (validateDate)
*****************************************************************************     12/06/1987
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
public static void main(String[] args) {
String s1="03/01/1987";
getvalues(s1);
}
public static void getvalues(String s1) {
if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
{
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try {
Date d1=sdf.parse(s1);
System.out.println(1);
} catch (ParseException e) {
System.out.println(-1);
}
}
else
System.out.println(-1);
}}
200.Validating Input Password   (validatePassword) 
*****************************************************************************   ashok_23
import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	boolean b=passwordValidation(s1);
	if(b==true)
		System.out.println("valid password");
	else
		System.out.println("not a valid password");
}
public static boolean passwordValidation(String s1) {
	boolean b=false,b1=false,b2=false;
	if(s1.length()>=8)
		if(!Character.isDigit(s1.charAt(0)))
			if(s1.charAt(0)!='@' && s1.charAt(0)!='_' && s1.charAt(0)!='#')
				if(s1.charAt(s1.length()-1)!='@' && s1.charAt(s1.length()-1)!='_' && s1.charAt(s1.length()-1)!='#')
					b1=true;
	if(b1==true)
		for(int i=0;i<s1.length();i++)
			if(Character.isAlphabetic(s1.charAt(i)) || Character.isDigit(s1.charAt(i)) || s1.charAt(i)=='#' || s1.charAt(i)=='@' || s1.charAt(i)=='_')
				b2=true;
	if(b2==true)
		if(s1.contains("#") || s1.contains("@") || s1.contains("_"))
			b=true;
	return b;
}
}
201.Vowel Check  (getVowels)
****************************************************   abceiduosp
public class UserMainCode {
public static int display(String name){
 
 
String s1=name;
int n1=0,n2=0,n3=0,n4=0,n5=0;
for(int i=0;i<s1.length();i++){
char c=s1.charAt(i);
if(c=='a' || c=='A')
n1++;
if(c=='e' || c=='E')
n2++;
if(c=='i' || c=='I')
n3++;
if(c=='o' || c=='O')
n4++;
if(c=='u' || c=='U')
n5++;}
if(n1==1 && n2==1 && n3==1 && n4==1 && n5==1)
return 1;
else
return 0 ;
}
202.Vowel Count
****************************************
import java.util.*;
public class PO 
	{public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int max=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count++;
			}
		}
		if(count>max)
		{
			max=count;
			
		}
	System.out.print(max);}}
203.Vowels  (storeMaxVowelWord)
*************************
 
 
import java.util.StringTokenizer;
 
public class B {
public static void main(String[] args) {
String s1 = "What is your name?";
getvalues(s1);
}
public static void getvalues(String s1) {
int i = 0;
StringTokenizer st = new StringTokenizer(s1," ");
int len = 0;
int count = 0;
int count2 = 0;
String s6 = null;
while (st.hasMoreTokens()) {
String s5 = st.nextToken();
len = s5.length();
count=0;
for (i = 0; i < len; i++) {
if (s5.charAt(i) == 'a' || s5.charAt(i) == 'e'|| s5.charAt(i) == 'i' || s5.charAt(i) == 'o'|| s5.charAt(i) == 'u'
||s5.charAt(i) == 'A' ||s5.charAt(i) == 'E' ||s5.charAt(i) == 'I' ||s5.charAt(i) == 'O' ||s5.charAt(i) == 'U')
count++;
}
if (count > count2)
{
count2 = count;
s6 = s5;
}
}
System.out.println(s6);
}
}
204.Vowels, Arrays & ArrayLists(matchCharacter)
**********************************************
import java.util.*;
public class Main
{
public static void main(String[] args)
{
int n;
		 
Scanner sc=new Scanner(System.in);
n=Integer.parseInt(sc.nextLine());
String[] str=new String[n];
for(int i=0;i<n;i++)
{
str[i]=sc.nextLine();
		 
}
ArrayList<String> arr=new ArrayList<String>();
arr=UserMainCode.getName(str);
Iterator<String> it=arr.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
		 
}
		 
}
import java.util.*;
public class UserMainCode
{
	public static ArrayList<String> getName(String[] ss)
{
ArrayList<String> as=new ArrayList<String>();
for(int i=0;i<ss.length;i++)
{
String sp=ss[i];
char[] mp=sp.toLowerCase().toCharArray();
if((mp[0]=='a'||mp[0]=='e'||mp[0]=='i'||mp[0]=='o'||mp[0]=='u')&&(mp[sp.length()-1]=='a'||mp[sp.length()-1]=='e'||mp[sp.length()-1]=='i'||mp[sp.length()-1]=='o'||mp[sp.length()-1]=='u'))
{
as.add(sp);
}
}
return as;
}
}
205.Word Count - II  (countWord)
******************************************************                    Today is Sunday/3
public class Main {
	public static void main(String[] args) {
	String s1="Today is Sunday";
	StringTokenizer st=new StringTokenizer(s1," ");
	int n=st.countTokens();
    System.out.println(n);
	}
}  
206.Word Count    (countWord)                           
***********************************************************************                     4/a/bb/b/ccc/1/2
public class UserMainCode
{public static int display(int n,String str[],int c)
{
int count=0;
for(int i=0;i<str.length;i++)
{
	if(str[i].length()==c)
	{
		count++;
	}
}
return count; 
}
}
207.Word Count   (sumOfDigits)
***********************
 
public class B 
{
      public static void main(String[] args) 
      {
            String[] s1={"2AA","12","A2C","C5a"};
            getSum(s1);
      }
      public static void getSum(String[] s1) 
      {
            int sum = 0;
            for(int i=0;i<s1.length;i++)
            {
                  String s = s1[i];
                  for(int j = 0;j<s.length();j++)
                  {
                        Character c = s.charAt(j);
                        if(Character.isDigit(c))
                        {
                              sum+=Integer.parseInt(s.valueOf(c));
                        }
                  }
            }
            System.out.println(sum);
      }
}
*/


