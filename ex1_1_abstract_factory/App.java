public class App {
    public static void main(String[] args) {
        // client use WidgetFactoryProvider
        IWidgetFactory factory = WidgetFactoryProvider.getWidgetFactory("motif");

        IScrollBar scrollBar = factory.createScrollBar();
        IWindow window = factory.createWindow();
        displayWidget(window, scrollBar);
    }

    public static void displayWidget(IWindow window, IScrollBar scrollBar) {
        window.displayWindow();
        scrollBar.displayScrollBar();
    }
}