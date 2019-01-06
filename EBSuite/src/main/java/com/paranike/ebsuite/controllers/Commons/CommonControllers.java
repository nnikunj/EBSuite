package com.paranike.ebsuite.controllers.Commons;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@RestController
public class CommonControllers {
	@RequestMapping("/app-error")
	public String errorHandler() {
		return "Failed to resolve to any valid operation!!! Please contact your admin.";

	}

}
