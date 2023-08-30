public class Turista {

   private String nome;
    String cpf;


    //Método
    public String viajar(){
        return  "Viajando...";
    }
    //construtor padrão
    Turista(){

    }
    //Sobrecarga do construtor personalizada
    Turista(String _nome){
        this.nome = _nome;
    }
        //Encapsulamento - Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
