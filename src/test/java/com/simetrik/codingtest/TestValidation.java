package com.simetrik.codingtest;
import static io.restassured.RestAssured.given;

import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

//Practice Exercise # 3
public class TestValidation {

	public static void main(String[] args) {
		
		String url = "https://jsonplaceholder.typicode.com/todos/1";
		SoftAssert sa = new SoftAssert();
		
		Response res = given()
				.when()
				.get(url)
				.then()
				.extract()
				.response();
		
		res.prettyPrint();
		
		JsonPath js = res.jsonPath();
		
		int actStatusCode = res.getStatusCode();
		int expStatusCode = 200;
		sa.assertEquals(actStatusCode, expStatusCode, "status code is not as expected");
		
		int actUserId = js.getInt("userId");
		
		sa.assertEquals(actUserId, 1);
		
		int actId = js.getInt("id");
		sa.assertEquals(actId, 1);
		
		String actTitle = js.getString("title");
		sa.assertEquals(actTitle, "delectus aut autem");
		
		boolean actComp = js.getBoolean("completed");
		sa.assertEquals(actComp, false);
		
		
		
		
		
		sa.assertAll();
		
		
		
		

	}

}
