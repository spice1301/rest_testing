
package com.pets.tests;

import com.pets.api.dataGenerator.PetDataGenerator;
import com.pets.api.model.Category;
import com.pets.api.model.Pet;
import com.pets.api.model.TagsItem;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;
import static io.restassured.RestAssured.given;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class PetsManagerTests {
   static PetDataGenerator petDataGenerator;

@BeforeClass
 public static void setUp(){
    petDataGenerator = new PetDataGenerator();
}

    @Test
  public void testCanCreatePet(){

        Pet actualPet = given().contentType(ContentType.JSON).log().all().
                body(petDataGenerator.getValidPet()).
                post("https://petstore.swagger.io/v2/pet").
                then().
                assertThat().
                statusCode(200).extract().as(Pet.class);
        assertEquals(actualPet.getName(), "Lolly");
    }
}


