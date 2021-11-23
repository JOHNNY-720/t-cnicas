package ClasesYObjetos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ingenieria {

    DecimalFormat df = new DecimalFormat("#.00");
    double promedio, parcial1, parcial2, examenfinal;

    //programacion, calculo, ingles
    public void programacion() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("digite la nota del primer parcial"));
        parcial2 = Double.parseDouble(JOptionPane.showInputDialog("digite la nota del primer parcia2"));
        examenfinal = Double.parseDouble(JOptionPane.showInputDialog("digite la nota del ultimo examen"));
        promedio = (parcial1 + parcial2 + examenfinal) / 3;
        JOptionPane.showMessageDialog(null, "El promedio es;" + promedio);
    }

    public void calculo() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("digite la nota del primer parcial"));
        parcial2 = Double.parseDouble(JOptionPane.showInputDialog("digite la nota del primer parcia2"));
        examenfinal = Double.parseDouble(JOptionPane.showInputDialog("digite la nota del ultimo examen"));
        promedio = (parcial1 + parcial2 + examenfinal) / 3;
        JOptionPane.showMessageDialog(null, "El promedio es;" + promedio);
    }

    public void ingles() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("digite la nota del primer parcial"));
        parcial2 = Double.parseDouble(JOptionPane.showInputDialog("digite la nota del primer parcia2"));
        examenfinal = Double.parseDouble(JOptionPane.showInputDialog("digite la nota del ultimo examen"));
        promedio = (parcial1 + parcial2 + examenfinal) / 3;
        JOptionPane.showMessageDialog(null, "El promedio es;" + promedio);
    }

    public static void main(String[] args) {
        Ingenieria notas = new Ingenieria();
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Digite el Promedio segun corresponda"
                    + "\n 1) Programacion "
                    + "\n 2) Calculo"
                    + "\n 3) ingles"
                    + "\n 0)  salir"));
            switch (menu) {
                case 1:
                    notas.programacion();
                    break;
                case 2:
                    notas.calculo();
                    break;
                case 3:
                    notas.ingles();
                    break;

            }
        } while (menu != 0);
    }
}
