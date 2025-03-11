public class Image implements IImage {
    private String fileName;
    private Image realImage;

    public Image(String fileName) {
        this.fileName = fileName;
        this.realImage = null;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new Image(fileName);
        }
        realImage.display();
    }
}
