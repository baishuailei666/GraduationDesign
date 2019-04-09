package sms.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sms.entity.Purchase;
import sms.service.PurchaseService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * web层：采购信息控制层
 * @date 2018-04-04
 * @author 白帅雷
 */
@Controller
@RequestMapping(value = "/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    /**
     * 定义静态logger用于输出log日志
     */
    private static Logger logger = Logger.getLogger(PurchaseController.class);

    /**
     * 添加采购信息
     * @param purchase
     * @return Map<String, Object>
     * @throws SQLException
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPurchase(@ModelAttribute("form") Purchase purchase, Model model) throws SQLException {
        int ret = this.purchaseService.addPurchase(purchase);
        logger.info("Add purchase information");
        if (ret ==  1) {
            model.addAttribute("addPurchase",true);
        } else {
            model.addAttribute("addPurchase",false);
        }
        return "purchase";
    }

    /**
     * 修改采购信息
     * @param purchase
     * @return int
     * @throws SQLException
     */
    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public String updatePurchase(@RequestBody Purchase purchase) throws SQLException {
        this.purchaseService.updatePurchase(purchase);
        logger.info("Update purchase information");
        return "purchase";
    }

    /**
     * 删除采购信息
     * @param purchaseId
     * @return int
     * @throws SQLException
     */
    @ResponseBody
    @RequestMapping(value = "/delete/{purchaseId}", method = RequestMethod.DELETE)
    public int deletePurchase(@PathVariable("purchaseId") String purchaseId) throws SQLException {
        int ret = this.purchaseService.deletePurchase(Integer.parseInt(purchaseId));
        logger.info("Delete purchase information");
        return ret;
    }

    /**
     * 根据采购商品名称goodsName查询采购信息
     * @param goodsName
     * @return List<Purchase>
     * @throws SQLException
     */
    @RequestMapping(value = "/goodsName/{goodsName}", method = RequestMethod.GET)
    public String getPurchaseByName(@PathVariable("goodsName") String goodsName, Model model) throws SQLException {
        logger.info("Get a purchase information by name.");
        List<Purchase> purchaseList = this.purchaseService.getPurchaseByName(goodsName);
        model.addAttribute("purchaseList",purchaseList);
        return "purchase";
    }

    /**
     * 根据采购时间purchaseTime查询采购信息
     * @param purchaseTime
     * @return List<Purchase>
     * @throws SQLException
     */
    @RequestMapping(value = "/purchaseTime/{purchaseTime}", method = RequestMethod.GET)
    public String getPurchaseByTime(@PathVariable("purchaseTime") String purchaseTime, Model model) throws SQLException {
        logger.info("Get a purchase information by purchase time.");
        List<Purchase> purchaseList = this.purchaseService.getPurchaseByTime(purchaseTime);
        model.addAttribute("purchaseList",purchaseList);
        return "purchase";
    }

    /**
     * 根据种类categoryName查询采购信息
     * @param categoryName
     * @return List<Purchase>
     * @throws SQLException
     */
    @RequestMapping(value = "/categoryName/{categoryName}", method = RequestMethod.GET)
    public String getPurchaseByCategoryName(@PathVariable("categoryName") String categoryName, Model model) throws SQLException {
        logger.info("Get a purchase information by category name.");
        List<Purchase> purchaseList = this.purchaseService.getPurchaseByCategoryName(categoryName);
        model.addAttribute("purchaseList",purchaseList);
        return "purchase";
    }

    /**
     * 分页查询所有采购信息
     * @return List<Purchase>
     * @param number
     * @param model
     * @throws SQLException
     */
    @RequestMapping(value = "/page/{number}", method = RequestMethod.GET)
    public String getAllPurchase(@PathVariable("number") int number, Model model) throws SQLException {
        logger.info("Get all purchase information.");
        List<Purchase> purchaseList = this.purchaseService.getAllPurchase((number-1)*10);
        model.addAttribute("purchaseList",purchaseList);
        return "purchase";
    }
}
