package cn.wbull.system.controller;

import cn.wbull.system.model.ClassStuList;
import cn.wbull.system.service.IClassStuListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("/class")
public class ClassStuListController {

    @Autowired
    private IClassStuListService classStuListService;

    @RequestMapping("/stulist")
    public String getClassStuList(@RequestParam("af") String af,@RequestParam("room") int room,@RequestParam("turns")int turns,Model model){

        List<ClassStuList> stuList = classStuListService.getStuList(turns, room, af);
        model.addAttribute("stuList", stuList);
        model.addAttribute("af", af);
        model.addAttribute("turns", turns);
        model.addAttribute("room", room);
        System.out.println(stuList.toString());
        return "stuList";
    }
    @RequestMapping("/toClassStu")
    public String toClassStu(){
        return "classStu";
    }
}
