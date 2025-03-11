public class App {
    public static void main(String[] args) {
        IImage myImage = new Image("test.jpg");
        // Do something else
        System.out.println("Image created but not loaded yet.");
        
        // Load and display the image only when needed
        myImage.display();        
    }
}
