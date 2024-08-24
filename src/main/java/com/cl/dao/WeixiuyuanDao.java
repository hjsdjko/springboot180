package com.cl.dao;

import com.cl.entity.WeixiuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WeixiuyuanView;


/**
 * 维修员
 * 
 * @author 
 * @email 
 * @date 2024-02-20 10:49:43
 */
public interface WeixiuyuanDao extends BaseMapper<WeixiuyuanEntity> {
	
	List<WeixiuyuanView> selectListView(@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);

	List<WeixiuyuanView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);
	
	WeixiuyuanView selectView(@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);
	

}
