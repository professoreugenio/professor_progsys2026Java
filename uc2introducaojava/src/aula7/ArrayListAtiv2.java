package aula7;
import java.util.ArrayList;
public class ArrayListAtiv2 {
	public static void main(String[] args) {
		
		ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Mouse");
        produtos.add("Teclado");
        produtos.add("Monitor");

        produtos.set(0, "Mouse Gamer");
        produtos.remove(1);

        System.out.println("===== PRODUTOS =====");

        for (String produto : produtos) {
            System.out.println(produto);
        }
	}

}
