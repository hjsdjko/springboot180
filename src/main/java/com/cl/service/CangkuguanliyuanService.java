package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.CangkuguanliyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CangkuguanliyuanView;


/**
 * 仓库管理员
 *
 * @author 
 * @email 
 * @date 2024-02-20 10:49:44
 */
public interface CangkuguanliyuanService extends IService<CangkuguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CangkuguanliyuanView> selectListView(Wrapper<CangkuguanliyuanEntity> wrapper);
   	
   	CangkuguanliyuanView selectView(@Param("ew") Wrapper<CangkuguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CangkuguanliyuanEntity> wrapper);
   	

}

