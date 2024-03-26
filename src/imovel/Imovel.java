package imovel;


public class Imovel {
    private String bairro;
    private int quartos, vagasGaragem;
    private boolean churrasqueira;
    private double investimento;
    
    public Imovel (String bairro, int quartos, int vagasGaragem, boolean churrasqueira, double investimento) {
        this.bairro = bairro;
        this.quartos = quartos;
        this.vagasGaragem = vagasGaragem;
        this.churrasqueira = churrasqueira;
        this.investimento = investimento;
    }
    
    //setters
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public void setQuartos(int quartos){
        this.quartos = quartos;
    }
    
    public void setVagasGaragem(int vagasGaragem){
        this.vagasGaragem = vagasGaragem;
    }
    
    public void setChurrasqueira(boolean churrasqueira){
        this.churrasqueira = churrasqueira;
    }
    
    public void setInvestimento (double investimento){
        this.investimento = investimento;
    }
    
    //getters
    
    public String getBairro(){
        return this.bairro;
    }
    
    public int getQuartos(){
        return this.quartos;
    }
    
    public int getVagasGaragem(){
        return this.vagasGaragem;
    }
    
    public boolean getChurrasqueira(){
        return this.churrasqueira;
    }
    
    public double getInvestimento(){
        return this.investimento;
    }
    
    // toString
    
    @Override
    public String toString(){
        if (this.churrasqueira == true){
            return "Bairro: "+this.bairro+".\nQuartos: "+this.quartos+".\nVagas garagem: "+this.vagasGaragem+".\nChurrasqueira? Sim\nInvestimento: "+this.investimento;
        }else{
            return "Bairro: "+this.bairro+".\nQuartos: "+this.quartos+".\nVagas garagem: "+this.vagasGaragem+".\nChurrasqueira? Não\nInvestimento: "+this.investimento;
        }
    }
}
