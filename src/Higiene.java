// Classe filha: Higiene
class Higiene extends Visita {
  
    
        public Higiene(int dia,int mes,int ano,Animal animal) {
            super(dia,mes,ano,100,animal);
        
    }

    @Override
    public String toString() {
        return "\t" +super.toString() + ", Tipo: Higiene";
    }

}