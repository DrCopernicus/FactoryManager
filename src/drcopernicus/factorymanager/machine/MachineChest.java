package drcopernicus.factorymanager.machine;

import drcopernicus.factorymanager.inventory.InventoryChest;
import drcopernicus.factorymanager.inventory.ItemStack;

public class MachineChest implements IMachine {
    private InventoryChest inventoryChest;

    public MachineChest() {
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
        System.out.println(inventoryChest.getContents());
    }
}
