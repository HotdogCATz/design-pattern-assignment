public class WidgetFactoryProvider {
    public static IWidgetFactory getWidgetFactory(String type) {
        switch (type.toLowerCase()) {
            case "motif" -> {
                return MotifWidgetFactory.getMotifWidgetFactory();
            }
            case "pm" -> {
                return PMWidgetFactory.getMotifWidgetFactory();
            }
            default -> throw new IllegalArgumentException("Unknown widget factory type: " + type);
        }
    }
}