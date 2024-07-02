package day17_customClass.Shopping;

public class TestItemObjects {
    public static void main(String[] args) {

        Item item1 = new Item("Pen", 4, 1.5);
        Item item2 = new Item("Notebook", 5, 3.5);
        Item item3 = new Item("Mouse", 5, 3.5);
        Item item4 = new Item("Keyboard", 5, 3.5);
        Item item5 = new Item("Apple", 5, 3.5);
        Item item6 = new Item("Cherry", 5, 3.5);
        Item item7 = new Item("Eraser", 5, 3.5);
        Item item8 = new Item("Ruler", 5, 3.5);
        Item item9 = new Item("Backpack", 5, 3.5);
        Item item10 = new Item("Orange", 5, 3.5);
        Item item11 = new Item("Headphone", 5, 3.5);


/*
        item1.setInfo("Pen", 4, 1.5);
        item2.setInfo("Notebook", 5, 3.5);
        item3.setInfo("Mouse", 5, 3.5);
        item4.setInfo("Keyboard", 5, 3.5);
        item5.setInfo("Apple", 5, 3.5);
        item6.setInfo("Cherry", 5, 3.5);
        item7.setInfo("Eraser", 5, 3.5);
        item8.setInfo("Ruler", 5, 3.5);
        item9.setInfo("Backpack", 5, 3.5);
        item10.setInfo("Orange", 5, 3.5);
        item11.setInfo("Headphone", 5, 3.5);

 */

        // System.out.println(item1);
        //  System.out.println(item2);

        System.out.println("----------------------------------");

        ShoppingCart cart = new ShoppingCart();


        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem( item3 );
        cart.addItem( item4 );
        //   cart.addItem( item5 );
        //   cart.addItem( item6 );
        //  cart.addItem( item7 );
        //  cart.addItem( item8 );
        //  cart.addItem( item9 );
        // cart.addItem( item10 );


        //  cart.addItem(item11);

        // System.out.println( Arrays.toString(cart.items) );

        cart.displayCart();




    }
}
