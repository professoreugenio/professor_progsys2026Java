package aula08.poo;

public class Pessoaview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.nome ="Paula Lins";
		pessoa1.idade =48;
		pessoa1.nacionalidade ="Brasileira";
		
		pessoa1.sexo ="Feminino";
		pessoa1.profissao ="Nutricionista";
		pessoa1.peso =58;
		pessoa1.altura =1.87;
		
		
		pessoa2.nome ="João Paulo";
		pessoa2.idade =20;
		pessoa2.nacionalidade ="Brasileira";
		
	
		
		pessoa1.exibirPessoa();
		pessoa1.exibirDadosExtras();
		pessoa2.exibirPessoa();

	}

}
