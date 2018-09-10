package exercises;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Javaframes1 {

	public static void main(String[] args) {
		
		JFrame jf=new JFrame("JAVA FRAME 1");
		jf.setSize(800, 800);
		jf.setVisible(true);
		
		JPanel jp=new JPanel();
		jp.setBackground(Color.RED);
		
		JLabel jl=new JLabel("INTRODUCTION TO JAVA LABEL");
	
		JButton jb=new JButton();
		jb.setBackground(Color.MAGENTA);
		jb.setText("DINESH");
		
		jp.add(jl);
		jp.add(jb);
		jf.add(jp);
		
	}
}
