package sms.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sms.entity.Sales;
import sms.service.SalesService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * web层：销售信息控制层
 * @date 2018-04-04
 * @author 白帅雷
 */
@Controller
@RequestMapping(value = "/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    /**
     * 定义静态logger用于输出log日志
     */
    private static Logger logger = Logger.getLogger(SalesController.class);

    /**
     * 添加销售信息
     * @param sales
     * @return Map<String, Object>
     * @throws SQLException
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSales(@ModelAttribute("form") Sales sales) throws SQLException {
        this.salesService.addSales(sales);
        logger.info("Add sales information");
        return "sale";
    }

    /**
     * 修改销售信息
     * @param sales
     * @return int
     * @throws SQLException
     */
    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public String updateSales(@RequestBody Sales sales) throws SQLException {
        this.salesService.updateSales(sales);
        logger.info("Update sales information");
        return "sale";
    }

    /**
     * 删除销售信息
     * @param salesId
     * @return int
     * @throws SQLException
     */
    @ResponseBody
    @RequestMapping(value = "/delete/{salesId}", method = RequestMethod.DELETE)
    public int deleteSales(@PathVariable("salesId") String salesId) throws SQLException {
        int ret = this.salesService.deleteSales(Integer.parseInt(salesId));
        logger.info("Delete sales information");
        return ret;
    }

    /**
     * 根据销售商品名称goodsName查询销售信息
     * @param goodsName
     * @return List<Sales>
     * @throws SQLException
     */
    @RequestMapping(value = "/goodsName/{goodsName}", method = RequestMethod.GET)
    public String getSalesByName(@PathVariable("goodsName") String goodsName, Model model) throws SQLException {
        logger.info("Get a sales information by name.");
        List<Sales> salesList = this.salesService.getSalesByName(goodsName);
        model.addAttribute("salesList",salesList);
        return "sale";
    }
    /**
     * 根据销售日期date查询销售信息
     * @param salesTime
     * @return List<Sales>
     * @throws SQLException
     */
    @RequestMapping(value = "/date/{salesTime}", method = RequestMethod.GET)
    public String getSalesByDate(@PathVariable("salesTime") String salesTime, Model model) throws SQLException {
        logger.info("Get a sales information by name.");
        List<Sales> salesList = this.salesService.getSalesByDate(salesTime);
        model.addAttribute("salesList",salesList);
        return "sale";
    }

    /**
     * 根据销售时间time 降序查询销售信息
     * @return List<Sales>
     * @throws SQLException
     */
    @RequestMapping(value = "/timeDESC", method = RequestMethod.GET)
    public String getSalesByTimeDESC(Model model) throws SQLException {
        logger.info("Get a sales information by time DESC.");
        List<Sales> salesTimeDESC = this.salesService.getSalesByTimeDESC();
        model.addAttribute("salesTimeDESC",salesTimeDESC);
        return "sale";
    }

    /**
     * 根据销售时间time 升序查询销售信息
     * @return List<Sales>
     * @throws SQLException
     */
    @RequestMapping(value = "/timeASC", method = RequestMethod.GET)
    public String getSalesByTimeASC(Model model) throws SQLException {
        logger.info("Get a sales information by time ASC.");
        List<Sales> salesTimeASC = this.salesService.getSalesByTimeASC();
        model.addAttribute("salesTimeASC",salesTimeASC);
        return "sale";
    }

    /**
     * 根据销售总价amount 降序查询销售信息
     * @return List<Sales>
     * @throws SQLException
     */
    @RequestMapping(value = "/amountDESC", method = RequestMethod.GET)
    public String getSalesByAmountDESC(Model model) throws SQLException {
        logger.info("Get a sales information by amount DESC.");
        List<Sales> salesAmountDESC = this.salesService.getSalesByAmountDESC();
        model.addAttribute("salesAmountDESC",salesAmountDESC);
        return "sale";
    }

    /**
     * 根据销售总价amount 升序查询销售信息
     * @return List<Sales>
     * @throws SQLException
     */
    @RequestMapping(value = "/amountASC", method = RequestMethod.GET)
    public String getSalesByAmountASC(Model model) throws SQLException {
        logger.info("Get a sales information by amount ASC.");
        List<Sales> salesAmountASC = this.salesService.getSalesByAmountASC();
        model.addAttribute("salesAmountASC",salesAmountASC);
        return "sale";
    }

    /**
     * 分页查询所有销售信息
     * @return List<Sales>
     * @param number
     * @param model
     * @throws SQLException
     */
    @RequestMapping(value = "/page/{number}", method = RequestMethod.GET)
    public String getAllSales(@PathVariable("number") int number, Model model) throws SQLException {
        logger.info("Get all sales information.");
        List<Sales> salesList = this.salesService.getAllSales((number-1)*10);
        model.addAttribute("salesList",salesList);
        return "sale";
    }
}
