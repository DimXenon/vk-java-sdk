package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.market.responses.GetExtendedResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.get method
 */
public class MarketGetQueryWithExtended extends AbstractQueryBuilder<MarketGetQueryWithExtended, GetExtendedResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param ownerId value of "owner id" parameter.
     */
    public MarketGetQueryWithExtended(VkApiClient client, Actor actor, int ownerId) {
        super(client, "market.get", GetExtendedResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        extended(true);
    }

    /**
     * Identifier of an item owner community
     * Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetQueryWithExtended ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Number of items to return
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 100.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetQueryWithExtended count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset based on a first matching item to get a certain items subset
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetQueryWithExtended offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * 1 - method will return additional fields: likes, can_comment, car_repost, photos. These parameters are not returned by default
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetQueryWithExtended extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected MarketGetQueryWithExtended getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("owner_id", "access_token");
    }
}
