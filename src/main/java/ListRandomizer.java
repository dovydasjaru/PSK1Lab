import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class ListRandomizer {
    @Getter
    @Setter
    private List<String> listItems = new LinkedList<>();
    private Random random = new Random();

    public String getRandomItem(){
        return listItems.get(random.nextInt(listItems.size()));
    }
}
