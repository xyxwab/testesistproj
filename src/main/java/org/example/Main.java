package org.example;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

//        Data datajson = new Data("lucas@", "1234", "lucas");
//        Gson gson = new Gson();
//
//        JsonObject jsonObject = gson.toJsonTree(datajson).getAsJsonObject();
//        String json = jsonObject.toString();
//        System.out.println(json);

        Data novadata = new Data("lucas@@", "12345", "loucaxinho");
        Candidate candidato = new Candidate(novadata);
        Request request = new Request("SIGNUP_CANDIDATE", novadata);

        Gson gson = new Gson();
        String json = gson.toJson(request); // Essa string json é uma string no formato JSON
        System.out.println(json);

        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

        JsonObject dataObject = jsonObject.getAsJsonObject("data");


//        Candidate candidate = new Candidate("lucas@gmail.com");
//
//        try {
//            Algorithm algorithm = Algorithm.HMAC256("DISTRIBUIDOS");
//            String token = JWT.create()
//                    .withClaim("id", candidate.getEmail())
//                    .withClaim("role", "CANDIDATE")
//                    .sign(algorithm);
//            System.out.println(token);
//        } catch (JWTCreationException exception){
//            System.out.println(exception.getMessage());
//            // Invalid Signing configuration / Couldn't convert Claims.
//        }
//        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Imx1Y2FzQGdtYWlsLmNvbSIsInJvbGUiOiJDQU5ESURBVEUifQ.EOj9xeZhWOjl3v6hcjeFK-Lz-l7CdCtjqqbN2vTvLHI";
//        DecodedJWT decodedJWT;
//        try {
//            Algorithm algorithm = Algorithm.HMAC256("DISTRIBUIDOS");
//            JWTVerifier verifier = JWT.require(algorithm)
//                    // specify any specific claim validations
//                    .withClaim("id", candidate.getEmail())
//                    .withClaim("role", "CANDIDATE")
//                    // reusable verifier instance
//                    .build();
//            decodedJWT = verifier.verify(token);
//            System.out.println();
//        } catch (JWTVerificationException exception){
//            System.out.println(exception.getMessage());
//            // Invalid signature/claims
//        }
    }
}