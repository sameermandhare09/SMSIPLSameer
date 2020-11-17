package com.example.smsiplsameer;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.chilkatsoft.CkCrypt2;
import com.google.gson.Gson;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Multipart;

public class MainActivity extends AppCompatActivity {

    String key = null,
            authKey = null,
            password = null;
    APIInterface apiInterface;
    private static final String TAG = "Chilkat";
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int min = 1;
        final int max = 4;
        final int random = new Random().nextInt((max - min) + 1) + min;
        Log.e("random number ",random+"");
        authKey = String.valueOf(random);

        password = "1234";

        String sha256s = sha256(password);
        Log.e("SHA256 hash", sha256s);

        String md5s = md5(sha256s);
        Log.e("md5s hash", md5s);


        String randoms = randomNumber(md5s,random);
        Log.e("key", randoms);
        key = randoms;


        apiCall();


    }

    private void apiCall() {

        apiInterface = Api.getClient().create(APIInterface.class);

        Call<URLResponse> call = apiInterface.getData(key,authKey,
                password);// key = "65c8279b8c750ab038eed455e0b3186d" auth_key = "1",password = "1234";
        call.enqueue(new Callback<URLResponse>() {
            @Override
            public void onResponse(Call<URLResponse> call, Response<URLResponse> response) {
                Gson gson = new Gson();
                String s =  gson.toJson(response.body());
                Log.e("response",s);


            }

            @Override
            public void onFailure(Call<URLResponse> call, Throwable t) {

                Log.e("Error",t.getMessage());
            }
        });


    }

    public String sha256(String s) {
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("SHA256");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i=0; i<messageDigest.length; i++)
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String md5(String s) {
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i=0; i<messageDigest.length; i++)
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String sha1(String s) {
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("SHA1");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i=0; i<messageDigest.length; i++)
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    public String randomNumber(String s,int random) {

        try {
            // Create MD5 Hash
            MessageDigest digest = null;
            if(random==1){
                digest = java.security.MessageDigest.getInstance("MD5");
            }else if (random==2){
                digest = java.security.MessageDigest.getInstance("SHA1");
            }else if (random==3){
                digest = java.security.MessageDigest.getInstance("SHA256");
            }else if (random==4){
                digest = java.security.MessageDigest.getInstance("SHA512");
            }

            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i=0; i<messageDigest.length; i++)
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public byte[] digestSHA256(String value) throws NoSuchAlgorithmException {
        MessageDigest digester = MessageDigest.getInstance("SHA256");

        byte[] stringBytes = value.getBytes();

        digester.update(stringBytes, 0, stringBytes.length);

        return digester.digest();
    }


    public byte[] digestMD5(String value) throws NoSuchAlgorithmException {
        MessageDigest digester = MessageDigest.getInstance("MD5");

        byte[] stringBytes = value.getBytes();

        digester.update(stringBytes, 0, stringBytes.length);

        return digester.digest();
    }

    public byte[] digestSH1(String value) throws NoSuchAlgorithmException {
        MessageDigest digester = MessageDigest.getInstance("SHA1");

        byte[] stringBytes = value.getBytes();

        digester.update(stringBytes, 0, stringBytes.length);

        return digester.digest();
    }
}