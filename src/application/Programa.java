package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import services.Servico;

public class Programa {

	public static void main(String[] args) {
		List<Produto> listaP = new ArrayList<>();
		listaP.add(new Produto("TV", 900.00));
		listaP.add(new Produto("Mouse", 50.00));
		listaP.add(new Produto("Tablet", 350.00));
		listaP.add(new Produto("HD Case", 80.90));
		
		Servico servico = new Servico();
		
		Double sum = servico.soma(listaP,p->p.getPreco()<100.00);
		
		System.out.println("Soma produtos T ="+String.format("%.2f", sum));
	}

}
