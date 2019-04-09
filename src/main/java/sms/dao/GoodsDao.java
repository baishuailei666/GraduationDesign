package sms.dao;

import org.springframework.stereotype.Service;
import sms.entity.Goods;

import java.util.List;

/**
 * Dao层：商品信息接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface GoodsDao {
    /**
     * 添加商品信息
     * @param goods
     * @return
     */
    int addGoods(Goods goods);

    /**
     * 修改商品信息
     * @param goods
     * @return
     */
    int updateGoods(Goods goods);

    /**
     * 删除某一商品信息
     * @param goodsId
     * @return
     */
    int deleteGoods(int goodsId);

    /**
     * 根据商品名称goodsName查询商品信息
     * @param goodsName
     * @return
     */
    Goods getGoodsByNameAuto(String goodsName);

    /**
     * 根据商品名称goodsName查询商品信息
     * @param goodsName
     * @return
     */
    List<Goods> getGoodsByName(String goodsName);

    /**
     * 根据商品条码goodsBarcode查询商品信息
     * @param goodsBarcode
     * @return
     */
    List<Goods> getGoodsByBarcode(String goodsBarcode);

    /**
     * 根据种类categoryName查询商品信息
     * @param categoryName
     * @return
     */
    List<Goods> getGoodsByCategoryName(String categoryName);

    /**
     * 分页查询所有商品信息
     * @param number
     * @return
     */
    List<Goods> getAllGoods(int number);

}
