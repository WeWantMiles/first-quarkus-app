import org.junit.jupiter.api.Test;
import org.mlv.domain.NutriscoreService;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;

import io.quarkus.test.junit.QuarkusMock;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.*;
import static org.hamcrest.CoreMatchers.is;
import javax.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

@QuarkusTest
public class FirstRessourceTest {
    
    @Inject
    NutriscoreService nutriscoreService;

    @BeforeAll
    public static void setup() {
        NutriscoreService mockNutriscoreService = Mockito.mock(NutriscoreService.class);
        Mockito.when(mockNutriscoreService.getNutriScore("3")).thenReturn("super Nutriscore");
        QuarkusMock.installMockForType(mockNutriscoreService, NutriscoreService.class);
    }

    @Test
    public void testNutriscoreServiceOk() {
        Assertions.assertEquals("super Nutriscore", nutriscoreService.getNutriScore("3"));
    }

    @Test
    public void testFirstEndpointOk() {
        given()
            .when().get("/first")
            .then()
                .statusCode(200)
                .body(is("first"));
    }
}
