package pdi.br.poli.ecomp;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ConfigImage {
    private String name;
    private int atualWidth;
    private int atualHeight;
    private int origWidth;
    private int origHeight;


    public ConfigImage(String name, int atualWidth, int atualHeight, int origWidth, int origHeight) {
        this.name = name;
        this.atualWidth = atualWidth;
        this.atualHeight = atualHeight;
        this.origWidth = origWidth;
        this.origHeight = origHeight;
    }

    public void zoonIn() {
            try {
                int n =  origWidth / atualWidth + 1;

                int w = origWidth;
                int h = origHeight;


                BufferedImage atualImage = ImageIO.read(new File(name));
                BufferedImage originalImage = new BufferedImage(w, h, atualImage.getType());
                for (int y=0; y < h; ++y)
                    for (int x=0; x < w; ++x)
                        originalImage.setRGB(x, y, atualImage.getRGB(x/n, y/n));


                File processedDir = new File("processed");
                if (!processedDir.exists()) {
                    processedDir.mkdir();
                }
                ImageIO.write(originalImage, "jpg", new File("processed//".concat(name)));
                System.out.println(name + " was processed.");
            } catch (IOException e) {
                System.out.println("Erro ao processar a imagem '" + name + "': " + e.getMessage());
            }
    }

    public void zoonOut() {

    }
}
