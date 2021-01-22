package valami.miracle.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import valami.miracle.Utils;
import valami.miracle.block.BlockRegistry;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> ancientHardblock = ITEMS.register("ancient_hardblock", () -> new BlockItem(BlockRegistry.AncientHardblock.get(), new Item.Properties().group(ModGroup.itemGroup)));

}
