package radio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RadioButton extends JFrame {
		int tam;
		double a,b,c,xx1,xx2,x1,x2,denta;
		String s;
		JLabel Title= new JLabel();
		JLabel hesoa= new JLabel();
		JLabel hesob= new JLabel();
		JLabel hesoc= new JLabel();
		JLabel Show= new JLabel();
		
		JTextField sa=new JTextField();
		JTextField sb=new JTextField();
		JTextField sc=new JTextField();
		JTextArea kq=new JTextArea();
		JRadioButton pt1= new JRadioButton ("LinearEquation");
		JRadioButton pt2= new JRadioButton ("SquareEquation");
		JButton Exit = new JButton();
		JButton Reset = new JButton();
		JButton Go = new JButton();
		ButtonGroup Group1= new ButtonGroup();
		public RadioButton() {
			this.getContentPane().setLayout(null);
			Title.setBounds(new Rectangle(30,20,350,30));
			Title.setText("LinearEquation and SquareEqution");
			Title.setForeground(Color.gray);
			this.getContentPane().add(Title);
			hesoa.setBounds(new Rectangle(30,100,100,30));
			hesoa.setText("he so a: ");
			this.getContentPane().add(hesoa);
			sa.setBounds(new Rectangle (120,100,30,25));
			this.getContentPane().add(sa);
			hesob.setBounds(30,140,100,30);
			hesob.setText("he so b: ");
			this.getContentPane().add(hesob);
			sb.setBounds(new Rectangle (120,140,30,25));
			this.getContentPane().add(sb);
			hesoc.setBounds(new Rectangle(30,180,100,30));
			hesoc.setText("he so c: ");
			this.getContentPane().add(hesoc);
			sc.setBounds(new Rectangle (120,180,30,25));
			this.getContentPane().add(sc);
			Show.setBounds(new Rectangle (260,100,100,30));
			Show.setText("Show");
			Show.setBackground(Color.BLUE);
			this.getContentPane().add(Show);
			kq.setBounds(new Rectangle(190,140,180,65));
			this.getContentPane().add(kq);
			pt1.setBounds(new Rectangle(30,220,160,30));
			this.getContentPane().add(pt1);
			pt2.setBounds(new Rectangle(200,220,160,30));
			this.getContentPane().add(pt2);
			Go.setBounds(new Rectangle(30,260,100,30));
			Go.setText("GO");
			Go.setForeground(Color.red);
			Go.setBackground(Color.black);
			this.getContentPane().add(Go);
			Reset.setBounds(new Rectangle(140,260,100,30));
			Reset.setText("Reset");
			Reset.setForeground(Color.GREEN);
			Reset.setBackground(Color.black);

			this.getContentPane().add(Reset);
			Exit.setBounds(new Rectangle(250,260,100,30));
			Exit.setText("Exit");
			Exit.setForeground(Color.YELLOW);
			Exit.setBackground(Color.black);
			this.getContentPane().add(Exit);
			Group1.add(pt1);
			Group1.add(pt2);
			Radio k= new Radio();
			pt1.addItemListener(k);
			pt2.addItemListener(k);
			Button l= new Button();
			Go.addActionListener(l);
			Reset.addActionListener(l);
			Exit.addActionListener(l);
		}
		public class Radio implements ItemListener
		{
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getItem()==pt1) {
					tam=1;
				sc.enable(false);
			}	else 
			{
				tam=2;
			sc.enable(true);
			}
			}
		}
		public class Button implements ActionListener{
			public void actionPerformed(ActionEvent hai) {
				RadioButton n= new RadioButton();
				if(hai.getSource()==Exit) {
					System.exit(0);
					n.dispose();
				}
				if(hai.getSource()==Reset) {
					sa.setText("");
					sb.setText("");
					sc.setText("");
					kq.setText("");
				}
				if(hai.getSource()==Go&&tam==1) {
					a=Double.parseDouble(sa.getText());
					b= Double.parseDouble(sb.getText());
					if(a==0) 
						kq.setText("pt vo nghiem");
						else
						{
							xx1=(-b)/a;
							s=String.valueOf(xx1);
							kq.setText("pt co nghiem:"+s);
						}
					}
				if(hai.getSource()==Go&&tam==2)
				{
					a=Double.parseDouble(sa.getText());
					b=Double.parseDouble(sb.getText());
					c=Double.parseDouble(sc.getText());
					if(a==0) {
						xx2=(-c)/b;
						s=String.valueOf(xx2);
						kq.setText(s);
					}
					else 
						denta=(b*b)-(4*a*c);
						if(denta<0)
							kq.setText("pt vo nghiem");
						else 
						{
							if(denta==0) {
								xx2=(-b)/2*a;
								s=String.valueOf(s);
								kq.setText(s);
							}
							else {
								x1=(-b+Math.sqrt(denta))/(2*a);
								x2=(-b-Math.sqrt(denta))/(2*a);
								kq.setText("x1="+x1+"x2="+x2);
							}
						}
				}	
			}	
		}
	public static void main(String[] args) {
		RadioButton r= new RadioButton();
		r.setSize(800,600);
		r.show();
	}

		}
