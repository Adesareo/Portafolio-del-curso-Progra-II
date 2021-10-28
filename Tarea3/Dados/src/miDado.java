import javax.swing.JOptionPane;

public class miDado {
private int dado1=0, dado2;
int opcion;
public void siempreSeis(){   
    //dado1= (int)(Math.random()*6)+1;
    dado1 = 6;
    JOptionPane.showMessageDialog(null, "Su dado es: [" + dado1 + "]" );
}

public void numAlto(){
    dado1 = (int)(Math.random()*6)+1;
    do{
         opcion= Integer.parseInt(JOptionPane.showInputDialog(null, "Su dado es: [" + dado1 +  "]\n"
            + "¿Desea tirar de nuevo el dado? (1 Si, 2 No)"));
            dado1 = dado1 + 1;
            if (dado1>6){dado1 = 1;}    
    }while(opcion!=2);
}

public void dosDados (){
   do{ 
    dado1= (int)(Math.random()*6)+1;
    dado2= (int)(Math.random()*6)+1;
    
    opcion= Integer.parseInt(JOptionPane.showInputDialog(null, "Sus dados son:\n" 
        + " Dado#1 ["+ dado1 + "]\n"
        + "Dado#2 ["+ dado2 + "]\n"
        + "¿Desea tirar de nuevo los dados? (1 Si, 2 No)"));
   }while(opcion!=2);
}
}
