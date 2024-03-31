import java.awt.Image;
import javax.swing.ImageIcon;

public class CustomIcon {

    private String defaultIconPath; // Path to the default image icon
    private String flippedIconPath; // Path to the flipped image icon
    private Boolean isDone; // Variable to track whether the icon and its corresponding image icon has been found or not
    private Boolean isFlipped; // Variable to track whether the icon is currently flipped or not.
    private ImageIcon defaultIconImage; // Variable to store image of the default icon.
    private ImageIcon flippedIconImage; // Variable to store image of the flipped icon.

    public CustomIcon(String flippedIconPath) {
        this.defaultIconPath = "/images/back_of_card.jpg";
        this.flippedIconPath = flippedIconPath;
        this.isDone = false;
        this.isFlipped = false;

        this.defaultIconImage = new ImageIcon(this.defaultIconPath);
        Image oldDefaultIconImage = this.defaultIconImage.getImage();
        Image updatedDefaultIconImage = oldDefaultIconImage.getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        this.defaultIconImage = new ImageIcon(updatedDefaultIconImage);

        this.flippedIconImage = new ImageIcon(this.flippedIconPath);
        Image oldFlippedIconImage = this.flippedIconImage.getImage();
        Image updatedFlippedIconImage = oldFlippedIconImage.getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        this.flippedIconImage = new ImageIcon(updatedFlippedIconImage);
    }

    public String getDefaultIconPath() {
        return defaultIconPath;
    }

    public String getFlippedIconPath() {
        return flippedIconPath;
    }

    public Boolean getIsDone() {
        return isDone;
    }

    public Boolean getIsFlipped() {
        return isFlipped;
    }

    public ImageIcon getDefaultIconImage() {
        return defaultIconImage;
    }

    public ImageIcon getFlippedIconImage() {
        return flippedIconImage;
    }


    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }

    public void setIsFlipped(Boolean isFlipped) {
        this.isFlipped = isFlipped;
    }
}