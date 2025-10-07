/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_2960
 *  net.minecraft.class_5321
 *  net.minecraft.class_7706
 *  net.minecraft.class_7924
 */
package net.sixunderscore.megumin.item;

import java.util.function.Function;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_7706;
import net.minecraft.class_7924;
import net.sixunderscore.megumin.Megumin;
import net.sixunderscore.megumin.item.custom.MeguminStaffItem;

public class ModItems {
    public static final class_1792 MEGUMIN_STAFF_ITEM = ModItems.registerItem("megumin_staff", MeguminStaffItem::new, new class_1792.class_1793().method_7889(1).method_7895(20));
    public static final class_1792 STAFF_BALL = ModItems.registerItem("staff_ball", class_1792::new, new class_1792.class_1793());

    public static class_1792 registerItem(String path, Function<class_1792.class_1793, class_1792> factory, class_1792.class_1793 settings) {
        return class_1802.method_51348((class_5321)class_5321.method_29179((class_5321)class_7924.field_41197, (class_2960)class_2960.method_60655((String)"megumin", (String)path)), factory, (class_1792.class_1793)settings);
    }

    public static void load() {
        ItemGroupEvents.modifyEntriesEvent((class_5321)class_7706.field_40202).register(content -> content.method_45421((class_1935)MEGUMIN_STAFF_ITEM));
        ItemGroupEvents.modifyEntriesEvent((class_5321)class_7706.field_41062).register(content -> content.method_45421((class_1935)STAFF_BALL));
    }
}
