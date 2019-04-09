package sms.entity;
/**
 * entity层：销售信息实体类
 * @date 2018-04-04
 * @author 白帅雷
 */
public class Sales {
    /**
     * 销售编号
     */
    private int salesId;
    /**
     * 销售商品名称
     */
    private String goodsName;
    /**
     * 销售商品条码
     */
    private String goodsBarcode;
    /**
     * 销售商品单位
     */
    private String goodsUnit;
    /**
     * 销售商品数量
     */
    private int goodsNum;
    /**
     * 销售时间
     */
    private String salesTime;
    /**
     * 销售商品单价
     */
    private String goodsPrice;
    /**
     * 销售总金额
     */
    private String salesTotalAmount;
    /**
     * 销售管理员
     */
    private String salesManager;

    public Sales() {
    }

    /**
     * @param salesId
     * @param goodsName
     * @param goodsBarcode
     * @param goodsUnit
     * @param goodsNum
     * @param salesTime
     * @param goodsPrice
     * @param salesTotalAmount
     * @param salesManager
     */
    public Sales(int salesId, String goodsName, String goodsBarcode, String goodsUnit
            , int goodsNum, String salesTime, String goodsPrice, String salesTotalAmount, String salesManager) {
        this.salesId = salesId;
        this.goodsName = goodsName;
        this.goodsBarcode = goodsBarcode;
        this.goodsUnit = goodsUnit;
        this.goodsNum = goodsNum;
        this.salesTime = salesTime;
        this.goodsPrice = goodsPrice;
        this.salesTotalAmount = salesTotalAmount;
        this.salesManager = salesManager;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsBarcode() {
        return goodsBarcode;
    }

    public void setGoodsBarcode(String goodsBarcode) {
        this.goodsBarcode = goodsBarcode;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getSalesTime() {
        return salesTime;
    }

    public void setSalesTime(String salesTime) {
        this.salesTime = salesTime;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getSalesTotalAmount() {
        return salesTotalAmount;
    }

    public void setSalesTotalAmount(String salesTotalAmount) {
        this.salesTotalAmount = salesTotalAmount;
    }

    public String getSalesManager() {
        return salesManager;
    }

    public void setSalesManager(String salesManager) {
        this.salesManager = salesManager;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "salesId=" + salesId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsBarcode='" + goodsBarcode + '\'' +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", goodsNum=" + goodsNum +
                ", salesTime='" + salesTime + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", salesTotalAmount='" + salesTotalAmount + '\'' +
                ", salesManager='" + salesManager + '\'' +
                '}';
    }
}
