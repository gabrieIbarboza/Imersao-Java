import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
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
        BufferedImage imageMe = ImageIO.read(new File("src/assets/img/me.png"));
        int yPositionMe = (imageHeight - imageMe.getHeight());
        graphics.drawImage(imageMe, 0, yPositionMe, null);

        // configurar fonte
        Font strickerFont = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.MAGENTA);
        graphics.setFont(strickerFont);

        // escrever na nova imagem
        FontMetrics fm = graphics.getFontMetrics();
        if(fm.stringWidth(strickerText) > imageWidth){
            graphics.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
            fm = graphics.getFontMetrics();
        } //Diminui tamanho da fonte se width da string for maior do que a width da imagem
        int xPostion = (imageWidth - fm.stringWidth(strickerText)) / 2;
        int yPosition = imageHeight + ((newImageHeight - imageHeight) / 2);
        graphics.drawString(strickerText, xPostion, yPosition);

        // converter nova imagem em arquivo
        String dirPath = String.format("output/%s/%s.png", apiName, stickerName);
        Files.createDirectories(Paths.get(String.format("output/%s", apiName))); //Creates a new directory and parent directories that do not exist.
        ImageIO.write(newImage, "png", new File(dirPath));

    }

}
