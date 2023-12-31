package areapoligono;
import javax.swing.JOptionPane;

public class poligono {
    public static void main(String[] args) {
        
    int p = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa a que figura deseas calcular su area \n (1)Triangulo \n (2)Cuadrado \n (3)Circulo"));
    
    float area = AreaP(p);

    JOptionPane.showMessageDialog(null,"El area del poligono "+area);

    }

    public static float AreaP(int poligono) {
        float b, a, r,aux = 0;
        if ((poligono == 1) || (poligono == 2)) {
            b = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la base de la figura"));
            a = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la altura de la figura"));
            if (poligono == 1) {
                aux = (b * a) / 2;
            }else{
                aux = b * a;
            }
        }if(poligono == 3){
                r = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el radio de la figura"));
                aux = (float)(Math.PI * r * r);
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de polígono no válido");
            aux = 0;
        }
        return aux;
    }

}
