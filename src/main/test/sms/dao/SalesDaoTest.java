package sms.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import sms.entity.Sales;
import sms.util.DatetimeUtil;

import static org.junit.Assert.*;
/**
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:Spring/spring-*.xml"})
@Transactional
public class SalesDaoTest {
    @Autowired
    SalesDao salesDao;
    @Test
    public void addSales() throws Exception {
        Sales sales = new Sales();
        sales.setGoodsName("哇哈哈电动牙刷" + (int)(Math.random() * 1001) + "85型");
        sales.setGoodsBarcode("692" + System.currentTimeMillis());
        sales.setSalesManager("小天天");
        sales.setGoodsUnit("个");
        sales.setGoodsNum(1);
        sales.setSalesTime(DatetimeUtil.getDate(System.currentTimeMillis()));
        sales.setGoodsPrice("198");
        sales.setSalesTotalAmount("198");
        this.salesDao.addSales(sales);
    }

}