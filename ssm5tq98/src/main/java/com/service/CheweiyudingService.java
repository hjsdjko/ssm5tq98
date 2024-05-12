package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheweiyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheweiyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheweiyudingView;


/**
 * 车位预定
 *
 * @author 
 * @email 
 * @date 2022-03-20 23:09:01
 */
public interface CheweiyudingService extends IService<CheweiyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheweiyudingVO> selectListVO(Wrapper<CheweiyudingEntity> wrapper);
   	
   	CheweiyudingVO selectVO(@Param("ew") Wrapper<CheweiyudingEntity> wrapper);
   	
   	List<CheweiyudingView> selectListView(Wrapper<CheweiyudingEntity> wrapper);
   	
   	CheweiyudingView selectView(@Param("ew") Wrapper<CheweiyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheweiyudingEntity> wrapper);
   	

}

