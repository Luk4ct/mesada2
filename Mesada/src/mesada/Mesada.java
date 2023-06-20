package mesada;

import java.util.Scanner;



public class Mesada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        
        classe lk = new classe();
        lk.setCadastro("kcfyg6");
        lk.setMesada(100);
        lk.setEmail("xvideos@gmail.com");
        lk.setNome("lc");
        lk.setIdade(16);
             System.out.println("digite o numero");
          int x = sc.nextInt();
        String numero = null;
        double calculo = 0;
        switch(x){
               
            case 5:
                numero = "5%";
                calculo = 5 + lk.getMesada();
                break;
            case 3:
                numero ="3%";
                calculo = 3 + lk.getMesada();
               
                break;}
   

        System.out.println(lk);
             System.out.println("total:"+calculo);
 
         

      
           
        
       

                
        }
  
        


            

        }
        
        
    
        
        
 
 

        

    

