package sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sms.dao.SalesDao;
import sms.dao.WareHouseDao;
import sms.entity.Sales;
import sms.service.SalesService;
import sms.util.PurUtil;
import sms.util.WarehouseUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * impl层：销售信息服务层实现类
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public class SalesServiceImpl implements SalesService{
    @Autowired
    private SalesDao salesDao;
    private WarehouseUtil warehouseUtil = new WarehouseUtil();
    private PurUtil purUtil = new PurUtil();
    /**
     * 添加销售信息(根据销售商品信息自动更新仓库商品库存; 如果商品库存低于最低库存量则自动生成采购单)
     *
     * @param sales
     * @return
     * @throws SQLException
     */
    @Override
    public int addSales(Sales sales) throws SQLException {
        int lowNum = 20;
        warehouseUtil.upWarehouse(sales.getGoodsName(), sales.getGoodsNum());
        int goodsInventory = warehouseUtil.getInventory(sales.getGoodsName());
        if (goodsInventory <= lowNum ) {
            purUtil.autoAddPur(sales.getGoodsName());
        }
        return this.salesDao.addSales(sales);
    }

    /**
     * 修改销售信息
     *
     * @param sales
     * @return
     * @throws SQLException
     */
    @Override
    public int updateSales(Sales sales) throws SQLException {
        return this.salesDao.updateSales(sales);
    }

    /**
     * 删除某一销售信息
     *
     * @param salesId
     * @return
     * @throws SQLException
     */
    @Override
    public int deleteSales(int salesId) throws SQLException {
        return this.salesDao.deleteSales(salesId);
    }

    /**
     * 根据销售商品名称goodsName查询销售信息
     *
     * @param goodsName
     * @return
     * @throws SQLException
     */
    @Override
    public List<Sales> getSalesByName(String goodsName) throws SQLException {
        return this.salesDao.getSalesByName(goodsName);
    }

    /**
     * 根据销售日期date查询销售信息
     *
     * @param salesTime
     * @return
     * @throws SQLException
     */
    @Override
    public List<Sales> getSalesByDate(String salesTime) throws SQLException {
        return this.salesDao.getSalesByDate(salesTime);
    }

    /**
     * 根据销售时间time 降序查询销售信息
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Sales> getSalesByTimeDESC() throws SQLException {
        return this.salesDao.getSalesByTimeDESC();
    }

    /**
     * 根据销售时间time 升序查询销售信息
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Sales> getSalesByTimeASC() throws SQLException {
        return this.salesDao.getSalesByTimeASC();
    }

    /**
     * 根据销售总价amount 降序查询销售信息
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Sales> getSalesByAmountDESC() throws SQLException {
        return this.salesDao.getSalesByAmountDESC();
    }

    /**
     * 根据销售总价amount 升序查询销售信息
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Sales> getSalesByAmountASC() throws SQLException {
        return this.salesDao.getSalesByAmountASC();
    }


    /**
     * 分页查询所有销售信息
     *
     * @return
     * @param number
     * @throws SQLException
     */
    @Override
    public List<Sales> getAllSales(int number) throws SQLException {
        return this.salesDao.getAllSales(number);
    }
}
