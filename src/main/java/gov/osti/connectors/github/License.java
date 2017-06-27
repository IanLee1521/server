/*
 */
package gov.osti.connectors.github;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitHub-specific License information, if available.
 * @author ensornl
 */
public class License {
    // attributes
    private String key;
    private String name;
    @JsonProperty (value = "spdx_id")
    private String indexName;
    private String url;
    private boolean featured;

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the indexName
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * @param indexName the indexName to set
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the featured
     */
    public boolean isFeatured() {
        return featured;
    }

    /**
     * @param featured the featured to set
     */
    public void setFeatured(boolean featured) {
        this.featured = featured;
    }
    
    /**
     * Return a String representation of this License.
     * @return the String of these values
     */
    @Override
    public String toString() {
        return "License: " + getName() + " URL=" + getUrl() + " indexed name=" + getIndexName();
    }
}
