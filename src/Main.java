import javax.xml.crypto.Data;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args)  {
       boolean user = Date.validate("test","1","12");
        System.out.println(user);

        Transport lada = new Transport();
        lada.diagnostick();
        Driver oleg = new Driver("Lada","Krutanda",87,"Oleg Olegovich Oleg","","3 goda" );
        oleg.go();
    }
    }
