package sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sms.dao.PurchaseDao;
import sms.entity.Purchase;
import sms.service.PurchaseService;

import java.sql.SQLException;
import java.util.List;

/**
 * impl层：采购信息服务层实现类
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public class PurchaseServiceImpl implements PurchaseService{
    @Autowired
    private PurchaseDao purchaseDao;
    /**
     * 添加采购信息
     *
     * @param purchase
     * @return
     * @throws SQLException
     */
    @Override
    public int addPurchase(Purchase purchase) throws SQLException {
        return this.purchaseDao.addPurchase(purchase);
    }

    /**
     * 修改采购信息
     *
     * @param purchase
     * @return
     * @throws SQLException
     */
    @Override
    public int updatePurchase(Purchase purchase) throws SQLException {
        return this.purchaseDao.updatePurchase(purchase);
    }

    /**
     * 删除某一采购信息
     *
     * @param purchaseId
     * @return
     * @throws SQLException
     */
    @Override
    public int deletePurchase(int purchaseId) throws SQLException {
        return this.purchaseDao.deletePurchase(purchaseId);
    }

    /**
     * 根据采购商品名称goodsName查询采购信息
     *
     * @param goodsName
     * @return
     * @throws SQLException
     */
    @Override
    public List<Purchase> getPurchaseByName(String goodsName) throws SQLException {
        return this.purchaseDao.getPurchaseByName(goodsName);
    }

    /**
     * 根据采购时间purchaseTime查询采购信息
     *
     * @param purchaseTime
     * @return
     * @throws SQLException
     */
    @Override
    public List<Purchase> getPurchaseByTime(String purchaseTime) throws SQLException {
        return this.purchaseDao.getPurchaseByTime(purchaseTime);
    }

    /**
     * 根据种类categoryName查询采购信息
     *
     * @param categoryName
     * @return
     * @throws SQLException
     */
    @Override
    public List<Purchase> getPurchaseByCategoryName(String categoryName) throws SQLException {
        return this.purchaseDao.getPurchaseByCategoryName(categoryName);
    }


    /**
     * 分页查询所有采购信息
     *
     * @return
     * @throws SQLException
     * @param number
     */
    @Override
    public List<Purchase> getAllPurchase(int number) throws SQLException {
        return this.purchaseDao.getAllPurchase(number);
    }
}
