package com.princy.pagepulse.service;

import com.princy.pagepulse.dto.PageReportDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PageServiceTest {

    private final PageService pageService = new PageService();

    @Test
    public void testValidURL() {

        PageReportDTO report = pageService.analyzePage("https://example.com");

        assertEquals(200, report.getStatus());
        assertNotNull(report.getTitle());
        assertTrue(report.getWordCount() > 0);
    }

    @Test
    public void testInvalidURL() {

        PageReportDTO report = pageService.analyzePage("abc");

        assertEquals(500, report.getStatus());
        assertEquals("Error", report.getTitle());
    }

    @Test
    public void testNonHtmlURL() {

        PageReportDTO report = pageService.analyzePage("https://httpbin.org/image/png");

        assertEquals(500, report.getStatus());
    }

}
