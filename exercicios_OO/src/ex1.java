class carro{
    
    String cor;
    String modelo;
    int capacidade_Do_Tanque;

    carro(){

    }   

    carro(String cor, String modelo, int capacidade_Do_Tanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidade_Do_Tanque = capacidade_Do_Tanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadedoTanque(int capacidade_Do_Tanque){
        this.capacidade_Do_Tanque = capacidade_Do_Tanque;
    }
    int getCapacidadedoTanque(){
        return capacidade_Do_Tanque;
    }


    double valor_Total_Gasolina(double valor_Litro){
        return valor_Litro * capacidade_Do_Tanque;
    }

    protected void finalize(){
        
    }
}
