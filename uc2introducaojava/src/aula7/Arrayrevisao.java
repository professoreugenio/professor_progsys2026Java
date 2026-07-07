package aula7;

public class Arrayrevisao {

	public static void main(String[] args) {
		
		String[] nomes = {
				"CARLOS",
				"ANDRÉ",
				"LUÍS",
				"MARIA",
				"JOSE"
		};
		
		String listarnomes="";
		
		for(int i=0;i<nomes.length;i++) {
			listarnomes += nomes[i]+"\n";
		}
		
		System.out.println(listarnomes);

	}

}
