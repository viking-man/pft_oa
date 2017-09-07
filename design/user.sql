CREATE TABLE `bs_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `rowstamp` bigint(20) NOT NULL COMMENT '时间戳',
  `createuser` bigint(20) NOT NULL COMMENT '创建人',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  `modifyuser` bigint(20) NOT NULL COMMENT '最后修改人',
  `modifytime` datetime NOT NULL COMMENT '最后修改时间',
  `username` varchar(50) NOT NULL COMMENT '姓名',
  `userno` varchar(50) NOT NULL COMMENT '工号',
  `sex` char(1) NOT NULL DEFAULT 'N' COMMENT '性别',
  `pwd` varchar(128) DEFAULT NULL COMMENT '密码',
  `addr` varchar(100) DEFAULT NULL COMMENT '地址',
  `phoneno` varchar(30) DEFAULT NULL COMMENT '电话',
  `mobileno` varchar(30) DEFAULT NULL COMMENT '手机号',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `noallowed` tinyint(4) NOT NULL DEFAULT '0' COMMENT '禁止登录',
  `suspended` tinyint(4) NOT NULL DEFAULT '0' COMMENT '停职标志',
  `department` varchar(20) DEFAULT NULL COMMENT '所在部门',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `wxuserid` varchar(40) DEFAULT NULL COMMENT '微信用户ID',
  `otuserid` varchar(40) DEFAULT NULL COMMENT '备用用户ID',
  `reserve1` varchar(40) DEFAULT NULL COMMENT '备用1',
  `reserve2` varchar(40) DEFAULT NULL COMMENT '备用2',
  `reserve3` varchar(40) DEFAULT NULL COMMENT '备用3',
  `externid` varchar(40) DEFAULT NULL COMMENT '外部id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userno` (`username`,`userno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工表 ';

