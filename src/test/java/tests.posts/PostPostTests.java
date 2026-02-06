package tests.posts;

import base.tests.components.BaseApiTest;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import test.enums.EndpointPath;
import tests.dto.builders.request.PostDtoBuilder;

public class PostPostTests extends BaseApiTest {

    @Test
    public void createNewPost(){

        var body = new PostDtoBuilder()
                .setBody("Body")
                .setTitle("title")
                .setUserId(1)
                .getModel();

        var gson = new Gson();
        var json = gson.toJson(body);

        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(json)
                .when()
                .post(BaseApiTest.endpointPaths.get(EndpointPath.Posts))
                .then()
                .statusCode(201);
                // TODO: add assert to check response content
    }
}
