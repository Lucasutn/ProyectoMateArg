import javax.swing.*;

public class Mate {

    private static int cantCebadas;
    private static boolean estadoLleno;


    public Mate(int n) {
        cantCebadas(n);
    }




    public void Cebar(){

        if(estadoLleno){
            JOptionPane.showMessageDialog(null, "Cuidado! Te quemaste!", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }else {
            estadoLleno=true;
        }

    }

    public void beber(){

        if(estadoLleno){
            estadoLleno=false;

            if(this.cantCebadas==0){
                JOptionPane.showMessageDialog(null, "Advertencia: el mate esta lavado!", "Mensaje", JOptionPane.WARNING_MESSAGE);
            }else {
                this.cantCebadas--;
            }

        }else{
            JOptionPane.showMessageDialog(null, "El mate esta vacio!", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }


    }


    public void cantCebadas(int cantYerba){

        if(cantYerba>=50 && cantYerba<100){
            this.cantCebadas=5;
        }else if(cantYerba>=100 && cantYerba<300){
            this.cantCebadas=30;
        }else if(cantYerba>=300 && cantYerba<500){
            this.cantCebadas=50;
        }
    }



}
