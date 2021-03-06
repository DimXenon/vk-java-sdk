package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.photos.PhotoFull;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.getById method
 */
public class PhotosGetByIdQueryWithExtended extends AbstractQueryBuilder<PhotosGetByIdQueryWithExtended, List<PhotoFull>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param photos value of "photos" parameter.
     */
    public PhotosGetByIdQueryWithExtended(VkApiClient client, Actor actor, String... photos) {
        super(client, "photos.getById", Utils.buildParametrizedType(List.class, PhotoFull.class));
        accessToken(actor.getAccessToken());
        photos(photos);
        extended(true);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param photos value of "photos" parameter.
     */
    public PhotosGetByIdQueryWithExtended(VkApiClient client, String... photos) {
        super(client, "photos.getById", Utils.buildParametrizedType(List.class, PhotoFull.class));
        photos(photos);
        extended(true);
    }

    /**
     * IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example:
     * 1_129207899,6492_135055734,
     * -20629724_271945303
     *
     * @param value value of "photos" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosGetByIdQueryWithExtended photos(String... value) {
        return unsafeParam("photos", value);
    }

    /**
     * "1" - to return additional fields
     * "0" - (default)
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected PhotosGetByIdQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * "1" - to return photo sizes in a special format
     *
     * @param value value of "photo sizes" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public PhotosGetByIdQueryWithExtended photoSizes(Boolean value) {
        return unsafeParam("photo_sizes", value);
    }

    @Override
    protected PhotosGetByIdQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photos");
    }
}
