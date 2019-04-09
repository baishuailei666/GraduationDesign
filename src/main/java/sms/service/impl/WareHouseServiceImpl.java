package sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sms.dao.WareHouseDao;
import sms.entity.WareHouse;
import sms.service.WareHouseService;

import java.sql.SQLException;
import java.util.List;

/**
 * impl层：仓库信息服务层实现类
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public class WareHouseServiceImpl implements WareHouseService{
    @Autowired
    private WareHouseDao wareHouseDao;
    /**
     * 添加仓库商品信息
     *
     * @param wareHouse
     * @return
     * @throws SQLException
     */
    @Override
    public int addWareHouse(WareHouse wareHouse) throws SQLException {
        return this.wareHouseDao.addWareHouse(wareHouse);
    }

    /**
     * 修改仓库商品信息
     *
     * @param wareHouse
     * @return
     * @throws SQLException
     */
    @Override
    public int updateWareHouse(WareHouse wareHouse) throws SQLException {
        return this.wareHouseDao.updateWareHouse(wareHouse);
    }

    /**
     * 删除仓库商品信息
     *
     * @param wareHouseId
     * @return
     * @throws SQLException
     */
    @Override
    public int deleteWareHouse(int wareHouseId) throws SQLException {
        return this.wareHouseDao.deleteWareHouse(wareHouseId);
    }

    /**
     * 根据商品条码goodsBarcode查询仓库商品信息
     *
     * @param goodsBarcode
     * @return
     * @throws SQLException
     */
    @Override
    public List<WareHouse> getWareHouseByGoodsBarcode(String goodsBarcode) throws SQLException {
        return this.wareHouseDao.getWareHouseByGoodsBarcode(goodsBarcode);
    }

    /**
     * 分页查询仓库所有商品信息
     *
     * @return
     * @param number
     * @throws SQLException
     */
    @Override
    public List<WareHouse> getAllWareHouse(int number) throws SQLException {
        return this.wareHouseDao.getAllWareHouse(number);
    }

    /**
     * 根据goodsPrice降序查询仓库商品信息
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<WareHouse> getWareHouseByGoodsPriceDESC() throws SQLException {
        return this.wareHouseDao.getWareHouseByGoodsPriceDESC();
    }

    /**
     * 根据goodsPrice升序查询仓库商品信息
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<WareHouse> getWareHouseByGoodsPriceASC() throws SQLException {
        return this.wareHouseDao.getWareHouseByGoodsPriceASC();
    }

    /**
     * 根据goodsInventory降序查询仓库商品信息
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<WareHouse> getWareHouseByGoodsInventoryDESC() throws SQLException {
        return this.wareHouseDao.getWareHouseByGoodsInventoryDESC();
    }

    /**
     * 根据goodsInventory降序查询仓库商品信息
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<WareHouse> getWareHouseByGoodsInventoryASC() throws SQLException {
        return this.wareHouseDao.getWareHouseByGoodsInventoryASC();
    }

    /**
     * 根据categoryName条件查询仓库商品信息
     *
     * @param categoryName
     * @return
     * @throws SQLException
     */
    @Override
    public List<WareHouse> getWareHouseByCategoryName(String categoryName) throws SQLException {
        return this.wareHouseDao.getWareHouseByCategoryName(categoryName);
    }
}
