package sms.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sms.dao.GoodsDao;
import sms.dao.PurchaseDao;
import sms.entity.Goods;
import sms.entity.Purchase;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自动生成采购单工具类
 *
 * @date 2018-05-03
 * @author 白帅雷
 */
@Component
public class PurUtil {
    @Autowired
    PurchaseDao purchaseDao;
    @Autowired
    GoodsDao goodsDao;

    /**
     * 根据销售商品库存量自动生成采购单
     *
     * @param goodsName
     */
    public void autoAddPur(String goodsName) {
        Goods goods = goodsDao.getGoodsByNameAuto(goodsName);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Purchase purchase = new Purchase();
        purchase.setGoodsName(goodsName);
        purchase.setSupplierPrice(goods.getSupplierPrice());
        purchase.setGoodsNum("30");
        purchase.setPurchaseManager("小熊猫");
        purchase.setPurchaseTime(sdf.format(date));
        purchase.setCategoryName(goods.getCategoryName());
        purchaseDao.addPurchase(purchase);
    }
}
