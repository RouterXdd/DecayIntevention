package decay.content;

import mindustry.world.meta.Attribute;

public class DInterAttributes {
    public static Attribute decay, timedrive;

    public static void load() {
        decay = Attribute.add("decay");
        timedrive = Attribute.add("timedrive");
    }
}