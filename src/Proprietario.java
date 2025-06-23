public class Proprietario {
    private String nome;
    private String ID;
    private String Contacto;


    
    public Proprietario(String nome, String iD, String contacto) {
        this.nome = nome;
        ID = iD;
        Contacto = contacto;
    }
    public Proprietario() {
        //TODO Auto-generated constructor stub
    }
    public String getNomeP() {
        return nome;
    }
    public void setNomeP(String nome) {
        this.nome = nome;
    }
    public String getIDP() {
        return ID;
    }
    public void setIDP(String iD) {
        ID = iD;
    }
    public String getContacto() {
        return Contacto;
    }
    public void setContacto(String contacto) {
        Contacto = contacto;
    }
    
}
