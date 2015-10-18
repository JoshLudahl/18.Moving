/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Ohlaph
 */
public class Packer {

    private int boxesVolume;
    private List<Box> boxy;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        boxy = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        Box box = new Box(boxesVolume);

        for (Thing item : things) {
            if (box.addThing(item)) {

            } else {
                boxy.add(box);
                box = new Box(this.boxesVolume);
                box.addThing(item);
            }
        }
        boxy.add(box);
        return boxy;
    }
}
