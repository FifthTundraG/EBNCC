package me.frogtato.ebncc;

import me.frogtato.ebncc.config.ModConfig;
import net.fabricmc.api.ClientModInitializer;

public final class EBNCC implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModConfig.init();
    }
}
