package com.kekecreations.arts_and_crafts_compatibility.common.item;

import com.kekecreations.arts_and_crafts_compatibility.core.registry.ACCTags;
import com.kekecreations.arts_and_crafts_compatibility.core.util.CompatUtils;
import com.kekecreations.arts_and_crafts_compatibility.core.platform.Services;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class ACCTallDoorItem extends BlockItem {

    public ACCTallDoorItem(Block block, Properties properties) {
        super(block, properties);
    }
    public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
        return stack.is(ACCTags.TALL_WOODEN_DOORS_ITEM) && !stack.is(ItemTags.NON_FLAMMABLE_WOOD) ? 300 : -1;
    }

    @Override
    public boolean isEnabled(FeatureFlagSet featureFlagSet) {
        return Services.PLATFORM.isModLoaded(CompatUtils.DRAMATIC_DOORS);
    }
}
