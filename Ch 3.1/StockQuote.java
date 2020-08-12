public class StockQuote {
    private static String readHTML(String symbol) {
        In page = new In("https://finance.yahoo.com/quote/" + symbol + "?p=" + symbol);
        return page.readAll();
    }

    public static double priceOf(String symbol) {
        String html = readHTML(symbol);
        int p = html.indexOf(
                "LAST_PRICE-value",
                0);
        int from = html.indexOf(">", p);
        from = html.indexOf(">", from + 1);
        int to = html.indexOf("</span>", from);
        String price = html.substring(from + 1, to);
        return Double.parseDouble(price.replaceAll(",", ""));
    }

    public static void main(String[] args) {
        String symbol = args[0];
        double price = priceOf(symbol);
        StdOut.println(price);
    }
}
