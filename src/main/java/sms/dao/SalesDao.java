package sms.dao;

import org.springframework.stereotype.Service;
import sms.entity.Sales;

import java.util.List;

/**
 * Dao层：销售信息接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface SalesDao {
    /**
     * 添加销售信息
     * @param sales
     * @return
     */
    int addSales(Sales sales);

    /**
     * 修改销售信息
     * @param sales
     * @return
     */
    int updateSales(Sales sales);

    /**
     * 删除某一销售信息
     * @param salesId
     * @return
     */
    int deleteSales(int salesId);

    /**
     * 根据销售商品名称goodsName查询销售信息
     * @param goodsName
     * @return
     */
    List<Sales> getSalesByName(String goodsName);

    /**
     * 根据销售日期date查询销售信息
     * @param salesTime
     * @return
     */
    List<Sales> getSalesByDate(String salesTime);

    /**
     * 根据销售时间time 降序查询销售信息
     * @return
     */
    List<Sales> getSalesByTimeDESC();

    /**
     * 根据销售时间time 升序查询销售信息
     * @return
     */
    List<Sales> getSalesByTimeASC();

    /**
     * 根据销售总价amount 降序查询销售信息
     * @return
     */
    List<Sales> getSalesByAmountDESC();

    /**
     * 根据销售总价amount 升序查询销售信息
     * @return
     */
    List<Sales> getSalesByAmountASC();

    /**
     * 分页查询所有销售信息
     * @param number
     * @return
     */
    List<Sales> getAllSales(int number);
}
