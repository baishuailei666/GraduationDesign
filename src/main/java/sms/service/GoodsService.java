package sms.service;

import org.springframework.stereotype.Service;
import sms.entity.Goods;

import java.sql.SQLException;
import java.util.List;

/**
 * service层：商品信息服务层接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface GoodsService {
    /**
     * 添加商品信息
     * @param goods
     * @return
     * @throws SQLException
     */
    int addGoods(Goods goods) throws SQLException;

    /**
     * 修改商品信息
     * @param goods
     * @return
     * @throws SQLException
     */
    int updateGoods(Goods goods) throws SQLException;

    /**
     * 删除某一商品信息
     * @param goodsId
     * @return
     * @throws SQLException
     */
    int deleteGoods(int goodsId) throws SQLException;

    /**
     * 根据商品条码goodsBarcode查询商品信息
     * @param goodsBarcode
     * @return
     * @throws SQLException
     */
    List<Goods> getGoodsByBarcode(String goodsBarcode) throws SQLException;

    /**
     * 根据种类categoryName查询商品信息
     * @param categoryName
     * @return
     * @throws SQLException
     */
    List<Goods> getGoodsByCategoryName(String categoryName) throws SQLException;

    /**
     * 根据商品名称goodsName查询商品信息
     * @param goodsName
     * @return
     * @throws SQLException
     */
    List<Goods> getGoodsByName(String goodsName) throws SQLException;

    /**
     * 分页查询所有商品信息
     * @param number
     * @return
     * @throws SQLException
     */
    List<Goods> getAllGoods(int number) throws SQLException;
}
