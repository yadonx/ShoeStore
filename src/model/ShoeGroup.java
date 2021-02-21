package model;

/**
 * Created by Emil Johansson
 * Date: 2021-02-20
 * Time: 21:29
 * Project: ShoeStore
 * Package: model
 */
public class ShoeGroup {
    private int id;
    private Shoe shoe;
    private int quantity;

    public ShoeGroup(int id, Shoe shoe, int quantity) {
        this.id = id;
        this.shoe = shoe;
        this.quantity = quantity;
    }
}