

package fatec.poo.aula1;

/**
 *
 * @author Marcos
 */
public class ContaTelefonica {
    private int Numero;
    private int Tipo;
    private int QtdePulsos;
    private int QtdeInter;
    private int QtdeServDesp; 

    public int getNumero() {
        return(Numero);
    }

    public void setNumero(int num) {
        Numero = num;
    }

    public int getTipo() {
        return(Tipo);
    }

    public void setTipo(int t) {
        Tipo = t;
    }

    public int getQtdePulsos() {
        return(QtdePulsos);
    }

    public void setQtdePulsos(int pulsos) {
        QtdePulsos = pulsos;
    }

    public int getQtdeInter() {
        return(QtdeInter);
    }

    public void setQtdeInter(int inter) {
        QtdeInter = inter;
    }

    public int getQtdeServDesp() {
        return(QtdeServDesp);
    }

    public void setQtdeServDesp(int desp) {
        QtdeServDesp = desp;
    }
    
    public double calcValorConta(){
        double valTaxa=0, valPulsos=0, valInter, valDesp;
        if(Tipo == 1){
            valTaxa = 10.00;
        }else{ 
            if(Tipo == 2){
            valTaxa = 15.00;
          }
        }
        if(QtdePulsos > 90){
            valPulsos = (QtdePulsos-90)*0.05;
        }
        valInter = (60 * QtdeInter) * 0.08;
        valDesp = QtdeServDesp * 2.00;
        return(valTaxa + valPulsos + valInter + valDesp);
    }
    
}
