import javax.swing.*;

public class Programa {



    public static void main(String[]args) {


        int cantYerba = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de yerba mayor a 50gr y menor a 500gr"));

        while(cantYerba<50 || cantYerba>500){
            if(cantYerba<50) {
                JOptionPane.showMessageDialog(null, "La cantidad de yerba es muy poca, cargue mas yerba","Mensaje", JOptionPane.WARNING_MESSAGE);
            }else if(cantYerba>500){
                JOptionPane.showMessageDialog(null, "La cantidad de yerba es excesiva, cargue menos yerba", "Mensaje",JOptionPane.WARNING_MESSAGE);
            }

            cantYerba = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de yerba mayor a 50gr y menor a 500gr"));

        }

        Mate mate1 = new Mate(cantYerba);



    }
}


