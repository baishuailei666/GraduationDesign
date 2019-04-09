package sms.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sms.entity.Supplier;
import sms.service.SupplierService;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * web层：供货商信息控制层
 * @date 2018-04-04
 * @author 白帅雷
 */
@Controller
@RequestMapping(value = "/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    /**
     * 定义静态logger用于输出log日志
     */
    private static Logger logger = Logger.getLogger(SupplierController.class);

    /**
     * 添加供货商信息
     * @param supplier
     * @return Map<String, Object>
     * @throws SQLException
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSupplier(@ModelAttribute("form") Supplier supplier, Model model) throws SQLException {
        int ret = this.supplierService.addSupplier(supplier);
        logger.info("Add supplier information");
        model.addAttribute("addSupplier",ret);
        return "supplier";
    }

    /**
     * 修改供货商信息
     * @param supplier
     * @return int
     * @throws SQLException
     */
    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public String updateSupplier(@RequestBody Supplier supplier) throws SQLException {
        this.supplierService.updateSupplier(supplier);
        logger.info("Update supplier information");
        return "supplier";
    }

    /**
     * 删除供货商信息
     * @param supplierId
     * @return int
     * @throws SQLException
     */
    @RequestMapping(value = "/delete/{supplierId}", method = RequestMethod.DELETE)
    public String deleteSupplier(@PathVariable("supplierId") String supplierId) throws SQLException {
        this.supplierService.deleteSupplier(Integer.parseInt(supplierId));
        logger.info("Delete supplier information");
        return "supplier";
    }

    /**
     * 根据供货商名称supplierName查询供货商信息
     * @param supplierName
     * @return List<Supplier>
     * @throws SQLException
     */
    @RequestMapping(value = "/supplierName/{supplierName}", method = RequestMethod.GET)
    public String getSupplierByName(@PathVariable("supplierName") String supplierName, Model model) throws SQLException {
        logger.info("Get a supplier information by name.");
        List<Supplier> supplierList = this.supplierService.getSupplierByName(supplierName);
        model.addAttribute("supplierList",supplierList);
        return "supplier";
    }

    /**
     * 根据供货价格supplierPrice 降序查询供货商信息
     * @return List<Supplier>
     * @throws SQLException
     */
    @RequestMapping(value = "/supplierPriceDESC", method = RequestMethod.GET)
    public String getSupplierBySupplierPriceDESC(Model model) throws SQLException {
        logger.info("Get a supplier information by price DESC.");
        List<Supplier> supplierPriceDESC = this.supplierService.getSupplierBySupplierPriceDESC();
        model.addAttribute("supplierPriceDESC",supplierPriceDESC);
        return "supplier";
    }
    /**
     * 根据供货价格supplierPrice 升序查询供货商信息
     * @return List<Supplier>
     * @throws SQLException
     */
    @RequestMapping(value = "/supplierPriceASC", method = RequestMethod.GET)
    public String getSupplierBySupplierPriceASC(Model model) throws SQLException {
        logger.info("Get a supplier information by price ASC.");
        List<Supplier> supplierPriceASC = this.supplierService.getSupplierBySupplierPriceASC();
        model.addAttribute("supplierPriceASC",supplierPriceASC);
        return "supplier";
    }

    /**
     * 根据种类categoryName查询供货商信息
     * @param categoryName
     * @return List<Supplier>
     * @throws SQLException
     */
    @RequestMapping(value = "/categoryName/{categoryName}", method = RequestMethod.GET)
    public String getSupplierByCategoryName(@PathVariable("categoryName") String categoryName, Model model) throws SQLException {
        logger.info("Get a supplier information by category name.");
        List<Supplier> supplierList = this.supplierService.getSupplierByCategoryName(categoryName);
        model.addAttribute("supplierList",supplierList);
        return "supplier";
    }

    /**
     * 分页查询所有供货商信息
     * @return List<Supplier>
     * @param number
     * @param model
     * @throws SQLException
     */
    @RequestMapping(value = "/page/{number}", method = RequestMethod.GET)
    public String getAllSupplier(@PathVariable("number") int number, Model model) throws SQLException {
        logger.info("Get all supplier information.");
        List<Supplier> supplierList = this.supplierService.getAllSupplier((number-1)*10);
        model.addAttribute("supplierList",supplierList);
        return "supplier";
    }
}
