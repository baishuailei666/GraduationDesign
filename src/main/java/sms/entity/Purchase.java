package sms.entity;
/**
 * Dao层：采购信息实体类
 * @date 2018-04-04
 * @author 白帅雷
 */
public class Purchase {
    /**
     * 采购编号
     */
    private int purchaseId;
    /**
     * 采购商品名称
     */
    private String goodsName;
    /**
     * 采购商品价格
     */
    private String supplierPrice;
    /**
     * 采购商品数量
     */
    private String goodsNum;
    /**
     * 采购管理员
     */
    private String purchaseManager;
    /**
     * 采购时间
     */
    private String purchaseTime;
    /**
     * 种类
     */
    private String categoryName;

    public Purchase() {
    }

    /**
     * @param purchaseId
     * @param goodsName
     * @param supplierPrice
     * @param goodsNum
     * @param purchaseManager
     * @param purchaseTime
     * @param categoryName
     */
    public Purchase(int purchaseId, String goodsName, String supplierPrice, String goodsNum
            , String purchaseManager, String purchaseTime, String categoryName) {
        this.purchaseId = purchaseId;
        this.goodsName = goodsName;
        this.supplierPrice = supplierPrice;
        this.goodsNum = goodsNum;
        this.purchaseManager = purchaseManager;
        this.purchaseTime = purchaseTime;
        this.categoryName = categoryName;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSupplierPrice() {
        return supplierPrice;
    }

    public void setSupplierPrice(String supplierPrice) {
        this.supplierPrice = supplierPrice;
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getPurchaseManager() {
        return purchaseManager;
    }

    public void setPurchaseManager(String purchaseManager) {
        this.purchaseManager = purchaseManager;
    }

    public String getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
