package sms.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sms.entity.Goods;
import sms.service.GoodsService;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * web层：商品信息控制层
 * @date 2018-04-04
 * @author 白帅雷
 */
@Controller
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 定义静态logger用于输出log日志
     */
    private static Logger logger = Logger.getLogger(GoodsController.class);

    /**
     * 添加商品信息
     * @param goods
     * @return Map<String, Object>
     * @throws SQLException
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addGoods(@ModelAttribute("form") Goods goods, Model model) throws SQLException {
        int ret = this.goodsService.addGoods(goods);
        logger.info("Add goods information");
        if (ret == 1) {
            model.addAttribute("addGoods",true);
        } else {
            model.addAttribute("addGoods",false);
        }
        return "goods";
    }

    /**
     * 修改商品信息
     * @param goods
     * @return int
     * @throws SQLException
     */
    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public String updateGoods(@RequestBody Goods goods) throws SQLException {
        this.goodsService.updateGoods(goods);
        logger.info("Update goods information");
        return "goods";
    }

    /**
     * 删除商品信息
     * @param goodsId
     * @return int
     * @throws SQLException
     */
    @ResponseBody
    @RequestMapping(value = "/delete/{goodsId}", method = RequestMethod.DELETE)
    public int deleteGoods(@PathVariable("goodsId") String goodsId) throws SQLException {
        int ret = this.goodsService.deleteGoods(Integer.parseInt(goodsId));
        logger.info("Delete goods information");
        return ret;
    }

    /**
     * 根据商品名称goodsName查询商品信息
     * @param goodsName
     * @return Goods
     * @throws SQLException
     */
    @RequestMapping(value = "/goodsName/{goodsName}", method = RequestMethod.GET)
    public String getGoodsByName(@PathVariable("goodsName") String goodsName, Model model) throws SQLException {
        logger.info("Get a goods information by name.");
        List<Goods> goodsList = this.goodsService.getGoodsByName(goodsName);
        model.addAttribute("goodsList", goodsList);
        return "goods";
    }

    /**
     * 根据商品条码goodsBarcode查询商品信息
     * @param goodsBarcode
     * @return Goods
     * @throws SQLException
     */
    @RequestMapping(value = "/goodsBarcode/{goodsBarcode}", method = RequestMethod.GET)
    public String getGoodsByBarcode(@PathVariable("goodsBarcode") String goodsBarcode, Model model) throws SQLException {
        logger.info("Get a goods information by barcode.");
        List<Goods> goodsList = this.goodsService.getGoodsByBarcode(goodsBarcode);
        model.addAttribute("goodsList", goodsList);
        return "goods";
    }

    /**
     * 根据种类categoryName查询商品信息
     * @param categoryName
     * @return List<Goods>
     * @throws SQLException
     */
    @RequestMapping(value = "/categoryName/{categoryName}", method = RequestMethod.GET)
    public String getGoodsByCategoryName(@PathVariable("categoryName") String categoryName, Model model) throws SQLException {
        logger.info("Get a goods information by category name.");
        List<Goods> goodsList = this.goodsService.getGoodsByCategoryName(categoryName);
        model.addAttribute("goodsList", goodsList);
        return "goods";
    }

    /**
     * 分页查询所有商品信息
     * @return List<Goods>
     * @param number
     * @param model
     * @throws SQLException
     */
    @RequestMapping(value = "/page/{number}", method = RequestMethod.GET)
    public String getAllGoods(@PathVariable("number") int number, Model model) throws SQLException {
        logger.info("Get all goods information.");
        List<Goods> goodsList = this.goodsService.getAllGoods((number-1)*10);
        model.addAttribute("goodsList", goodsList);
        return "goods";
    }
}
