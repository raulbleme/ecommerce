package br.com.ecommerce.implementacao;
import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class ImplementarProduto {

	public static void main(String[] args) {
		
		//Instanciando um objeto da classe Produto
		Produto objeto = new Produto();
		objeto.preencherCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um código:")));
		objeto.preencherDescricao(JOptionPane.showInputDialog("Descrição"));
		objeto.preencherQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:")));
		objeto.preencherValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da compra:")));
		objeto.preencherValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da venda:")));

		
		System.out.println("Código..... : " + objeto.retornarCodigo());
		System.out.println("Descrição.. : " + objeto.retornarDescricao());
		System.out.println("Qtde....... : " + objeto.retornarQtde());
		System.out.println("Valor Compra: " + objeto.retornarValorCompra());
		System.out.println("Valor Venda:  " + objeto.retornarValorVenda());
		System.out.println("----------");
		System.out.println("Total Venda: " + objeto.retornarTotalVenda());
		System.out.println("Total Compra: " + objeto.retornarTotalCompra());
		System.out.println("Valor à vista: " + objeto.retornarValorAVista());
		System.out.println("Valor das parcelas (3x): " + objeto.retornarParcela(3));
		
		objeto.atualizarValores(Float.parseFloat(JOptionPane.showInputDialog("Digite o percentual de reajuste do valor de venda:")));
		System.out.println("Novo valor de venda: " + objeto.retornarValorVenda());
		
		objeto.novoValorAVista(Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto desejado:")));
		System.out.println("Novo valor de venda à vista: " + objeto.retornarNovoValorAVista());
		
		
	}

}
