package com.cl.dao;

import com.cl.entity.ShebeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShebeixinxiView;


/**
 * 设备信息
 * 
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface ShebeixinxiDao extends BaseMapper<ShebeixinxiEntity> {
	
	List<ShebeixinxiView> selectListView(@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);

	List<ShebeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);
	
	ShebeixinxiView selectView(@Param("ew") Wrapper<ShebeixinxiEntity> wrapper);
	

}
