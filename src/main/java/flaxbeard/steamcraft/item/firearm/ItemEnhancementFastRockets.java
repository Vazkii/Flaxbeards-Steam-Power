package flaxbeard.steamcraft.item.firearm;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import flaxbeard.steamcraft.Steamcraft;
import flaxbeard.steamcraft.SteamcraftItems;
import flaxbeard.steamcraft.api.enhancement.IEnhancementRocketLauncher;
import flaxbeard.steamcraft.entity.EntityMusketBall;
import flaxbeard.steamcraft.entity.EntityRocket;

public class ItemEnhancementFastRockets extends Item implements IEnhancementRocketLauncher {

	@Override
	public boolean canApplyTo(ItemStack stack) {
		return stack.getItem() == SteamcraftItems.rocketLauncher;
	}
	
	@Override
    public EnumRarity getRarity(ItemStack p_77613_1_)
    {
    	return Steamcraft.upgrade;
    }

	@Override
	public int cost(ItemStack stack) {
		return 8;
	}

	@Override
	public String getID() {
		return "fastRocket";
	}

	@Override
	public String getIcon(Item item) {
		return "steamcraft:weaponRocketLauncherFast";
	}

	@Override
	public String getName(Item item) {
		return "item.steamcraft:rocketLauncherFast";
	}
	
	
	@Override
	public String getEnhancementName(Item item) {
		return "enhancement.steamcraft:rocketLauncherFast";
	}

	@Override
	public float getAccuracyChange(Item weapon) {
		return 0;
	}

	@Override
	public int getReloadChange(Item weapon) {
		return 0;
	}

	@Override
	public int getClipSizeChange(Item weapon) {
		return 0;
	}

	@Override
	public float getExplosionChange(Item weapon) {
		return 0;
	}

	@Override
	public int getFireDelayChange(ItemStack weapon) {
		return 0;
	}

	@Override
	public EntityRocket changeBullet(EntityRocket bullet) {
		bullet.motionX *= 2.0F;
		bullet.motionY *= 2.0F;
		bullet.motionZ *= 2.0F;

		return bullet;
	}

}
