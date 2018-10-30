package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 */
public interface BrandService {

    public List<TbBrand> findAll();
    
    /**
     * 品牌分页
     * pageNum 当前页数
     * pageSize 页记录数
     */
    public PageResult findPage(int pageNum,int pageSize);
    
    /**
     * 增加
     */
    public void add(TbBrand tbBrand);
    
    /**
     * 根据ID查询实体
     */
    public TbBrand findOne(Long id);
    
    /**
     * 修改
     */
    public void update(TbBrand brand);
    
    /**
     * 删除
     */
    public void delete(Long[] ids);
    
    /**
     * 品牌分页
     * pageNum 当前页数
     * pageSize 页记录数
     */
    public PageResult findPage(TbBrand brand, int pageNum,int pageSize);
    
    
    /**
     * 返回下拉列表数据
     */
    public List<Map> selectOptionList();
}








