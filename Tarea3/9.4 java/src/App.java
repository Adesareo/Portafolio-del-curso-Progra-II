import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Cuenta cuenta1 = new Cuenta();
        int opcion=0, ingreso=0, retiro=0;
    do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Bienvenid@ a la cuenta bancaria de Programación 2, ingrese la opción que desea realizar\n"
                    +   "1: Agregar fondos\n"
                    +   "2: Retirar fondos\n"
                    +   "3: Consultar fondos\n"
                    +   "4: Salir",
                    JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1:
                    cuenta1.agregarFondos(ingreso);
                    break;
                case 2:
                    cuenta1.retirarFondos(retiro);
                    break;
                case 3:
                     cuenta1.consultarSaldo();
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
