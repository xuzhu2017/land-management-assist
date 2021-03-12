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









