package com.jack25440.Emanon.init;

import com.jack25440.Emanon.item.ItemEmanon;
import com.jack25440.Emanon.item.ItemEterealEssence;
import com.jack25440.Emanon.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by jack2 on 17/01/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEmanon eterealEssence = new ItemEterealEssence();

    public static void init()
    {
        GameRegistry.registerItem(eterealEssence, "eterealEssence");
    }
}
