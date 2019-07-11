package kurs.Jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class JokesController {

    /*po adresie url:
    localhost:8080 /przechodzi do metody generateJoke()
    -ModelMp słuzy do przekazywania danych z Kontrolera do widoku html
    jeśli piszemy map.put("name","Michał ");
    to w html będzie widzoczna zmienna name , której wartość będzie Michał



*/
    @GetMapping("/")
    public String generateJoke(ModelMap map){
        ChuckNorrisQuotes joke =new ChuckNorrisQuotes();

        map.put("quote",joke.getRandomQuote());
        return "joke"; //przejdz do pliku://resources/templates/joke.html

    }
}
