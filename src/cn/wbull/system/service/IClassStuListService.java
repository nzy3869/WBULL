package cn.wbull.system.service;

import cn.wbull.system.model.ClassStuList;

import java.util.List;

/**
 * 获取考场学生列表
 */
public interface IClassStuListService {

    /**
     * 获取考场学生列表
     * @param turns 轮数
     * @param room 考场
     * @param af 上下午
     * @return 学生列表
     */
    public List<ClassStuList> getStuList(int turns,int room,String af);
}
