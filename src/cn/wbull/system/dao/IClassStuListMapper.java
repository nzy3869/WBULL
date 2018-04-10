package cn.wbull.system.dao;

import cn.wbull.system.model.ClassStuList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 查询上/下午某考场某伦的考生名单
 */
public interface IClassStuListMapper {
    /**
     * 查询上/下午某考场某伦的考生名单
     * @param turns 轮数
     * @param room  第几考场
     * @param af 上下午
     * @return 该考场学生名单
     */
    public List<ClassStuList> getStuListByTurn(@Param("turns")String turns,@Param("room")String room,@Param("af")String af);
}
