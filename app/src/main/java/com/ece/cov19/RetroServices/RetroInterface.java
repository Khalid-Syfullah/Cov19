package com.ece.cov19.RetroServices;

import com.ece.cov19.DataModels.DashBoardNumberModel;
import com.ece.cov19.DataModels.ImageDataModel;
import com.ece.cov19.DataModels.PatientDataModel;
import com.ece.cov19.DataModels.RequestDataModel;
import com.ece.cov19.DataModels.UserDataModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RetroInterface {
    @FormUrlEncoded
    @POST("registration.php")
    Call<UserDataModel> registerRetroMethod(@Field("name") String name, @Field("phone") String phone, @Field("gender") String gender,
                                            @Field("blood_group") String bloodGroup, @Field("division") String division,
                                            @Field("district") String district, @Field("thana") String thana, @Field("age") String age,
                                            @Field("donor") String donorInfo, @Field("password") String password);

    @FormUrlEncoded
    @POST("login.php")
    Call<UserDataModel> loginRetroMethod(@Field("phone") String phone, @Field("password") String password);

    @FormUrlEncoded
    @POST("checkUser.php")
    Call<UserDataModel> checkUser(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("updateUserInfo.php")
    Call<UserDataModel> updateUser(@Field("phone") String phone, @Field("name") String name, @Field("division") String division, @Field("district") String district, @Field("thana") String thana, @Field("age") String age, @Field("donor") String donorInfo);

    @FormUrlEncoded
    @POST("updateUserPassword.php")
    Call<UserDataModel> updatePassword(@Field("phone") String loggedInUserPhone, @Field("password") String password);


    @FormUrlEncoded
    @POST("patientData.php")
    Call<PatientDataModel> registerPatientRetro(@Field("name") String name, @Field("age") String age, @Field("gender") String gender,
                                                @Field("blood_group") String bloodGroup, @Field("hospital") String hospital,
                                                @Field("division") String division, @Field("district") String district,
                                                @Field("date") String date, @Field("need") String need,
                                                @Field("phone") String phone);




    @FormUrlEncoded
    @POST("searchDonor.php")
    Call<ArrayList<UserDataModel>> findDonor(@Field("bloodGroup") String bloodgroup,@Field("district") String district,@Field("phone") String phone);


    @FormUrlEncoded
    @POST("searchPatients.php")
    Call<ArrayList<PatientDataModel>> searchPatients(@Field("bloodGroup") String bloodGroup,@Field("district") String district,@Field("phone") String phone);

    @FormUrlEncoded
    @POST("dashBoardNumbers.php")
    Call<DashBoardNumberModel> getDashBoardNumbers(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("ownPatients.php")
    Call<ArrayList<PatientDataModel>> ownPatients(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("updatePatientProfile.php")
    Call<PatientDataModel> updatePatientProfile(@Field("name") String name, @Field("age") String age, @Field("blood_group") String bloodGroup, @Field("phone") String phone,


                                                @Field("newname") String newName, @Field("newage") String newaAge, @Field("newgender") String newGender,
                                                @Field("newblood_group") String newBloodGroup, @Field("newhospital") String newHospital,
                                                @Field("newdivision") String newDivision, @Field("newdistrict") String newDistrict,
                                                @Field("newdate") String newDate, @Field("newneed") String newNeed);

    @FormUrlEncoded
    @POST("deletePatientProfile.php")
    Call<PatientDataModel> deletePatientProfile(@Field("name") String name, @Field("age") String age, @Field("gender") String gender,
                                                @Field("blood_group") String bloodGroup, @Field("hospital") String hospital,
                                                @Field("division") String division, @Field("district") String district,
                                                @Field("date") String date, @Field("need") String need,
                                                @Field("phone") String phone);


    @FormUrlEncoded
    @POST("sendRequest.php")
    Call<RequestDataModel> sendRequest( @Field("donorPhone") String donorPhone, @Field("patientName") String patientName,
                                        @Field("patientAge") String patientAge, @Field("patientPhone") String patientPhone,
                                        @Field("patientBloodGrp") String patientBloodGrp,@Field("requestedBy") String requester);

    @FormUrlEncoded
    @POST("checkDonorRequest.php") Call<ArrayList<PatientDataModel>> checkDonorRequest(@Field("phone") String userPhone,@Field("status") String status);

    @FormUrlEncoded
    @POST("checkPatientRequest.php")
    Call<ArrayList<UserDataModel>> checkPatientRequest(@Field("name") String name,@Field("age") String age,
                                                 @Field("bloodGroup") String bloodgroup, @Field("phone") String phone);

    @FormUrlEncoded
    @POST("checkDonorResponse.php")
    Call<ArrayList<UserDataModel>> checkDonorResponse(@Field("name") String name,@Field("age") String age,
                                                      @Field("bloodGroup") String bloodgroup, @Field("phone") String phone);
    @FormUrlEncoded
    @POST("checkPatientResponse.php") Call<ArrayList<PatientDataModel>> checkPatientResponse(@Field("phone") String userPhone);



    @FormUrlEncoded
    @POST("checkDonorApproaches.php")
    Call<ArrayList<PatientDataModel>> checkRequestByDonor(@Field("donorPhone") String loggedInUserPhone);

    @FormUrlEncoded
    @POST("getPatientRequest.php")
    Call<ArrayList<UserDataModel>> getPatientRequest(@Field("name") String name,@Field("age") String age,
                                                       @Field("bloodGroup") String bloodgroup, @Field("phone") String phone);

    @FormUrlEncoded
    @POST("lookForRequests.php")
    Call<RequestDataModel> requestsOperation(@Field("donorPhone") String donorPhone, @Field("patientName") String patientName,
                                             @Field("patientAge") String patientAge, @Field("patientBloodGroup") String patientBloodGroup,
                                             @Field("patientPhone") String phone, @Field("requestedBy") String requestedBy, @Field("operation") String operation);
    @FormUrlEncoded
    @POST("tokenRegister.php")
    Call <UserDataModel> sendToken(@Field("phone") String phone, @Field("token") String token);

    @FormUrlEncoded
    @POST("pushNotification.php")
    Call <UserDataModel> sendNotification(@Field("phone") String phone, @Field("title") String title, @Field("body") String body);

    @FormUrlEncoded
    @POST("imageUpload.php")
    Call<ImageDataModel> uploadImage(@Field("title") String title, @Field("image") String image);

    @FormUrlEncoded
    @POST("imageDownload.php")
    Call<ImageDataModel> downloadImage(@Field("title") String title);

    @FormUrlEncoded
    @POST("imageDelete.php")
    Call<ImageDataModel> deleteImage(@Field("title") String title);
}


