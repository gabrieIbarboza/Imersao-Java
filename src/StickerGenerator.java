import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;


public class StickerGenerator {

    public void create(String stickerName, InputStream imageInputStream, String strickerText, String apiName) throws IOException {

        // leitura da imagem da URL
            //InputStream inputStream = 
            //    new URL(imageURL)
            //    .openStream();
        BufferedImage image = ImageIO.read(imageInputStream);

        // criar imagem transparente em memória baseada na imagem lida
        int imageWidth = image.getWidth();
        int imageHeight = image.getHeight();
        int newImageHeight = imageHeight + 200;
        BufferedImage newImage = new BufferedImage(imageWidth, newImageHeight, BufferedImage.TRANSLUCENT); 

        // copiar imagem original para nova imagem
        Graphics2D graphics = (Graphics2D) newImage.getGraphics();
        graphics.drawImage(image, 0, 0, null);

        // copiar "me.png" para nova imagem
            //BufferedImage imageMe = ImageIO.read(new File("src/assets/img/me.png"));
            //int yPositionMe = (imageHeight - imageMe.getHeight());
            //graphics.drawImage(imageMe, 0, yPositionMe, null);

        // escrever na figurinha
        StickerWritter stickerWritter = new StickerWritter();
        stickerWritter.writeOnTheSticker(strickerText, graphics, imageWidth, imageHeight, newImageHeight);

        // converter nova imagem em arquivo
        String dirPath = String.format("output/%s/%s.png", apiName, stickerName);
        Files.createDirectories(Paths.get(String.format("output/%s", apiName))); //Creates a new directory and parent directories that do not exist.
        ImageIO.write(newImage, "png", new File(dirPath));

    }

}
