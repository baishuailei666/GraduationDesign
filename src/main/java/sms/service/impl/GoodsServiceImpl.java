package sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sms.dao.GoodsDao;
import sms.entity.Goods;
import sms.service.GoodsService;

import java.sql.SQLException;
import java.util.List;

/**
 * impl层：商品信息服务层实现类
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsDao goodsDao;

    /**
     * 添加商品信息
     *
     * @param goods
     * @return
     * @throws SQLException
     */
    @Override
    public int addGoods(Goods goods) throws SQLException {
        return this.goodsDao.addGoods(goods);
    }

    /**
     * 修改商品信息
     *
     * @param goods
     * @return
     * @throws SQLException
     */
    @Override
    public int updateGoods(Goods goods) throws SQLException {
        return this.goodsDao.updateGoods(goods);
    }

    /**
     * 删除某一商品信息
     *
     * @param goodsId
     * @return
     * @throws SQLException
     */
    @Override
    public int deleteGoods(int goodsId) throws SQLException {
        return this.goodsDao.deleteGoods(goodsId);
    }

    /**
     * 根据商品条码goodsBarcode查询商品信息
     *
     * @param goodsBarcode
     * @return
     * @throws SQLException
     */
    @Override
    public List<Goods> getGoodsByBarcode(String goodsBarcode) throws SQLException {
        return this.goodsDao.getGoodsByBarcode(goodsBarcode);
    }

    /**
     * 根据种类categoryName查询商品信息
     *
     * @param categoryName
     * @return
     * @throws SQLException
     */
    @Override
    public List<Goods> getGoodsByCategoryName(String categoryName) throws SQLException {
        return this.goodsDao.getGoodsByCategoryName(categoryName);
    }

    /**
     * 根据商品名称goodsName查询商品信息
     *
     * @param goodsName
     * @return
     * @throws SQLException
     */
    @Override
    public List<Goods> getGoodsByName(String goodsName) throws SQLException {
        return this.goodsDao.getGoodsByName(goodsName);
    }


    /**
     * 分页查询所有商品信息
     *
     * @return
     * @param number
     * @throws SQLException
     */
    @Override
    public List<Goods> getAllGoods(int number) throws SQLException {
        return this.goodsDao.getAllGoods(number);
    }
}
