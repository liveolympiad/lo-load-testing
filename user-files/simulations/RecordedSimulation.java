import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.HashMap;
import java.util.Map;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class RecordedSimulation extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://content.liveolympiad.org")
      .inferHtmlResources();
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("Accept", "*/*");
    headers_0.put("Accept-Encoding", "gzip, deflate, br");
    headers_0.put("Accept-Language", "en-US,en;q=0.9");
    headers_0.put("Access-Control-Request-Headers", "authorization,content-type");
    headers_0.put("Access-Control-Request-Method", "POST");
    headers_0.put("Origin", "https://app.liveolympiad.org");
    headers_0.put("Sec-Fetch-Dest", "empty");
    headers_0.put("Sec-Fetch-Mode", "cors");
    headers_0.put("Sec-Fetch-Site", "same-site");
    headers_0.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("Accept", "application/json, text/plain, */*");
    headers_1.put("Accept-Encoding", "gzip, deflate, br");
    headers_1.put("Accept-Language", "en-US,en;q=0.9");
    headers_1.put("Content-Type", "application/json");
    headers_1.put("Origin", "https://app.liveolympiad.org");
    headers_1.put("Sec-Fetch-Dest", "empty");
    headers_1.put("Sec-Fetch-Mode", "cors");
    headers_1.put("Sec-Fetch-Site", "same-site");
    headers_1.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_1.put("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJjY2VhODBhMC00Y2UyLTQ3NDQtYmY5Zi05MzJiYWM2MGNhM2YiLCJpYXQiOjE2NzIxMjc5MDUsInN1YiI6ImxvZ2luIiwiaXNzIjoiYWltbGVhcm4iLCJleHAiOjE2NzI3MzI3MDV9.kOmkgvhSWfRK7b-Y7IAsvVJGgV9QWcUyfWufx4UGXwk");
    headers_1.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_2.put("Accept-Encoding", "gzip, deflate, br");
    headers_2.put("Accept-Language", "en-US,en;q=0.9");
    headers_2.put("Sec-Fetch-Dest", "document");
    headers_2.put("Sec-Fetch-Mode", "navigate");
    headers_2.put("Sec-Fetch-Site", "same-site");
    headers_2.put("Sec-Fetch-User", "?1");
    headers_2.put("Upgrade-Insecure-Requests", "1");
    headers_2.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_2.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_12 = new HashMap<>();
    headers_12.put("Accept", "*/*");
    headers_12.put("Accept-Encoding", "gzip, deflate, br");
    headers_12.put("Accept-Language", "en-US,en;q=0.9");
    headers_12.put("Access-Control-Request-Headers", "authorization");
    headers_12.put("Access-Control-Request-Method", "GET");
    headers_12.put("Origin", "https://test.liveolympiad.org");
    headers_12.put("Sec-Fetch-Dest", "empty");
    headers_12.put("Sec-Fetch-Mode", "cors");
    headers_12.put("Sec-Fetch-Site", "cross-site");
    headers_12.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_13 = new HashMap<>();
    headers_13.put("Accept", "*/*");
    headers_13.put("Accept-Encoding", "gzip, deflate, br");
    headers_13.put("Accept-Language", "en-US,en;q=0.9");
    headers_13.put("Origin", "https://test.liveolympiad.org");
    headers_13.put("Sec-Fetch-Dest", "empty");
    headers_13.put("Sec-Fetch-Mode", "cors");
    headers_13.put("Sec-Fetch-Site", "cross-site");
    headers_13.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_13.put("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJjY2VhODBhMC00Y2UyLTQ3NDQtYmY5Zi05MzJiYWM2MGNhM2YiLCJpYXQiOjE2NzIxMjc5MDUsInN1YiI6ImxvZ2luIiwiaXNzIjoiYWltbGVhcm4iLCJleHAiOjE2NzI3MzI3MDV9.kOmkgvhSWfRK7b-Y7IAsvVJGgV9QWcUyfWufx4UGXwk");
    headers_13.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_13.put("sec-ch-ua-mobile", "?0");
    headers_13.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_15 = new HashMap<>();
    headers_15.put("Accept", "*/*");
    headers_15.put("Accept-Encoding", "gzip, deflate, br");
    headers_15.put("Accept-Language", "en-US,en;q=0.9");
    headers_15.put("Access-Control-Request-Headers", "authorization");
    headers_15.put("Access-Control-Request-Method", "GET");
    headers_15.put("Origin", "https://test.liveolympiad.org");
    headers_15.put("Sec-Fetch-Dest", "empty");
    headers_15.put("Sec-Fetch-Mode", "cors");
    headers_15.put("Sec-Fetch-Site", "same-site");
    headers_15.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_16 = new HashMap<>();
    headers_16.put("Accept", "*/*");
    headers_16.put("Accept-Encoding", "gzip, deflate, br");
    headers_16.put("Accept-Language", "en-US,en;q=0.9");
    headers_16.put("Origin", "https://test.liveolympiad.org");
    headers_16.put("Sec-Fetch-Dest", "empty");
    headers_16.put("Sec-Fetch-Mode", "cors");
    headers_16.put("Sec-Fetch-Site", "same-site");
    headers_16.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_16.put("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJjY2VhODBhMC00Y2UyLTQ3NDQtYmY5Zi05MzJiYWM2MGNhM2YiLCJpYXQiOjE2NzIxMjc5MDUsInN1YiI6ImxvZ2luIiwiaXNzIjoiYWltbGVhcm4iLCJleHAiOjE2NzI3MzI3MDV9.kOmkgvhSWfRK7b-Y7IAsvVJGgV9QWcUyfWufx4UGXwk");
    headers_16.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_16.put("sec-ch-ua-mobile", "?0");
    headers_16.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_18 = new HashMap<>();
    headers_18.put("Accept", "*/*");
    headers_18.put("Accept-Encoding", "gzip, deflate, br");
    headers_18.put("Accept-Language", "en-US,en;q=0.9");
    headers_18.put("If-None-Match", "W/\"7f89-igXfBvAVqF/g0T/ANs90EHKxdBs\"");
    headers_18.put("Origin", "https://test.liveolympiad.org");
    headers_18.put("Sec-Fetch-Dest", "empty");
    headers_18.put("Sec-Fetch-Mode", "cors");
    headers_18.put("Sec-Fetch-Site", "same-site");
    headers_18.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_18.put("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJjY2VhODBhMC00Y2UyLTQ3NDQtYmY5Zi05MzJiYWM2MGNhM2YiLCJpYXQiOjE2NzIxMjc5MDUsInN1YiI6ImxvZ2luIiwiaXNzIjoiYWltbGVhcm4iLCJleHAiOjE2NzI3MzI3MDV9.kOmkgvhSWfRK7b-Y7IAsvVJGgV9QWcUyfWufx4UGXwk");
    headers_18.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_18.put("sec-ch-ua-mobile", "?0");
    headers_18.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_20 = new HashMap<>();
    headers_20.put("Accept", "*/*");
    headers_20.put("Accept-Encoding", "gzip, deflate, br");
    headers_20.put("Accept-Language", "en-US,en;q=0.9");
    headers_20.put("Access-Control-Request-Headers", "authorization,content-type");
    headers_20.put("Access-Control-Request-Method", "POST");
    headers_20.put("Origin", "https://test.liveolympiad.org");
    headers_20.put("Sec-Fetch-Dest", "empty");
    headers_20.put("Sec-Fetch-Mode", "cors");
    headers_20.put("Sec-Fetch-Site", "same-site");
    headers_20.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_21 = new HashMap<>();
    headers_21.put("Accept", "*/*");
    headers_21.put("Accept-Encoding", "gzip, deflate, br");
    headers_21.put("Accept-Language", "en-US,en;q=0.9");
    headers_21.put("If-None-Match", "W/\"125-HD1Tq0b/K7yjx2rEZQKUUCRd/14\"");
    headers_21.put("Origin", "https://test.liveolympiad.org");
    headers_21.put("Sec-Fetch-Dest", "empty");
    headers_21.put("Sec-Fetch-Mode", "cors");
    headers_21.put("Sec-Fetch-Site", "same-site");
    headers_21.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_21.put("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJjY2VhODBhMC00Y2UyLTQ3NDQtYmY5Zi05MzJiYWM2MGNhM2YiLCJpYXQiOjE2NzIxMjc5MDUsInN1YiI6ImxvZ2luIiwiaXNzIjoiYWltbGVhcm4iLCJleHAiOjE2NzI3MzI3MDV9.kOmkgvhSWfRK7b-Y7IAsvVJGgV9QWcUyfWufx4UGXwk");
    headers_21.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_21.put("sec-ch-ua-mobile", "?0");
    headers_21.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_22 = new HashMap<>();
    headers_22.put("Accept", "*/*");
    headers_22.put("Accept-Encoding", "gzip, deflate, br");
    headers_22.put("Accept-Language", "en-US,en;q=0.9");
    headers_22.put("Origin", "https://test.liveolympiad.org");
    headers_22.put("Sec-Fetch-Dest", "empty");
    headers_22.put("Sec-Fetch-Mode", "cors");
    headers_22.put("Sec-Fetch-Site", "same-site");
    headers_22.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_22.put("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJjY2VhODBhMC00Y2UyLTQ3NDQtYmY5Zi05MzJiYWM2MGNhM2YiLCJpYXQiOjE2NzIxMjc5MDUsInN1YiI6ImxvZ2luIiwiaXNzIjoiYWltbGVhcm4iLCJleHAiOjE2NzI3MzI3MDV9.kOmkgvhSWfRK7b-Y7IAsvVJGgV9QWcUyfWufx4UGXwk");
    headers_22.put("content-type", "application/json");
    headers_22.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_22.put("sec-ch-ua-mobile", "?0");
    headers_22.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_23 = new HashMap<>();
    headers_23.put("Accept", "*/*");
    headers_23.put("Accept-Encoding", "identity;q=1, *;q=0");
    headers_23.put("Accept-Language", "en-US,en;q=0.9");
    headers_23.put("Range", "bytes=0-");
    headers_23.put("Sec-Fetch-Dest", "audio");
    headers_23.put("Sec-Fetch-Mode", "no-cors");
    headers_23.put("Sec-Fetch-Site", "cross-site");
    headers_23.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_23.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_23.put("sec-ch-ua-mobile", "?0");
    headers_23.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_30 = new HashMap<>();
    headers_30.put("Accept", "*/*");
    headers_30.put("Accept-Encoding", "gzip, deflate, br");
    headers_30.put("Accept-Language", "en-US,en;q=0.9");
    headers_30.put("If-None-Match", "W/\"4-K+iMpCQsduglOsYkdIUQZQMtaDM\"");
    headers_30.put("Origin", "https://test.liveolympiad.org");
    headers_30.put("Sec-Fetch-Dest", "empty");
    headers_30.put("Sec-Fetch-Mode", "cors");
    headers_30.put("Sec-Fetch-Site", "same-site");
    headers_30.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_30.put("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJjY2VhODBhMC00Y2UyLTQ3NDQtYmY5Zi05MzJiYWM2MGNhM2YiLCJpYXQiOjE2NzIxMjc5MDUsInN1YiI6ImxvZ2luIiwiaXNzIjoiYWltbGVhcm4iLCJleHAiOjE2NzI3MzI3MDV9.kOmkgvhSWfRK7b-Y7IAsvVJGgV9QWcUyfWufx4UGXwk");
    headers_30.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_30.put("sec-ch-ua-mobile", "?0");
    headers_30.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_31 = new HashMap<>();
    headers_31.put("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_31.put("Accept-Encoding", "gzip, deflate, br");
    headers_31.put("Accept-Language", "en-US,en;q=0.9");
    headers_31.put("Sec-Fetch-Dest", "image");
    headers_31.put("Sec-Fetch-Mode", "no-cors");
    headers_31.put("Sec-Fetch-Site", "cross-site");
    headers_31.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_31.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_31.put("sec-ch-ua-mobile", "?0");
    headers_31.put("sec-ch-ua-platform", "macOS");
    
    Map<CharSequence, String> headers_85 = new HashMap<>();
    headers_85.put("Accept", "*/*");
    headers_85.put("Accept-Encoding", "gzip, deflate, br");
    headers_85.put("Accept-Language", "en-US,en;q=0.9");
    headers_85.put("If-None-Match", "W/\"1c0-RJlfQvPKi+WEG4pZvfVk+nAvAoI\"");
    headers_85.put("Origin", "https://test.liveolympiad.org");
    headers_85.put("Sec-Fetch-Dest", "empty");
    headers_85.put("Sec-Fetch-Mode", "cors");
    headers_85.put("Sec-Fetch-Site", "same-site");
    headers_85.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
    headers_85.put("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJjY2VhODBhMC00Y2UyLTQ3NDQtYmY5Zi05MzJiYWM2MGNhM2YiLCJpYXQiOjE2NzIxMjc5MDUsInN1YiI6ImxvZ2luIiwiaXNzIjoiYWltbGVhcm4iLCJleHAiOjE2NzI3MzI3MDV9.kOmkgvhSWfRK7b-Y7IAsvVJGgV9QWcUyfWufx4UGXwk");
    headers_85.put("sec-ch-ua", "Not?A_Brand\";v=\"8\", \"Chromium\";v=\"108\", \"Google Chrome\";v=\"108");
    headers_85.put("sec-ch-ua-mobile", "?0");
    headers_85.put("sec-ch-ua-platform", "macOS");
    
    String uri2 = "https://test.liveolympiad.org";
    
    String uri3 = "https://cdn.jsdelivr.net/npm/mathjax@3.0.1/es5/tex-mml-chtml.js";
    
    String uri4 = "https://s3.ap-south-1.amazonaws.com/edulabs/questions/a6556854-1e2e-43dd-b0f9-5f8055ff5bac.mp3";
    
    String uri5 = "https://fonts.googleapis.com/css2";
    
    String uri6 = "https://edulabs.s3.ap-south-1.amazonaws.com/questions";
    
    String uri7 = "https://users.digishaala.com/profile";

    ScenarioBuilder scn = scenario("RecordedSimulation")
      .exec(
        http("request_0")
          .options("/tests")
          .headers(headers_0)
          .resources(
            http("request_1")
              .post("/tests")
              .headers(headers_1)
              .body(RawFileBody("recordedsimulation/0001_request.json")),
            http("request_2")
              .get(uri2 + "/landing/63ad2bf62501ec19339e7925?token=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJjY2VhODBhMC00Y2UyLTQ3NDQtYmY5Zi05MzJiYWM2MGNhM2YiLCJpYXQiOjE2NzIxMjc5MDUsInN1YiI6ImxvZ2luIiwiaXNzIjoiYWltbGVhcm4iLCJleHAiOjE2NzI3MzI3MDV9.kOmkgvhSWfRK7b-Y7IAsvVJGgV9QWcUyfWufx4UGXwk&mock=true&route=test")
              .headers(headers_2),
            http("request_3")
              .get(uri5 + "?family=Oleo+Script&display=swap"),
            http("request_4")
              .get(uri2 + "/static/css/2.b28305bc.chunk.css"),
            http("request_5")
              .get(uri2 + "/static/css/main.f4a291ca.chunk.css"),
            http("request_6")
              .get(uri2 + "/static/js/main.b407ee18.chunk.js"),
            http("request_7")
              .get(uri2 + "/static/js/2.e3103e4a.chunk.js"),
            http("request_8")
              .get(uri5 + "?family=Montserrat:wght@200&display=swap"),
            http("request_9")
              .get(uri5 + "?family=Poppins:wght@200;300&display=swap"),
            http("request_10")
              .get(uri3),
            http("request_11")
              .get(uri2 + "/favicon.ico"),
            http("request_12")
              .options(uri7)
              .headers(headers_12),
            http("request_13")
              .get(uri7)
              .headers(headers_13),
            http("request_14")
              .get(uri2 + "/favicon.ico"),
            http("request_15")
              .options("/tests/63ad2bf62501ec19339e7925")
              .headers(headers_15),
            http("request_16")
              .get("/tests/63ad2bf62501ec19339e7925")
              .headers(headers_16),
            http("request_17")
              .options("/packages/62f35380899c0038b6283dfd")
              .headers(headers_15),
            http("request_18")
              .get("/packages/62f35380899c0038b6283dfd")
              .headers(headers_18),
            http("request_19")
              .options("/items/media/62f0b7d6466acf7815e14043")
              .headers(headers_15),
            http("request_20")
              .options("/tests/submit")
              .headers(headers_20),
            http("request_21")
              .get("/items/media/62f0b7d6466acf7815e14043")
              .headers(headers_21),
            http("request_22")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0022_request.json")),
            http("request_23")
              .get(uri4)
              .headers(headers_23)
              .check(status().is(403))
          )
      )
      .pause(3)
      .exec(
        http("request_24")
          .post("/tests/submit")
          .headers(headers_22)
          .body(RawFileBody("recordedsimulation/0024_request.html"))
      )
      .pause(2)
      .exec(
        http("request_25")
          .options("/activity/navigate")
          .headers(headers_20)
          .resources(
            http("request_26")
              .options("/items/media/62f34823466acf7815e141dc")
              .headers(headers_15),
            http("request_27")
              .options("/tests/submit")
              .headers(headers_20),
            http("request_28")
              .post("/activity/navigate")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0028_request.json")),
            http("request_29")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0029_request.html")),
            http("request_30")
              .get("/items/media/62f34823466acf7815e141dc")
              .headers(headers_30),
            http("request_31")
              .get(uri6 + "/62f34823466acf7815e141dc/blobid6")
              .headers(headers_31)
              .check(status().is(403)),
            http("request_32")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0032_request.html"))
          )
      )
      .pause(3)
      .exec(
        http("request_33")
          .options("/items/media/62f34946466acf7815e141e8")
          .headers(headers_15)
          .resources(
            http("request_34")
              .options("/activity/navigate")
              .headers(headers_20),
            http("request_35")
              .post("/activity/navigate")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0035_request.html")),
            http("request_36")
              .get("/items/media/62f34946466acf7815e141e8")
              .headers(headers_30),
            http("request_37")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0037_request.json"))
          )
      )
      .pause(1)
      .exec(
        http("request_38")
          .options("/tests/submit")
          .headers(headers_20)
          .resources(
            http("request_39")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0039_request.html"))
          )
      )
      .pause(4)
      .exec(
        http("request_40")
          .options("/activity/navigate")
          .headers(headers_20)
          .resources(
            http("request_41")
              .options("/items/media/62f349fc899c0038b6283db5")
              .headers(headers_15),
            http("request_42")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0042_request.html")),
            http("request_43")
              .post("/activity/navigate")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0043_request.json")),
            http("request_44")
              .get("/items/media/62f349fc899c0038b6283db5")
              .headers(headers_30),
            http("request_45")
              .options("/tests/submit")
              .headers(headers_20),
            http("request_46")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0046_request.html")),
            http("request_47")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0047_request.html")),
            http("request_48")
              .options("/items/media/62f34e3e466acf7815e141f7")
              .headers(headers_15),
            http("request_49")
              .post("/activity/navigate")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0049_request.html")),
            http("request_50")
              .get("/items/media/62f34e3e466acf7815e141f7")
              .headers(headers_16)
          )
      )
      .pause(9)
      .exec(
        http("request_51")
          .options("/activity/navigate")
          .headers(headers_20)
          .resources(
            http("request_52")
              .options("/items/media/62f34ebc466acf7815e141fa")
              .headers(headers_15),
            http("request_53")
              .options("/tests/submit")
              .headers(headers_20),
            http("request_54")
              .post("/activity/navigate")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0054_request.json")),
            http("request_55")
              .get("/items/media/62f34ebc466acf7815e141fa")
              .headers(headers_16),
            http("request_56")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0056_request.json")),
            http("request_57")
              .get(uri6 + "/undefined/blobid8")
              .headers(headers_31)
              .check(status().is(403)),
            http("request_58")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0058_request.html")),
            http("request_59")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0059_request.html")),
            http("request_60")
              .post("/activity/navigate")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0060_request.html")),
            http("request_61")
              .options("/items/media/62f35092466acf7815e1420b")
              .headers(headers_15),
            http("request_62")
              .get("/items/media/62f35092466acf7815e1420b")
              .headers(headers_16)
          )
      )
      .pause(16)
      .exec(
        http("request_63")
          .options("/activity/navigate")
          .headers(headers_20)
          .resources(
            http("request_64")
              .options("/items/media/62f35129466acf7815e14212")
              .headers(headers_15),
            http("request_65")
              .get(uri6 + "/62f35129466acf7815e14212/blobid5")
              .headers(headers_31),
            http("request_66")
              .options("/tests/submit")
              .headers(headers_20),
            http("request_67")
              .post("/activity/navigate")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0067_request.json")),
            http("request_68")
              .get("/items/media/62f35129466acf7815e14212")
              .headers(headers_16),
            http("request_69")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0069_request.json"))
          )
      )
      .pause(1)
      .exec(
        http("request_70")
          .post("/tests/submit")
          .headers(headers_22)
          .body(RawFileBody("recordedsimulation/0070_request.html"))
          .resources(
            http("request_71")
              .post("/activity/navigate")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0071_request.html")),
            http("request_72")
              .options("/items/media/62f351bd466acf7815e1421a")
              .headers(headers_15),
            http("request_73")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0073_request.html")),
            http("request_74")
              .get(uri6 + "/62f351bd466acf7815e1421a/blobid0")
              .headers(headers_31),
            http("request_75")
              .get("/items/media/62f351bd466acf7815e1421a")
              .headers(headers_16)
          )
      )
      .pause(1)
      .exec(
        http("request_76")
          .options("/activity/navigate")
          .headers(headers_20)
          .resources(
            http("request_77")
              .options("/tests/submit")
              .headers(headers_20),
            http("request_78")
              .options("/items/media/62f3527a466acf7815e14225")
              .headers(headers_15),
            http("request_79")
              .post("/tests/submit")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0079_request.html")),
            http("request_80")
              .post("/activity/navigate")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0080_request.html")),
            http("request_81")
              .get("/items/media/62f3527a466acf7815e14225")
              .headers(headers_16)
          )
      )
      .pause(10)
      .exec(
        http("request_82")
          .options("/tests/finishTest")
          .headers(headers_20)
          .resources(
            http("request_83")
              .post("/tests/finishTest")
              .headers(headers_22)
              .body(RawFileBody("recordedsimulation/0083_request.json")),
            http("request_84")
              .options("/tests/63ad2bf62501ec19339e7925")
              .headers(headers_15),
            http("request_85")
              .get("/tests/63ad2bf62501ec19339e7925")
              .headers(headers_85)
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
