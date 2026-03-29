package view;
import java.io.IOException;

import model.*;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		int vet[] = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5 };
		
		for(int i = 0; i<vet.length; i++) {
			if(vet[i]>=0) {
				p.push(vet[i]);
			}
			else if(vet[i]<0) {
				try {
					int n1 = p.pop();
					int n2 = p.pop();
					
					p.push(vet[i]);
					p.push(n1+n2);
					
				}catch(Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
		System.out.println("Quantidade de valores presentes na pilha: "+p.size());

	}

}
