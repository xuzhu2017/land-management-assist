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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of admin_menu
-- ----------------------------
INSERT INTO `admin_menu` VALUES ('1', '/admin', 'AdminIndex', '首页', 'el-icon-s-home', 'AdminIndex', '0');
INSERT INTO `admin_menu` VALUES ('2', '/admin/dashboard', 'DashboardAdmin', '运行情况', null, 'dashboard/admin/index', '1');
INSERT INTO `admin_menu` VALUES ('3', '/admin', 'User', '用户管理', 'el-icon-user', 'AdminIndex', '0');
INSERT INTO `admin_menu` VALUES ('4', '/admin', 'Content', '内容管理', 'el-icon-tickets', 'AdminIndex', '0');
INSERT INTO `admin_menu` VALUES ('5', '/admin', 'System', '系统配置', 'el-icon-s-tools', 'AdminIndex', '0');
INSERT INTO `admin_menu` VALUES ('6', '/admin/user/profile', 'Profile', '用户信息', null, 'user/UserProfile', '3');
INSERT INTO `admin_menu` VALUES ('7', '/admin/user/role', 'Role', '角色配置', null, 'user/Role', '3');
INSERT INTO `admin_menu` VALUES ('8', '/admin/content/book', 'BookManagement', '图书管理', null, 'content/BookManagement', '4');
INSERT INTO `admin_menu` VALUES ('9', '/admin/content/banner', 'BannerManagement', '广告管理', null, 'content/BannerManagement', '4');
INSERT INTO `admin_menu` VALUES ('10', '/admin/content/article', 'ArticleManagement', '文章管理', null, 'content/ArticleManagement', '4');


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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='权限表';


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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='角色表';


-- ************************************** `land_management_assist_dev`.`t_admin_role_menu`

CREATE TABLE IF NOT EXISTS `land_management_assist_dev`.`t_admin_role_menu`
(
 `id`          integer unsigned NOT NULL AUTO_INCREMENT ,
 `role_id`     integer NOT NULL COMMENT '角色id' ,
 `menu_id`     integer NOT NULL COMMENT '菜单id' ,
 `create_time` datetime NOT NULL COMMENT '创建时间' ,
 `update_time` datetime NOT NULL COMMENT '更新时间' ,

PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='角色和菜单关联表';


-- ************************************** `land_management_assist_dev`.`t_admin_role_permission`

CREATE TABLE IF NOT EXISTS `land_management_assist_dev`.`t_admin_role_permission`
(
 `id`            integer unsigned NOT NULL AUTO_INCREMENT ,
 `role_id`       integer NOT NULL COMMENT '角色id' ,
 `permission_id` integer NOT NULL COMMENT '权限id' ,
 `create_time`   datetime NOT NULL COMMENT '创建时间' ,
 `update_time`   datetime NOT NULL COMMENT '更新时间' ,

PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='角色和权限关联表';


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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='用户表';


-- ************************************** `land_management_assist_dev`.`t_admin_user_role`

CREATE TABLE IF NOT EXISTS `land_management_assist_dev`.`t_admin_user_role`
(
 `id`          integer unsigned NOT NULL AUTO_INCREMENT ,
 `user_id`     integer NOT NULL COMMENT '用户id' ,
 `role_id`     integer NOT NULL COMMENT '角色id' ,
 `create_time` datetime NOT NULL COMMENT '创建时间' ,
 `update_time` datetime NOT NULL COMMENT '更新时间' ,

PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='用户和角色关联表';

