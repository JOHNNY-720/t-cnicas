package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Figuras {

    public void cuadrado() {
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del lado"));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es; " + area);
    }

    public void triangulo() {
        int base, altura, area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del lado"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la altura"));
        area = base * altura;
        JOptionPane.showMessageDialog(null, "El area del triangulo es; " + area);
    }

    public void circulo() {
        double radio, pi = 3.1416, area;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del circulo"));
        area = pi * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El area del circulo es; " + area);
    }
}
