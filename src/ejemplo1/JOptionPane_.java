package ejemplo1;

import javax.swing.*;

public class JOptionPane_ {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"Leea cuidadosamente los requerimientos","ProgramaEjemplo",JOptionPane.INFORMATION_MESSAGE);
        String letra=JOptionPane.showInputDialog("Ingrese una letra");
    }
}