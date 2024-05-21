/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

import javax.swing.JOptionPane;
import mark.SemesterTest;
import mark.Predicate;
import mark.FinalMark;
import mark.ExamMark;
import mark.ClassTest;
import mark.Assignment;
import mark.Mark;

public class runProgram {
    
    public static void main(String[] args) {
        
        //semester test calculations
        
        
      int st1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your semester test 1 mark"));
      int st2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your semester test 2 mark"));
       
        int totalSt = st1 + st2;
        Mark st = new SemesterTest(totalSt);
       double stResults=st.contribution()*st.getValue();

       //class test calculations
       
       int ct1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your Class test 1 mark"));
       int ct2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your Class test 2 mark"));
       
         int ctCal = ct2 + ct1;
         Mark ct = new ClassTest(ctCal);
        double ct2Calcu = ct.contribution()*ct.getValue();

       //assessment claculation
       int a1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your Assessment 1 mark"));
       int a2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your Assessment 2 mark"));
      
        int asRes = a1 +a2;
         Mark as = new Assignment(asRes);
       double asCal = as.contribution()*as.getValue();

       //predicate calculations
       double tota = stResults + ct2Calcu + asCal;
        Mark pre = new Predicate((int)tota);
       double predi = pre.contribution()*pre.getValue();
       
  

       //Exam 
       int exa  = Integer.parseInt(JOptionPane.showInputDialog("Enter your exam score"));
       Mark ex = new ExamMark(exa);
       double exCal = ex.contribution()*ex.getValue();
       
       //Final mark
       double fina = predi + exCal;
       Mark fin = new FinalMark((int)fina);
       double finCal = fin.contribution()*fin.getValue();
       
       //Display
       StringBuilder sb = new StringBuilder();
       sb.append("Semester test :"+(int)st1).append("\n");
       sb.append("Semester test :"+(int)st2).append("\n");
       sb.append("Class test 1 :"+(int)ct1).append("\n");
       sb.append("Class test 2 :"+(int)ct2).append("\n");
       sb.append("Assessment 1 :"+(int)a1).append("\n");
       sb.append("Assessment 2 : "+(int)a2).append("\n");
       sb.append("Predicate :"+(int)predi).append("\n");
       sb.append("Exam :"+(int)exCal).append("\n");
       sb.append("Final mark :"+(int)finCal).append("\n");
       
       JOptionPane.showMessageDialog(null, sb.toString());
               
      
    }
}
