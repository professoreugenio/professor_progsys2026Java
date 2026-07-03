package aula05;
import config.Datahorapadraobr;
import config.Autor;
public class Testeimportdata {

	public static void main(String[] args) {
		
		Datahorapadraobr mickey = new Datahorapadraobr();
		Autor nome = new Autor();
		
		
		System.out.println(mickey.datahoraFormatada());
		System.out.println(nome.meuNome());
		System.out.println(nome.meuCurso());
		
	}

}
