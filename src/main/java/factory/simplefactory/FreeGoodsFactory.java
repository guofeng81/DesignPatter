package factory.simplefactory;

public class FreeGoodsFactory {
    public static IFreeGood getInstance(Integer awardType){
        IFreeGood iFreeGood = null;
        if(awardType == 1){
            iFreeGood = new DiscountFreeGoods();
        }else if(awardType == 2){
            iFreeGood = new YouKuMemberFreeGoods();
        }else if(awardType == 3){
            iFreeGood = new SimallGiftFreeGoods();
        }
        return iFreeGood;
    }
}
