package blobbatobba.pizzamod.item;

import blobbatobba.pizzamod.PizzaMod;
import blobbatobba.pizzamod.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));


    static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PizzaMod.MOD_ID, name), item);
    }
}
