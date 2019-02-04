package com.gt.utility.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gt.utility.endpoint.bean.IssueListResponse;
import com.gt.utility.feign.resource.IssueSearchResult;
import com.gt.utility.service.JiraIssueService;

@RestController
public class IssueEndpoint {

	@Autowired
	private JiraIssueService jiraIssueService;
	
    @GetMapping("/issues")
    public IssueListResponse issues() {    	
    	
    	IssueListResponse issueListResponse = jiraIssueService.getAll();

        return issueListResponse;
    }

}
