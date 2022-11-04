public class Main {
    public static void main(String[] args) {
        
        carro carro1 = new carro();
    
        carro1.setCor("Azul"); 
        carro1.setCapacidadedoTanque(62);
        carro1.setModelo("CRV"); 
        
        System.out.println("Cor:" + carro1.getCor());
        System.out.println("Capacidade do tanque: " + carro1.getCapacidadedoTanque());
        System.out.println("Modelo:" + carro1.getModelo());

        System.out.println("Valor do tanque cheio: " + carro1.valor_Total_Gasolina(5.20));
        
        funcionario funcionario1  = new funcionario();

        funcionario gerente = new funcionario();

        class calculadora implements operacaoMatematica{
            @Override
            public void soma(double num_1, double num_2) {
                System.out.println("Soma: " + (num_1 + num_2));
            }
            @Override
            public void subtracao(double num_1, double num_2) {
                System.out.println("Subtracao: " + (num_1 - num_2));
            }
            @Override
            public void multiplicacao(double num_1, double num_2) {
                System.out.println("Multiplicacao: " + (num_1 * num_2));    
            }
            @Override
            public void divisao(double num_1, double num_2) {
                System.out.println("Divisao: " + (num_1 / num_2));
            }
        }
    }
}
