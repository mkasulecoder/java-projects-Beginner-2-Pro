import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class BookScapper {

    public static void main(String[] args) {
        String url = "https://books.toscrape.com/";

        try{
            Document document = Jsoup.connect(url).get();
            Elements books = document.select(".product_pod");

            System.out.println("================================");
            System.out.println("Books - Web Scrapper");
            System.out.println("================================");
            for(Element bk: books){
                String title = bk.select("h3 > a").text();
                String price = bk.select(".price_color").text();
                String actual_price = price.substring(1);

                // get books with £20
                if(Double.parseDouble(actual_price) < 20.0)
                    System.out.println(title + " - " + price);
            }
            System.out.println("================================");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
