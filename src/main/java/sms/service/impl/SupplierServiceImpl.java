package sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sms.dao.SupplierDao;
import sms.entity.Supplier;
import sms.service.SupplierService;

import java.sql.SQLException;
import java.util.List;

/**
 * impl层：供货商信息服务层实现类
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public class SupplierServiceImpl implements SupplierService{
    @Autowired
    private SupplierDao supplierDao;
    /**
     * 添加供货商信息
     *
     * @param supplier
     * @return
     * @throws SQLException
     */
    @Override
    public int addSupplier(Supplier supplier) throws SQLException {
        return this.supplierDao.addSupplier(supplier);
    }

    /**
     * 修改供货商信息
     *
     * @param supplier
     * @return
     * @throws SQLException
     */
    @Override
    public int updateSupplier(Supplier supplier) throws SQLException {
        return this.supplierDao.updateSupplier(supplier);
    }

    /**
     * 删除某一供货商信息
     *
     * @param supplierId
     * @return
     * @throws SQLException
     */
    @Override
    public int deleteSupplier(int supplierId) throws SQLException {
        return this.supplierDao.deleteSupplier(supplierId);
    }

    /**
     * 根据供货商名称supplierName查询供货商信息
     *
     * @param supplierName
     * @return
     * @throws SQLException
     */
    @Override
    public List<Supplier> getSupplierByName(String supplierName) throws SQLException {
        return this.supplierDao.getSupplierByName(supplierName);
    }

    /**
     * 根据供货价格supplierPrice 降序查询供货商信息
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Supplier> getSupplierBySupplierPriceDESC() throws SQLException {
        return this.supplierDao.getSupplierBySupplierPriceDESC();
    }

    /**
     * 根据供货价格supplierPrice 升序查询供货商信息
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Supplier> getSupplierBySupplierPriceASC() throws SQLException {
        return this.supplierDao.getSupplierBySupplierPriceASC();
    }

    /**
     * 根据种类categoryName查询供货商信息
     *
     * @param categoryName
     * @return
     * @throws SQLException
     */
    @Override
    public List<Supplier> getSupplierByCategoryName(String categoryName) throws SQLException {
        return this.supplierDao.getSupplierByCategoryName(categoryName);
    }


    /**
     * 分页查询所有供货商信息
     *
     * @return
     * @param number
     * @throws SQLException
     */
    @Override
    public List<Supplier> getAllSupplier(int number) throws SQLException {
        return this.supplierDao.getAllSupplier(number);
    }
}
