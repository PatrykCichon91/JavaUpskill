package tests.posts;

import base.tests.components.BaseApiTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import test.enums.EndpointPath;

public class GetPostsByIdTests extends BaseApiTest {

    @Test
    public void  getPostById(){
        RestAssured.given()
                .pathParam("postId", 1)
                .when()
                .get(BaseApiTest.endpointPaths.get(EndpointPath.Posts) + "/{postId}")
                .prettyPeek()
                .then()
                .statusCode(200);
    }

    @Test
    public void getPostByIdForNonexistentId(){
        RestAssured.given()
                .pathParam("postId", 9999)
                .when()
                .get(BaseApiTest.endpointPaths.get(EndpointPath.Posts) + "/{postId}")
                .then()
                .statusCode(404);
    }
}
