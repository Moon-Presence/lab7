import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    JPanel p= new JPanel();
    JLabel l1= new JLabel("Первое число");
    JLabel l2= new JLabel("Второе число");
    JTextField t1 =new JTextField("");
    JTextField t2 =new JTextField("");
    JButton Sum=new JButton("+");
    JButton Dif=new JButton("-");
    JButton Mul=new JButton("*");
    JButton Div=new JButton("/");
    JLabel Ans= new JLabel("0");
    JLabel Note= new JLabel("ПЭ-171:Осокин Р.М.");
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        super("Calculator");

        setSize(400,300);
        setResizable(true);
        p.setLayout(new GridLayout(5,2,20,20));
        Sum.addActionListener(new SumProc());
        Dif.addActionListener(new DifProc());
        Mul.addActionListener(new MulProc());
        Div.addActionListener(new DivProc());
        p.add(l1);p.add(l2);
        p.add(t1);p.add(t2);
        p.add(Sum);p.add(Dif);
        p.add(Mul);p.add(Div);
        p.add(Ans);p.add(Note);
        add(p);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class SumProc implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double a=0,b=1;
            try{
                a=Double.valueOf(t1.getText());
                b=Double.valueOf(t2.getText());
                Ans.setText(Double.toString(a+b));}
            catch(NumberFormatException e1)
            {Ans.setText("Incorrect value, try again");}

        }
    }
    class DifProc implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double a=0,b=1;
            try{
                a=Double.valueOf(t1.getText());
                b=Double.valueOf(t2.getText());
                Ans.setText(Double.toString(a-b));}
            catch(NumberFormatException e1)
            {Ans.setText("Incorrect value, try again");}

        }
    }
    class MulProc implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double a=0,b=1;
            try{
                a=Double.valueOf(t1.getText());
                b=Double.valueOf(t2.getText());
                Ans.setText(Double.toString(a*b));}
            catch(NumberFormatException e1)
            {Ans.setText("Incorrect value, try again");}

        }
    }
    class DivProc implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double a=0,b=1;
            try{
            a=Double.valueOf(t1.getText());
            b=Double.valueOf(t2.getText());
            if(b==0)
                Ans.setText("Infinite");
            else
                Ans.setText(Double.toString(a/b));}
            catch(NumberFormatException e1)
            {Ans.setText("Incorrect value, try again");}

        }
    }







}
