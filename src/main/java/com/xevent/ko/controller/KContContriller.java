package com.xevent.ko.controller;

import com.xevent.ko.bean.KCont;
import com.xevent.ko.resp.Result;
import com.xevent.ko.utils.TimeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@RestController
public class KContContriller {
    @RequestMapping("/getKcont")
    public Result setKCont(){
        Result result = new Result();
        try {
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
            //初始化
            Date nowTime = df.parse(df.format(new Date()));
            Date beginTime = df.parse("00:00:00");
            Date endTime = df.parse("23:59:00");
            boolean flag = TimeUtil.belongCalendar(nowTime, beginTime, endTime);
            if(flag) {
                KCont cont = new KCont();
                cont.setKo(true);
                cont.setStartTime("00:00:00");
                cont.setEndTime("23:59:00");
                result.setCode(1);
                result.setMsg("success");
                result.setObj(cont);
            }else {
                result.setMsg("fail");
                result.setCode(0);
            }
        }catch (Exception e){
            result.setMsg("fail");
            result.setCode(0);
        }
        return  result;
    }

    @RequestMapping("/index")
    public String index(){
        return  "index";
    }





}
