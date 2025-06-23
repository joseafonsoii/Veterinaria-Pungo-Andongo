public abstract class Visita {
    private String data;
    private double custo;
    private int qtdVisitas = 0;
    private Animal animal;

    
        public Visita(int dia ,int mes, int ano,double custo,Animal a ) {
            this.data =String.format("%d/%d/%d",dia,mes,ano);
            this.custo = custo;
            this.qtdVisitas++;
            this.animal = a;
    }
    
    public void setData(String data) {
        this.data = data;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getData() {
        return data;
    }

    public double getCusto() {
        return custo;
    }
    public int getQtdVisitas() {
        return qtdVisitas;
    }

    public void setQtdVisitas(int qtdVisitas) {
        this.qtdVisitas = qtdVisitas;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "\tVisita [DATA:" + data + "|CUSTO:" + custo + ", QUANTIDADE DE VISITAS:" + 
        qtdVisitas + "ID DO ANIMAL:" + animal.getIDA()+"]";
    }

}

