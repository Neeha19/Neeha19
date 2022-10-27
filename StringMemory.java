package loop.main;

public class StringMemory {

	public static void main(String[] args) {
		String s1= "Neeha";
		String s2= "neeha";
		String s3= new String("Neeha");
		String s4= new String("neeha");
		//== operator compares references but not the value being stored
		//== returns the boolean value 
		//String Constant Pool  area which is present in heap will not allow duplicates
		
		System.out.println(s4==s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s3.equalsIgnoreCase(s2));
		
		
		System.out.println(s1==s2);
		
		String str1="Nee";
		String str2="Neeharika";
		System.out.println(str2.compareTo(str1));
		
		//Concatenation using concat method or using + operator
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat("harika"));
		System.out.println(str1);
		
		//str2 is immutable string it cannot be chnged once concatination is done the value is not being referenced 
		//str1=str2.concat(str1);
		System.out.println(str1);
		System.out.println(str1==str2);
		
		
		
		
		
		String str3="Nee" + "harika";
		System.out.println(str3);
		
		
		
		
//Example
		
		
String str11="Telusko";
String str12="Ineuron";
String str13="Telsuko" + "Ineuron"; // value is stored in String Constant pool compile time only it will be resolved
String str14=str11+str12; // value is stored in  main heap area  run time execution

String str15= str11 + "Ineuron";// it is in main Heap area 

System.out.println(str15==str14);


String str0= "RajaRamMohanRoy"; // in SCP
System.out.println(str0.toLowerCase()); // in heap area
System.out.println(str0.toUpperCase()); // in heap area
// System.out.println(s1(3));  It will not work


System.out.println(str0.substring(4,8));
//System.out.println(str0.charAt(31)); //java.lang.StringIndexOutOfBoundsException 


System.out.println(str0.length()); // in String length is method and in array length is property 





StringMemory sm = new StringMemory( );
System.out.println(sm);

String S2 = new String("Abc");
System.out.print(s2);






		
		
		
		
		
		

	}

}
