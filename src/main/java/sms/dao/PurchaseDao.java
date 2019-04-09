package sms.dao;

import org.springframework.stereotype.Service;
import sms.entity.Purchase;

import java.util.List;

/**
 * Dao层：采购信息接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface PurchaseDao {
    /**
     * 添加采购信息
     * @param purchase
     * @return
     */
    int addPurchase(Purchase purchase);

    /**
     * 修改采购信息
     * @param purchase
     * @return
     */
    int updatePurchase(Purchase purchase);

    /**
     * 删除某一采购信息
     * @param purchaseId
     * @return
     */
    int deletePurchase(int purchaseId);

    /**
     * 根据采购商品名称goodsName查询采购信息
     * @param goodsName
     * @return
     */
    List<Purchase> getPurchaseByName(String goodsName);

    /**
     * 根据采购时间purchaseTime查询采购信息
     * @param purchaseTime
     * @return
     */
    List<Purchase> getPurchaseByTime(String purchaseTime);

    /**
     * 根据种类categoryName查询采购信息
     * @param categoryName
     * @return
     */
    List<Purchase> getPurchaseByCategoryName(String categoryName);

    /**
     * 分页查询所有采购信息
     * @return
     * @param number
     */
    List<Purchase> getAllPurchase(int number);
}
