package sms.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import sms.entity.Supplier;

import static org.junit.Assert.*;
/**
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:Spring/spring-*.xml"})
@Transactional
public class SupplierDaoTest {
    @Autowired
    SupplierDao supplierDao;
    @Test
    public void addSupplier() throws Exception {
        Supplier supplier = new Supplier();
        supplier.setSupplierName("浙江娃哈哈有限公司");
        supplier.setGoodsName("娃哈哈柠檬茶" + (int)(Math.random() * 1001) + "85型");
        supplier.setSupplierPrice("89");
        supplier.setSupplierAddress("浙江杭州");
        supplier.setSupplierPersonnel("大白");
        supplier.setSupplierTel("17826800792");
        supplier.setSupplierEmail("dabai@sms.io");
        supplier.setCategoryName("饮料烟酒类");
        supplier.setGoodsUnit("箱");
        this.supplierDao.addSupplier(supplier);
    }

}