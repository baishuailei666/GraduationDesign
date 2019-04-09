package sms.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import sms.entity.WareHouse;

import static org.junit.Assert.*;
/**
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:Spring/spring-*.xml"})
@Transactional
public class WareHouseDaoTest {
    @Autowired
    WareHouseDao wareHouseDao;
    @Test
    public void addWareHouse() throws Exception {
        WareHouse wareHouse = new WareHouse();
        wareHouse.setGoodsName("仓库商品信息添加" + Math.random());
        wareHouse.setGoodsBarcode(String.valueOf(System.currentTimeMillis()));
        wareHouse.setGoodsPrice("29.90");
        wareHouse.setSupplierName("杭州电子科技大学后勤公司");
        wareHouse.setGoodsInventory(100);
        wareHouse.setCategoryName("日配类");
        wareHouse.setGoodsUnit("箱");
        wareHouse.setGoodsContent("2.5kg");
        this.wareHouseDao.addWareHouse(wareHouse);
    }
}