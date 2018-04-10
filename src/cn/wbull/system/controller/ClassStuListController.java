package cn.wbull.system.controller;

import cn.wbull.system.model.ClassStuList;
import cn.wbull.system.service.IClassStuListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/class")
public class ClassStuListController {

    @Autowired
    private IClassStuListService classStuListService;

    @RequestMapping("/stuList")
    public List<ClassStuList> getClassStuList(int turns,int room,String af){

        List<ClassStuList> stuList = classStuListService.getStuList(turns, room, af);

        return stuList;
    }
    @RequestMapping("/toClassStu")
    @ResponseBody
    public String toClassStu(){
        return "classStu";
    }
}
