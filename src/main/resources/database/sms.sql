/*
Navicat MySQL Data Transfer

Source Server         : xlauncher
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : sms

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-24 17:53:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `category_id` int(11) NOT NULL COMMENT '商品种类编号',
  `category_name` varchar(20) DEFAULT NULL COMMENT '商品种类',
  PRIMARY KEY (`category_id`),
  KEY `category_name` (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('3', '副食类');
INSERT INTO `category` VALUES ('1', '包装食品类');
INSERT INTO `category` VALUES ('4', '家居百货类');
INSERT INTO `category` VALUES ('6', '文体办公类');
INSERT INTO `category` VALUES ('7', '日配类');
INSERT INTO `category` VALUES ('5', '洗涤日化类');
INSERT INTO `category` VALUES ('2', '饮料烟酒类');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goods_id` int(20) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `goods_barcode` varchar(20) DEFAULT NULL COMMENT '商品条码',
  `goods_unit` varchar(5) DEFAULT NULL COMMENT '商品规格',
  `supplier_price` decimal(10,2) DEFAULT NULL COMMENT '商品进货价',
  `goods_price` decimal(10,2) DEFAULT NULL COMMENT '商品销售价',
  `supplier_name` varchar(20) DEFAULT NULL COMMENT '商品生产商',
  `category_name` varchar(20) DEFAULT NULL COMMENT '商品类别',
  `goods_sc` varchar(20) DEFAULT NULL COMMENT '生成许可证编号',
  `goods_content` varchar(10) DEFAULT NULL COMMENT '商品净含量',
  PRIMARY KEY (`goods_id`),
  KEY `category_name` (`category_name`),
  KEY `supplier_price` (`supplier_price`),
  KEY `goods_unit` (`goods_unit`),
  KEY `supplier_name` (`supplier_name`),
  KEY `goods_name` (`goods_name`),
  KEY `goods_price` (`goods_price`),
  CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`category_name`) REFERENCES `category` (`category_name`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '幸运方便面红烧排骨面60g*30安徽泡面袋装干吃干脆面零食', '6901671216014', '箱', '19.90', '29.80', '镇江味佳园食品有限公司金山分公司', '包装食品类', 'SC11232117100076', '60g*30');
INSERT INTO `goods` VALUES ('2', '港饼湖北特产 黄石牧羊湖港饼超薄芝麻饼500g包邮办公室休闲零食', '6908512108211', '包', '9.90', '24.90', '湖北牧羊湖食品有限公司', '包装食品类', 'SC124420203000', '500g');
INSERT INTO `goods` VALUES ('3', '娃哈哈小AD钙奶100ml*48瓶哇哈哈儿童节礼物 牛奶饮料', '6901234567899', '箱', '30.00', '48.00', '杭州娃哈哈饮料有限公司', '饮料烟酒类', 'QS330006010104', '100ml*48');
INSERT INTO `goods` VALUES ('4', '康师傅劲爽拉面方便面整箱12桶装批发红烧香辣老坛酸菜牛肉面泡面', '6921234567888', '箱', '28.80', '34.80', '杭州顶益食品有限公司', '包装食品类', 'SC10333019904036', '106g*12');
INSERT INTO `goods` VALUES ('5', '娃哈哈饮用纯净水596ml*24瓶/箱 哇哈哈纯净水整箱多省包邮矿泉水', '6923265987451', '箱', '32.00', '48.00', '巢湖娃哈哈饮料有限公司', '饮料烟酒类', 'QS340006010147', '596ml*24');
INSERT INTO `goods` VALUES ('6', '光明_一只椰子牛乳饮品250MLx24瓶 椰汁牛奶饮料整箱', '6931542658711', '箱', '88.00', '118.00', '广州光明乳品有限公司', '饮料烟酒类', 'SC10544011600445', '250ml*24');
INSERT INTO `goods` VALUES ('7', 'SID超人全身水洗智能剃须刀男士充电式电动刮胡刀胡须刀正品RS337', '6942563845126', '个', '68.00', '89.00', '浙江超人科技股份有限公司', '日配类', 'SC10524011100835', ' RS 337');
INSERT INTO `goods` VALUES ('8', '东北大米吉林大米延边朝鲜族珲春大米稻花香大米包邮', '6925846184942', '袋', '89.00', '136.00', '珲春谷粒香富硒米业有限公司', '日配类', 'SC101222404091', '10000g');
INSERT INTO `goods` VALUES ('9', '古居玻璃杯韩版过滤茶杯创意潮流车载水杯便携随手男女式杯子定制', '6935145145122', '个', '21.00', '68.00', '海南玻璃风制品有限公司', '家居百货类', 'SC30124824065451', '500ml');
INSERT INTO `goods` VALUES ('10', '丝飘抽纸27包原浆本色纸 竹浆餐巾纸抽家用卫生纸巾家庭装整箱批', '6942513548451', '包', '18.90', '29.90', '浙江中顺纸业有限公司', '日配类', 'SC20383019504036', '100抽*27');
INSERT INTO `goods` VALUES ('11', '天堂伞油画伞防晒防紫外线太阳伞女雨伞折叠遮阳伞黑胶晴雨两用伞', '6945125484578', '把', '49.00', '78.00', '杭州天堂伞业有限公司', '家居百货类', 'QS380604010308', '2.4kg');
INSERT INTO `goods` VALUES ('12', '婴儿童摇摇马幼儿宝宝玩具小木马摇椅塑料带音乐女孩1-2周岁礼物', '6926545852130', '个', '89.00', '195.00', '北京儿童快乐有限公司', '文体办公类', 'SC6054401331023', '8.9kg');
INSERT INTO `goods` VALUES ('13', '儿童天文望远镜显微镜小学生日礼物益智玩具科技实验制作创意礼品', '6964657892313', '个', '168.00', '278.00', '江苏无限科技有限公司', '文体办公类', 'SC2004901735063', '3.5kg');
INSERT INTO `goods` VALUES ('14', '复古定制logo实木衣架成人服装店男装女装童装批發木质木头衣服架', '6921896547201', '个', '31.80', '44.75', '江苏南通木业有限公司', '家居百货类', 'SC302106441121', '106.19g');
INSERT INTO `goods` VALUES ('15', '三枪男士内裤男平角裤纯棉质夏季平角内裤男四角内裤青年男生裤头', '6912864591837', '件', '19.80', '37.50', '河北石家庄服饰有限公司', '日配类', 'SC2724901735063', '95%棉');
INSERT INTO `goods` VALUES ('16', '包邮龙泉青瓷餐具创意陶瓷米饭碗复古中式小汤碗 耐热微波炉可用', '6937962834105', '件', '4.00', '6.90', '江西景德镇瓷器制造有限公司', '家居百货类', 'SC2201724201774', '4.5英寸');
INSERT INTO `goods` VALUES ('17', '汰渍洗衣液家庭装量贩组合套装洁净去渍清香型3kg*2机洗瓶装正品', '6923721998156', '瓶', '38.90', '59.90', '浙江金华泰泽生化科技有限公司', '洗涤日化类', 'SC8924901735063', '6.7kg');
INSERT INTO `goods` VALUES ('18', '天猫精灵 X1智能音箱语音助手蓝牙音箱WiFi网络音响', '6946327963668', '个', '298.00', '499.00', '浙江天猫供应链管理有限公司', '家居百货类', 'SC8924901732008', '4.1kg');
INSERT INTO `goods` VALUES ('22', ' 带娃小汤碗 耐热微波炉可用', '115', '包', '20.00', '20.00', '单位', '家居百货类', null, '我的');
INSERT INTO `goods` VALUES ('23', ' 带娃清香型3kg*2机洗瓶装正', '115', '包', '20.00', '20.00', '单位', '家居百货类', null, '我的');
INSERT INTO `goods` VALUES ('24', '哇哈哈牙膏', '6946327963660', '个', '10.80', '20.00', '江苏娃哈哈饮料有限公司', '家居百货类', 'SC8924901732002', '300ml');
INSERT INTO `goods` VALUES ('26', '娃哈哈香草冰淇淋营养快线50', '692527145108636', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '饮料烟酒类', '1527145108636', '550ml');
INSERT INTO `goods` VALUES ('27', '娃哈哈香草冰淇淋营养快线74', '1527145120831', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '饮料烟酒类', '1527145120831', '500ml');
INSERT INTO `goods` VALUES ('28', '娃哈哈香草冰淇淋营养快线17', '1527145133672', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '饮料烟酒类', '1527145133672', '500ml');
INSERT INTO `goods` VALUES ('29', '娃哈哈香草冰淇淋营养快线42', '1527145475975', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '饮料烟酒类', '1527145475975', '500ml');
INSERT INTO `goods` VALUES ('30', '娃哈哈香草冰淇淋营养快线4', '692527145484645', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '饮料烟酒类', '1527145484645', '500ml');
INSERT INTO `goods` VALUES ('31', '娃哈哈香草冰淇淋营养快线34', '692527145494490', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '饮料烟酒类', '1527145494490', '500ml');
INSERT INTO `goods` VALUES ('32', '娃哈哈香草冰淇淋果冻29', '1527145672375', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '包装食品类', '1527145672384', '150kg');
INSERT INTO `goods` VALUES ('33', '娃哈哈香草冰淇淋果冻28', '1527145680670', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '包装食品类', '1527145680671', '150kg');
INSERT INTO `goods` VALUES ('34', '娃哈哈香草冰淇淋果冻81', '1527145688819', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '包装食品类', '1527145688819', '150kg');
INSERT INTO `goods` VALUES ('35', '娃哈哈香草冰淇淋果冻61', '1527145697546', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '包装食品类', '1527145697546', '150kg');
INSERT INTO `goods` VALUES ('36', '娃哈哈香草冰淇淋果冻15', '1527145708573', '箱', '19.90', '39.90', '浙江娃哈哈有限公司', '包装食品类', '1527145708573', '150kg');

-- ----------------------------
-- Table structure for purchase
-- ----------------------------
DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase` (
  `purchase_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '采购编号',
  `goods_name` varchar(50) DEFAULT NULL COMMENT '采购商品名称',
  `supplier_price` decimal(10,2) DEFAULT NULL COMMENT '采购价格',
  `goods_num` varchar(11) DEFAULT NULL COMMENT '采购数量',
  `purchase_time` datetime DEFAULT NULL COMMENT '采购时间',
  `category_name` varchar(20) DEFAULT NULL COMMENT '采购种类',
  `purchase_manager` varchar(20) DEFAULT NULL COMMENT '采购管理员',
  PRIMARY KEY (`purchase_id`),
  KEY `category_name` (`category_name`),
  KEY `goods_name` (`goods_name`),
  KEY `purchase_manager` (`purchase_manager`),
  CONSTRAINT `purchase_ibfk_1` FOREIGN KEY (`category_name`) REFERENCES `category` (`category_name`),
  CONSTRAINT `purchase_ibfk_3` FOREIGN KEY (`purchase_manager`) REFERENCES `userinfo` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchase
-- ----------------------------
INSERT INTO `purchase` VALUES ('1', '天猫精灵 X1智能音箱语音助手蓝牙音箱WiFi网络音响', '298.00', '20', '2018-04-17 20:39:29', '家居百货类', '小勾勾');
INSERT INTO `purchase` VALUES ('2', 'SID超人全身水洗智能剃须刀男士充电式电动刮胡刀胡须刀正品RS337', '68.00', '20', '2018-04-19 13:55:14', '日配类', '小勾勾');
INSERT INTO `purchase` VALUES ('3', '娃哈哈饮用纯净水596ml*24瓶/箱 哇哈哈纯净水整箱多省包邮矿泉水', '32.00', '50', '2018-04-19 13:55:52', '饮料烟酒类', '小勾勾');
INSERT INTO `purchase` VALUES ('4', '儿童天文望远镜显微镜小学生日礼物益智玩具科技实验制作创意礼品', '168.00', '30', '2018-04-19 13:56:29', '文体办公类', '小三百');
INSERT INTO `purchase` VALUES ('5', '汰渍洗衣液家庭装量贩组合套装洁净去渍清香型3kg*2机洗瓶装正品', '38.90', '50', '2018-04-19 13:57:05', '洗涤日化类', '小三百');
INSERT INTO `purchase` VALUES ('6', '娃哈哈小AD钙奶100ml*48瓶哇哈哈儿童节礼物 牛奶饮料', '30.00', '50', '2018-04-19 13:57:33', '饮料烟酒类', '小三百');
INSERT INTO `purchase` VALUES ('7', '港饼湖北特产 黄石牧羊湖港饼超薄芝麻饼500g包邮办公室休闲零食', '9.90', '100', '2018-04-19 13:58:02', '包装食品类', '小三百');
INSERT INTO `purchase` VALUES ('8', '幸运方便面红烧排骨面60g*30安徽泡面袋装干吃干脆面零食', '19.90', '100', '2018-04-19 13:58:27', '包装食品类', '小三百');
INSERT INTO `purchase` VALUES ('9', '康师傅劲爽拉面方便面整箱12桶装批发红烧香辣老坛酸菜牛肉面泡面', '28.80', '50', '2018-04-19 13:58:50', '包装食品类', '小熊猫');
INSERT INTO `purchase` VALUES ('10', '复古定制logo实木衣架成人服装店男装女装童装批發木质木头衣服架', '31.80', '50', '2018-04-19 13:59:31', '家居百货类', '小熊猫');
INSERT INTO `purchase` VALUES ('11', '光明_一只椰子牛乳饮品250MLx24瓶 椰汁牛奶饮料整箱', '88.00', '30', '2018-04-19 14:00:05', '饮料烟酒类', '小熊猫');
INSERT INTO `purchase` VALUES ('13', '哇哈哈电动牙刷', '189.00', '20', '2018-05-02 12:30:00', '日配类', '小熊猫');
INSERT INTO `purchase` VALUES ('14', '哇哈哈电动牙刷', '189.00', '20', '2018-05-04 16:30:00', '家居百货类', '小熊猫');
INSERT INTO `purchase` VALUES ('15', '哇哈哈电动牙刷685型', '189.00', '50', '2018-05-24 15:21:50', '家居百货类', '小熊猫');
INSERT INTO `purchase` VALUES ('16', '哇哈哈电动牙刷4285型', '189.00', '50', '2018-05-24 15:25:55', '家居百货类', '小熊猫');
INSERT INTO `purchase` VALUES ('17', '哇哈哈电动牙刷2085型', '189.00', '50', '2018-05-24 15:26:04', '家居百货类', '小熊猫');
INSERT INTO `purchase` VALUES ('18', '哇哈哈电动牙刷4085型', '189.00', '50', '2018-05-24 16:04:23', '家居百货类', '小熊猫');
INSERT INTO `purchase` VALUES ('19', '哇哈哈电动牙刷1585型', '189.00', '50', '2018-05-24 16:04:33', '家居百货类', '小熊猫');
INSERT INTO `purchase` VALUES ('20', '哇哈哈电动牙刷985型', '189.00', '50', '2018-05-24 16:05:07', '家居百货类', '小熊猫');
INSERT INTO `purchase` VALUES ('21', '哇哈哈电动牙刷485型', '189.00', '50', '2018-05-24 16:05:19', '家居百货类', '小熊猫');

-- ----------------------------
-- Table structure for sales
-- ----------------------------
DROP TABLE IF EXISTS `sales`;
CREATE TABLE `sales` (
  `sales_id` int(10) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(50) DEFAULT NULL COMMENT '销售商品名称',
  `goods_barcode` varchar(20) DEFAULT NULL COMMENT '商品条码',
  `goods_unit` varchar(5) DEFAULT NULL COMMENT '销售商品规格',
  `goods_num` varchar(11) DEFAULT NULL COMMENT '销售商品数量',
  `sales_time` datetime DEFAULT NULL COMMENT '销售商品时间',
  `goods_price` decimal(10,2) DEFAULT NULL COMMENT '销售商品单价',
  `sales_total_amount` decimal(11,2) DEFAULT NULL COMMENT '销售商品总价',
  `sales_manager` varchar(20) DEFAULT NULL COMMENT '销售管理员',
  PRIMARY KEY (`sales_id`),
  KEY `sales_manager` (`sales_manager`),
  KEY `goods_price` (`goods_price`),
  CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`sales_manager`) REFERENCES `userinfo` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sales
-- ----------------------------
INSERT INTO `sales` VALUES ('1', '东北大米吉林大米延边朝鲜族珲春大米稻花香大米包邮', '6925846184942', '袋', '2', '2018-04-17 20:41:55', '136.00', '272.00', '小尚尚');
INSERT INTO `sales` VALUES ('2', '光明_一只椰子牛乳饮品250MLx24瓶 椰汁牛奶饮料整箱', '6931542658711', '箱', '1', '2018-04-19 14:01:00', '118.00', '118.00', '小尚尚');
INSERT INTO `sales` VALUES ('3', '娃哈哈饮用纯净水596ml*24瓶/箱 哇哈哈纯净水整箱多省包邮矿泉水', '6923265987451', '箱', '3', '2018-04-19 14:01:00', '48.00', '144.00', '小尚尚');
INSERT INTO `sales` VALUES ('4', '儿童天文望远镜显微镜小学生日礼物益智玩具科技实验制作创意礼品', '6964657892313', '个', '1', '2018-04-19 14:01:00', '278.00', '278.00', '小天天');
INSERT INTO `sales` VALUES ('5', '三枪男士内裤男平角裤纯棉质夏季平角内裤男四角内裤青年男生裤头', '6912864591837', '个', '5', '2018-04-18 14:05:04', '37.50', '187.50', '小天天');
INSERT INTO `sales` VALUES ('6', '天堂伞油画伞防晒防紫外线太阳伞女雨伞折叠遮阳伞黑胶晴雨两用伞', '6945125484578', '把', '1', '2018-04-18 14:05:04', '78.00', '78.00', '小天天');
INSERT INTO `sales` VALUES ('7', '丝飘抽纸27包原浆本色纸 竹浆餐巾纸抽家用卫生纸巾家庭装整箱批', '6942513548451', '包', '2', '2018-04-18 14:05:04', '29.90', '59.80', '小天天');
INSERT INTO `sales` VALUES ('8', '古居玻璃杯韩版过滤茶杯创意潮流车载水杯便携随手男女式杯子定制', '6935145145122', '个', '1', '2018-04-19 14:05:36', '68.00', '68.00', '小萧萧');
INSERT INTO `sales` VALUES ('9', '康师傅劲爽拉面方便面整箱12桶装批发红烧香辣老坛酸菜牛肉面泡面', '6921234567888', '箱', '1', '2018-04-19 14:05:36', '34.80', '34.80', '小萧萧');
INSERT INTO `sales` VALUES ('10', '包邮龙泉青瓷餐具创意陶瓷米饭碗复古中式小汤碗 耐热微波炉可用', '6937962834105', '个', '6', '2018-04-19 14:05:36', '6.90', '41.40', '小萧萧');
INSERT INTO `sales` VALUES ('11', 'SID超人全身水洗智能剃须刀男士充电式电动刮胡刀胡须刀正品RS337', '6942563845126', '个', '1', '2018-04-19 14:05:36', '89.00', '89.00', '小萧萧');
INSERT INTO `sales` VALUES ('13', '天猫精灵 X1智能音箱语音助手蓝牙音箱WiFi网络音响', '6946327963668', '个', '1', '2018-05-02 15:26:00', '499.00', '499.00', '小天天');
INSERT INTO `sales` VALUES ('15', '哇哈哈电动牙刷123', '6946327963665', '个', '2', '2018-05-04 15:26:00', '189.00', '378.00', '小天天');
INSERT INTO `sales` VALUES ('16', '哇哈哈电动牙刷', '6946327963665', '个', '2', '2018-05-04 15:26:00', '189.00', '378.00', '小天天');
INSERT INTO `sales` VALUES ('17', '哇哈哈电动牙刷185型', '6921527146008554', '个', '1', '2018-05-24 15:13:28', '198.00', '198.00', '小天天');
INSERT INTO `sales` VALUES ('18', '哇哈哈电动牙刷985型', '6921527146045649', '个', '1', '2018-05-24 15:14:05', '198.00', '198.00', '小天天');
INSERT INTO `sales` VALUES ('19', '哇哈哈电动牙刷185型', '6921527146157381', '个', '1', '2018-05-24 15:15:57', '198.00', '198.00', '小天天');
INSERT INTO `sales` VALUES ('20', '哇哈哈电动牙刷9185型', '6921527146172294', '个', '1', '2018-05-24 15:16:12', '198.00', '198.00', '小天天');
INSERT INTO `sales` VALUES ('21', '哇哈哈电动牙刷1085型', '6921527146183099', '个', '1', '2018-05-24 15:16:23', '198.00', '198.00', '小天天');
INSERT INTO `sales` VALUES ('22', '哇哈哈电动牙刷56285型', '6921527146196318', '个', '1', '2018-05-24 15:16:36', '198.00', '198.00', '小天天');

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `supplier_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '供货商编号',
  `supplier_name` varchar(50) DEFAULT NULL COMMENT '供货商名称',
  `goods_name` varchar(50) DEFAULT NULL COMMENT '供货商品',
  `supplier_price` decimal(10,2) DEFAULT NULL COMMENT '供货商品单价',
  `supplier_address` varchar(20) DEFAULT NULL COMMENT '供货商地址',
  `supplier_personnel` varchar(20) DEFAULT NULL COMMENT '供货商联系人',
  `supplier_tel` varchar(20) DEFAULT NULL COMMENT '供货商电话',
  `supplier_email` varchar(20) DEFAULT NULL COMMENT '供货商邮箱',
  `category_name` varchar(20) DEFAULT NULL COMMENT '供货商品种类',
  `goods_unit` varchar(5) DEFAULT NULL COMMENT '商品单位',
  PRIMARY KEY (`supplier_id`),
  KEY `supplier_price` (`supplier_price`),
  KEY `supplier_name` (`supplier_name`),
  KEY `supplier_address` (`supplier_address`),
  KEY `category_name` (`category_name`),
  KEY `goods_unit` (`goods_unit`),
  KEY `goods_name` (`goods_name`),
  CONSTRAINT `supplier_ibfk_2` FOREIGN KEY (`category_name`) REFERENCES `category` (`category_name`),
  CONSTRAINT `supplier_ibfk_3` FOREIGN KEY (`goods_unit`) REFERENCES `goods` (`goods_unit`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1', '杭州娃哈哈饮料有限公司', '娃哈哈小AD钙奶100ml*48瓶哇哈哈儿童节礼物 牛奶饮料', '30.00', '浙江省杭州市', '大晖', '13806981474', 'dahui@supplier.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('2', '湖北牧羊湖食品有限公司', '港饼湖北特产 黄石牧羊湖港饼超薄芝麻饼500g包邮办公室休闲零食', '9.90', '湖北省黄石市', '大白', '13707452689', 'dabai@supplier.io', '包装食品类', '包');
INSERT INTO `supplier` VALUES ('3', '杭州顶益食品有限公司', '康师傅劲爽拉面方便面整箱12桶装批发红烧香辣老坛酸菜牛肉面泡面', '28.80', '浙江省杭州市', '大黑', '13809601478', 'dahei@supplier.io', '包装食品类', '箱');
INSERT INTO `supplier` VALUES ('4', '巢湖娃哈哈饮料有限公司', '娃哈哈饮用纯净水596ml*24瓶/箱 哇哈哈纯净水整箱多省包邮矿泉水', '32.00', '安徽省巢湖市', '大带', '15068689608', 'dadai@supplier.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('5', '浙江超人科技股份有限公司', 'SID超人全身水洗智能剃须刀男士充电式电动刮胡刀胡须刀正品RS337', '68.00', '浙江省杭州市', '大开', '15996333745', 'dakai@supplier.io', '日配类', '个');
INSERT INTO `supplier` VALUES ('6', '海南玻璃风制品有限公司', '古居玻璃杯韩版过滤茶杯创意潮流车载水杯便携随手男女式杯子定制', '21.00', '海南省三亚市', '大农', '15863247859', 'danong@supplier.io', '家居百货类', '个');
INSERT INTO `supplier` VALUES ('7', '浙江金华泰泽生化科技有限公司', '汰渍洗衣液家庭装量贩组合套装洁净去渍清香型3kg*2机洗瓶装正品', '38.90', '浙江省金华市', '大飞', '15794214463', 'dafei@supplier.io', '洗涤日化类', '瓶');
INSERT INTO `supplier` VALUES ('8', '浙江天猫供应链管理有限公司', '天猫精灵 X1智能音箱语音助手蓝牙音箱WiFi网络音响', '298.00', '浙江省杭州市', '大笔', '15025026458', 'dabi@supplier.io', '家居百货类', '个');
INSERT INTO `supplier` VALUES ('9', '广州光明乳品有限公司', '光明_一只椰子牛乳饮品250MLx24瓶 椰汁牛奶饮料整箱', '88.00', '广东省广州市', '大鱼', '17806211789', 'dayu@supplier.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('10', '江西景德镇瓷器制造有限公司', '包邮龙泉青瓷餐具创意陶瓷米饭碗复古中式小汤碗 耐热微波炉可用', '4.00', '江西省景德镇市', '大民', '17709296070', 'damin@supplier.io', '家居百货类', '件');
INSERT INTO `supplier` VALUES ('11', '江苏无限科技有限公司', '儿童天文望远镜显微镜小学生日礼物益智玩具科技实验制作创意礼品', '168.00', '江苏省南京市', '大天', '13107736071', 'datian@supplier.io', '文体办公类', '个');
INSERT INTO `supplier` VALUES ('12', '浙江娃哈哈有限公司', '娃哈哈柠檬茶41285型', '89.00', '浙江杭州', '大白', '17826800792', 'dabai@sms.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('13', '浙江娃哈哈有限公司', '娃哈哈柠檬茶72585型', '89.00', '浙江杭州', '大白', '17826800792', 'dabai@sms.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('14', '浙江娃哈哈有限公司', '娃哈哈柠檬茶68585型', '89.00', '浙江杭州', '大白', '17826800792', 'dabai@sms.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('15', '浙江娃哈哈有限公司', '娃哈哈柠檬茶17985型', '89.00', '浙江杭州', '大白', '17826800792', 'dabai@sms.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('16', '浙江娃哈哈有限公司', '娃哈哈柠檬茶46685型', '89.00', '浙江杭州', '大白', '17826800792', 'dabai@sms.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('17', '浙江娃哈哈有限公司', '娃哈哈柠檬茶73285型', '89.00', '浙江杭州', '大白', '17826800792', 'dabai@sms.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('18', '浙江娃哈哈有限公司', '娃哈哈柠檬茶16485型', '89.00', '浙江杭州', '大白', '17826800792', 'dabai@sms.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('19', '浙江娃哈哈有限公司', '娃哈哈柠檬茶49985型', '89.00', '浙江杭州', '大白', '17826800792', 'dabai@sms.io', '饮料烟酒类', '箱');
INSERT INTO `supplier` VALUES ('20', '浙江娃哈哈有限公司', '娃哈哈柠檬茶18685型', '89.00', '浙江杭州', '大白', '17826800792', 'dabai@sms.io', '饮料烟酒类', '箱');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `user_Id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(25) NOT NULL COMMENT '用户账号',
  `user_password` varchar(25) NOT NULL COMMENT '用户密码',
  `user_name` varchar(25) DEFAULT NULL COMMENT '用户姓名',
  `user_sex` varchar(10) DEFAULT NULL COMMENT '用户性别',
  `user_tel` varchar(30) DEFAULT NULL COMMENT '用户电话',
  `user_email` varchar(30) DEFAULT NULL COMMENT '用户邮箱',
  `user_position` varchar(20) DEFAULT NULL COMMENT '用户职位',
  `user_department` varchar(20) DEFAULT NULL COMMENT '用户部门',
  PRIMARY KEY (`user_Id`),
  KEY `user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'admin', 'admin2018', '白帅雷', '男', '13107736080', 'admin@sms.io', '系统管理员', '经理');
INSERT INTO `userinfo` VALUES ('2', 'sale', 'sale2018', '小尚尚', '男', '13200738092', 'sale@sms.io', '销售管理员', '销售部门');
INSERT INTO `userinfo` VALUES ('3', 'warehouse', 'warehouse2018', '小波儿', '男', '17826810791', 'warehouse@sms.io', '仓库管理员', '仓库部门');
INSERT INTO `userinfo` VALUES ('4', 'purchase', 'purchase2018', '小熊猫', '女', '18956324809', 'purchase@sms.io', '采购管理员', '采购部门');
INSERT INTO `userinfo` VALUES ('5', 'admin001', 'admin001', '白天一', '女', '13107736081', 'admin12@sms.io', '系统管理员', '副经理');
INSERT INTO `userinfo` VALUES ('6', 'sale419', 'sale20180419', '小萧萧', '女', '18507316848', 'sale419@sms.io', '销售管理员', '销售部门');
INSERT INTO `userinfo` VALUES ('7', 'sale418', 'sale20180418', '小天天', '女', '17820674985', 'sale418@sms.io', '销售管理员', '销售部门');
INSERT INTO `userinfo` VALUES ('8', 'purchase419', 'purchase20180419', '小勾勾', '男', '17920318979', 'purchase419@sms.io', '采购管理员', '采购部门');
INSERT INTO `userinfo` VALUES ('9', 'warehouse418', 'warehouse20180418', '小苍苍', '女', '17726037895', 'wareho418@sms.io', '仓库管理员', '仓库部门');
INSERT INTO `userinfo` VALUES ('10', 'purchase420', 'purchase20180420', '小三百', '男', '18809452680', 'purchase420@sms.io', '采购管理员', '采购部门');
INSERT INTO `userinfo` VALUES ('11', 'warehouse420', 'warehouse20180420', '小刺猬', '男', '18925607316', 'warehouse420@sms.io', '仓库管理员', '仓库部门');
INSERT INTO `userinfo` VALUES ('12', 'admin002', 'admin002', '白木冉', '女', '13809098040', 'admin002@sms.io', '系统管理员', '副经理');
INSERT INTO `userinfo` VALUES ('13', 'admin003', 'admin003', '凤梨酥', '女', '13806580747', 'admin003@sms.io', '系统管理员', '副经理');
INSERT INTO `userinfo` VALUES ('14', 'supplier', 'supplier2018', '无极峰', '男', '14789652358', 'supplier@sms.io', '供货管理员', '供货部门');
INSERT INTO `userinfo` VALUES ('15', 'supplier2018', 'supplier2018', '天勾', '男', '12345678959', 'supplier2018@sms.io', '供货管理员', '供货部门');

-- ----------------------------
-- Table structure for warehouse
-- ----------------------------
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse` (
  `warehouse_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '仓库编号',
  `goods_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `goods_barcode` varchar(20) DEFAULT NULL COMMENT '商品条码',
  `goods_price` decimal(10,2) DEFAULT NULL COMMENT '商品进货价',
  `supplier_name` varchar(50) DEFAULT NULL COMMENT '商品供货商',
  `goods_inventory` int(10) DEFAULT NULL COMMENT '商品库存量',
  `category_name` varchar(20) DEFAULT NULL COMMENT '商品种类',
  `goods_unit` varchar(5) DEFAULT NULL COMMENT '商品单位',
  `goods_content` varchar(10) DEFAULT NULL COMMENT '商品规格',
  PRIMARY KEY (`warehouse_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of warehouse
-- ----------------------------
INSERT INTO `warehouse` VALUES ('1', '康师傅劲爽拉面方便面整箱12桶装批发红烧香辣老坛酸菜牛肉面泡面', '6921234567888', '28.80', '杭州顶益食品有限公司', '50', '包装食品类', '箱', '106g*12');
INSERT INTO `warehouse` VALUES ('2', '包邮龙泉青瓷餐具创意陶瓷米饭碗复古中式小汤碗 耐热微波炉可用', '6937962834105', '6.90', '江西景德镇瓷器制造有限公司', '101', '家居百货类', '件', '4.5英寸');
INSERT INTO `warehouse` VALUES ('3', '丝飘抽纸27包原浆本色纸 竹浆餐巾纸抽家用卫生纸巾家庭装整箱批', '6942513548451', '29.90', '浙江中顺纸业有限公司', '80', '日配类', '箱', '100抽*27');
INSERT INTO `warehouse` VALUES ('4', '娃哈哈饮用纯净水596ml*24瓶/箱 哇哈哈纯净水整箱多省包邮矿泉水', '6923265987451', '48.00', '巢湖娃哈哈饮料有限公司', '50', '饮料烟酒类', '箱', '596ml*24');
INSERT INTO `warehouse` VALUES ('5', '天猫精灵 X1智能音箱语音助手蓝牙音箱WiFi网络音响', '6926327963668', '499.00', '浙江天猫供应链管理有限公司', '40', '家居百货类', '个', '4.1kg');
INSERT INTO `warehouse` VALUES ('6', '汰渍洗衣液家庭装量贩组合套装洁净去渍清香型3kg*2机洗瓶装正品', '6923721998156', '59.90', '浙江金华泰泽生化科技有限公司', '60', '洗涤日化类', '瓶', '6.7kg');
INSERT INTO `warehouse` VALUES ('7', '婴儿童摇摇马幼儿宝宝玩具小木马摇椅塑料带音乐女孩1-2周岁礼物', '6956545852130', '195.00', '北京儿童快乐有限公司', '30', '文体办公类', '个', '8.9kg');
INSERT INTO `warehouse` VALUES ('8', '东北大米吉林大米延边朝鲜族珲春大米稻花香大米包邮', '6925846184942', '136.00', '珲春谷粒香富硒米业有限公司', '100', '日配类', '袋', '10000g');
INSERT INTO `warehouse` VALUES ('9', '娃哈哈小AD钙奶100ml*48瓶哇哈哈儿童节礼物 牛奶饮料', '6921234567899', '48.00', '杭州娃哈哈饮料有限公司', '70', '饮料烟酒类', '箱', '100ml*48');
INSERT INTO `warehouse` VALUES ('10', '天堂伞油画伞防晒防紫外线太阳伞女雨伞折叠遮阳伞黑胶晴雨两用伞', '6945125484578', '78.00', '杭州天堂伞业有限公司', '50', '家居百货类', '把', '2.4kg');
INSERT INTO `warehouse` VALUES ('11', 'SID超人全身水洗智能剃须刀男士充电式电动刮胡刀胡须刀正品RS337', '6942563845126', '89.00', '浙江超人科技股份有限公司', '20', '日配类', '个', ' RS 337');
INSERT INTO `warehouse` VALUES ('12', '幸运方便面红烧排骨面60g*30安徽泡面袋装干吃干脆面零食', '6901671216014', '29.80', '镇江味佳园食品有限公司金山分公司', '100', '包装食品类', '箱', '60g*30');
INSERT INTO `warehouse` VALUES ('13', '仓库商品信息添加123', '201805241425', '29.90', '杭州电子科技大学后勤公司', '30', '日配类', '箱', '2.5kg');
INSERT INTO `warehouse` VALUES ('14', '仓库商品信息添加465', '1527143357242', '29.90', '杭州电子科技大学后勤公司', '30', '日配类', '箱', '2.5kg');
INSERT INTO `warehouse` VALUES ('15', '仓库商品信息添加789', '1527143370252', '29.90', '杭州电子科技大学后勤公司', '50', '日配类', '箱', '2.5kg');
INSERT INTO `warehouse` VALUES ('16', '仓库商品信息添加0.42570159456553935', '1527143394937', '29.90', '杭州电子科技大学后勤公司', '50', '日配类', '箱', '2.5kg');
INSERT INTO `warehouse` VALUES ('17', '仓库商品信息添加0.632099381545171', '1527143415178', '29.90', '杭州电子科技大学后勤公司', '50', '日配类', '箱', '2.5kg');
INSERT INTO `warehouse` VALUES ('18', '仓库商品信息添加0.47949360427036103', '1527143443964', '29.90', '杭州电子科技大学后勤公司', '50', '日配类', '箱', '2.5kg');
INSERT INTO `warehouse` VALUES ('19', '仓库商品信息添加0.18620541456493256', '1527143461831', '29.90', '杭州电子科技大学后勤公司', '50', '日配类', '箱', '2.5kg');
INSERT INTO `warehouse` VALUES ('20', '仓库商品信息添加0.1622781451939611', '1527143475878', '29.90', '杭州电子科技大学后勤公司', '100', '日配类', '箱', '2.5kg');
INSERT INTO `warehouse` VALUES ('21', '仓库商品信息添加0.8678533325584256', '1527143495815', '29.90', '杭州电子科技大学后勤公司', '100', '日配类', '箱', '2.5kg');
