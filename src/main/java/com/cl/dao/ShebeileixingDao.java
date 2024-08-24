package com.cl.dao;

import com.cl.entity.ShebeileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShebeileixingView;


/**
 * 设备类型
 * 
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface ShebeileixingDao extends BaseMapper<ShebeileixingEntity> {
	
	List<ShebeileixingView> selectListView(@Param("ew") Wrapper<ShebeileixingEntity> wrapper);

	List<ShebeileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeileixingEntity> wrapper);
	
	ShebeileixingView selectView(@Param("ew") Wrapper<ShebeileixingEntity> wrapper);
	

}
