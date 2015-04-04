package drcopernicus.factorymanager.machine;

import drcopernicus.factorymanager.inventory.InventoryChest;
import drcopernicus.factorymanager.inventory.ItemStack;

public class MachinePump implements IMachine {
    private InventoryChest inventoryChest;
    public IMachine input;
    public IMachine output;

    public MachinePump() {
        inventoryChest = new InventoryChest();
    }

    @Override
    public ItemStack give(ItemStack itemStack) {
        return inventoryChest.give(itemStack);
    }

    @Override
    public ItemStack take(int amount) {
        return inventoryChest.take(amount);
    }

    @Override
    public void tick() {
        input.give(inventoryChest.give(input.take(2)));
        inventoryChest.give(output.give(inventoryChest.take(64)));
    }
}
