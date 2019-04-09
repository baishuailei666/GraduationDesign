package sms.service;

import org.springframework.stereotype.Service;
import sms.entity.Sales;

import java.sql.SQLException;
import java.util.List;

/**
 * service层：销售信息服务层接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface SalesService {
    /**
     * 添加销售信息
     * @param sales
     * @return
     * @throws SQLException
     */
    int addSales(Sales sales) throws SQLException;

    /**
     * 修改销售信息
     * @param sales
     * @return
     * @throws SQLException
     */
    int updateSales(Sales sales) throws SQLException;

    /**
     * 删除某一销售信息
     * @param salesId
     * @return
     * @throws SQLException
     */
    int deleteSales(int salesId) throws SQLException;

    /**
     * 根据销售商品名称goodsName查询销售信息
     * @param goodsName
     * @return
     * @throws SQLException
     */
    List<Sales> getSalesByName(String goodsName) throws SQLException;

    /**
     * 根据销售日期date查询销售信息
     * @param salesTime
     * @return
     * @throws SQLException
     */
    List<Sales> getSalesByDate(String salesTime) throws SQLException;

    /**
     * 根据销售时间time 降序查询销售信息
     * @return
     * @throws SQLException
     */
    List<Sales> getSalesByTimeDESC() throws SQLException;

    /**
     * 根据销售时间time 升序查询销售信息
     * @return
     * @throws SQLException
     */
    List<Sales> getSalesByTimeASC() throws SQLException;

    /**
     * 根据销售总价amount 降序查询销售信息
     * @return
     * @throws SQLException
     */
    List<Sales> getSalesByAmountDESC() throws SQLException;

    /**
     * 根据销售总价amount 升序查询销售信息
     * @return
     * @throws SQLException
     */
    List<Sales> getSalesByAmountASC() throws SQLException;

    /**
     * 分页查询所有销售信息
     * @return
     * @param number
     * @throws SQLException
     */
    List<Sales> getAllSales(int number) throws SQLException;
}
