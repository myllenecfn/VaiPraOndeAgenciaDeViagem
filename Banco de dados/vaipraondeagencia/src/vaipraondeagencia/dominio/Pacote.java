package vaipraondeagencia.dominio;

public class Pacote {
	private Integer id_pacote;
	private Integer id_cliente;
	private String preco_pacote;
	private String cidade_origem;
	private String cidade_destino;
	private String hora_partida;
	private String hora_chegada;
	
	public Integer getId_pacote() {
		return id_pacote;
	}
	public void setId_pacote(Integer id_pacote) {
		this.id_pacote = id_pacote;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getPreco_pacote() {
		return preco_pacote;
	}
	public void setPreco_pacote(String preco_pacote) {
		this.preco_pacote = preco_pacote;
	}
	public String getCidade_origem() {
		return cidade_origem;
	}
	public void setCidade_origem(String cidade_origem) {
		this.cidade_origem = cidade_origem;
	}
	public String getCidade_destino() {
		return cidade_destino;
	}
	public void setCidade_destino(String cidade_destino) {
		this.cidade_destino = cidade_destino;
	}
	public String getHora_partida() {
		return hora_partida;
	}
	public void setHora_partida(String hora_partida) {
		this.hora_partida = hora_partida;
	}
	public String getHora_chegada() {
		return hora_chegada;
	}
	public void setHora_chegada(String hora_chegada) {
		this.hora_chegada = hora_chegada;
	}
	
	
}
