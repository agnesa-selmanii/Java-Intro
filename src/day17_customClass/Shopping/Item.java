package day17_customClass.Shopping;

public class Item {
    public String itemName;
    public int quantity;
    public double unitPrice;

    public Item(String itemName, int quantity, double unitPrice){
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calcCost(){
        return  unitPrice * quantity;
    }


    public String toString() { // Jason
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + calcCost() +
                '}';
    }
}
