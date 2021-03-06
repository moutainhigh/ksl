package com.ruoyi.system.mapper;

import java.util.List;

import com.ruoyi.system.domain.Settlementchild;
import com.ruoyi.system.domain.Sparepart;

/**
 * 备件Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-01
 */
public interface SparepartMapper
{



    public List<Sparepart> selectSparepartByPurchasecontractid(String Purchasecontractid);
    /**
     * 查询备件
     * 
     * @param id 备件ID
     * @return 备件
     */
    public Sparepart selectSparepartById(Long id);


    public Sparepart selectSparepartByUuid(String uuid);

    /**
     * 查询备件列表
     * 
     * @param sparepart 备件
     * @return 备件集合
     */
    public List<Sparepart> selectSparepartList(Sparepart sparepart);

    /**
     * 新增备件
     * 
     * @param sparepart 备件
     * @return 结果
     */
    public int insertSparepart(Sparepart sparepart);

    /**
     * 修改备件
     * 
     * @param sparepart 备件
     * @return 结果
     */
    public int updateSparepart(Sparepart sparepart);

    /**
     * 删除备件
     * 
     * @param id 备件ID
     * @return 结果
     */
    public int deleteSparepartById(Long id);

    /**
     * 批量删除备件
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSparepartByIds(String[] ids);
}
