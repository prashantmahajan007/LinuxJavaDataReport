package com.barclays.dataReport.controller;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.dataReport.entity.LinuxJavaDataSheet;
import com.barclays.dataReport.service.DataReportService;

@RestController
public class DataReportController {

	private final DataReportService dataReportService;

	public DataReportController(DataReportService uploadService) {
		this.dataReportService = uploadService;
	}

	@GetMapping("/dataReport")
	public ResponseEntity<List<LinuxJavaDataSheet>> upload() {
		try {
			return new ResponseEntity<>(dataReportService.getLinuxJavaDataReport(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@PutMapping("/dataReport/update")
	public ResponseEntity<LinuxJavaDataSheet> updateDataReport(@RequestParam String serverName, @RequestParam String comment, @RequestParam Date proposedDate) {
		try {
			return new ResponseEntity<>(dataReportService.updateDataReport(serverName, comment, proposedDate), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
