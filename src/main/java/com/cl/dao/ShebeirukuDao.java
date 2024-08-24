package com.cl.dao;

import com.cl.entity.ShebeirukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShebeirukuView;


/**
 * 设备入库
 * 
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface ShebeirukuDao extends BaseMapper<ShebeirukuEntity> {
	
	List<ShebeirukuView> selectListView(@Param("ew") Wrapper<ShebeirukuEntity> wrapper);

	List<ShebeirukuView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeirukuEntity> wrapper);
	
	ShebeirukuView selectView(@Param("ew") Wrapper<ShebeirukuEntity> wrapper);
	

}
