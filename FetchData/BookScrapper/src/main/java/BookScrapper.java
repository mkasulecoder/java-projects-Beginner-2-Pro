import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BookScrapper {
    public static void main(String[] args) {
        String url = "http://books.toscrape.com/";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements books = doc.select(".product_pod");

            for (Element book : books) {
                String title = book.select("h3 > a").text();
                String price = book.select(".price_color").text();
                String pr = price.substring(1);

                if(Double.parseDouble(pr) < 25) {
                    System.out.println(title + " - " + price);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
