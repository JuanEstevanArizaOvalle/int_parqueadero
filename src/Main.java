import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String placa;
        String nombre;
        Double entrada;
        Double salida;
        double resta,multi,veiculo;
        JOptionPane.showMessageDialog(null,"parqueadero cela cuido");
        JOptionPane.showMessageDialog(null,"el valor por carro es de 2000 y el de moto es de 1000");
        placa = JOptionPane.showInputDialog("escriba su placa: ");
        nombre = JOptionPane.showInputDialog("escriba su nombre: ");
        entrada = Double.parseDouble(JOptionPane.showInputDialog("escriba su hora de entrada: "));
        JOptionPane.showMessageDialog(null,"su placa es: " + placa);
        JOptionPane.showMessageDialog(null,"su nombre es: "+nombre);
        JOptionPane.showMessageDialog(null,"la hora de entrada es: "+entrada);
        salida = Double.parseDouble(JOptionPane.showInputDialog("escriba su hora de salida: "));
        JOptionPane.showMessageDialog(null,"la hora de salida es: "+salida);
        resta = salida-entrada;
        JOptionPane.showMessageDialog(null,"el tiempo que paso es de: "+Math.ceil(resta));
        veiculo = Double.parseDouble(JOptionPane.showInputDialog("escriba 1 si unted trajo carro y 2 si usted trajo moto: "));
       /* if (veiculo == 1) {
           multi=Math.ceil(resta)*2000;
            JOptionPane.showMessageDialog(null,"el valor a pagar por su carro es: "+multi);
        }
        else {
            multi=Math.ceil(resta)*
            1000;
            JOptionPane.showMessageDialog(null, "el valor a pagar por su moto es: " + multi);
        }
        */
        switch((int)veiculo){
            case 1:multi=Math.ceil(resta)*2000;
                JOptionPane.showMessageDialog(null,"el valor a pagar por su carro es: "+multi);
                break;
            case 2:multi=Math.ceil(resta)*1000;
                JOptionPane.showMessageDialog(null, "el valor a pagar por su moto es: " + multi);
                break;
            default: JOptionPane.showMessageDialog(null,"el valor ingresado no existe");
        }
    }
}
