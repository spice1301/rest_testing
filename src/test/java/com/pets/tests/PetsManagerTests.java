<<<<<<< HEAD
package com.pets.tests;

import com.pets.api.model.Category;
import com.pets.api.model.Pet;
import com.pets.api.model.TagsItem;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import static io.restassured.RestAssured.given;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.IsEqual.equalTo;

public class PetsManagerTests {


@BeforeAll
 static void setUp(){
    RestAssured.baseURI = "https://petstore.swagger.io/v2";
}


    @Test
    void testCanCreatePet(){


        List<String> photoUrls = new ArrayList<String>();
        photoUrls.add("test");

        Category category = new Category();
        category

        Pet pet = new Pet();
                pet.setPhotoUrls(photoUrls);
                pet.setName("Lolly");
                pet.setId(12345);
                pet.setCategory(category);
                pet.setTags();
                pet.setStatus();


    RestAssured
                .given().contentType(ContentType.JSON).log().all()
                .body(pet).
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                assertThat().
                statusCode(200).
                and().
                contentType(ContentType.JSON).
                and().
                header("Content-Length",equalTo("4567"));
    }
}

