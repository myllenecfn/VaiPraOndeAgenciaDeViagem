package AgenciaDeViagem;

public class Pacotes {
   
    private int ID_Pacote;
    
    private int Preço_Pacote;
    
    private String Cidade_Origem;
    
    private String Cidade_Destino;
    
    private String Hora_Partida;
    
    private String Hora_Chegada;
    
    private Usuários usuários;
    
    
    private int getID_Pacote() {
        return this.ID_Pacote;
    }
    
    private int setID_Pacote(Integer ID_Pacote) {
        this.ID_Pacote = ID_Pacote;
    }
    

    private int getPreço_Pacote() {
        return this.Preço_Pacote;
    }
    

    private int setPreço_Pacote(Integer Preço_Pacote) {
        this.Preço_Pacote = Preço_Pacote;
    }
    

    private String getCidade_Origem() {
        return this.Cidade_Origem;
    }
    
    private String setCidade_Origem(String Cidade_Origem) {
        this.Cidade_Origem = Cidade_Origem;
    }
    
    private String getCidade_Destino() {
        return this.Cidade_Destino;
    }
    
    private String setCidade_Destino(String Cidade_Destino) {
        this.Cidade_Destino = Cidade_Destino;
    }
    
    
    private String getHora_Partida() {
        return this.Hora_Partida;
    }
    
    private String setHora_Partida(String Hora_Partida) {
        this.Hora_Partida = Hora_Partida;
    }
    
    private String getHora_Chegada() {
        return this.Hora_Chegada;
    }
    
    
    private String setHora_Chegada(String Hora_Chegada) {
        this.Hora_Chegada = Hora_Chegada;
    }
    
    
    
    public Usuários getUsuários() {
        return this.usuários;
    }
    
    public Usuários setUsuários(Usuários usuários) {
        this.usuários = usuários;
    }
    
    
    
}
