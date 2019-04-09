package sms.service;

import org.springframework.stereotype.Service;
import sms.entity.WareHouse;

import java.sql.SQLException;
import java.util.List;

/**
 * service层：仓库信息服务层接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface WareHouseService {
    /**
     * 添加仓库商品信息
     * @param wareHouse
     * @return
     * @throws SQLException
     */
    int addWareHouse(WareHouse wareHouse) throws SQLException;

    /**
     * 修改仓库商品信息
     * @param wareHouse
     * @return
     * @throws SQLException
     */
    int updateWareHouse(WareHouse wareHouse) throws SQLException;

    /**
     * 删除仓库商品信息
     * @param wareHouseId
     * @return
     * @throws SQLException
     */
    int deleteWareHouse(int wareHouseId) throws SQLException;

    /**
     * 根据商品条码goodsBarcode查询仓库商品信息
     * @param goodsBarcode
     * @return
     * @throws SQLException
     */
    List<WareHouse> getWareHouseByGoodsBarcode(String goodsBarcode) throws SQLException;

    /**
     * 分页查询仓库所有商品信息
     * @return
     * @param number
     * @throws SQLException
     */
    List<WareHouse> getAllWareHouse(int number) throws SQLException;

    /**
     * 根据goodsPrice降序查询仓库商品信息
     * @return
     * @throws SQLException
     */
    List<WareHouse> getWareHouseByGoodsPriceDESC() throws SQLException;

    /**
     * 根据goodsPrice升序查询仓库商品信息
     * @return
     * @throws SQLException
     */
    List<WareHouse> getWareHouseByGoodsPriceASC() throws SQLException;

    /**
     * 根据goodsInventory降序查询仓库商品信息
     * @return
     * @throws SQLException
     */
    List<WareHouse> getWareHouseByGoodsInventoryDESC() throws SQLException;

    /**
     * 根据goodsInventory降序查询仓库商品信息
     * @return
     * @throws SQLException
     */
    List<WareHouse> getWareHouseByGoodsInventoryASC() throws SQLException;

    /**
     * 根据categoryName条件查询仓库商品信息
     * @param categoryName
     * @return
     * @throws SQLException
     */
    List<WareHouse> getWareHouseByCategoryName(String categoryName) throws SQLException;

}
