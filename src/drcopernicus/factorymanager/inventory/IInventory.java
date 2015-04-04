package drcopernicus.factorymanager.inventory;

public interface IInventory {
    public ItemStack give(ItemStack itemStack);
    public ItemStack take(int amount);
    public String getContents();
}
