package entidades;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidades;
	
	public double valorTotalNoEstoque() {
		return preco * quantidades;
	}
	public void adicionarProduto(int quantidades) {
		this.quantidades+=quantidades;
	}
	public void removerProduto(int quantidades) {
		this.quantidades-=quantidades;
	}
	@Override
	public String toString() {
		return "\nDados do produto:"
				+"\nNome: "+nome
				+"\nValor: "+String.format("%.2f", preco)
				+"\nQuantidade em estoque: "+quantidades
				+"\nValor total do produto: "+String.format("%.2f", valorTotalNoEstoque());
	}
}
