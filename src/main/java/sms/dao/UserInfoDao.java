package sms.dao;

import org.springframework.stereotype.Service;
import sms.entity.UserInfo;

import java.sql.SQLException;
import java.util.List;
/**
 * Dao层：用户信息接口
 * @date 2018-04-04
 * @author 白帅雷
 */
@Service
public interface UserInfoDao {
    /**
     * 添加用户信息
     * @param userInfo
     * @return
     */
    int addUserInfo(UserInfo userInfo);

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    int updateUserInfo(UserInfo userInfo);

    /**
     * 删除用户信息
     * @param userId
     * @return
     */
    int deleteUserInfo(int userId);

    /**
     * 根据部门userDepartment查询用户信息
     * @param userDepartment
     * @return
     */
    List<UserInfo> getUserInfoByDepartment(String userDepartment);

    /**
     * 根据账号userAccount查询用户信息
     * @param userAccount
     * @return
     */
    UserInfo getUserInfoByAccount(String userAccount);

    /**
     * 根据姓名userName查询用户信息
     * @param userName
     * @return
     */
    UserInfo getUserInfoByName(String userName);

    /**
     * 分页查询所有用户信息
     * @return
     * @param number
     */
    List<UserInfo> getAllUserInfo(int number);

    /**
     * 用户登录
     * @param userAccount
     * @return
     */
    UserInfo userLogin(String userAccount);
}
