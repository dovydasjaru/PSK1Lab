package lt.vu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;

@Named
@SessionScoped //@RequestScoped
public class PirmasKomponentas implements java.io.Serializable {
    @Inject
    private AntrasKomponentas antras;

    @Inject
    public PirmasKomponentas() {
        System.out.println("Constructor injection");
    }

    public String sakykLabas() {
        return "Labas " + new Date() + " " + toString();
    }

    @PostConstruct
    public void init() {
        System.out.println(toString() + " constructed.");
        System.out.println(antras.getClass().getName());
    }

    @PreDestroy
    public void aboutToDie() {
        System.out.println(toString() + " ready to die.");
    }
}