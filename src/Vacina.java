public class Vacina extends Visita {
    private String nomeVacina;
    
        public Vacina(String nomeVacina,int dia,int mes,int ano,Animal a) {
            super(dia,mes,ano,500.0,a);
            this.nomeVacina = nomeVacina;
        
    }
    
    public void setNomeVacina(String nomeVacina) {
            this.nomeVacina = nomeVacina;
        }
      
    public String getNomeVacina() {
        return nomeVacina;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Vacina, Nome da Vacina: " + nomeVacina;
    }

}