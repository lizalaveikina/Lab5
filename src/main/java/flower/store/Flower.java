package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower extends Item{
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
}
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.Setter;
// import lombok.NoArgsConstructor;

// @Setter
// @Getter
// @AllArgsConstructor
// @NoArgsConstructor
// public class Flower extends Item {
//     private FlowerType flowerType;
//     private FlowerColor color;
//     private double price;
//     private double sepalLength;

//     public Flower(Flower flower) {
//         this.color = flower.color;
//         this.price = flower.price;
//         this.sepalLength = flower.sepalLength;
//         this.flowerType = flower.flowerType;
//     }

//     public String getColor() {
//         return color.toString();
//     }

// }