package com.seleznev.iway.service;

import com.google.common.collect.ImmutableList;
import com.seleznev.iway.model.IwayWebLink;
import com.seleznev.iway.model.SiteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.net.URISyntaxException;
import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

@Service
public class IwayService {

    @Autowired
    private IwayClient iwayClient;

//IwayWebLink =  StackoverflowWebsite


public List<IwayWebLink> findAll() throws URISyntaxException {
    return iwayClient.getSites().stream()
            .map(this::toIwayWebLink)
            .collect(collectingAndThen(toList(), ImmutableList::copyOf));
}

private IwayWebLink toIwayWebLink (@NotNull SiteDto input){
return new IwayWebLink(
        input.getUser_id(),
        input.getStart_place_point(),
        input.getFinish_place_point(),
        input.getCurrency(),
        input.getLang());
}



}
