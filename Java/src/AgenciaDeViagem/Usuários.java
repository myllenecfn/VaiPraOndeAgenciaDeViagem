package AgenciaDeViagem;

public class Usuários {
    
    private int CPF;
   
    private String Nome;
    
    private String Email;
   
    private String Senha;
    

    private Pacotes pacotes;
    
    private int getCPF() {
        return this.CPF;
    }
    
    private int setCPF(Integer CPF) {
        this.CPF = CPF;
    }
   
    private String getNome() {
        return this.Nome;
    }
   
    private String setNome(String Nome) {
        this.Nome = Nome;
    }
    

    private String getEmail() {
        return this.Email;
    }
   
    private String setEmail(String Email) {
        this.Email = Email;
    }
   
    private String getSenha() {
        return this.Senha;
    }
    
    private String setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
    public Pacotes getPacotes() {
        return this.pacotes;
    }
    
    public Pacotes setPacotes(Pacotes pacotes) {
        this.pacotes = pacotes;
    }
    
    
    
}
