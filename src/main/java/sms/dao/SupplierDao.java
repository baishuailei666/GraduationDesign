package sms.dao;

import org.springframework.stereotype.Service;
import sms.entity.Supplier;

import java.util.List;

/**
 * Dao层：供货商信息接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface SupplierDao {
    /**
     * 添加供货商信息
     * @param supplier
     * @return
     */
    int addSupplier(Supplier supplier);

    /**
     * 修改供货商信息
     * @param supplier
     * @return
     */
    int updateSupplier(Supplier supplier);

    /**
     * 删除某一供货商信息
     * @param supplierId
     * @return
     */
    int deleteSupplier(int supplierId);

    /**
     * 根据供货商名称supplierName查询供货商信息
     * @param supplierName
     * @return
     */
    List<Supplier> getSupplierByName(String supplierName);

    /**
     * 根据供货价格supplierPrice 降序查询供货商信息
     * @return
     */
    List<Supplier> getSupplierBySupplierPriceDESC();

    /**
     * 根据供货价格supplierPrice 升序查询供货商信息
     * @return
     */
    List<Supplier> getSupplierBySupplierPriceASC();

    /**
     * 根据种类categoryName查询供货商信息
     * @param categoryName
     * @return
     */
    List<Supplier> getSupplierByCategoryName(String categoryName);


    /**
     * 分页查询所有供货商信息
     * @param number
     * @return
     */
    List<Supplier> getAllSupplier(int number);
}
