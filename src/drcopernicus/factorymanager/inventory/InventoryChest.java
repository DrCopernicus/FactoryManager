package drcopernicus.factorymanager.inventory;

import java.util.ArrayList;

public class InventoryChest implements IInventory {
    private ArrayList<ItemStack> itemStacks;
    private static final int MAX_SIZE = 56;

    public InventoryChest() {
        itemStacks = new ArrayList<ItemStack>();
    }

    @Override
    public ItemStack give(ItemStack itemStack) {
        if (itemStack == null) return null;
        int i = 0;
        while (i < itemStacks.size() && itemStack.getAmount() > 0) {
            if (itemStacks.get(i).getName().equals(itemStack.getName())) {
                itemStack.setAmount(itemStacks.get(i).give(itemStack.getAmount()));
            }
            i++;
        }
        if (itemStack.getAmount() <= 0) return null;
        if (itemStacks.size() < MAX_SIZE) {
            itemStacks.add(itemStack);
            return null;
        }
        return itemStack;
    }

    @Override
    public ItemStack take(int amount) {
        if (itemStacks.size() == 0) return null;
        return itemStacks.remove(itemStacks.size()-1);
    }

    @Override
    public String getContents() {
        String s = "=> " + toString();
        for (ItemStack itemStack : itemStacks) {
            s += "\n   " + itemStack.getAmount() + "x " + itemStack.getName();
        }
        return s;
    }
}
