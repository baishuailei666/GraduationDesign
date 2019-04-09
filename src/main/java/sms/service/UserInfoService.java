package sms.service;

import org.springframework.stereotype.Service;
import sms.entity.UserInfo;

import java.sql.SQLException;
import java.util.List;

/**
 * service层：用户信息服务层接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface UserInfoService {
    /**
     * 添加用户信息
     * @param userInfo
     * @return
     * @throws SQLException
     */
    int addUserInfo(UserInfo userInfo) throws SQLException;

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     * @throws SQLException
     */
    int updateUserInfo(UserInfo userInfo) throws SQLException;

    /**
     * 删除用户信息
     * @param userId
     * @return
     * @throws SQLException
     */
    int deleteUserInfo(int userId) throws SQLException;

    /**
     * 根据部门userDepartment查询用户信息
     * @param userDepartment
     * @return
     * @throws SQLException
     */
    List<UserInfo> getUserInfoByDepartment(String userDepartment) throws SQLException;

    /**
     * 根据账号userAccount查询用户信息
     * @param userAccount
     * @return
     * @throws SQLException
     */
    UserInfo getUserInfoByAccount(String userAccount) throws SQLException;

    /**
     * 根据姓名userName查询用户信息
     * @param userName
     * @return
     * @throws SQLException
     */
    UserInfo getUserInfoByName(String userName) throws SQLException;

    /**
     * 分页查询所有用户信息
     * @return
     * @param number
     * @throws SQLException
     */
    List<UserInfo> getAllUserInfo(int number) throws SQLException;

    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @return
     * @throws SQLException
     */
    int userLogin(String userAccount, String userPassword) throws SQLException;
}
