public class App {
    public static void main(String[] args) {
        IWidgetFactory factory = PMWidgetFactory.getMotifWidgetFactory();
        IScrollBar scrollBar = factory.createScrollBar();
        IWindow window = factory.createWindow();
        displayWidget(window, scrollBar);
        
    }
    public static void displayWidget(IWindow window, IScrollBar scrollBar) {
        window.displayWindow();
        scrollBar.displayScrollBar();
    }
}
