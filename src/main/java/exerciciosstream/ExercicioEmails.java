package exerciciosstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Streams e Optionals - Dado uma lista de e-mails:
- filtre somente os e-mails que sejam do google
- imprima cada um dos e-mails do google, mesmo que duplicados (experimente o peek())
- remova os e-mails duplicados
- obtenha o nome a partir do e-mail. Ex: imeedendorpe1@usa.gov, retornar só imeedendorpe1
- Gere uma String separada por vírgulas com os nomes.
 */
public class ExercicioEmails {

    public static void main(String[] args) {

        String listaEmails = Stream.of("imeedendorpe1@usa.gov", "dbattram2@google.ru", "bvarden3@jigsy.com", "bmatthias4@sciencedaily.com", "cdarnell5@hugedomains.com", "lflattman6@livejournal.com", "mlippard7@cornell.edu", "lbrome8@google.es", "dmatresse4@google.it", "smayall9@soup.io", "cpenberthya@ask.com", "msandeson0@google.com", "apinnijar1@github.io", "rziehms2@aboutads.info", "jjakubowsky3@privacy.gov.au", "dmatresse4@google.it", "cdaniells5@tiny.cc", "carnaudi6@smh.com.au", "mhumes7@tamu.edu", "cdullard8@ycombinator.com", "ibriztman9@craigslist.org", "znewsteada@constantcontact.com", "hdunkerlyb@meetup.com", "cstanelandc@e-recht24.de", "vhartnupd@xrea.com", "pinnote@soup.io", "dgippsf@google.com", "sharvettg@amazon.de", "aroxburghh@google.fr", "rsidnalli@biglobe.ne.jp", "dmuntj@nytimes.com", "jaqueom@google.com")
                .filter(l -> l.contains("@google"))
                .peek(System.out::println)
                .distinct()
                .map(l -> l.substring(0,l.indexOf("@")))
                .collect(Collectors.joining(", "));

        System.out.println(listaEmails);

    }
}
