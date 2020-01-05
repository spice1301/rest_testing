package com.pets.api.dataGenerator;

import com.pets.api.model.Category;
import com.pets.api.model.Pet;
import com.pets.api.model.TagsItem;

import java.util.ArrayList;
import java.util.List;

public class PetDataGenerator {

    public Pet getValidPet(){

        List<String> photoUrls = new ArrayList<String>();
        photoUrls.add("test");

        Category category = new Category();
        category.setId(1222);
        category.setName("Labrador");

        TagsItem tagsItem = new TagsItem("TagName" ,123456);
        ArrayList<TagsItem> tags = new ArrayList<TagsItem>();
        tags.add(tagsItem);


        Pet pet = new Pet();
        pet.setPhotoUrls(photoUrls);
        pet.setName("Lolly");
        pet.setId(12345);
        pet.setCategory(category);
        pet.setTags(tags);
        pet.setStatus("Active");

        return pet;
    }
}
