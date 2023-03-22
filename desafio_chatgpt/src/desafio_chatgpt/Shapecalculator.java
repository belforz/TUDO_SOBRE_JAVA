
package desafio_chatgpt;
import javax.swing.JOptionPane;

public class Shapecalculator {
    void circle() {
     try {
    double c_radius = Double.parseDouble(JOptionPane.showInputDialog("Try to type the radius value"));
     if(c_radius <0){
         JOptionPane.showMessageDialog(null, "Number invalid! Try another above 0");         
     }
     else {
         
     }
     double circ_res = 2 * Math.PI * c_radius;
     String formattedResult = String.format("%.2f", circ_res );
     JOptionPane.showMessageDialog(null, "The circle's area is: " + formattedResult);
     
} catch(Exception e){
    JOptionPane.showMessageDialog(null, "Your type is invalid, try a real number");
}
    }
    
    void rectangle() {
     try {
    double a_rect = Double.parseDouble(JOptionPane.showInputDialog("Try to type the area value"));
     if(a_rect <0){
         JOptionPane.showMessageDialog(null, "Number invalid! Try another above 0");         
     }
     else {
         
     }
     double b_rect = Double.parseDouble(JOptionPane.showInputDialog("Try to type the base value"));
     if(b_rect <0){
         JOptionPane.showMessageDialog(null, "Number invalid! Try another above 0");         
     }
     else {
         
     }
     double rec_res = a_rect * b_rect ;
     String formattedResult = String.format("%.2f", rec_res );
     JOptionPane.showMessageDialog(null, "The rectangle's area is: " + formattedResult);
     
} catch(Exception e){
    JOptionPane.showMessageDialog(null, "Your type is invalid, try a real number");
}
    }
}
