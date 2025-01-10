
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter widget type: 1.motif, 2.pm");
        System.out.print("Enter: ");
        String widgetType = sc.nextLine();
        sc.close();
        IWidgetFactory factory;
        // client use WidgetFactoryProvider
        switch (widgetType) {
            case "1" -> {
                factory = WidgetFactoryProvider.getWidgetFactory("motif");
                break;
            }

            case "2" -> {
                factory = WidgetFactoryProvider.getWidgetFactory("pm");
                break;
            }

            default -> throw new AssertionError();
        }
        IScrollBar scrollBar = factory.createScrollBar();
        IWindow window = factory.createWindow();
        displayWidget(window, scrollBar);
    }

    public static void displayWidget(IWindow window, IScrollBar scrollBar) {
        window.displayWindow();
        scrollBar.displayScrollBar();
    }
}