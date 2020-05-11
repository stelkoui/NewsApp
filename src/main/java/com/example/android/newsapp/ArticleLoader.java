package com.example.android.newsapp;

import android.content.Context;

import android.content.AsyncTaskLoader;


import java.util.List;

public class ArticleLoader extends AsyncTaskLoader<List<Article>> {

    /** Query URL */
    private String mUrl;


    public ArticleLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {

        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Article> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of articles.
        List<Article> earthquakes = QueryUtils.fetchData(mUrl);
        return earthquakes;
    }
}

