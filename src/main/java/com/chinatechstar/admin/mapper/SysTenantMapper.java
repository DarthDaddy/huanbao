package com.chinatechstar.admin.mapper;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.chinatechstar.admin.entity.SysTenant;
import com.chinatechstar.admin.vo.SysTenantVO;
import com.chinatechstar.file.vo.FileVO;

/**
 * 租户信息的数据持久接口层
 * 
 * @版权所有 广东国星科技有限公司 www.mscodecloud.com
 */
public interface SysTenantMapper {

	/**
	 * 查询租户分页或导出数据
	 * 
	 * @param paramMap 参数Map
	 * @return
	 */
	List<LinkedHashMap<String, Object>> querySysTenant(Map<String, Object> paramMap);

	/**
	 * 查询是否已存在此租户编码
	 * 
	 * @param id         租户ID
	 * @param tenantCode 租户编码
	 * @return
	 */
	Integer getSysTenantByTenantCode(Long id, String tenantCode);

	/**
	 * 新增租户
	 * 
	 * @param sysTenant 租户对象
	 * @return
	 */
	int insertSysTenant(SysTenant sysTenant);

	/**
	 * 编辑租户
	 * 
	 * @param sysTenant 租户对象
	 * @return
	 */
	int updateSysTenant(SysTenant sysTenant);

	/**
	 * 删除租户
	 * 
	 * @param id 租户ID
	 * @return
	 */
	int deleteSysTenant(Long[] id);

	List<SysTenantVO> querySysTenants();

    List<SysTenant> querySysTenantByCurrent(String tenantCode);

    List<SysTenant> querySysTenantList();

	SysTenantVO querySysTenantVo(String tenantCode);

	List<FileVO> queryFileListByTenantCode(String tenantCode);
}
