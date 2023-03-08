import java.util.Scanner;

public class App 
{
    
  public static void main(String[] args) {
    
  }  
  {                                                            // Menu
    Scanner scanmenu = new Scanner(System.in);
    System.out.println(" ");
    System.out.println("      JOGO DA FORCA      ");
    System.out.println("+ --------------------- +");
    System.out.println("|  1 - Inicio do jogo   |");
    System.out.println("|-----------------------|");
    System.out.println("|     2 - Creditos      |");
    System.out.println("|-----------------------|");
    System.out.println("|   3 - Sair do jogo    |");
    System.out.println("+ --------------------- +");
    System.out.println(" ");
    System.out.println("Selecione o numero desejado (1, 2 e 3):");      
    int escolhaMenu = scanmenu.nextInt();                             // IF MENU

    if (escolhaMenu>=1 && escolhaMenu<=3) 
    {                                                                  //SWITCH MENU 

        switch (escolhaMenu) 
     
        
      { 
         case 1:
        Scanner scantema = new Scanner(System.in);
        System.out.println("escolha o tema que você deseja:");
        System.out.println("1- Pokemon");
        System.out.println("2- Filmes");
        System.out.println("3- Jogadores de futebol");
        System.out.println("4- Marca");
        System.out.println("5- Herois da Marvel");
          int escolhaTema = scantema.nextInt();                         // SWITCH TEMAS

          switch (escolhaTema) {                                        //TEMA 1

            case 1:
            System.out.println("layout forca 1");
            char espaço1 = "p";
            char espaço2 = "i";
            char espaço3 = "c";
            char espaço4 = "h";
            char espaço5 = "u";
            Scanner scantentativa = new Scanner(System.in);
            char tentativa1 = scantentativa.next();                                   //IF TEMA 1
            
            if (tentativa1 = espaço1) {
                System.out.println(espaço1);
            } else if (tentativa1 = espaço2){
              System.out.println(espaço2);
          }   
              else if (tentativa1=espaço3){
                System.out.println(espaço3);
              }
              else if (tentativa1=espaço4) {
                System.out.println(espaço4);
              }
              else if (tentativa1=espaço5) {
                System.out.println(espaço5);
              }

            
          
          
          
          
          
          
          break;
            case 2:                                        //TEMA 2
            System.out.println("layout forca 2 ");
            System.out.println("Criação das variaveis 2");             //TEMA 3 
             break;
            case 3:
            System.out.println("layout forca 3 ");
            System.out.println("Criação das variaveis ");             //TEMA 4
             break;
            case 4:
            System.out.println("layout forca 4");
            System.out.println("Criação das variaveis 4 ");             // TEMA 5
             break;
            case 5:
            System.out.println("layout forca 5");
            System.out.println("Criação das variaveis 5");
             break;
          }                                                               //FIM SWITCH TEMAS






           break;
          case 2: 
        System.out.println("Esse Trabalho foi Feito Por:");
        System.out.println("Christian Mol");
        System.out.println("Enzo Amorim");
        System.out.println("Fernando Santos");
        System.out.println("Gustavo Freire");
        System.out.println("Vitor Conceição");
           break;
          case 3:
        System.out.println("Ja vai? :(");
        System.out.println("Tchauuu");
           break;} 
    }  
    else 
    {
      System.out.println("Nao temos essa opcao :(");
    }    


  }










}