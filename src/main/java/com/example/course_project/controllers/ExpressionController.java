package com.example.course_project.controllers;

import com.example.course_project.models.Expression;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class ExpressionController {
    @GetMapping("/mathoper")
    public String greetingFors(Model model){
        model.addAttribute("expression", new Expression());
        return "operations";
    }

    @PostMapping("/mathoper")
    public String greetingSubmit(@ModelAttribute Expression expression, Map<String, Object> map) throws Exception{
        String string = expression.getExpr();
        char[] array = string.toCharArray();
        double result = 0.0;

        for(Character ch : array){
            if(ch == '+'){
                String[] numbers = string.split("\\+");
                result  = Double.parseDouble(numbers[0])+ Double.parseDouble(numbers[1]);
            }
            if(ch == '-'){
                String[] numbers = string.split("\\-");
                result  = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
            }
            if(ch == '*'){
                String[] numbers = string.split("\\*");
                result  = Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]);
            }
            if(ch == '/'){
                String[] numbers = string.split("\\/");
                result  = Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]);
            }
            if(ch == '%'){
                String[] numbers = string.split("\\%");
                result  = Double.parseDouble(numbers[0]) % Double.parseDouble(numbers[1]);
            }
        }
        String answer = String.valueOf(result);
        expression.setExpr(answer);
        return "operations";
    }
}
