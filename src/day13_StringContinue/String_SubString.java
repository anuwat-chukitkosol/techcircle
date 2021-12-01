package day13_StringContinue;

public class String_SubString {

	public static void main(String[] args) {
//					   0123456789
		String word = "television";
		
		String word2 = word.substring(2,5);
		
		System.out.println(word2);
		
		System.out.println(word.substring(4));
		
		System.out.println(word.substring(4,word.length()));
		
//		String email = "irfan.tursun@techcircleSolutions.org";
		
//		Write a program to find the domain name of the following emails
		
		String email2 = "test@gmail.com";
		
		String email3 = "test@yahoo.com";
		
		String email4 = "test@outlook.com";
		
		String email5 = "test@github.com";
		
		System.out.println(email2.substring(5,10));
		System.out.println(email2.substring(email2.indexOf('@')+1,email2.indexOf('.')));
		
		System.out.println(email3.substring(5,10));
		
		System.out.println(email4.substring(5,12));
		
		System.out.println(email5.substring(5,11));
		
		String email6 = "FirstNameLastName@gmail.com";
		
		System.out.println(email6.indexOf('@'));
		
		int startPosition = email6.indexOf('@')+1;
		int endPosition = email6.indexOf('.');
		
		System.out.println(email6.substring(startPosition,endPosition));
		
		String email = "irfan.tursun@techcircleSolutions.org";
		
		int b = email.indexOf('@')+1;
		int e = email.indexOf('.',b);
		int lastPosition = email.lastIndexOf('.');
		
		
		String domainName = email.substring(b,e);
		System.out.println(domainName);
		
		String domain2 = email.substring(b,lastPosition);
		System.out.println(domain2);
		
//		Write a program to find first and last name of the given email
		
		String email7 = "Shafkat.ali@techcirclesolutions.org";
		
		int endFirstName = email7.indexOf('.');
		int beginLastName = email7.indexOf('.')+1;
		int endLastName = email.indexOf('@')-1;
		
		String FirstName = email7.substring(0,endFirstName);
		String LastName = email7.substring(beginLastName,endLastName);
		
		System.out.println(FirstName);
		System.out.println(LastName);


	}

}
