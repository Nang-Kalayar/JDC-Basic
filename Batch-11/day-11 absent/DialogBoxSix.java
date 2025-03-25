import javax.swing.*;
import java.awt.*;

public class DialogBoxSix extends JFrame{
	public static void main(String[] args) {
		JButton [] g = new JButton[3];
		g[0] = new JButton("male");
		g[1] = new JButton("female");
		g[2] = new JButton("None of Your Business!");
		int response = JOptionPane.ShowOptionDialog(null,
		"What is your gender?",
		"Gender",
		0,
		JOptionPane.INFORMATION-MESSAGE,
		null,
		g,
		g[2];

} 