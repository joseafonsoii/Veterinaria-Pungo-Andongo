public class Animal {
   private String nome;
   private String raca;
   private String especie;
   private String dataBirth;
   private String IDA;
   private Proprietario proprietario;
   private int idade;
   private int qtd=0;
  
      
   public Animal(String nome, String raca, String especie, int dia ,int mes,int ano, Proprietario proprietario,String id) {
       this.nome = nome;
       this.raca = raca;
       this.especie = especie;
       this.dataBirth = String.format("%d/%d/%d",dia,mes,ano);
       this.proprietario = proprietario;
       this.IDA = id;
       this.idade = calcularIdade(ano);
       this.qtd++;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getRaca() {
    return raca;
}

public void setRaca(String raca) {
    this.raca = raca;
}

public String getEspecie() {
    return especie;
}

public void setEspecie(String especie) {
    this.especie = especie;
}

public String getDataBirth() {
    return dataBirth;
}

public void setDataBirth(String dataBirth) {
    this.dataBirth = dataBirth;
}

public Proprietario getProprietario() {
    return proprietario;
}

public void setProprietario(Proprietario proprietario) {
    this.proprietario = proprietario;
}

public String getIDA() {
    return IDA;
}

public void setIDA(String iDA) {
    IDA = iDA;
}

   public int calcularIdade(int ano){
    int niver = 2025 - ano;
    return niver;

   }

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
    
}

public int getQtd() {
    return qtd;
}

public void setQtd(int qtd) {
    this.qtd = qtd;
}

@Override
public String toString() {
    return "Animal [nome=" + nome + ", raca=" + raca + ", especie=" + especie + ", dataBirth=" + dataBirth + ", IDA="
            + IDA + ", proprietario=" + proprietario.getIDP() + ", idade=" + idade + ", qtd=" + qtd + "]";
}
   
    
    
}
