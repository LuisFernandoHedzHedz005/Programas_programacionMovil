//Luis Fernando Hernández Hernández 

package programas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import complementos.PanelImagen;
@SuppressWarnings("serial")
public class Galeria extends JFrame implements ActionListener{
	PanelImagen pi;
	JPanel pbotones;
	JButton btnatras, btnadelante;
	String nuevaImagen;
	int contador = 1;

	public Galeria(){
		setTitle("Galeria Imagenes");
		setSize(400, 400);
		setDefaultCloseOperation(3);
		pi = new PanelImagen();
		pi.setSize(400, 350);
		pbotones = new JPanel();
		btnatras = new JButton("atras");
		btnadelante = new JButton("adelante");
		btnatras.addActionListener(this);
		btnadelante.addActionListener(this);
		pbotones.add(btnadelante);
		pbotones.add(btnatras);
		add(pi);
		add(pbotones, BorderLayout.SOUTH);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnatras)) {
			if(contador <= 1) {
				contador = 3;
			}else {
				contador = contador - 1;
			}
		}
		if(e.getSource().equals(btnadelante)) {
			if(contador >= 3) {
				contador = 1;
			}else {
				contador = contador + 1;
			}
		}
		nuevaImagen = "../ProgramacionMovil/src/complementos/img/gato" + contador + ".jpg";
		System.out.println("contador" + contador + ".jpg");
		pi.ruta = nuevaImagen;
		pi.repaint();
	}
	
	public static void main(String[] args) {
		Galeria g = new Galeria();
		g.setVisible(true);
	}

}
