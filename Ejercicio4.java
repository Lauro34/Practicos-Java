import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        String nombre;
        final JOptionPane JOptionPane = JOptionPane;
        nombre = JOptionPane.showInputDialog(null, "Introduzca tu nombre:");
                
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("No se ha introducido ningun nombre. Saliendo del programa");
            return;
        }  
        
        System.out.println("Bienvenido" + nombre + "!");
    }
}
    
