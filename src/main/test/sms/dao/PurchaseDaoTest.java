package sms.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import sms.entity.Purchase;
import sms.util.DatetimeUtil;

import static org.junit.Assert.*;
/**
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:Spring/spring-*.xml"})

public class PurchaseDaoTest {
    @Autowired
    PurchaseDao purchaseDao;
    @Test
    public void addPurchase() throws Exception {
        Purchase purchase = new Purchase();
        purchase.setGoodsName("哇哈哈电动牙刷" + (int)(Math.random() * 101) + "85型");
        purchase.setSupplierPrice("189");
        purchase.setGoodsNum("50");
        purchase.setPurchaseTime(DatetimeUtil.getDate(System.currentTimeMillis()));
        purchase.setPurchaseManager("小熊猫");
        purchase.setCategoryName("家居百货类");
        this.purchaseDao.addPurchase(purchase);

    }

}