package drcopernicus.factorymanager.inventory;

public class ItemStack {
    private String name;
    private int amount;
    private static final int MAX_AMOUNT = 64;

    public ItemStack(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public int give(int amount) {
        int excess = (this.amount + amount) - MAX_AMOUNT;
        if (excess >= 0) {
            this.amount = MAX_AMOUNT;
            return excess;
        } else {
            this.amount += amount;
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
