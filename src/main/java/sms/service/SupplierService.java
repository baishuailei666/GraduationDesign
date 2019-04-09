package sms.service;

import org.springframework.stereotype.Service;
import sms.entity.Supplier;

import java.sql.SQLException;
import java.util.List;

/**
 * service层：供货商信息服务层接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface SupplierService {
    /**
     * 添加供货商信息
     * @param supplier
     * @return
     * @throws SQLException
     */
    int addSupplier(Supplier supplier) throws SQLException;

    /**
     * 修改供货商信息
     * @param supplier
     * @return
     * @throws SQLException
     */
    int updateSupplier(Supplier supplier) throws SQLException;

    /**
     * 删除某一供货商信息
     * @param supplierId
     * @return
     * @throws SQLException
     */
    int deleteSupplier(int supplierId) throws SQLException;

    /**
     * 根据供货商名称supplierName查询供货商信息
     * @param supplierName
     * @return
     * @throws SQLException
     */
    List<Supplier> getSupplierByName(String supplierName) throws SQLException;

    /**
     * 根据供货价格supplierPrice 降序查询供货商信息
     * @return
     * @throws SQLException
     */
    List<Supplier> getSupplierBySupplierPriceDESC() throws SQLException;

    /**
     * 根据供货价格supplierPrice 升序查询供货商信息
     * @return
     * @throws SQLException
     */
    List<Supplier> getSupplierBySupplierPriceASC() throws SQLException;

    /**
     * 根据种类categoryName查询供货商信息
     * @param categoryName
     * @return
     * @throws SQLException
     */
    List<Supplier> getSupplierByCategoryName(String categoryName) throws SQLException;

    /**
     * 分页查询所有供货商信息
     * @param number
     * @return
     * @throws SQLException
     */
    List<Supplier> getAllSupplier(int number) throws SQLException;
}
