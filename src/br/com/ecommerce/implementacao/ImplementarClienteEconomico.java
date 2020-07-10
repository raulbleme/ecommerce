package br.com.ecommerce.implementacao;
import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.tela.Magica;

public class ImplementarClienteEconomico {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(
				Magica.i("Digite o código:"), 
				Magica.t("Digite o nome:").toUpperCase(), 
				Magica.t("Digite o e-mail:").toLowerCase(), 
				Magica.t("Digite o telefone:"), 
				Magica.t("Digite o CPF:"), 
				Magica.f("Digite o limite:"));
		
		System.out.println(cliente.getAll());
	}

}
