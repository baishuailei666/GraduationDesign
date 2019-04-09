package sms.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sms.dao.WareHouseDao;
import sms.entity.WareHouse;

/**
 * 自动更新仓库商品库存工具类
 *
 * @date 2018-05-03
 * @author 白帅雷
 */
@Component
public class WarehouseUtil {
    @Autowired
    WareHouseDao wareHouseDao;

    /**
     * 根据销售商品数量更新仓库库存
     *
     * @param goodsName
     */
    public void upWarehouse(String goodsName, int goodsNum) {
        WareHouse getWareHouse = this.wareHouseDao.getWareHouseByGoodsName(goodsName);
        WareHouse setWareHouse = new WareHouse();
        setWareHouse.setGoodsName(goodsName);
        setWareHouse.setGoodsInventory(getWareHouse.getGoodsInventory() - goodsNum);
        this.wareHouseDao.updateWareHouse(setWareHouse);
    }

    /**
     * 根据商品名称获取库存量
     *
     * @param goodsName
     * @return
     */
    public int getInventory(String goodsName) {
        return this.wareHouseDao.getWareHouseByGoodsName(goodsName).getGoodsInventory();
    }
}
