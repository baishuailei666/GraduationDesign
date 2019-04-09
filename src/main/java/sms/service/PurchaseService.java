package sms.service;

import org.springframework.stereotype.Service;
import sms.entity.Purchase;

import java.sql.SQLException;
import java.util.List;

/**
 * service层：采购信息服务层接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface PurchaseService {
    /**
     * 添加采购信息
     * @param purchase
     * @return
     * @throws SQLException
     */
    int addPurchase(Purchase purchase) throws SQLException;

    /**
     * 修改采购信息
     * @param purchase
     * @return
     * @throws SQLException
     */
    int updatePurchase(Purchase purchase) throws SQLException;

    /**
     * 删除某一采购信息
     * @param purchaseId
     * @return
     * @throws SQLException
     */
    int deletePurchase(int purchaseId) throws SQLException;

    /**
     * 根据采购商品名称goodsName查询采购信息
     * @param goodsName
     * @return
     * @throws SQLException
     */
    List<Purchase> getPurchaseByName(String goodsName) throws SQLException;

    /**
     * 根据采购时间purchaseTime查询采购信息
     * @param purchaseTime
     * @return
     * @throws SQLException
     */
    List<Purchase> getPurchaseByTime(String purchaseTime) throws SQLException;

    /**
     * 根据种类categoryName查询采购信息
     * @param categoryName
     * @return
     * @throws SQLException
     */
    List<Purchase> getPurchaseByCategoryName(String categoryName) throws SQLException;

    /**
     * 分页查询所有采购信息
     * @return
     * @param number
     * @throws SQLException

     */
    List<Purchase> getAllPurchase(int number) throws SQLException;
}
