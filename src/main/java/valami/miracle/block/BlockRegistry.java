package valami.miracle.block;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import valami.miracle.Utils;
import valami.miracle.block.AncientHardblock;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> AncientHardblock = BLOCKS.register("ancient_hardblock", AncientHardblock::new);
}
