package me.frogtato.ebncc;

import net.fabricmc.api.ClientModInitializer;

public final class EBNCC implements ClientModInitializer {
    /** temporary, replace with configurable option later */
    public static int getBorderReplacementColor() {
        return 0xFF0000FF; // blue
    }
    /** temporary, replace with configurable option later */
    public static int getReplacementColor() {
        return 0xFFFFFFFF;
    }

    @Override
    public void onInitializeClient() {
        System.out.println("Hello from EBNCC!");
    }
}
