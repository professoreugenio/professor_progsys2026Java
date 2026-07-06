package sistema;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Image;

public class TelaSistemaBgimagem {

    public static void main(String[] args) {

        JFrame tela = new JFrame();

        tela.setTitle("Professor Eugênio");
        tela.setSize(500, 350);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);

        JPanel painelFundo = new JPanel() {

            Image imagemFundo = new ImageIcon("imagem/fundo.png").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                // Melhora a qualidade do redimensionamento
                g2d.setRenderingHint(
                        RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BICUBIC
                );

                g2d.setRenderingHint(
                        RenderingHints.KEY_RENDERING,
                        RenderingHints.VALUE_RENDER_QUALITY
                );

                g2d.setRenderingHint(
                        RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON
                );

                // Desenha a imagem ocupando toda a tela
                g2d.drawImage(imagemFundo, 0, 0, getWidth(), getHeight(), this);
            }
        };

        tela.setContentPane(painelFundo);

        tela.setVisible(true);
    }
}