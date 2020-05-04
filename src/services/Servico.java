package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class Servico {
	public Double soma(List<Produto> lista, Predicate<Produto> criterio) {
		Double sum = 0.0;
		for(Produto p : lista) {
			if(criterio.test(p)) {
				sum+=p.getPreco();
			}
		}
		return sum;
	}
}
