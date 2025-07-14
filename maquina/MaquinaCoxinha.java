public class MaquinaCoxinha {
    
    private int quantidadeCoxinhas;
    
    public MaquinaCoxinha(){
        quantidadeCoxinhas = 0;
    }

    public void setQuantidade(){
        this.quantidadeCoxinhas = quantidadeCoxinhas;
    }
    
    public int getQuantidade(){
        return quantidadeCoxinhas;
    }
    
    public void abastecer(int quantidadeAbastecer){
        
        if(quantidadeAbastecer >= 0){
            quantidadeCoxinhas += quantidadeAbastecer;
        }
        //System.out.println("Quantidade total depois de abastecer: " + quantidadeCoxinhas);
    }
    
    public void venderCoxinhas(){
        if(quantidadeCoxinhas > 0){
            quantidadeCoxinhas --;
        }
    }
    
    public void venderCoxinhas(int quantidadeCompra){
        int soma = 0;
        if(quantidadeCompra <= quantidadeCoxinhas && quantidadeCompra > 0){
        quantidadeCoxinhas -= quantidadeCompra;
        }
    }
    
    public void zerarMaquina(){
        quantidadeCoxinhas = 0;
    }
}
