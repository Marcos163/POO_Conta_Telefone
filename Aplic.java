
package fatec.poo.aula1;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Aplic {
    public static void main(String[] args) {
       Scanner Entrada = new Scanner(System.in);
       ContaTelefonica objConta = new ContaTelefonica();
       int numeroTelefone, tipoTelefone, qtdePulsos, qtdeInter, qtdeDesp;
       
       System.out.println("Digite o numero do telefone:");
       numeroTelefone = Entrada.nextInt();
       
       System.out.println("Digite o tipo do telefone(1-Resiencial | 2-Comercial:)");
       tipoTelefone = Entrada.nextInt();
       
       if(tipoTelefone == 1 || tipoTelefone == 2){
       objConta.setTipo(tipoTelefone);
        }else{
           System.out.println("Opcao invalida!");
           return;
       }
       
       System.out.println("Digite a quantidade de pulsos:");
       qtdePulsos = Entrada.nextInt();
       
       System.out.println("Digite a quantidade de minutos de interurbano:");
       qtdeInter = Entrada.nextInt();
       
       System.out.println("Digite a quantidade de despertador utilizado:");
       qtdeDesp = Entrada.nextInt();
       
       objConta.setNumero(numeroTelefone);
       
       objConta.setQtdePulsos(qtdePulsos);
       objConta.setQtdeInter(qtdeInter);
       objConta.setQtdeServDesp(qtdeDesp);
       
       System.out.println("Telefone: "+ numeroTelefone);
       if(tipoTelefone == 1){
       System.out.println("Tipo: Residencial");
       }else{
           if(tipoTelefone == 2){
               System.out.println("Tipo: Comercial");
           }
       }
       System.out.println("Quantidade de pulsos: "+ qtdePulsos );
       System.out.println("Minutos de interurbano: "+ qtdeInter + " minutos");
       System.out.println("Quantidade de servico de despertador utilizado: "+ qtdeDesp);
       System.out.println("Valor da conta: " + objConta.calcValorConta() );
    }
       
    
}
