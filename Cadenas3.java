package ppp;

public class Cadenas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Autor1,Autor2,Autor3,Autor4;
		
		Autor1 = "Murakami";
		Autor2 = "Sabato";
		
		System.out.println(Autor1.equals(Autor2));
		
		Autor3 ="Murakami";
		
		Autor4 = "murakami";
		System.out.println(Autor1.equals(Autor3));
		
		System.out.println(Autor1.equalsIgnoreCase(Autor4));
	}

}
