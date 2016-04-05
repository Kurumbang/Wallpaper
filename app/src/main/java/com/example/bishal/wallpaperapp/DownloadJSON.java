package com.example.bishal.wallpaperapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Bishal on 4/2/2016.
 */
public class DownloadJSON extends AsyncTask<Void, Void, Void> {

    Context context;
    String address = "";
    ProgressDialog progressDialog;
    URL url;
    ArrayList<Wallpaper> feedItems;
    JSONObject jsonobject;
    JSONArray jsonarray;
    public DownloadJSON(Context context){
        this.context = context;
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading...");
    }
    @Override
    protected void onPreExecute() {
        progressDialog.show();
        super.onPreExecute();
    }

    public void setAddress(String url){
        this.address = url;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        progressDialog.dismiss();
    }
    @Override
    protected Void doInBackground(Void... params) {
        feedItems = new ArrayList<>();




        return null;
    }

}
