package provacrud;

import javax.swing.JOptionPane;

public class Produtos {
    private String nome;
    private Double valorUnic;
    private int qtdDisponivel;
    private int qtdReservada;
    
    public Produtos(String nome, Double valorUnic, int qtdDisponivel, int qtdReservada){
        this.nome = nome;
        this.valorUnic = valorUnic;
        this.qtdDisponivel = qtdDisponivel;
        this.qtdReservada = qtdReservada;
    }
  
     public void consultarP(){
        JOptionPane.showMessageDialog(null, Produtos.this.nome 
                                                                       +" \n Valor : " + Produtos.this.valorUnic 
                                                                       +"\n Qtd disponiveis: "+ Produtos.this.qtdDisponivel 
                                                                       + "\n Qtd reservadas: "+ Produtos.this.qtdReservada);
    }
     
       public void cadastrar(){
          String nomeP = JOptionPane.showInputDialog(null, "Qual é o produto? > ");
         Double  valorP =  Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do produto? > "));
         Integer dispP = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos produtos disponíveis no estoque?> "));
         Integer reserP = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos produtos reservados?> "));
          Produtos novoP  = new Produtos(nomeP, valorP, dispP, reserP);
         JOptionPane.showMessageDialog(null, "Sucesso!   "+ Produtos.this.nome +"\n"
              +"Valor: "+Produtos.this.valorUnic + "\n"
              +"Quantidade disponivel: "+Produtos.this.qtdDisponivel + "\n"
              +"Quantidade reservada "+Produtos.this.qtdReservada );
    }
     
         public void excluirP(){
          int prodEst =  JOptionPane.showConfirmDialog(null, "Você quer excluir seu produto reservado? ");
        if(prodEst ==0){
           Produtos.this.qtdDisponivel ++;
           Produtos.this.qtdReservada--;
            JOptionPane.showMessageDialog(null, "Agora há "+qtdReservada+" produtos reservados.");
        }
    }
     
     public void adicionarRes(){
           Integer  prodRes =  Integer.parseInt( JOptionPane.showInputDialog(null, "Qual produto você deseja reservar? "+ Produtos.this.nome, Produtos.this.qtdDisponivel));
           int prodDis = Produtos.this.qtdDisponivel;
          prodDis = prodDis - prodRes;
          Produtos.this.qtdDisponivel = prodDis;
         prodRes += Produtos.this.qtdReservada;
           Produtos.this.qtdReservada = prodRes;
            JOptionPane.showMessageDialog(null, "Agora há  "+ qtdReservada +" produtos reservados. \n"
                                                                                                                + qtdDisponivel + " produtos disponíveis. ");
        
    }
     
    public void atualizar(){
        int prodEst =  JOptionPane.showConfirmDialog(null, "Você quer finalizar a compra do produto reservado? ");
        if(prodEst ==0){
           Produtos.this.qtdReservada--;
            JOptionPane.showMessageDialog(null, "Agora há "+qtdReservada+" produtos reservados.");
        } 
    }
}
/*
for(p : nome)
 if p.nome.equals(prod){
*/