package me.frogtato.ebncc.mixin;

import me.frogtato.ebncc.config.ModConfig;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.contextualbar.ContextualBar;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ContextualBar.class)
public interface ContextualBarRendererMixin {
    /** right border */
    @Redirect(
            method = "extractExperienceLevel",
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/client/gui/GuiGraphicsExtractor.text (Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
                    ordinal = 0
            )
    )
    private static void redirectText1(GuiGraphicsExtractor instance, Font font, Component str, int x, int y, int color, boolean dropShadow) {
        instance.text(font, str, x, y, ModConfig.INSTANCE.borderColor, dropShadow);
    }

    /** left border */
    @Redirect(
            method = "extractExperienceLevel",
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/client/gui/GuiGraphicsExtractor.text (Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
                    ordinal = 1
            )
    )
    private static void redirectText2(GuiGraphicsExtractor instance, Font font, Component str, int x, int y, int color, boolean dropShadow) {
        instance.text(font, str, x, y, ModConfig.INSTANCE.borderColor, dropShadow);
    }

    /** bottom border */
    @Redirect(
            method = "extractExperienceLevel",
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/client/gui/GuiGraphicsExtractor.text (Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
                    ordinal = 2
            )
    )
    private static void redirectText3(GuiGraphicsExtractor instance, Font font, Component str, int x, int y, int color, boolean dropShadow) {
        instance.text(font, str, x, y, ModConfig.INSTANCE.borderColor, dropShadow);
    }

    /** top border */
    @Redirect(
            method = "extractExperienceLevel",
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/client/gui/GuiGraphicsExtractor.text (Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
                    ordinal = 3
            )
    )
    private static void redirectText4(GuiGraphicsExtractor instance, Font font, Component str, int x, int y, int color, boolean dropShadow) {
        instance.text(font, str, x, y, ModConfig.INSTANCE.borderColor, dropShadow);
    }

    /** actual number (the green part in vanilla) */
    @Redirect(
            method = "extractExperienceLevel",
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/client/gui/GuiGraphicsExtractor.text (Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
                    ordinal = 4
            )
    )
    private static void redirectText5(GuiGraphicsExtractor instance, Font font, Component str, int x, int y, int color, boolean dropShadow) {
        instance.text(font, str, x, y, ModConfig.INSTANCE.numberColor, dropShadow);
    }
}
