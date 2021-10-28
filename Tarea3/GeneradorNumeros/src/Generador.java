import javax.swing.JOptionPane;

public class Generador {
    public static void main(String[] args) throws Exception {
        int numero_inicial=5;
        int numero_aleatorio=0, numero_siguiente = 0, opcion=0; 
    do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Su numero inicial es: \n"
        +   "[" + numero_inicial + "]\n"
        +   "Su número aleatorio es: \n"
        +   "[" + numero_aleatorio + "]\n"
        +   "Su número siguiente es: \n"
        +   "[" + numero_siguiente + "]\n"
                +   "1: Generar número\n"
                +   "2: Salir\n",
                JOptionPane.INFORMATION_MESSAGE));
        switch (opcion) {
            case 1:
            if (numero_siguiente==0){
                numero_aleatorio = ((numero_inicial * 25173) + 13849) % 65536;
                numero_siguiente = numero_aleatorio;
                }else{
                numero_aleatorio = ((numero_siguiente * 25173) + 13849) % 65536;
                numero_siguiente = numero_aleatorio;
                }
                break;
            case 2:
            JOptionPane.showMessageDialog(null, "Saliendo...");
                break;
            default:
                JOptionPane.showMessageDialog(null,
                    "Ingrese una opción correcta");
        }
  } while (opcion != 2);
    
}

}

