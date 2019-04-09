package sms.entity;

/**
 * entity：商品信息实体类
 * @date 2018-04-04
 * @author 白帅雷
 */
public class Goods {

    /**
     * 商品编号
     */
    private int goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品条码
     */
    private String goodsBarcode;
    /**
     * 商品单位
     */
    private String goodsUnit;
    /**
     * 商品进货价
     */
    private String supplierPrice;
    /**
     * 商品销售价
     */
    private String goodsPrice;
    /**
     * 商品生产商
     */
    private String supplierName;
    /**
     * 商品种类
     */
    private String categoryName;
    /**
     * 商品生成许可证
     */
    private String goodsSc;
    /**
     * 商品规格
     */
    private String goodsContent;


    public Goods() {
    }

    /**
     * @param goodsId
     * @param goodsName
     * @param goodsBarcode
     * @param goodsUnit
     * @param supplierPrice
     * @param goodsPrice
     * @param supplierName
     * @param categoryName
     * @param goodsSc
     * @param goodsContent
     */
    public Goods(int goodsId, String goodsName, String goodsBarcode, String goodsUnit
            , String supplierPrice, String goodsPrice, String supplierName
            , String categoryName, String goodsSc, String goodsContent) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsBarcode = goodsBarcode;
        this.goodsUnit = goodsUnit;
        this.supplierPrice = supplierPrice;
        this.goodsPrice = goodsPrice;
        this.supplierName = supplierName;
        this.categoryName = categoryName;
        this.goodsSc = goodsSc;
        this.goodsContent = goodsContent;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
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

    public String getSupplierPrice() {
        return supplierPrice;
    }

    public void setSupplierPrice(String supplierPrice) {
        this.supplierPrice = supplierPrice;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getGoodsSc() {
        return goodsSc;
    }

    public void setGoodsSc(String goodsSc) {
        this.goodsSc = goodsSc;
    }

    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsBarcode='" + goodsBarcode + '\'' +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", supplierPrice='" + supplierPrice + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", goodsSc='" + goodsSc + '\'' +
                ", goodsContent='" + goodsContent + '\'' +
                '}';
    }
}
