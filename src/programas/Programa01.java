//Luis Fernando Hernández Hernández 

package programas;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
//Luis Fernando Hernández Hernández 
@SuppressWarnings("serial")
public class Programa01 extends JFrame implements ActionListener{
	JTextField texto, textoDado;
	JButton btnSaludar;
	
	public Programa01() {
		setSize(400,400);
		setTitle("Programa 1");
		setDefaultCloseOperation(3);
		texto = new JTextField("Tu nombre");
		btnSaludar = new JButton("Saludar");
		btnSaludar.addActionListener(this);
		textoDado = new JTextField();
		add(texto, BorderLayout.NORTH);
		add(btnSaludar, BorderLayout.SOUTH);
		add(textoDado, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		textoDado.setText("Hola, " + texto.getText() + 
				" Espero que tengas un buen día, saludos");
	}
	
	public static void main(String[] args) {
		Programa01 p = new Programa01();
		p.setVisible(true);
	}
	
}
