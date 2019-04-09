package sms.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import sms.entity.Goods;

import static org.junit.Assert.*;
/**
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:Spring/spring-*.xml"})
@Transactional
public class GoodsDaoTest {
    @Autowired
    GoodsDao goodsDao;
    @Test
    public void addGoods() throws Exception {
        Goods goods = new Goods();
        goods.setGoodsName("娃哈哈香草冰淇淋果冻" + (int)(Math.random() * 100));
        goods.setGoodsBarcode(String.valueOf(System.currentTimeMillis()));
        goods.setGoodsPrice("39.9");
        goods.setGoodsUnit("箱");
        goods.setSupplierPrice("19.9");
        goods.setSupplierName("浙江娃哈哈有限公司");
        goods.setCategoryName("包装食品类");
        goods.setGoodsSc(String.valueOf(System.currentTimeMillis()));
        goods.setGoodsContent("150kg");
        this.goodsDao.addGoods(goods);
    }

    @Test
    public void updateGoods() throws Exception {
    }

    @Test
    public void deleteGoods() throws Exception {
    }

    @Test
    public void getGoodsByNameAuto() throws Exception {
    }

    @Test
    public void getGoodsByName() throws Exception {
    }

    @Test
    public void getGoodsByBarcode() throws Exception {
    }

    @Test
    public void getGoodsByCategoryName() throws Exception {
    }

    @Test
    public void getAllGoods() throws Exception {
    }

}