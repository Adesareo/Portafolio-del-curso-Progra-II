import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int puntuacion_actual=0, opcion=0;
    do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "TANTEADOR\n"
                +   "Marcador actual:"
                +    " [" + puntuacion_actual + "]\n"
                +   "1: Incrementar marcador\n"
                +   "2: Disminuir marcador\n"
                +   "3: Resetear marcador\n"
                +   "4: Salir\n",
                JOptionPane.INFORMATION_MESSAGE));
        switch (opcion) {
            case 1:
            puntuacion_actual = puntuacion_actual + 1;
                break;
            case 2:
            puntuacion_actual = puntuacion_actual - 1;
                break;
            case 3:
            puntuacion_actual = 0;
                break;   
            case 4:
            JOptionPane.showMessageDialog(null, "Saliendo...");
                break;
            default:
                JOptionPane.showMessageDialog(null,
                    "Ingrese una opción correcta");
        }
  } while (opcion != 4);
    
}
}

