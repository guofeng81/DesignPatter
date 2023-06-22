package factory.simplefactory;

public class DeliverController {
    public ResponseResult awardToUser(AwardInfo awardInfo){
        IFreeGood freeGood = FreeGoodsFactory.getInstance(awardInfo.getAwardType());
        ResponseResult result = freeGood.sendFreeGoods(awardInfo);
        return result;
    }
}
