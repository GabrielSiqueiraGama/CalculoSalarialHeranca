package entities;

public class Tercerizado extends Funcionario{
	
	private Integer CustoAdicional;
	
	public Tercerizado(){
		super();
	}
	public Tercerizado(String nome, Integer horas, Double valorHora, Integer custoAdicional) {
		super(nome, horas, valorHora);
		CustoAdicional = custoAdicional;
	}
	public Integer getCustoAdicional() {
		return CustoAdicional;
	}
	public void setCustoAdicional(Integer custoAdicional) {
		CustoAdicional = custoAdicional;
	}
	@Override
	public double Pagamento() {
		return super.Pagamento() + CustoAdicional * 1.1;
	}
	
}
