$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search function",
  "description": "",
  "id": "search-function",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "validate search function of etsy.com with valid inputs",
  "description": "",
  "id": "search-function;validate-search-function-of-etsy.com-with-valid-inputs",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user enters valid key word in input box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the expected results should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStep.the_user_is_on_home_page()"
});
formatter.result({
  "duration": 3578247800,
  "status": "passed"
});
formatter.match({
  "location": "SearchStep.the_user_enters_valid_key_word_in_input_box()"
});
formatter.result({
  "duration": 93017099,
  "status": "passed"
});
formatter.match({
  "location": "SearchStep.the_user_clicks_on_search_button()"
});
formatter.result({
  "duration": 2599433716,
  "status": "passed"
});
formatter.match({
  "location": "SearchStep.the_expected_results_should_be_displayed()"
});
formatter.result({
  "duration": 123078934,
  "status": "passed"
});
});