package com.techinnovative.beauty.account.web.resources;

import com.techinnovative.beauty.generated.v1.api.UsersApi;
import com.techinnovative.beauty.generated.v1.model.CreateUserRequest;
import com.techinnovative.beauty.generated.v1.model.CreateUserResponse;
import com.techinnovative.beauty.generated.v1.model.Credential;
import com.techinnovative.beauty.generated.v1.model.UserAccount;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public class UsersResource implements UsersApi {
    @Override
    public ResponseEntity<UserAccount> findUser(String userId) {
        return UsersApi.super.findUser(userId);
    }

    @Override
    public ResponseEntity<List<UserAccount>> findUsers(String username, String email, Integer page, Integer size) {
        return UsersApi.super.findUsers(username, email, page, size);
    }

    @Override
    public ResponseEntity<List<Credential>> getUserCredentials(UUID userId) {
        return UsersApi.super.getUserCredentials(userId);
    }

    @Override
    public ResponseEntity<CreateUserResponse> saveUser(CreateUserRequest createUserRequest) {
        return UsersApi.super.saveUser(createUserRequest);
    }
}
