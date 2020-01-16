package com.yanggle.shiro.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yanggle.shiro.entity.SysMenuEntity;

import java.util.List;

/**
 * @Description 权限DAO
 */
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {

    /**
     * 根据角色查询用户权限
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    List<SysMenuEntity> selectSysMenuByRoleId(Long roleId);

}
