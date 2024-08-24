package com.cl.dao;

import com.cl.entity.ShebeichukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShebeichukuView;


/**
 * 设备出库
 * 
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface ShebeichukuDao extends BaseMapper<ShebeichukuEntity> {
	
	List<ShebeichukuView> selectListView(@Param("ew") Wrapper<ShebeichukuEntity> wrapper);

	List<ShebeichukuView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeichukuEntity> wrapper);
	
	ShebeichukuView selectView(@Param("ew") Wrapper<ShebeichukuEntity> wrapper);
	

}
