package com.gt.utility.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.utility.endpoint.bean.FieldResponse;
import com.gt.utility.endpoint.bean.IssueListResponse;
import com.gt.utility.endpoint.bean.IssueResponse;
import com.gt.utility.feign.FeignController;
import com.gt.utility.feign.body.PostSearchBody;
import com.gt.utility.feign.resource.Issue;
import com.gt.utility.feign.resource.IssueSearchResult;
import com.gt.utility.service.JiraIssueService;

@Service
public class JiraIssueServiceImpl implements JiraIssueService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private FeignController feignController;

	@Override
	public IssueListResponse getAll() {
		logger.info("calling getAll()");
		IssueListResponse issueListResponse = new IssueListResponse();
		List<IssueResponse> issuesResult = new ArrayList<IssueResponse>();
		issueListResponse.setIssues(issuesResult);
		Long startAt = 0L;
		Long maxResults = 100L;

		PostSearchBody postSearchBody = feignController.getPostSearchBody(startAt, maxResults);

		IssueSearchResult searchResult = feignController.getPage(postSearchBody);
		Long totalIssues = searchResult.getTotal();
		issueListResponse.setTotal(totalIssues);

		List<Issue> issues;

		while (totalIssues > 0) {
			issues = searchResult.getIssues();

			for (Issue issue : issues) {
				issuesResult.add(new IssueResponse(issue.getKey(), new FieldResponse(issue.getFields())));
			}

			if (startAt + maxResults < totalIssues) {
				startAt = startAt + maxResults;
				postSearchBody.setStartAt(startAt);
				searchResult = feignController.getPage(postSearchBody);
			} else {
				totalIssues = 0L;
			}
		}
		logger.info("returning " + issuesResult.size() + " issues ");
		return issueListResponse;
	}
}