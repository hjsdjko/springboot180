package com.cl.dao;

import com.cl.entity.YihurenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YihurenyuanView;


/**
 * 医护人员
 * 
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface YihurenyuanDao extends BaseMapper<YihurenyuanEntity> {
	
	List<YihurenyuanView> selectListView(@Param("ew") Wrapper<YihurenyuanEntity> wrapper);

	List<YihurenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YihurenyuanEntity> wrapper);
	
	YihurenyuanView selectView(@Param("ew") Wrapper<YihurenyuanEntity> wrapper);
	

}
