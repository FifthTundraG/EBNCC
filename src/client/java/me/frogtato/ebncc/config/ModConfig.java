package me.frogtato.ebncc.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "ebncc")
public class ModConfig implements ConfigData {
    @ConfigEntry.Gui.Excluded
    public static ModConfig INSTANCE;

    public static void init()
    {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        INSTANCE = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }

    @ConfigEntry.ColorPicker(allowAlpha = true)
    @ConfigEntry.Gui.Tooltip
    @Comment("ARGB Format")
    public int numberColor = -8323296;
    @ConfigEntry.ColorPicker(allowAlpha = true)
    @ConfigEntry.Gui.Tooltip
    @Comment("ARGB Format")
    public int borderColor = -16777216;
}
