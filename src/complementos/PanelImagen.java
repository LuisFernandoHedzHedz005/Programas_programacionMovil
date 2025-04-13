//Luis Fernando Hernández Hernández 

package complementos;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class PanelImagen extends JPanel{
	public Image imagenDada;
	public ImageIcon icono;
	public String ruta;
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		icono = new ImageIcon(ruta);
		imagenDada = icono.getImage();
		g.drawImage(imagenDada, 0, 0, getWidth(), getHeight(), this);
	}
}
