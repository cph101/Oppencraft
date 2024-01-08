package com.cph.oppencraft.mixin.server;

import com.cph.oppencraft.Oppencraft;
import com.cph.oppencraft.compat.TrinketsCompat;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    @SuppressWarnings({"unused", "DataFlowIssue"}) private void checkOppenhat(@NotNull DamageSource source, float amount, CallbackInfoReturnable<Boolean> mainFuncReturn) {
        PlayerEntity player = ((PlayerEntity)(Object)this);
        ServerPlayerEntity serverPlayerEntity = player.getServer().getPlayerManager().getPlayer(player.getEntityName());
        if (TrinketsCompat.hasOppenhat(player) && source.isExplosive()) {
            // we know the oppenhat can protect 🗿
            if (source.getSource() != null && source.getSource().isAlive()) {
                // source is valid and alive
                if (source.getAttacker() == player || Objects.requireNonNull(source.getAttacker()).isTeammate(player)) {
                    // Accidental harm 😁
                    mainFuncReturn.setReturnValue(false);
                    if (TrinketsCompat.hasOnlyOppenhat(player)) {
                        serverPlayerEntity.getAdvancementTracker().grantCriterion(
                                player.getServer().getAdvancementLoader().get(new Identifier(Oppencraft.MOD_ID, "oppencraft/functional_clothing")),
                                "what_an_l"
                        );
                    }
                }
                // we got a creeper 😐
            } else {
                // something is blowing the fuck up but we don't care 💀
                mainFuncReturn.setReturnValue(false);
                if (TrinketsCompat.hasOnlyOppenhat(player)) {
                    serverPlayerEntity.getAdvancementTracker().grantCriterion(
                            player.getServer().getAdvancementLoader().get(new Identifier(Oppencraft.MOD_ID, "oppencraft/functional_clothing")),
                            "what_an_l"
                    );
                }
            }
        }
    }
}
