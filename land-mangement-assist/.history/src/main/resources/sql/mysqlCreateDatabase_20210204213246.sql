-- Warning: You can generate script only for one table/view at a time in your Free plan 
-- 
-- ****************** SqlDBM: MySQL ******************;
-- ***************************************************;

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
) COMMENT='菜单表';





