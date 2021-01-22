package valami.miracle.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import valami.miracle.block.BlockRegistry;

public class MiracleGroup extends ItemGroup {
    public MiracleGroup()
    {
        super("miracle_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(BlockRegistry.AncientHardblock.get());
    }
}
