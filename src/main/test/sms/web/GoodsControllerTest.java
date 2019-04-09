package sms.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;
/**
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:Spring/spring-*.xml"})
@Transactional
public class GoodsControllerTest {
    @Test
    public void addGoods() throws Exception {
    }

    @Test
    public void updateGoods() throws Exception {
    }

    @Test
    public void deleteGoods() throws Exception {
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