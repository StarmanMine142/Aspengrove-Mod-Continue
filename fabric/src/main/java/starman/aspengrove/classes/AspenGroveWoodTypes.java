package starman.aspengrove.classes;

<<<<<<< HEAD
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
=======
import net.minecraft.world.level.block.state.properties.*;
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59

public class AspenGroveWoodTypes {
    public static final BlockSetType ASPEN_BLOCK_SET_TYPE = BlockSetType.register(new BlockSetType("aspengrove:aspen"));
    public static final WoodType ASPEN = WoodType.register(new WoodType("aspengrove:aspen", ASPEN_BLOCK_SET_TYPE));

    public static void initialize() {
    }
}