/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_3414
 *  net.minecraft.class_7923
 */
package net.sixunderscore.megumin.sound;

import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_7923;
import net.sixunderscore.megumin.Megumin;

public class ModSounds {
    public static class_3414 BIG_EXPLOSION = class_3414.method_47908((class_2960)class_2960.method_60655((String)"megumin", (String)"big_explosion"));
    public static class_3414 MAGIC_RING = class_3414.method_47908((class_2960)class_2960.method_60655((String)"megumin", (String)"magic_ring"));
    public static class_3414 MAGIC_AMBIENT = class_3414.method_47908((class_2960)class_2960.method_60655((String)"megumin", (String)"magic_ambient"));

    public static void register() {
        Megumin.LOGGER.info("Registering sounds for: megumin");
        class_2378.method_10230((class_2378)class_7923.field_41172, (class_2960)class_2960.method_60655((String)"megumin", (String)"big_explosion"), (Object)BIG_EXPLOSION);
        class_2378.method_10230((class_2378)class_7923.field_41172, (class_2960)class_2960.method_60655((String)"megumin", (String)"magic_ring"), (Object)MAGIC_RING);
        class_2378.method_10230((class_2378)class_7923.field_41172, (class_2960)class_2960.method_60655((String)"megumin", (String)"magic_ambient"), (Object)MAGIC_AMBIENT);
    }
}
