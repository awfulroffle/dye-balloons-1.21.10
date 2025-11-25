package dyeballoons.entity.custom;

import dyeballoons.entity.ModEntities;
import dyeballoons.modid.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class OrangeBalloonProjectileEntity extends PersistentProjectileEntity {

    public OrangeBalloonProjectileEntity(EntityType<? extends PersistentProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    public OrangeBalloonProjectileEntity(World world, PlayerEntity player) {
        super(ModEntities.ORANGE_BALLOON, player, world, new ItemStack(ModItems.ORANGE_BALLOON), null);
    }

    @Override
    protected ItemStack getDefaultItemStack() {
        return null;
    }

public boolean IsGrounded() {
        return isInGround();
}
    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();

        if (!this.getEntityWorld().isClient()) {
            entity.damage(((ServerWorld) this.getEntityWorld()), this.getDamageSources().thrown(this, this.getOwner()), 4);

            this.getEntityWorld().sendEntityStatus(this, (byte)3);
            this.discard();
        }
    }}

