package flower.store;

// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.ToString;

// import java.util.ArrayList;
// import java.util.List;

// @Getter
// @NoArgsConstructor
// @ToString
// public class FlowerBucket {
//     private List<FlowerPack> bucket = new ArrayList<>();

//     public void add(FlowerPack flowerPack) {
//         bucket.add(flowerPack);
//     }

//     public double getPrice() {
//         return bucket.stream().mapToDouble(FlowerPack::getPrice).sum();
//     }
// }
import java.util.ArrayList;
import java.util.List;


public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}