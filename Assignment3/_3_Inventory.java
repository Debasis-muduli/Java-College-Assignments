public class _3_Inventory {
    public static void main(String[] args) {
        item[] Items = new item[3];
        Items[0] = new item("Laptop", 120000.0, 5);
        Items[1] = new item("Printer", 3000.0, 10);
        Items[2] = new item("Mouse", 200.0, 50);

        System.out.println("Store Inventory");
        System.out.printf("%-15s%-15s%-15s%-20s\n", "Name", "Price", "Quantity", "Value");

        // for (item item : Items) {
        //     displayItemDetails(item);
        // }
        for (int i = 0; i < Items.length; i++) {
            displayItemDetails(Items[i]);
        }

        double totalInventoryValue = 0;
        // for (item item : Items) {
        //     totalInventoryValue += item.getValue();
        // }
        for (int i = 0; i < Items.length; i++) {
            totalInventoryValue += Items[i].getValue();
        }
        System.out.printf("Total Inventory Value:" + totalInventoryValue);
    }

    static void displayItemDetails(item item) {
        System.out.printf("%-15s%-15.2f%-15d%-20.2f\n",
                item.getName(), item.getPrice(), item.getQuantity(), item.getValue());
    }
}

class item {
    String name;
    double price;
    int quantity;

    item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    double getValue() {
        return quantity * price;
    }
}