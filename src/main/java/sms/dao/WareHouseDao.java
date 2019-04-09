package sms.dao;

import org.springframework.stereotype.Service;
import sms.entity.WareHouse;

import java.util.List;

/**
 * Dao层：仓库信息接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface WareHouseDao {
    /**
     * 添加仓库商品信息
     * @param wareHouse
     * @return
     */
    int addWareHouse(WareHouse wareHouse);

    /**
     * 修改仓库商品信息
     * @param wareHouse
     * @return
     */
    int updateWareHouse(WareHouse wareHouse);

    /**
     * 删除仓库商品信息
     * @param wareHouseId
     * @return
     */
    int deleteWareHouse(int wareHouseId);

    /**
     * 根据商品条码goodsBarcode查询仓库商品信息
     * @param goodsBarcode
     * @return
     */
    List<WareHouse> getWareHouseByGoodsBarcode(String goodsBarcode);

    /**
     * 分页查询仓库所有商品信息
     * @return
     * @param number
     */
    List<WareHouse> getAllWareHouse(int number);

    /**
     * 根据goodsPrice降序查询仓库商品信息
     * @return
     */
    List<WareHouse> getWareHouseByGoodsPriceDESC();

    /**
     * 根据goodsPrice升序查询仓库商品信息
     * @return
     */
    List<WareHouse> getWareHouseByGoodsPriceASC();

    /**
     * 根据goodsInventory降序查询仓库商品信息
     * @return
     */
    List<WareHouse> getWareHouseByGoodsInventoryDESC();

    /**
     * 根据goodsInventory降序查询仓库商品信息
     * @return
     */
    List<WareHouse> getWareHouseByGoodsInventoryASC();

    /**
     * 根据categoryName条件查询仓库商品信息
     * @param categoryName
     * @return
     */
    List<WareHouse> getWareHouseByCategoryName(String categoryName);

    /**
     * 根据goodsName条件查询仓库商品信息
     * @param goodsName
     * @return
     */
    WareHouse getWareHouseByGoodsName(String goodsName);
}
