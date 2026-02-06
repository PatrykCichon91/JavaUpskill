package tests.dto.builders.request;

import tests.dto.models.request.PostDto;

public class PostDtoBuilder {

    private final PostDto model = new PostDto();

    public PostDtoBuilder setTitle(String title){
        model.Title = title;
        return this;
    }

    public PostDtoBuilder setBody(String body){
        model.Body = body;
        return this;
    }

    public PostDtoBuilder setUserId(int userId){
        model.UserId = userId;
        return this;
    }

    public PostDto getModel() {
        return model;
    }
}
