package com.vk.api.sdk.objects.ads;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.stats.WallpostStat;

import java.util.Objects;

/**
 * PostStats object
 */
public class PostStats extends WallpostStat {
    /**
     * Object ID
     */
    @SerializedName("ad_id")
    private Integer adId;

    public Integer getAdId() {
        return adId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(adId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostStats postStats = (PostStats) o;
        return Objects.equals(adId, postStats.adId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PostStats{");
        sb.append("adId=").append(adId);
        sb.append('}');
        return sb.toString();
    }
}
