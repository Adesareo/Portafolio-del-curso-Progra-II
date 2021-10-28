import javax.swing.JOptionPane;

public class Clase {
    public static void main(String[] args) throws Exception {
        int opcion;
        miDado claseDados = new miDado();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "¿Qué desea realizar con el dado?\n" + "1: Siempre 6\n"
                            + "2: Número más alto que el anterior\n" + "3: 2 dados aleatorios\n" + "4: Salir",
                    JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
            case 1:
                claseDados.siempreSeis();
                break;
            case 2:
                claseDados.numAlto();
                break;
            case 3:
                claseDados.dosDados();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Saliendo...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opción correcta");
            }
        } while (opcion != 4);
    }
}
