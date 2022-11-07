package calculadora;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class Calculadora extends JFrame {
 
private JButton n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,np,ig;
 
private JButton sum,res,div,mul;
 
private JButton c,mame,porc;
 
private JTextField resp;
 
private JLabel text;
 
 
float num1,num2;
 
String signo;
 
 
public void operacion()
{
 
 
setTitle("Calculadora");
 
setSize(250,400);
 
setLayout(null);
 
Image icon = Toolkit.getDefaultToolkit()
.getImage(getClass()
.getResource("a22.png")
);
 
setIconImage(icon);
 
 
 
ig = new JButton("="); sum = new JButton("+");
 
n0 = new JButton("0"); res = new JButton("-");
 
n1 = new JButton("1"); div = new JButton("/");
 
n2 = new JButton("2"); mul = new JButton("*");
 
n3 = new JButton("3"); c = new JButton("C");
 
n4 = new JButton("4"); mame = new JButton(" ");
 
n5 = new JButton("5"); porc = new JButton("%");
 
n6 = new JButton("6"); resp = new JTextField(" ");
 
n7 = new JButton("7"); text = new JLabel("Calculadora Humilde");
 
n8 = new JButton("8");
 
n9 = new JButton("9");
 
np = new JButton(".");
 
 
n0.setBounds(10,300,45,35);
 
add(n0);
 
np.setBounds(65,300,45,35);
 
add(np);
 
ig.setBounds(120,300,45,35);
 
add(ig);
 
n1.setBounds(10,255,45,35);
 
add(n1);
 
n2.setBounds(65,255,45,35);
 
add(n2);
 
n3.setBounds(120,255,45,35);
 
add(n3);
 
sum.setBounds(175,255,45,80);
 
add(sum);
 
n4.setBounds(10,210,45,35);
 
add(n4);
 
n5.setBounds(65,210,45,35);
 
add(n5);
 
n6.setBounds(120,210,45,35);
 
add(n6);
 
res.setBounds(175,210,45,35);
 
add(res);
 
n7.setBounds(10,165,45,35);
 
add(n7);
 
n8.setBounds(65,165,45,35);
 
add(n8);
 
n9.setBounds(120,165,45,35);
 
add(n9);
 
mul.setBounds(175,165,45,35);
 
add(mul);
 
c.setBounds(10,120,45,35);
 
add(c);
 
mame.setBounds(65,120,45,35);
 
add(mame);
 
porc.setBounds(120,120,45,35);
 
add(porc);
 
div.setBounds(175,120,45,35);
 
add(div);
 
resp.setBounds(10,75,210,35);
 
add(resp);
 
text.setBounds(55,10,210,55);
 
add(text);
 
 
 
ActionListener al = (ActionEvent e) -> {
 
resp.setText(resp.getText()+"0");
 
};
 
n0.addActionListener(al);
 
 
ActionListener al1 = (ActionEvent e) -> {
 
resp.setText(resp.getText()+"1");
 
}; 
 
n1.addActionListener(al1);
 
 
ActionListener al2 = (ActionEvent e) -> {
 
resp.setText(resp.getText()+"2");
 
}; 
 
n2.addActionListener(al2); 
 
 
ActionListener al3 = (ActionEvent e) -> {
 
resp.setText(resp.getText()+"3");
 
}; 
 
n3.addActionListener(al3);
 
ActionListener al4 = (ActionEvent e) -> {
 
resp.setText(resp.getText()+"4");
 
}; 
 
n4.addActionListener(al4);
 
ActionListener al5 = (ActionEvent e) -> {
 
resp.setText(resp.getText()+"5");
 
}; 
 
n5.addActionListener(al5);
 
ActionListener al6 = (ActionEvent e) -> {
 
resp.setText(resp.getText()+"6");
 
}; 
 
n6.addActionListener(al6); 
 
 
ActionListener al7 = (ActionEvent e) -> {
 
resp.setText(resp.getText()+"7");
 
}; 
 
n7.addActionListener(al7);
 
ActionListener al8 = (ActionEvent e) -> {
 
resp.setText(resp.getText()+"8");
 
}; 
 
n8.addActionListener(al8);
 
ActionListener al9 = (ActionEvent e) -> {
 
resp.setText(resp.getText()+"9");
 
}; 
 
n9.addActionListener(al9);
 
 
ActionListener alc = (ActionEvent e) -> {
 
resp.setText(" ");
 
}; 
 
c.addActionListener(alc);
 
ActionListener alp = (ActionEvent e) -> {
 
resp.setText(resp.getText()+".");
 
}; 
 
np.addActionListener(alp); 
 
 
ActionListener als = (ActionEvent e) -> {
 
num1 = Float.parseFloat(resp.getText()
);
 
signo = "+";
 
resp.setText("");
 
}; 
 
sum.addActionListener(als); 
 
ActionListener alr = (ActionEvent e) -> {
 
num1 = Float.parseFloat(resp.getText()
);
 
signo = "-";
 
resp.setText("");
 
}; 
 
res.addActionListener(alr); 
 
 
ActionListener alm = (ActionEvent e) -> {
 
num1 = Float.parseFloat(resp.getText()
);
 
signo = "*";
 
resp.setText("");
 
}; 
 
mul.addActionListener(alm);
 
 
ActionListener ald = (ActionEvent e) -> {
 
num1 = Float.parseFloat(resp.getText()
);
 
signo = "/";
 
resp.setText("");
 
}; 
 
div.addActionListener(ald);
 
 
ActionListener alpo = (ActionEvent e) -> {
 
num1 = Float.parseFloat(resp.getText()
);
 
signo = "%";
 
resp.setText("");
 
}; 
 
porc.addActionListener(alpo);
 
 
//////////////// RESPUESTA //////////////////
 
 
ActionListener ali = (ActionEvent e) -> {
 
num2 = Float.parseFloat(resp.getText()
);
 
 
switch(signo)
{
 
case "+" -> resp.setText(sinc(num1+num2)
);
 
case "-" -> resp.setText(sinc(num1-num2)
);
 
case "*" -> resp.setText(sinc(num1*num2)
);
 
case "/" -> resp.setText(sinc(num1/num2)
);
 
case "%" -> resp.setText(sinc(num1%num2)
);
 
}
 
}; 
 
ig.addActionListener(ali); 
 
 
///////////////////////////////////////////////////////////////////////////////
 
setDefaultCloseOperation(EXIT_ON_CLOSE);
 
setVisible(true);
 
 
 
}
public String sinc(float resultado)
{
 
String retorno=" ";
 
retorno = Float.toString(resultado);
 
 
if (resultado%1==0)
{
 
retorno=retorno.substring(0,retorno.length()-2);
 
 
}
 
 
return retorno;
}
 
public static void main(String[] args) {
 
Calculadora cal = new Calculadora();
 
cal.operacion();
 
 
}
 
}
