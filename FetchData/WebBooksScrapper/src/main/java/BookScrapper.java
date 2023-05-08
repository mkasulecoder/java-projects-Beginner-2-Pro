import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class BookScrapper {

    public static void main(String[] args) {
        String url = "https://books.toscrape.com/";

        try{
            Document document = Jsoup.connect(url).get();

            Elements books = document.select(".product_pod");

            for(Element bk : books){
                String title = bk.select("h3 > a").text();
                String price = bk.select(".price_color").text();

                //convert price into double
                String actual_price = price.substring(1);

                if(Double.parseDouble(actual_price) < 20.0)
                    System.out.println(title + " - " + price);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
