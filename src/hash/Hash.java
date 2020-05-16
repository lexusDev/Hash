package hash;

public class Hash {
	private int chave;
	private Hash prox;
	
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public Hash getProx() {
		return prox;
	}
	public void setProx(Hash prox) {
		this.prox = prox;
	}
}
