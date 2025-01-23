import java.util.*;
class Q8_AmarAkbarAnthony{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ageAmar = sc.nextInt();
		int ageAkbar = sc.nextInt();
		int ageAnthony = sc.nextInt();
		double heightAmar = sc.nextDouble();
		double heightAkbar = sc.nextDouble();
		double heightAnthony = sc.nextDouble();
		if(ageAkbar <= ageAmar && ageAkbar <= ageAnthony)
			System.out.println("Akbar is the youngest with age : "+ageAkbar+" years old");
		else if(ageAnthony <= ageAmar && ageAnthony <= ageAkbar)
			System.out.println("Anthony is the youngest with age : "+ageAnthony+" years old");
		else if(ageAmar <= ageAkbar && ageAmar <= ageAnthony)
			System.out.println("Amar is the youngest with age : "+ageAmar+" years old");
		if(heightAkbar >= heightAmar && heightAkbar >= heightAnthony)
			System.out.println("Akbar is the tallest with height : "+heightAkbar+" cm");
		else if(heightAnthony >= heightAmar && heightAnthony >= heightAkbar)
			System.out.println("Anthony is the tallest with height : "+heightAnthony+" cm");
		else if(heightAmar >= heightAkbar && heightAmar >= heightAnthony)
			System.out.println("Amar is the tallest with height : "+heightAmar+" cm");
			
	}
}