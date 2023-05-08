import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

public class BookWebScrapper {

    public static void main(String[] args) {
        String url = "https://books.toscrape.com/";



        try{
            Document doc = Jsoup.connect(url).get();
            Elements books = doc.select(".product_pod");

            for(Element bk : books){
                String title = bk.select("h3 > a").text();
                String price = bk.select(".price_color").text();
//                System.out.println(title + " - " + price);

                String price_only = price.substring(1);

                // get books than 15
                if(Double.parseDouble(price_only) < 20){
                    System.out.println(title + " - " + price);
                }
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
