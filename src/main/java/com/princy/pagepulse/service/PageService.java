package com.princy.pagepulse.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;
import com.princy.pagepulse.dto.PageReportDTO;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@Service
public class PageService {

    public PageReportDTO analyzePage(String url) {

        PageReportDTO report = new PageReportDTO();

        try {

            long startTime = System.currentTimeMillis();

            Document document = Jsoup.connect(url)
                    .timeout(5000)
                    .get();

            long endTime = System.currentTimeMillis();

            report.setStatus(200);
            report.setResponseTime(endTime - startTime);
            report.setTitle(document.title());

            Element meta = document.selectFirst("meta[name=description]");

            if (meta != null) {
                report.setMetaDescription(meta.attr("content"));
            } else {
                report.setMetaDescription("No meta description found");
            }

            report.setH1Count(document.select("h1").size());

            Elements images = document.select("img");

            report.setImageCount(images.size());

            int missingAlt = 0;

            for (Element image : images) {

                if (!image.hasAttr("alt") || image.attr("alt").isBlank()) {
                    missingAlt++;
                }

            }

            report.setAltTextCount(missingAlt);

            String text = document.body().text();

            if (text.isBlank()) {
                report.setWordCount(0);
            } else {
                report.setWordCount(text.split("\\s+").length);
            }

        } catch (Exception e) {

            report.setStatus(500);
            report.setTitle("Error");
            report.setMetaDescription("Unable to analyze the given URL.");

        }

        return report;
    }
}
