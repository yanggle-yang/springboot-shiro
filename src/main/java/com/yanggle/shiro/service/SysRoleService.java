package com.yanggle.shiro.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanggle.shiro.entity.SysRoleEntity;

import java.util.List;

/**
 * @Description 角色业务接口
 */
public interface SysRoleService extends IService<SysRoleEntity> {

    /**
     * 通过用户ID查询角色集合
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);
}

