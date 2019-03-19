package cn.ldbz.mapper;

import org.apache.ibatis.annotations.Param;

import cn.ldbz.pojo.LdbzSolrItem;
import org.springframework.stereotype.Service;


public interface LdbzSolrItemMapper extends LdbzBaseMapper<LdbzSolrItem>{

	LdbzSolrItem selectByCode(@Param("code")Long code);
	
}