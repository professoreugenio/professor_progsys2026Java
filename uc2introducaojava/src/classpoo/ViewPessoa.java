package classpoo;

public class ViewPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();		
		Pessoa pessoa2 = new Pessoa();		
		
		pessoa1.nome = "Paula Lins";
		pessoa1.idade = 45;
		pessoa1.cidade = "Baturité";		
		pessoa2.nome = "Carlos Lima";
		pessoa2.idade = 35;
		pessoa2.cidade = "Maracanaú";		
		
		
		
		
		pessoa1.apresentar();
		pessoa2.apresentar();
		

	}

}
