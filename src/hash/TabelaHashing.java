package hash;

public class TabelaHashing {
	private int tam;
	private Hash tabela[];
	
	public TabelaHashing(int tam) {
		this.tam = tam;
		tabela = new Hash[tam];
		//inicializarTabela();
	}
	
	public void inserir(int num) {
		int pos = funcao_hashing(num);
		Hash novo = new Hash();
		novo.setChave(num);
		novo.setProx(tabela[pos]);
		tabela[pos] = novo;
	}
	
	public void remover(int num) {
		int pos = funcao_hashing(num);
		
		if(tabela[pos] != null) {
			if (tabela[pos].getChave() == num) {
				tabela[pos] = tabela[pos].getProx();
			}
			else {
				Hash ant = tabela[pos];
				Hash aux = tabela[pos].getProx();
				
				while (aux != null && aux.getChave() != num) {
					ant = aux;
					aux= aux.getProx();
				}
				
				if(aux != null)
					ant.setProx(aux.getProx());
			}
		}
	}
	
	public Hash buscar(int num) {
		return null;
	}
	
	public void mostrarTabela() {
		for (int i = 0; i < tam; i++) {
			Hash aux = tabela[i];
			
			while(aux != null) {
				System.out.println("Entrada " + i + " : " + aux.getChave());
				aux = aux.getProx();
			}
		}
	}
	
	private int funcao_hashing(int num) {
		return num%tam;
	}
	
	private void inicializarTabela() {
		for (int i = 0; i < tam; i++)
			tabela[i] = null;
	}
}
