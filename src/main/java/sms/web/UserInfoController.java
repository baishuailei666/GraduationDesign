package sms.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sms.entity.UserInfo;
import sms.service.UserInfoService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * web层：用户信息控制层
 * @date 2018-04-04
 * @author 白帅雷
 */
@Controller
@RequestMapping(value = "/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 定义静态logger用于输出log日志
     */
    private static Logger logger = Logger.getLogger(UserInfoController.class);

    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @return
     * @throws SQLException
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String userLogin(String userAccount,String userPassword, Model model) throws SQLException {
        int ret = this.userInfoService.userLogin(userAccount,userPassword);
        model.addAttribute("userAccount",userAccount);
        model.addAttribute("loginStatus",ret);
        switch (ret) {
            case 101:return "goods";
            case 102:return "sale";
            case 103:return "warehouse";
            case 104:return "purchase";
            case 105:return "supplier";
            default:break;
        }
        return "login";
    }

    /**
     * 用户注册
     * @return
     * @throws SQLException
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String userRegister() throws SQLException {
        return "register";
    }


    /**
     * 用户退出
     * @return
     * @throws SQLException
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String userLogOut() throws SQLException {
        return "login";
    }

    /**
     * 注册账号密码信息
     * @param userInfo
     * @return Map<String, Object>
     * @throws SQLException
     */
    @RequestMapping(value ="/registerAccount" , method = RequestMethod.POST)
    public String registerUserInfo(@ModelAttribute("form") UserInfo userInfo) throws SQLException {
        logger.info("Register user information");
        int ret = this.userInfoService.addUserInfo(userInfo);
        if (ret == 1) {
            return "login";
        }
        return "register";
    }

    /**
     * 添加用户信息
     * @param userInfo
     * @return Map<String, Object>
     * @throws SQLException
     */
    @RequestMapping(value ="/add" , method = RequestMethod.POST)
    public String addUserInfo(@ModelAttribute("form") UserInfo userInfo, Model model)
            throws SQLException {
        logger.info("Add user information");
        int ret = this.userInfoService.addUserInfo(userInfo);
        model.addAttribute("addUser",ret);
        return "userInfo";
    }

    /**
     * 修改用户信息
     * @param userInfo
     * @return int
     * @throws SQLException
     */
    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public String updateUserInfo(@RequestBody UserInfo userInfo, Model model) throws SQLException {
        int ret = this.userInfoService.updateUserInfo(userInfo);
        logger.info("Update user information");
        model.addAttribute("updateRet",ret);
        return "userInfo";
    }

    /**
     * 删除用户信息
     * @param userId
     * @return int
     * @throws SQLException
     */
    @RequestMapping(value = "/delete/{userId}", method = RequestMethod.DELETE)
    public String deleteUserInfo(@PathVariable("userId") String userId, Model model) throws SQLException {
        int ret = this.userInfoService.deleteUserInfo(Integer.parseInt(userId));
        logger.info("Delete user information");
        model.addAttribute("userInfoDeleteRet",ret);
        return "userInfo";
    }

    /**
     * 根据部门userDepartment查询用户信息
     * @param userDepartment
     * @return List<UserInfo>
     * @throws SQLException
     */
    @RequestMapping(value = "/userDepartment/{userDepartment}", method = RequestMethod.GET)
    public String getUserInfoByDepartment(@PathVariable("userDepartment") String userDepartment, Model model) throws SQLException {
        logger.info("Get a user information by department.");
        List<UserInfo> userInfoList = this.userInfoService.getUserInfoByDepartment(userDepartment);
        model.addAttribute("userInfoList",userInfoList);
        return "userInfo";
    }

    /**
     * 根据账号userAccount查询用户信息
     * @param userAccount
     * @return UserInfo
     * @throws SQLException
     */
    @RequestMapping(value = "/userAccount/{userAccount}", method = RequestMethod.GET)
    public String getUserInfoByAccount(@PathVariable("userAccount") String userAccount, Model model) throws SQLException {
        logger.info("Get a user information by account.");
        UserInfo userInfo = this.userInfoService.getUserInfoByAccount(userAccount);
        model.addAttribute("userList", userInfo);
        return "goods";
    }

    /**
     * 根据姓名userName查询用户信息
     * @param userName
     * @return UserInfo
     * @throws SQLException
     */
    @RequestMapping(value = "/userName/{userName}", method = RequestMethod.GET)
    public String getUserInfoByName(@PathVariable("userName") String userName) throws SQLException {
        logger.info("Get a user information by name.");
        this.userInfoService.getUserInfoByName(userName);
        return "userInfo";
    }

    /**
     * 分页查询所有用户信息
     * @return List<UserInfo>
     * @param number
     * @param model
     * @throws SQLException
     */
    @RequestMapping(value = "/page/{number}", method = RequestMethod.GET)
    public String getAllUserInfo(@PathVariable("number") int number, Model model) throws SQLException {
        logger.info("Get all user information.");
        List<UserInfo> userInfoList = this.userInfoService.getAllUserInfo((number-1)*10);
        model.addAttribute("userInfoList",userInfoList);
        return "userInfo";
    }
}
