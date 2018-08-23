package pdi.br.poli.ecomp;


import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        ConfigImage Zoom_in_1 = new ConfigImage("Zoom_in_(1).jpg", 100,150,360,480, 2);
        ConfigImage Zoom_in_2 = new ConfigImage("Zoom_in_(2).jpg", 890,500,2592,1456, 2 );
        ConfigImage Zoom_in_3 = new ConfigImage("Zoom_in_(3).jpg", 250,330,720,990, 2 );
        List<ConfigImage> imagesToZoomIn = new ArrayList<>();
        imagesToZoomIn.add(Zoom_in_1);
        imagesToZoomIn.add(Zoom_in_2);
        imagesToZoomIn.add(Zoom_in_3);
        for (ConfigImage image : imagesToZoomIn) {
            image.zoonIn();
        }

        ConfigImage Zoom_out_1 = new ConfigImage("Zoom_out_(1).jpg", 750,500,271,120, 2 );
        ConfigImage Zoom_out_2 = new ConfigImage("Zoom_out_(2).jpg", 990,1600,317,500 , 2);
        ConfigImage Zoom_out_3 = new ConfigImage("Zoom_out_(3).jpg", 330,750,174,500 , 2);
        List<ConfigImage> imagesToZoomOut = new ArrayList<>();
        imagesToZoomOut.add(Zoom_out_1);
        imagesToZoomOut.add(Zoom_out_2);
        imagesToZoomOut.add(Zoom_out_3);
        for (ConfigImage image : imagesToZoomOut) {
                image.zoonOut();
        }

        System.out.println("--- pdi.br.poli.ecomp ---");
    }
}
