package moving.domain;

import moving.domain.Thing;
import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

    private int max;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        things = new ArrayList<Thing>();
        this.max = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if ((thing.getVolume() + total() <= this.max)) {
            things.add(thing);
            return true;
        }
        return false;
    }

    public int total() {
        int volume = 0;
        for (Thing item : things) {
            volume += item.getVolume();
        }
        return volume;
    }

    @Override
    public int getVolume() {
        return total();
    }
}
