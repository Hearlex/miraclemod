package valami.miracle.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AncientHardblock extends Block {
    public AncientHardblock() {
        super(Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(15));
    }
}
