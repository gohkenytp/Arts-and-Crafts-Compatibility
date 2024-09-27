package com.kekecreations.arts_and_crafts_compatibility.common.item;

import com.kekecreations.arts_and_crafts_compatibility.core.platform.Services;
import com.kekecreations.arts_and_crafts_compatibility.core.util.CompatUtils;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.item.configurable.EBBookshelfBlockItem;

public class FabricBookshelfBlockItem extends EBBookshelfBlockItem {

    public FabricBookshelfBlockItem(Block block, Properties settings) {
        super(block, settings);
    }

    public boolean isEnabled(FeatureFlagSet enable) {
        return Services.PLATFORM.isModLoaded(CompatUtils.EXCESSIVE_BUILDING) && EBConfig.ENABLE_SHELF_VARIANTS.get();
    }
}