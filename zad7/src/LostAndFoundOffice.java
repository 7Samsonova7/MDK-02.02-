
import java.util.ArrayList;

class Ball { }

class Accordion { }

class Hat { }

class Umbrella { }
public class LostAndFoundOffice {
    private final ArrayList<Object> things = new ArrayList<>();

    public void put(Object element) {
        if (element != null) {
            things.add(element);
        }
    }

    public boolean check(Object target) {
        if (target == null) {
            return false;
        }

        for (Object object : things) {
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}

