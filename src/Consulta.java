// Classe filha: Consulta
class Consulta extends Visita {
    private String motivoConsulta;
   

    
        public Consulta(String motivoConsulta,Animal animal,int dia,int mes,int ano) {
            super(dia,mes,ano,300.0,animal);
            this.motivoConsulta = motivoConsulta;
    }
    

    


    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    @Override
    public String toString() {
        return super.toString() + "\tTipo de visita: Consulta\n"+ "Motivo:" + motivoConsulta + "]"+ "\n" ;
    
}
}