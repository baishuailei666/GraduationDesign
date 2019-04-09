package sms.entity;
/**
 * entity层：供货商信息实体类
 * @date 2018-04-04
 * @author 白帅雷
 */
public class Supplier {
    /**
     * 供货商编号
     */
    private int supplierId;
    /**
     * 供货商名称
     */
    private String supplierName;
    /**
     * 供货商品名称
     */
    private String goodsName;
    /**
     * 供货商品价格
     */
    private String supplierPrice;
    /**
     * 供货商地址
     */
    private String supplierAddress;
    /**
     * 供货商联系人
     */
    private String supplierPersonnel;
    /**
     * 供货商电话
     */
    private String supplierTel;
    /**
     * 供货商邮箱
     */
    private String supplierEmail;
    /**
     * 种类
     */
    private String categoryName;
    /**
     * 商品单位
     */
    private String goodsUnit;

    public Supplier() {
    }

    /**
     * @param supplierId
     * @param supplierName
     * @param goodsName
     * @param supplierPrice
     * @param supplierAddress
     * @param supplierPersonnel
     * @param supplierTel
     * @param supplierEmail
     * @param categoryName
     * @param goodsUnit
     */
    public Supplier(int supplierId, String supplierName, String goodsName, String supplierPrice
            , String supplierAddress, String supplierPersonnel, String supplierTel, String supplierEmail, String categoryName, String goodsUnit) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.goodsName = goodsName;
        this.supplierPrice = supplierPrice;
        this.supplierAddress = supplierAddress;
        this.supplierPersonnel = supplierPersonnel;
        this.supplierTel = supplierTel;
        this.supplierEmail = supplierEmail;
        this.categoryName = categoryName;
        this.goodsUnit = goodsUnit;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierPersonnel() {
        return supplierPersonnel;
    }

    public void setSupplierPersonnel(String supplierPersonnel) {
        this.supplierPersonnel = supplierPersonnel;
    }

    public String getSupplierTel() {
        return supplierTel;
    }

    public void setSupplierTel(String supplierTel) {
        this.supplierTel = supplierTel;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
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

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", supplierPrice='" + supplierPrice + '\'' +
                ", supplierAddress='" + supplierAddress + '\'' +
                ", supplierPersonnel='" + supplierPersonnel + '\'' +
                ", supplierTel='" + supplierTel + '\'' +
                ", supplierEmail='" + supplierEmail + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", goodsUnit='" + goodsUnit + '\'' +
                '}';
    }
}
