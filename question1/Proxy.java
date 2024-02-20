public class Proxy implements IImage {
    private String fileName;
    private Image image;
    
    public Proxy(String fileName) {
        this.fileName = fileName;
    }
    public void display() {
        if (image == null) {
            image = new Image(fileName);
        }
        image.display();
    }
}
