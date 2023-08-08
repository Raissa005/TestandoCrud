package provacrud;

import javax.swing.JOptionPane;
import provacrud.Produtos;

public class Main {
     
    public static void main(String[] args) {
          menu();
    }
    
    public static void menu(){
        
        String opcao;
      do{
            opcao = JOptionPane.showInputDialog(null, "Bem vindo à JôJoias! \n "
                                                                  + "Menu:  \n"
                                                                  +"1- Colsultar produtos \n"
                                                                  +"2-  Cadastrar novo produto \n"
                                                                  +"3-  Excluir sua reserva \n"
                                                                  +"4- Reservar produto \n"
                                                                 +"5- Saida de produto \n"
                                                                 + "6- Fechar \n");
              if("1".equals(opcao)){  
                    new Produtos(null, 0.0, 0, 0).consultarP();
             }else if("2".equals(opcao)){
                 int prodEst =  JOptionPane.showConfirmDialog(null, "Você quer adicionar mais produtos ao estoque?");
                 if(prodEst == 0){
                     new Produtos(null, 0.0, 0, 0).cadastrar();
                  }
             }else if("3".equals(opcao)){
                   new Produtos(null, 0.0, 0, 0).excluirP();
             }else if ("4".equals(opcao)){
                 int prodEst =  JOptionPane.showConfirmDialog(null, "Você deseja reservar mais produtos?");           
                 if(prodEst == 0){
                         new Produtos(null, 0.0, 0, 0).adicionarRes();
                  }
             }else if("5".equals(opcao)){
                   new Produtos(null, 0.0, 0, 0).atualizar();
             }    
      } while(!"6".equals(opcao));
    }
}
