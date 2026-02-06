import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class GetPostsByIdTests extends BaseApiTest {

    private final String ENDPOINT_PATH = "/posts";

    @Test
    public void  getPostById(){
        RestAssured.given()
                .pathParam("postId", 1)
                .when()
                .get(ENDPOINT_PATH + "/{postId}")
                .prettyPeek()
                .then()
                .statusCode(200);
    }

    @Test
    public void getPostByIdForNonexistentId(){
        RestAssured.given()
                .pathParam("postId", 9999)
                .when()
                .get(ENDPOINT_PATH + "/{postId}")
                .then()
                .statusCode(404);
    }
}
