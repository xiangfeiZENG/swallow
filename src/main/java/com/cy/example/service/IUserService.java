package com.cy.example.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.cy.example.carrier.PageCa;
import com.cy.example.entity.system.SysUserEntity;

public interface IUserService extends IService<SysUserEntity>{
	
	public int updateMy(SysUserEntity user);

	public SysUserEntity findOneByUsername(String username);

	public int searchAllCount(SysUserEntity user);

	public List<SysUserEntity> searchAll(SysUserEntity user, PageCa page);
}
