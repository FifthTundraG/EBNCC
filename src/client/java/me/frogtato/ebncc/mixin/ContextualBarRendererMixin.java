package me.frogtato.ebncc.mixin;

import me.frogtato.ebncc.EBNCC;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.contextualbar.ContextualBarRenderer;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ContextualBarRenderer.class)
public interface ContextualBarRendererMixin {
    /** right border */
    @Redirect(
            method = "renderExperienceLevel",
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/client/gui/GuiGraphics.drawString (Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
                    ordinal = 0
            )
    )
    private static void redirectDrawString1(GuiGraphics guiGraphics, Font font, Component component, int i, int j, int k, boolean bl) {
        guiGraphics.drawString(font, component, i, j, EBNCC.getBorderReplacementColor(), bl);
    }

    /** left border */
    @Redirect(
            method = "renderExperienceLevel",
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/client/gui/GuiGraphics.drawString (Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
                    ordinal = 1
            )
    )
    private static void redirectDrawString2(GuiGraphics guiGraphics, Font font, Component component, int i, int j, int k, boolean bl) {
        guiGraphics.drawString(font, component, i, j, EBNCC.getBorderReplacementColor(), bl);
    }

    /** bottom border */
    @Redirect(
            method = "renderExperienceLevel",
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/client/gui/GuiGraphics.drawString (Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
                    ordinal = 2
            )
    )
    private static void redirectDrawString3(GuiGraphics guiGraphics, Font font, Component component, int i, int j, int k, boolean bl) {
        guiGraphics.drawString(font, component, i, j, EBNCC.getBorderReplacementColor(), bl);
    }

    /** top border */
    @Redirect(
            method = "renderExperienceLevel",
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/client/gui/GuiGraphics.drawString (Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
                    ordinal = 3
            )
    )
    private static void redirectDrawString4(GuiGraphics guiGraphics, Font font, Component component, int i, int j, int k, boolean bl) {
        guiGraphics.drawString(font, component, i, j, EBNCC.getBorderReplacementColor(), bl);
    }

    /** actual number (the green part in vanilla) */
    @Redirect(
            method = "renderExperienceLevel",
            at = @At(
                    value = "INVOKE",
                    target = "net/minecraft/client/gui/GuiGraphics.drawString (Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V",
                    ordinal = 4
            )
    )
    private static void redirectDrawString5(GuiGraphics guiGraphics, Font font, Component component, int i, int j, int k, boolean bl) {
        guiGraphics.drawString(font, component, i, j, EBNCC.getReplacementColor(), bl);
    }
}
