package me.frogtato.ebncc.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "ebncc")
public class ModConfig implements ConfigData {
    @ConfigEntry.ColorPicker(allowAlpha = true) // todo: allow alpha? game expects ARGB colors but should we actually let the player give that?
    public int borderColor = -16777216;
    @ConfigEntry.ColorPicker(allowAlpha = true)
    public int numberColor = -8323296;
}
