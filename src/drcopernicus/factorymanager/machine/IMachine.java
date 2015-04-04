package drcopernicus.factorymanager.machine;

import drcopernicus.factorymanager.inventory.ItemStack;

public interface IMachine {
    public ItemStack give(ItemStack itemStack);
    public ItemStack take(int amount);
    public void tick();
}
