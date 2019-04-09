package sms.entity;

/**
 * entity：用户信息实体类
 * @date 2018-04-04
 * @author 白帅雷
 */
public class UserInfo {
    /**
     * 用户编号
     */
    private int userId;
    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     *
     */
    private String userSex;
    /**
     * 用户电话
     */
    private String userTel;
    /**
     * 用户邮箱
     */
    private String userEmail;
    /**
     * 用户职位
     */
    private String userPosition;
    /**
     * 用户所属部门
     */
    private String userDepartment;

    public UserInfo(){

    }

    /**
     * @param userId
     * @param userAccount
     * @param userPassword
     * @param userName
     * @param userSex
     * @param userTel
     * @param userEmail
     * @param userPosition
     * @param userDepartment
     */
    public UserInfo(int userId, String userAccount, String userPassword, String userName
            , String userSex, String userTel, String userEmail, String userPosition, String userDepartment) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userSex = userSex;
        this.userTel = userTel;
        this.userEmail = userEmail;
        this.userPosition = userPosition;
        this.userDepartment = userDepartment;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPosition='" + userPosition + '\'' +
                ", userDepartment='" + userDepartment + '\'' +
                '}';
    }
}
