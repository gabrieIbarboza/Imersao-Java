package main.java.br.com.gabrieibarboza.javaexplorer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;

public class StickerWritter {
    
    public void writeOnTheSticker(String stickerText, Graphics2D graphics, int imageWidth, int imageHeight, int newImageHeight) {

        // configurar fonte
        Font strickerFont = new Font("Impact", Font.BOLD, 64);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(strickerFont);

        // escrever na nova imagem
        FontMetrics fm = graphics.getFontMetrics();
        if(fm.stringWidth(stickerText) > imageWidth){
            strickerFont = (new Font(Font.SANS_SERIF, Font.BOLD, 40));
            graphics.setFont(strickerFont);
            fm = graphics.getFontMetrics();
        } //Diminui tamanho da fonte se width da string for maior do que a width da imagem
        int xPostion = (imageWidth - fm.stringWidth(stickerText)) / 2;
        int yPosition = imageHeight + ((newImageHeight - imageHeight) / 2);
        graphics.drawString(stickerText, xPostion, yPosition);

        // outline na fonte
        FontRenderContext fontRenderContext = graphics.getFontRenderContext();
        TextLayout textLayout = new TextLayout(stickerText, strickerFont, fontRenderContext);
        
        Shape textOutline = textLayout.getOutline(null);
        AffineTransform transform = graphics.getTransform();
        transform.translate(xPostion, yPosition);
        graphics.setTransform(transform);

        BasicStroke outlineStroke = new BasicStroke(imageWidth * 0.004f);
        graphics.setStroke(outlineStroke);

        graphics.setColor(Color.BLACK);
        graphics.draw(textOutline);
        graphics.setClip(textOutline);

    }

}
