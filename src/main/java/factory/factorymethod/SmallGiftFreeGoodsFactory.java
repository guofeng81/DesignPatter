package factory.factorymethod;

public class SmallGiftFreeGoodsFactory implements FreeGoodsFactory{

    @Override
    public IFreeGoods getInstance() {
        return new SmallGiftFreeGoods();
    }
}
