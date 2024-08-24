package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XinxicaijiyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinxicaijiyuanView;


/**
 * 信息采集员
 *
 * @author 
 * @email 
 * @date 2024-02-20 10:49:43
 */
public interface XinxicaijiyuanService extends IService<XinxicaijiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinxicaijiyuanView> selectListView(Wrapper<XinxicaijiyuanEntity> wrapper);
   	
   	XinxicaijiyuanView selectView(@Param("ew") Wrapper<XinxicaijiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinxicaijiyuanEntity> wrapper);
   	

}

