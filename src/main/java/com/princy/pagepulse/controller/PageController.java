package com.princy.pagepulse.controller;

import com.princy.pagepulse.dto.PageReportDTO;
import com.princy.pagepulse.service.PageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    private final PageService pageService;

    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @GetMapping("/analyze")
    public PageReportDTO analyze(@RequestParam String url) {
        return pageService.analyzePage(url);
    }
}