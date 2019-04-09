package sms.entity;
/**
 * entity层：仓库信息实体类
 * @date 2018-04-04
 * @author 白帅雷
 */
public class WareHouse {
    /**
     * 仓库编号
     */
    private int warehouseId;
    /**
     * 仓库商品名称
     */
    private String goodsName;
    /**
     * 仓库商品条码
     */
    private String goodsBarcode;
    /**
     * 仓库商品价格
     */
    private String goodsPrice;
    /**
     * 仓库商品供货商
     */
    private String supplierName;
    /**
     * 仓库商品库存
     */
    private int goodsInventory;
    /**
     * 仓库商品种类
     */
    private String categoryName;
    /**
     * 商品单位
     */
    private String goodsUnit;

    /**
     * 商品规格
     */
    private String goodsContent;

    public WareHouse() {
    }

    /**
     * @param warehouseId
     * @param goodsName
     * @param goodsBarcode
     * @param goodsPrice
     * @param supplierName
     * @param goodsInventory
     * @param categoryName
     * @param goodsUnit
     * @param goodsContent
     */
    public WareHouse(int warehouseId, String goodsName, String goodsBarcode, String goodsPrice
            , String supplierName, int goodsInventory, String categoryName, String goodsUnit, String goodsContent) {
        this.warehouseId = warehouseId;
        this.goodsName = goodsName;
        this.goodsBarcode = goodsBarcode;
        this.goodsPrice = goodsPrice;
        this.supplierName = supplierName;
        this.goodsInventory = goodsInventory;
        this.categoryName = categoryName;
        this.goodsUnit = goodsUnit;
        this.goodsContent = goodsContent;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
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

    public int getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(int goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "warehouseId=" + warehouseId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsBarcode='" + goodsBarcode + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", goodsInventory='" + goodsInventory + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", goodsContent='" + goodsContent + '\'' +
                '}';
    }
}
