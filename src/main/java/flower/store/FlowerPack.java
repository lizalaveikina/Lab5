package flower.store;

import lombok.Getter;


@Getter 
public class FlowerPack {
    private Flower flower;
    private int quantity;

    FlowerPack (Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;

}

    public void setQuantity(int value) {
        if (value < 1) {
            this.quantity = 1;
        } else {
            this.quantity = value;
        }
    }

    public double getPrice() {
        return quantity* flower.getPrice();
    }
}
