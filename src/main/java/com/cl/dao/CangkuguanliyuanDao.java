package com.cl.dao;

import com.cl.entity.CangkuguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CangkuguanliyuanView;


/**
 * 仓库管理员
 * 
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface CangkuguanliyuanDao extends BaseMapper<CangkuguanliyuanEntity> {
	
	List<CangkuguanliyuanView> selectListView(@Param("ew") Wrapper<CangkuguanliyuanEntity> wrapper);

	List<CangkuguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<CangkuguanliyuanEntity> wrapper);
	
	CangkuguanliyuanView selectView(@Param("ew") Wrapper<CangkuguanliyuanEntity> wrapper);
	

}
