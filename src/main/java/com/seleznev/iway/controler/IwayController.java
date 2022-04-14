package com.seleznev.iway.controler;


import com.seleznev.iway.model.IwayWebLink;
import com.seleznev.iway.service.IwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/get/prices")
public class IwayController {
    @Autowired
    private IwayService iwayService;

    @RequestMapping
    public List<IwayWebLink> getListOfProviders() throws URISyntaxException {
        return iwayService.findAll();
    }

}
