package test.comments;

import base.tests.components.BaseApiTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import test.enums.EndpointPath;

public class GetPostsCommentsTests extends BaseApiTest {

    @Test
    public void getPostsComment(){
        RestAssured.given()
                .basePath(BaseApiTest.endpointPaths.get(EndpointPath.Comments))
                .queryParam("postId", 1)
                .when()
                .get()
                .then()
                .statusCode(200)
                .log()
                .body();
    }
}
