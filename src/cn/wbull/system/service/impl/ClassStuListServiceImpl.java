package cn.wbull.system.service.impl;

import cn.wbull.system.dao.IClassStuListMapper;
import cn.wbull.system.model.ClassStuList;
import cn.wbull.system.service.IClassStuListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassStuListServiceImpl implements IClassStuListService {

    @Autowired
    private IClassStuListMapper classStuListMapper;

    @Override
    public List<ClassStuList> getStuList(int turns, int room, String af) {
        return classStuListMapper.getStuListByTurn(turns,room,af);
    }
}
