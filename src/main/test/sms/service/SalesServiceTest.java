package sms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import sms.dao.SalesDao;
import sms.entity.Sales;

import static org.junit.Assert.*;
/**
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:Spring/spring-*.xml"})
@Transactional
public class SalesServiceTest {
    @Autowired
    SalesDao salesDao;
    @Test
    public void addSales() throws Exception {
        Sales sales = new Sales();
        sales.setGoodsName("哇哈哈电动牙刷");
        sales.setGoodsBarcode("6946327963665");
        sales.setGoodsPrice("189");
        sales.setGoodsNum(2);
        sales.setGoodsUnit("个");
        sales.setSalesTotalAmount("378");
        sales.setSalesTime("2018-05-04 15:26");
        sales.setSalesManager("小天天");
        this.salesDao.addSales(sales);
    }

    @Test
    public void updateSales() throws Exception {
    }

    @Test
    public void deleteSales() throws Exception {
    }

    @Test
    public void getSalesByName() throws Exception {
    }

    @Test
    public void getSalesByDate() throws Exception {
    }

    @Test
    public void getSalesByTimeDESC() throws Exception {
    }

    @Test
    public void getSalesByTimeASC() throws Exception {
    }

    @Test
    public void getSalesByAmountDESC() throws Exception {
    }

    @Test
    public void getSalesByAmountASC() throws Exception {
    }

    @Test
    public void getAllSales() throws Exception {
    }

}