package com.quartzactuator.gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/test")
    public ResponseEntity<String> getSampleResponse() {
        return ResponseEntity.ok("Not Protected as you see....");
    }
}
