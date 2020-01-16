package com.yanggle.shiro.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yanggle.shiro.entity.SysRoleEntity;

import java.util.List;

/**
 * @Description 角色DAO
 */
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

    /**
     * 通过用户ID查询角色集合
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);
}
