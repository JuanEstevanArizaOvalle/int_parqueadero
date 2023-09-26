import javax.swing.*;

public class juanL {
    public static void main(String[]args){
        char letra;
        letra = JOptionPane.showInputDialog("porfavor escriba una letra en mayuscula o minuscula").charAt(0);
        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"la letra que ustes escribio es mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null,"la letra que ustes escribio es minuscula");
        }
    }
}
