package prractise;

import java.util.Iterator;

public class Stringg {

	public static void main(String[] args) {
		String a = "sivai";
		String b = "siva";

		String c = new String("david");
		String re = new String("Rupey999");

		System.out.println(a);

		System.out.println("----------------------------------------Splitt");

		String[] s = a.split("");
		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i]);
		}
		System.out.println("----------------------------------------char at");

		char chara = a.charAt(2);
		System.out.println(chara);

		System.out.println("----------------------------------------comparing");

		boolean eq = a.equals(c);
		System.out.println(eq);

		System.out.println("----------------------------------------Reverse");
		char[] chare = a.toCharArray();

		for (int i = chare.length - 1; i >= 0; i--) {
			System.out.print(chare[i]);
		}
		System.out.println("\n----------------------------------------replace");

		String replace = a.replace("i", "j");
		System.out.println(replace);

		System.out.println("----------------------------------------char occurence");
		char[] charec = a.toCharArray();
		int count = 0;

		for (int i = 0; i < charec.length; i++) {
			if (charec[i] == 'i') {
				count++;
				System.out.println(count);
				System.out.println(a.contains(a));

		System.out.println("----------------------------------------regular expression");

				String replaceAll = re.replaceAll("[^a-zA-Z]", "");
				System.out.println(replaceAll);

				String replaceAll2 = re.replaceAll("[^0-9]", "");
				System.out.println(replaceAll2);

				
				int parseInt = Integer.parseInt(replaceAll2); 
				System.out.println(parseInt);
				System.out.println(parseInt+1);
				 
		System.out.println("----------------------------------------printing string");
		char[] charect = a.toCharArray();
		String u= ""; 
		for(int i1=0; i1< charect.length; i1++) {
		u=u+charect[i1];
			System.out.println(u);
			}

		}

	}
	}}
