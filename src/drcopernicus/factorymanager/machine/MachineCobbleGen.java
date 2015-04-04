package drcopernicus.factorymanager.machine;

import drcopernicus.factorymanager.inventory.ItemStack;

public class MachineCobbleGen implements IMachine {
    @Override
    public ItemStack give(ItemStack itemStack) {
        return itemStack;
    }

    @Override
    public ItemStack take(int amount) {
        return new ItemStack("Cobblestone", amount);
    }

    @Override
    public void tick() {

    }
}
