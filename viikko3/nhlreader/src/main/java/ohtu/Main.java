package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {


        Date date = new Date();
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";

        String bodyText = Request.Get(url).execute().returnContent().asString();
        
        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);

        String nationality = "FIN";

        System.out.println("Players from "+ nationality + "" + date.toString());

        Arrays.stream(players)
                .filter(p -> p.getNationality().equals(nationality))
                .sorted(Comparator.comparing(Player::getTotal)
                .reversed()).forEach(e -> System.out.println(
                e.toString()
        ));


    }

}
