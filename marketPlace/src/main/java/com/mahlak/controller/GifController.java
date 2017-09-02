package com.mahlak.controller;

import com.mahlak.data.GifRepository;
import com.mahlak.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping(value = "/")
    public String listGifts(ModelMap modelMap){
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";

    }



    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name,  ModelMap modelMap){
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif",gif);
        return "gif-details";

    }
}

