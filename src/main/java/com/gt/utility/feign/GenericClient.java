package com.gt.utility.feign;

import com.gt.utility.feign.body.PostSearchBody;
import com.gt.utility.feign.resource.IssueSearchResult;

import feign.Headers;
import feign.RequestLine;

public interface GenericClient {

	@RequestLine("POST")
	@Headers({ "Content-Type: application/json; charset=utf8",
			"cookie:ajs_group_id=null; ajs_anonymous_id=%22debb5832-300f-4ffe-a22c-0ac14335bba8%22; _csrf=5jL3tcuxcQTUUADjZay0lnQ0; atlassian.xsrf.token=B5WK-RO6E-D0DD-B8IQ_2c9e8dc03ea61aaf98cc6cff78048b0d53f8bca3_lin; cloud.session.token=eyJraWQiOiJzZXNzaW9uLXNlcnZpY2VcL3Nlc3Npb24tc2VydmljZSIsImFsZyI6IlJTMjU2In0.eyJhc3NvY2lhdGlvbnMiOltdLCJzdWIiOiI1YmM5ZGVlYWE4MzliMDMzN2Y3YzhjYjUiLCJhdWQiOiJhdGxhc3NpYW4iLCJpbXBlcnNvbmF0aW9uIjpbXSwibmJmIjoxNTQ4ODY0NzA3LCJyZWZyZXNoVGltZW91dCI6MTU0ODg2NTMwNywiaXNzIjoic2Vzc2lvbi1zZXJ2aWNlIiwic2Vzc2lvbklkIjoiZWMzNTY3MTktZWZhZS00MWQ5LTgzZGMtZGJmYWU2ZTI1NGZlIiwiZXhwIjoxNTUxNDU2NzA3LCJpYXQiOjE1NDg4NjQ3MDcsImVtYWlsIjoiZ2lhbmx1Y2EudHVyYW5vQGV2ZXJpcy5jb20iLCJqdGkiOiJlYzM1NjcxOS1lZmFlLTQxZDktODNkYy1kYmZhZTZlMjU0ZmUifQ.htC6C6RcQrJitRkWzwoWQDcHE5qGADsE8UrdMS4hAbrj-6YTzo8RHQTe398S1yKF0HQNCBWWRqWuRRQuEkgASw2uFfJH1qnvP_8tUpZp-eq0lmMtri46aryoNTHsQPD0FIyEj0Lf-2DRZ1UpS7P0Wef-g7H45Me4NenUrFwb1kzW0PdCm9XHjLOQsg92DNAywS9e0Whla0I6AV8TpxIrwLwiyX3aZaBXg64jn5eAEHGzZ1ZDE1RIhv_8DzaWsCRyz4FqK5JCGJo__9udD5IDmBQHVLMwVBbhtZ3Mdm24dcELLmblHg0XvJdzrEIabJa-qrLzuFTjjpARUGPT_3Fmfw" })
	IssueSearchResult search(PostSearchBody postSearchBody);

}