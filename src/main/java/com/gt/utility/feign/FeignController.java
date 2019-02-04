package com.gt.utility.feign;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.gt.utility.feign.body.PostSearchBody;
import com.gt.utility.feign.resource.IssueSearchResult;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;

@Controller
public class FeignController {

	private GenericClient genericClient;
	private static final String JQL = "project = EVERISBSS ORDER BY key ASC";
	private static final String URI = "https://everislatam.atlassian.net/rest/api/2/search?jql=project=EVERISBSS";

	private static final List<String> FIELDS = Arrays.asList("key", "summary", "issuetype", "reporter", "description",
			"issuelinks-linktype", "issuelinks-issues", "assignee", "customfield_13576", "customfield_14115",
			"customfield_14122", "customfield_14162", "customfield_14163", "customfield_14164", "customfield_14165",
			"customfield_14293", "customfield_14295", "customfield_14297", "customfield_14302", "customfield_14304",
			"customfield_14307", "customfield_14309", "customfield_14311", "customfield_14313", "customfield_14315",
			"customfield_14317", "customfield_14319", "customfield_14326", "customfield_14324-1", "customfield_14298",
			"customfield_14299", "customfield_14300", "customfield_14301", "customfield_14303", "customfield_14306",
			"customfield_14308", "customfield_14310", "customfield_14312", "customfield_14314", "customfield_14316",
			"customfield_14318", "customfield_14352", "comment");

	public FeignController() {

		genericClient = Feign.builder()//
				.client(new OkHttpClient())//
				.encoder(new GsonEncoder())//
				.decoder(new GsonDecoder())//
				.logger(new feign.slf4j.Slf4jLogger(GenericClient.class))//
				.logLevel(feign.Logger.Level.FULL)//
				.target(GenericClient.class, URI);//
	}

	public IssueSearchResult getPage(PostSearchBody postSearchBody) {
		return genericClient.search(postSearchBody);
	}

	public PostSearchBody getPostSearchBody(Long startAt, Long maxResults) {
		return new PostSearchBody(FeignController.JQL, startAt, maxResults, FeignController.FIELDS);
	}
}
