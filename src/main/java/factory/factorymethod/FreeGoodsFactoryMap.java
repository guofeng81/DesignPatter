package factory.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class FreeGoodsFactoryMap {

    private static final Map<Integer, FreeGoodsFactory> cacheFactories;

    static {
        cacheFactories =  new HashMap<>();
        cacheFactories.put(1, new DiscountFreeGoodsFactory());
        cacheFactories.put(2, new SmallGiftFreeGoodsFactory());
    }
}
