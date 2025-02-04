package adapter;

public class StockMarketDataParserAdapter implements CSVParser {
    private final StockMarketDataParser stockMarketParser;

    public StockMarketDataParserAdapter(StockMarketDataParser stockMarketParser) {
        this.stockMarketParser = stockMarketParser;
    }

    @Override
    public void parseCSV() {
        stockMarketParser.parseFromCSV();
    }
}
