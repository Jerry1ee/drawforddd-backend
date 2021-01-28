package com.lzy.drawforddd.controller;


import com.lzy.drawforddd.dto.PatternDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author
 * @version 1.0
 * @className
 * @description
 * @date
 * @e-mail cqulizhiying@foxmail.com
 **/

@CrossOrigin(value = "*", maxAge = 3600)
@RestController
public class ValidateGraphModels {

    @PostMapping(value = "/validation")

    @ResponseBody
    public String getValidateResult(@RequestBody Map<String, PatternDTO> modelsMap){

        List<PatternDTO> patternDTOList = modelsMap.values().stream().collect(Collectors.toList());
        System.out.println(patternDTOList);
        return "ok";
    }

}
