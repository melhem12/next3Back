package net.claims.express.next2.http.requests;

import lombok.Data;

import java.util.List;
@Data
public class CloneProfileRequest {
   private String sourceUserId;
    private  String destinationUserId ;
    private  List<String> profiles;
}
