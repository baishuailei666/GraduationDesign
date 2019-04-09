package sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sms.dao.UserInfoDao;
import sms.entity.UserInfo;
import sms.service.UserInfoService;

import java.sql.SQLException;
import java.util.List;

/**
 * impl层：用户信息服务层实现类
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;
    static String admin = "系统管理员";
    static String sale = "销售管理员";
    static String warehouse = "仓库管理员";
    static String purchase = "采购管理员";
    static String supplier = "供货管理员";
    /**
     * 添加用户信息
     *
     * @param userInfo
     * @return
     * @throws SQLException
     */
    @Override
    public int addUserInfo(UserInfo userInfo) throws SQLException {
        return this.userInfoDao.addUserInfo(userInfo);
    }

    /**
     * 修改用户信息
     *
     * @param userInfo
     * @return
     * @throws SQLException
     */
    @Override
    public int updateUserInfo(UserInfo userInfo) throws SQLException {
        return this.userInfoDao.updateUserInfo(userInfo);
    }

    /**
     * 删除用户信息
     *
     * @param userId
     * @return
     * @throws SQLException
     */
    @Override
    public int deleteUserInfo(int userId) throws SQLException {
        return this.userInfoDao.deleteUserInfo(userId);
    }

    /**
     * 根据部门userDepartment查询用户信息
     *
     * @param userDepartment
     * @return
     * @throws SQLException
     */
    @Override
    public List<UserInfo> getUserInfoByDepartment(String userDepartment) throws SQLException {
        return this.userInfoDao.getUserInfoByDepartment(userDepartment);
    }

    /**
     * 根据账号userAccount查询用户信息
     *
     * @param userAccount
     * @return
     * @throws SQLException
     */
    @Override
    public UserInfo getUserInfoByAccount(String userAccount) throws SQLException {
        return this.userInfoDao.getUserInfoByAccount(userAccount);
    }

    /**
     * 根据姓名userName查询用户信息
     *
     * @param userName
     * @return
     * @throws SQLException
     */
    @Override
    public UserInfo getUserInfoByName(String userName) throws SQLException {
        return this.userInfoDao.getUserInfoByName(userName);
    }

    /**
     * 分页查询所有用户信息
     *
     * @return
     * @param number
     * @throws SQLException
     */
    @Override
    public List<UserInfo> getAllUserInfo(int number) throws SQLException {
        return this.userInfoDao.getAllUserInfo(number);
    }

    /**
     * 用户登录
     *
     * @param userAccount
     * @param userPassword
     * @return
     * @throws SQLException
     */
    @Override
    public int userLogin(String userAccount, String userPassword) throws SQLException {
        UserInfo userInfo = this.userInfoDao.userLogin(userAccount);
        if (userInfo != null) {
            String userPasswordDb = userInfo.getUserPassword();
            if (userPasswordDb.equals(userPassword)) {
                String userPositionDB = this.userInfoDao.getUserInfoByAccount(userAccount).getUserPosition();
                if (admin.equals(userPositionDB)) {
                    return 101;
                }
                if (sale.equals(userPositionDB)) {
                    return 102;
                }
                if (warehouse.equals(userPositionDB)) {
                    return 103;
                }
                if (purchase.equals(userPositionDB)) {
                    return 104;
                }
                if (supplier.equals(userPositionDB)) {
                    return 105;
                }
            }
        }
       return 0;
    }
}
