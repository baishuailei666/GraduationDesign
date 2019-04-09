package sms.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sms.entity.WareHouse;
import sms.service.WareHouseService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * web层：仓库信息控制层
 * @date 2018-04-04
 * @author 白帅雷
 */
@Controller
@RequestMapping(value = "/warehouse")
public class WareHouseController {
    @Autowired
    private WareHouseService wareHouseService;

    /**
     * 定义静态logger用于输出log日志
     */
    private static Logger logger = Logger.getLogger(WareHouseController.class);

    /**
     * 向仓库添加商品信息
     * @param wareHouse
     * @return Map<String, Object>
     * @throws SQLException
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addWareHouse(@ModelAttribute("form") WareHouse wareHouse, Model model)
            throws SQLException {
        int ret = this.wareHouseService.addWareHouse(wareHouse);
        logger.info("Add goods information to the wareHouse");
        model.addAttribute("addWarehouse",ret);
        return "warehouse";
    }

    /**
     * 修改仓库商品信息
     * @param wareHouse
     * @return int
     * @throws SQLException
     */
    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public String updateWareHouse(@RequestBody WareHouse wareHouse) throws SQLException {
        this.wareHouseService.updateWareHouse(wareHouse);
        logger.info("Update goods information to the warehouse.");
        return "warehouse";
    }

    /**
     * 删除仓库中商品信息
     * @param wareHouseId
     * @return int
     * @throws SQLException
     */
    @RequestMapping(value = "/delete/{wareHouseId}", method = RequestMethod.DELETE)
    public String deleteWareHouse(@PathVariable("wareHouseId") String wareHouseId, Model model) throws SQLException {
        int ret = this.wareHouseService.deleteWareHouse(Integer.parseInt(wareHouseId));
        logger.info("Delete goods information from the warehouse.");
        model.addAttribute("warehouseDeleteRet",ret);
        return "warehouse";
    }

    /**
     * 根据商品条码goodsBarcode查询仓库中商品信息
     * @param goodsBarcode
     * @return WareHouse
     * @throws SQLException
     */
    @RequestMapping(value = "/goodsBarcode/{goodsBarcode}", method = RequestMethod.GET)
    public String getWareHouseByGoodsBarcode(@PathVariable("goodsBarcode") String goodsBarcode, Model model) throws SQLException {
        logger.info("Get a goods information from the warehouse by goods barcode.");
        List<WareHouse> wareHouseList = this.wareHouseService.getWareHouseByGoodsBarcode(goodsBarcode);
        model.addAttribute("wareHouseBarcodeList",wareHouseList);
        return "warehouse";
    }

    /**
     * 分页查询仓库所有商品信息
     * @return List<WareHouse>
     * @param number
     * @param model
     * @throws SQLException
     */
    @RequestMapping(value = "/page/{number}", method = RequestMethod.GET)
    public String getAllWareHouse(@PathVariable("number") int number, Model model) throws SQLException {
        logger.info("Get all goods information from the warehouse.");
        List<WareHouse> wareHouseList = this.wareHouseService.getAllWareHouse((number-1)*10);
        model.addAttribute("wareHouseList",wareHouseList);
        return "warehouse";
    }

    /**
     * 根据goodsPrice降序查询仓库商品信息
     * @return List<WareHouse>
     * @throws SQLException
     */
    @RequestMapping(value = "/goodsPriceDESC", method = RequestMethod.GET)
    public String getWareHouseByGoodsPriceDESC(Model model) throws SQLException {
        logger.info("Get a goods information from the warehouse by goods price desc.");
        List<WareHouse> warehouseGoodsPriceDESC = this.wareHouseService.getWareHouseByGoodsPriceDESC();
        model.addAttribute("warehouseGoodsPriceDESC",warehouseGoodsPriceDESC);
        return "warehouse";
    }

    /**
     * 根据goodsPrice升序查询仓库商品信息
     * @return List<WareHouse>
     * @throws SQLException
     */
    @RequestMapping(value = "/goodsPriceASC", method = RequestMethod.GET)
    public String getWareHouseByGoodsPriceASC(Model model) throws SQLException {
        logger.info("Get a goods information from the warehouse by goods price asc.");
        List<WareHouse> warehouseGoodsPriceASC = this.wareHouseService.getWareHouseByGoodsPriceASC();
        model.addAttribute("warehouseGoodsPriceASC",warehouseGoodsPriceASC);
        return "warehouse";
    }

    /**
     * 根据goodsInventory降序查询仓库商品信息
     * @return List<WareHouse>
     * @throws SQLException
     */
    @RequestMapping(value = "/goodsInventoryDESC", method = RequestMethod.GET)
    public String getWareHouseByGoodsInventoryDESC(Model model) throws SQLException {
        logger.info("Get a goods information from the warehouse by goods inventory desc.");
        List<WareHouse> goodsInventoryDESC = this.wareHouseService.getWareHouseByGoodsInventoryDESC();
        model.addAttribute("goodsInventoryDESC",goodsInventoryDESC);
        return "warehouse";
    }

    /**
     * 根据goodsInventory升序查询仓库商品信息
     * @return List<WareHouse>
     * @throws SQLException
     */
    @RequestMapping(value = "/goodsInventoryASC", method = RequestMethod.GET)
    public String getWareHouseByGoodsInventoryASC(Model model) throws SQLException {
        logger.info("Get a goods information from the warehouse by goods inventory asc.");
        List<WareHouse> goodsInventoryASC = this.wareHouseService.getWareHouseByGoodsInventoryASC();
        model.addAttribute("goodsInventoryASC",goodsInventoryASC);
        return "warehouse";
    }

    /**
     * 根据categoryName条件查询仓库商品信息
     * @param categoryName
     * @return List<WareHouse>
     * @throws SQLException
     */
    @RequestMapping(value = "/categoryName/{categoryName}", method = RequestMethod.GET)
    public String getWareHouseByCategoryName(@PathVariable("categoryName") String categoryName, Model model) throws SQLException {
        logger.info("Get a goods information from the warehouse by category.");
        List<WareHouse> warehouseCategoryList = this.wareHouseService.getWareHouseByCategoryName(categoryName);
        model.addAttribute("warehouseCategoryList",warehouseCategoryList);
        return "warehouse";
    }

}
