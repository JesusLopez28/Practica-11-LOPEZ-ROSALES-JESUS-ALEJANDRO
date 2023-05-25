package practica.pkg11.lopez.rosales.jesus.alejandro;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFondo extends JPanel {

    private Image imagen;
    private ImageIcon imageIcon;

    public ImagenFondo(String ruta) {
        imageIcon = new ImageIcon(ruta);
    }

    @Override
    public void paint(Graphics g) {
        imagen = imageIcon.getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        super.paint(g);
    }
}
