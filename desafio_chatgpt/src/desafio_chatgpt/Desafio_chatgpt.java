
package desafio_chatgpt;
import javax.swing.JOptionPane;

public class Desafio_chatgpt {

    public static void main(String[] args) {
     Shapecalculator x = new Shapecalculator();
     Shapecalculator y = new Shapecalculator();
     
     String choice = JOptionPane.showInputDialog("What area do you wanna know? Circle or Rectangle?");
     
     
     if(choice.equals("circle")){
        x.circle();
        
    } else if(choice.equals("rectangle")){
        y.rectangle();
         
     }
    else{
        JOptionPane.showMessageDialog(null, "Your type is invalid, try circle or rectangle");
    }
    
}}
