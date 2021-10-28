import javax.swing.JOptionPane;

public class Cuenta {
    protected int ingreso, saldo_actual = 0, retiro, saldo_inicial = 100000;
    public  void agregarFondos(int ingreso){
        ingreso = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Ingrese la cantidad que desea agregar:",
            JOptionPane.INFORMATION_MESSAGE));
        if(saldo_actual==0){
            saldo_actual = saldo_inicial + ingreso;            
        }else{  
            saldo_actual= saldo_actual + ingreso;
        }
        JOptionPane.showMessageDialog(null, "Su saldo actual es de: " +saldo_actual + " colones");
    }
    public void retirarFondos(int retiro) {
        retiro = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Ingrese la cantidad que desea retirar:",
            JOptionPane.INFORMATION_MESSAGE));
        if(saldo_actual==0){
            saldo_actual = saldo_inicial - retiro;            
        }else{  
            saldo_actual= saldo_actual - retiro;
        }
        JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + saldo_actual + " colones");
    }
    public void consultarSaldo(){
        if(saldo_actual==0){
            JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + saldo_inicial + " colones");         
        }else{
            JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + saldo_actual + " colones"); 
        }
        
    }
}
