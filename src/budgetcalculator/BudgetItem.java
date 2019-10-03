package budgetcalculator;

import java.util.Objects;

public class BudgetItem {
    public int id;
    public String ItemName;
    public double amount;
    public String frequency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BudgetItem that = (BudgetItem) o;
        return id == that.id &&
                Double.compare(that.amount, amount) == 0 &&
                Objects.equals(ItemName, that.ItemName) &&
                Objects.equals(frequency, that.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ItemName, amount, frequency);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public BudgetItem() {
    }
}
