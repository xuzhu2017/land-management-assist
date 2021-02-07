-- ****************** SqlDBM: MySQL ******************;
-- ***************************************************;

-- 创建数据库和表
-- xuzhu
-- 2021-2-4 21:34:26

DROP DATABASE IF EXISTS `land_management_assist_dev`;
CREATE DATABASE IF NOT EXISTS `land_management_assist_dev`;
USE `land_management_assist_dev`;


-- ************************************** `land_management_assist_dev`.`t_admin_menu`

CREATE TABLE IF NOT EXISTS `land_management_assist_dev`.`t_admin_menu`
(
 `id`          integer unsigned NOT NULL AUTO_INCREMENT ,
 `code`        varchar(255) NOT NULL COMMENT '菜单编码，英文' ,
 `parent_id`   integer NULL COMMENT '父级菜单' ,
 `path`        varchar(255) NOT NULL COMMENT '菜单路由' ,
 `name`        varchar(255) NULL COMMENT '菜单名，中文' ,
 `component`   varchar(255) NULL COMMENT '前台组件名' ,
 `icon_cls`    varchar(255) NULL COMMENT '菜单图标样式' ,
 `deleted`     tinyint NOT NULL COMMENT '逻辑删除' ,
 `create_time` datetime NOT NULL COMMENT '创建时间' ,
 `update_time` datetime NOT NULL COMMENT '更新时间' ,

PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of t_admin_menu
-- ----------------------------
INSERT INTO `t_admin_menu` VALUES ('1', 'AdminIndex', '0', '/admin', '首页', 'AdminIndex', 'el-icon-s-home', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_menu` VALUES ('2', 'DashboardAdmin', '1', '/admin/dashboard', '运行情况', 'dashboard/admin/index', null, '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_menu` VALUES ('3', 'User', '0', '/admin', '用户管理', 'AdminIndex', 'el-icon-user', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_menu` VALUES ('4', 'Content', '0', '/admin', '内容管理', 'AdminIndex', 'el-icon-tickets', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_menu` VALUES ('5', 'System', '0', '/admin', '系统配置', 'AdminIndex', 'el-icon-s-tools', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_menu` VALUES ('6', 'Profile', '3', '/admin/user/profile', '用户信息', 'user/UserProfile', null, '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_menu` VALUES ('7', 'Role', '3', '/admin/user/role', '角色配置', 'user/Role', null, '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_menu` VALUES ('8', 'BookManagement', '4', '/admin/content/book', '图书管理', 'content/BookManagement', null, '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_menu` VALUES ('9', 'BannerManagement', '4', '/admin/content/banner', '广告管理', 'content/BannerManagement', null, '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_menu` VALUES ('10', 'ArticleManagement', '4', '/admin/content/article', '文章管理', 'content/ArticleManagement', null, '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');


-- ************************************** `land_management_assist_dev`.`t_admin_permission`

CREATE TABLE IF NOT EXISTS `land_management_assist_dev`.`t_admin_permission`
(
 `id`          integer unsigned NOT NULL AUTO_INCREMENT ,
 `code`        varchar(255) NOT NULL COMMENT '权限编码，英文' ,
 `name`        varchar(255) NULL COMMENT '权限名，中文' ,
 `description` varchar(255) NULL COMMENT '权限描述' ,
 `url`         varchar(255) NULL COMMENT '触发权限的url' ,
 `deleted`     tinyint NOT NULL COMMENT '逻辑删除' ,
 `create_time` datetime NOT NULL COMMENT '创建时间' ,
 `update_time` datetime NOT NULL COMMENT '更新时间' ,

PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of t_admin_permission
-- ----------------------------
INSERT INTO `t_admin_permission` VALUES ('1', 'users_management', '用户管理', null, '/api/admin/user', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_permission` VALUES ('2', 'roles_management', '角色管理', null, '/api/admin/role', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_permission` VALUES ('3', 'content_management', '内容管理', null, '/api/admin/content', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');


-- ************************************** `land_management_assist_dev`.`t_admin_role`

CREATE TABLE IF NOT EXISTS `land_management_assist_dev`.`t_admin_role`
(
 `id`          integer unsigned NOT NULL AUTO_INCREMENT ,
 `code`        varchar(255) NOT NULL COMMENT '角色编码，英文' ,
 `name`        varchar(255) NULL COMMENT '角色名，中文' ,
 `deleted`     tinyint NOT NULL COMMENT '逻辑删除' ,
 `create_time` datetime NOT NULL COMMENT '创建时间' ,
 `update_time` datetime NOT NULL COMMENT '更新时间' ,

PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of t_admin_role
-- ----------------------------
INSERT INTO `t_admin_role` VALUES ('1', 'sysAdmin', '系统管理员', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_role` VALUES ('2', 'contentManager', '内容管理员', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_role` VALUES ('3', 'visitor', '访客', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');
INSERT INTO `t_admin_role` VALUES ('9', 'test', '测试角色', '0', '2021-02-06 22:15:19', '2021-02-06 22:18:21');


-- ************************************** `land_management_assist_dev`.`t_admin_role_menu`

CREATE TABLE IF NOT EXISTS `land_management_assist_dev`.`t_admin_role_menu`
(
 `id`          integer unsigned NOT NULL AUTO_INCREMENT ,
 `role_id`     integer NOT NULL COMMENT '角色id' ,
 `menu_id`     integer NOT NULL COMMENT '菜单id' ,

PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='角色和菜单关联表';

-- ----------------------------
-- Records of t_admin_role_menu
-- ----------------------------
INSERT INTO `t_admin_role_menu` VALUES ('1', '4', '1');
INSERT INTO `t_admin_role_menu` VALUES ('2', '4', '2');
INSERT INTO `t_admin_role_menu` VALUES ('3', '3', '1');
INSERT INTO `t_admin_role_menu` VALUES ('4', '3', '2');
INSERT INTO `t_admin_role_menu` VALUES ('5', '9', '1');
INSERT INTO `t_admin_role_menu` VALUES ('6', '9', '2');
INSERT INTO `t_admin_role_menu` VALUES ('7', '1', '1');
INSERT INTO `t_admin_role_menu` VALUES ('8', '1', '2');
INSERT INTO `t_admin_role_menu` VALUES ('9', '1', '3');
INSERT INTO `t_admin_role_menu` VALUES ('10', '1', '6');
INSERT INTO `t_admin_role_menu` VALUES ('11', '1', '7');
INSERT INTO `t_admin_role_menu` VALUES ('12', '1', '4');
INSERT INTO `t_admin_role_menu` VALUES ('13', '1', '8');
INSERT INTO `t_admin_role_menu` VALUES ('14', '1', '9');
INSERT INTO `t_admin_role_menu` VALUES ('15', '1', '10');
INSERT INTO `t_admin_role_menu` VALUES ('16', '1', '5');
INSERT INTO `t_admin_role_menu` VALUES ('17', '2', '1');
INSERT INTO `t_admin_role_menu` VALUES ('18', '2', '2');
INSERT INTO `t_admin_role_menu` VALUES ('19', '2', '4');
INSERT INTO `t_admin_role_menu` VALUES ('20', '2', '8');
INSERT INTO `t_admin_role_menu` VALUES ('21', '2', '9');
INSERT INTO `t_admin_role_menu` VALUES ('22', '2', '10');


-- ************************************** `land_management_assist_dev`.`t_admin_role_permission`

CREATE TABLE IF NOT EXISTS `land_management_assist_dev`.`t_admin_role_permission`
(
 `id`            integer unsigned NOT NULL AUTO_INCREMENT ,
 `role_id`       integer NOT NULL COMMENT '角色id' ,
 `permission_id` integer NOT NULL COMMENT '权限id' ,

PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='角色和权限关联表';

-- ----------------------------
-- Records of t_admin_role_permission
-- ----------------------------
INSERT INTO `t_admin_role_permission` VALUES ('83', '5', '3');
INSERT INTO `t_admin_role_permission` VALUES ('108', '1', '1');
INSERT INTO `t_admin_role_permission` VALUES ('109', '1', '2');
INSERT INTO `t_admin_role_permission` VALUES ('110', '1', '3');
INSERT INTO `t_admin_role_permission` VALUES ('139', '2', '3');


-- ************************************** `land_management_assist_dev`.`t_admin_user`

CREATE TABLE IF NOT EXISTS `land_management_assist_dev`.`t_admin_user`
(
 `id`          integer unsigned NOT NULL AUTO_INCREMENT ,
 `username`    varchar(255) NOT NULL COMMENT '用户名，用于登录' ,
 `password`    varchar(255) NOT NULL COMMENT '密码，加密后的字符串' ,
 `salt`        varchar(255) NULL COMMENT '盐，加密用' ,
 `name`        varchar(255) NULL COMMENT '真实姓名' ,
 `phone`       varchar(255) NULL COMMENT '手机号码' ,
 `deleted`     tinyint NOT NULL DEFAULT 0 COMMENT '逻辑删除' ,
 `create_time` datetime NOT NULL COMMENT '创建时间' ,
 `update_time` datetime NOT NULL COMMENT '更新时间' ,

PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='用户表';


-- ************************************** `land_management_assist_dev`.`t_admin_user_role`

CREATE TABLE IF NOT EXISTS `land_management_assist_dev`.`t_admin_user_role`
(
 `id`          integer unsigned NOT NULL AUTO_INCREMENT ,
 `user_id`     integer NOT NULL COMMENT '用户id' ,
 `role_id`     integer NOT NULL COMMENT '角色id' ,
 `create_time` datetime NOT NULL COMMENT '创建时间' ,
 `update_time` datetime NOT NULL COMMENT '更新时间' ,

PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='用户和角色关联表';

